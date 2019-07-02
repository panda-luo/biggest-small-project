package club.panda1024.biggestsmallproject.bing.service;

import club.panda1024.biggestsmallproject.model.vo.BingImageVo;
import club.panda1024.biggestsmallproject.service.BgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-29T14:10
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BgServiceTest {

  @Resource
  private BgService bgService;


  @Test
  public void getImageByBingJsonTest() {
    BingImageVo imageByBingJson = bgService.getImageByBingJson();
    System.out.println(imageByBingJson.getDisc());

  }

}
