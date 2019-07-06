package club.panda1024.biggestsmallproject.service.impl;

import club.panda1024.biggestsmallproject.service.DeadLockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-07-06T16:27
 */
@Slf4j
@Service
public class DeadLockServiceImpl implements DeadLockService {


  private static Object lock1 = new Object();
  private static Object lock2 = new Object();

  @Override
  public void locked() {
    log.info("开始lock test");

    Thread t1 = new Thread(() -> {
      log.info("线程T1运行中");
      synchronized (lock1) {
        try{
          log.info("T1 - i'm coming.");
          Thread.sleep(10000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock2) {
          log.info("T1 - 我没有发生死锁");
        }
      }
    });

    Thread t2 = new Thread(() -> {
      log.info("线程T1运行中");
      synchronized (lock2) {
        try{
          log.info("T2 - i'm coming.");
          Thread.sleep(10000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock1) {
          log.info("T2 - 我没有发生死锁");
        }
      }
    });

    t1.start();
    t2.start();

  }



}

