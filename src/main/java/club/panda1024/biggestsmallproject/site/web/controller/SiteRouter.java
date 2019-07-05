package club.panda1024.biggestsmallproject.site.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-07-05T11:40
 */
@Controller
public class SiteRouter {

  @GetMapping(value = {"", "/", "/index"})
  public String index(Model model) {
    return "site/index";
  }

}
