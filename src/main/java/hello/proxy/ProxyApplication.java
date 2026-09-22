package hello.proxy;

import hello.proxy.config.v5_autoproxy.AutoProxyConfig;
import hello.proxy.config.v6_aop.AopConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import({AppV1Config.class, AppV2Config.class})
@Import({LogTraceConfig.class
//    , InterfaceProxyConfig.class
//    , ConcreteProxyConfig.class
//    , DynamicProxyBasicConfig.class
//    , DynamicProxyFilterConfig.class
//    , ProxyFactoryConfigV1.class
//    , ProxyFactoryConfigV2.class
//    , BeanPostProcessorConfig.class
//    , AutoProxyConfig.class
    , AopConfig.class
})
@SpringBootApplication(scanBasePackages = "hello.proxy.app.v3")
public class ProxyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProxyApplication.class, args);
  }

}
