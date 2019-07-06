package club.panda1024.biggestsmallproject.site.web.controller;

import club.panda1024.biggestsmallproject.service.BgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-07-05T11:40
 */
@Controller
public class SiteRouter {

  @Resource
  private BgService bgService;


  @GetMapping(value = {"", "/", "/index"})
  public String index(Model model) {
    initBg(model);
    return "site/index";
  }

  /**
   *  初始化index背景数据
   */
  private void initBg(Model model){
    model.addAttribute("bg", bgService.getImageByBingJson());

  }
}
