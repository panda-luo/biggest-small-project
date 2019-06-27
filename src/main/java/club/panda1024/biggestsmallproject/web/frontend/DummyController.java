package club.panda1024.biggestsmallproject.web.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  this is a dummy controller...........
 *
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-27T14:57
 */
@RestController
public class DummyController {

  @GetMapping("dummy")
  public String dummy() {
    return "dummy2";
  }
}
