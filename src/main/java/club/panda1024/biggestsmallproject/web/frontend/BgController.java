package club.panda1024.biggestsmallproject.web.frontend;

import club.panda1024.biggestsmallproject.model.vo.BingImageVo;
import club.panda1024.biggestsmallproject.service.BgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-29T13:21
 */
@RestController
@RequestMapping("bg")
@Slf4j
public class BgController {

  @Resource
  private BgService bgService;

  @GetMapping("bingImage")
  public BingImageVo getImageByBingJson() {
    log.info("getImageByBingJson - 从bing获取背景页面");
    return bgService.getImageByBingJson();
  }

}
