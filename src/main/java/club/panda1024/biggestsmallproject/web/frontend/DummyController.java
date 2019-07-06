package club.panda1024.biggestsmallproject.web.frontend;

import club.panda1024.biggestsmallproject.service.DeadLockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  this is a dummy controller...............
 *
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-27T14:57
 */
@RestController
public class DummyController {

  @Resource
  private DeadLockService deadLockService;


  @GetMapping("dummy")
  public String dummy() {
    return "dummy-win-jenkins--try--try";
  }

  @GetMapping("locked")
  public String deadLock() {
    deadLockService.locked();
    return "unlocked";
  }

}
