package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class TimeInvocationHandler implements InvocationHandler {

  private final Object target;

  public TimeInvocationHandler(Object target) {
    this.target = target;
  }

  // 인터페이스를 통해서 생성된 프록시의 메소드를 호출할 경우에만 아래의 메소드가 호출되고
  // method에 해당 메소드의 포인터가 넘어오게 된다.
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    log.info("TimeProxy 실행");

    long startTime = System.currentTimeMillis();

    Object result = method.invoke(target, args);

    long endTime = System.currentTimeMillis();
    long resultTimes = endTime - startTime;

    log.info("TimeProxy 종료 resultTime={}", resultTimes);

    return result;
  }
}
