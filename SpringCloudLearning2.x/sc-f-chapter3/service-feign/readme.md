`mvn clean install`会出现以下错误，直接忽略，可以运行，或者可以在打包安装时忽略test的过程

即打包的时候不启动test的就行了，在pom.xml 文件下的properties 下加入
```
<properties>
	<skipTests>true</skipTests>
</properties>
或者
<properties>
	<maven.test.skip>true</maven.test.skip>
</properties>
```

具体错误
```
2018-10-14 10:22:59.253  WARN 13352 --- [       Thread-6] s.c.a.AnnotationConfigApplicationContext : Exception thrown from ApplicationListener handling ContextClosedEvent

org.springframework.beans.factory.BeanCreationNotAllowedException: Error creating bean with name 'eurekaAutoServiceRegistration': Singleton bean creation not allowed while singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:208) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1089) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.ApplicationListenerMethodAdapter.getTargetBean(ApplicationListenerMethodAdapter.java:288) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.ApplicationListenerMethodAdapter.doInvoke(ApplicationListenerMethodAdapter.java:258) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.ApplicationListenerMethodAdapter.processEvent(ApplicationListenerMethodAdapter.java:180) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.ApplicationListenerMethodAdapter.onApplicationEvent(ApplicationListenerMethodAdapter.java:142) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:139) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:400) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:406) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:354) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.doClose(AbstractApplicationContext.java:1000) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.close(AbstractApplicationContext.java:967) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.cloud.context.named.NamedContextFactory.destroy(NamedContextFactory.java:76) [spring-cloud-context-2.0.1.RELEASE.jar:2.0.1.RELEASE]
	at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:256) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroyBean(DefaultSingletonBeanRegistry.java:571) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingleton(DefaultSingletonBeanRegistry.java:543) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton(DefaultListableBeanFactory.java:954) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingletons(DefaultSingletonBeanRegistry.java:504) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingletons(DefaultListableBeanFactory.java:961) [spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.destroyBeans(AbstractApplicationContext.java:1041) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.doClose(AbstractApplicationContext.java:1017) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext$1.run(AbstractApplicationContext.java:937) [spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]

Disconnected from the target VM, address: 'javadebug', transport: 'shared memory'
```