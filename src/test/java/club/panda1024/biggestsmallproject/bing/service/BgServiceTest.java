package club.panda1024.biggestsmallproject.bing.service;

import club.panda1024.biggestsmallproject.model.vo.BingImageVo;
import club.panda1024.biggestsmallproject.service.BgService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
    List list = new LinkedList<String>();
    System.out.println(imageByBingJson.getDisc());
  }

  @Test
  public void printMid() {
    List list = Lists.newArrayList(1, 2, 3, 4, 5);

    Iterator iter = list.iterator();


    if(iter.hasNext()) {

    }


  }

}
