package club.panda1024.biggestsmallproject.service.impl;

import club.panda1024.biggestsmallproject.model.dto.BingImageDetailDto;
import club.panda1024.biggestsmallproject.model.dto.BingImageDto;
import club.panda1024.biggestsmallproject.model.query.BingImageQuery;
import club.panda1024.biggestsmallproject.model.vo.BingImageVo;
import club.panda1024.biggestsmallproject.service.BgService;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
@Slf4j
public class BgServiceImpl implements BgService {

  private static final String BING_BG_IMAGE_URL = "https://cn.bing.com/HPImageArchive.aspx";

  @Override
  public BingImageVo getImageByBingJson() {
    BingImageVo bingImageVo = new BingImageVo();
    String resp = HttpUtil.get(BING_BG_IMAGE_URL, BingImageQuery.defaultQuery());

    BingImageDto bingImageDto = JSONUtil.toBean(resp, BingImageDto.class);
    BingImageDetailDto bingImageDetailDto = bingImageDto.getImages().get(0);

    this.assemble(bingImageVo, bingImageDetailDto);
    return bingImageVo;
  }






//===============================================================================
// 以下为私有方法

  private void assemble(BingImageVo bingImageVo, BingImageDetailDto bingImageDetailDto) {
    bingImageVo.setUrl(bingImageDetailDto.getUrl());
    bingImageVo.setDisc(bingImageDetailDto.getCopyright());
    bingImageVo.setTitle(StrUtil.isEmpty(bingImageDetailDto.getTitle()) ? bingImageDetailDto.getCopyright() : bingImageDetailDto.getTitle());
  }
}
