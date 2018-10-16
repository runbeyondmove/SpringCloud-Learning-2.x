1、在config-client的Controller上要添加注解@RefreshScope。
2、在config-client配置文件中添加management.endpoints.web.exposure.include=bus-refresh 
3、请求方式为POST
4、rabbitMQ使用默认帐号和密码，其他帐号记得注意权限

http://localhost:8881/actuator/bus-refresh


actuator暴露的endpoint可以在https://docs.spring.io/spring-boot/docs/2.0.4.RELEASE/reference/htmlsingle/#production-ready-endpoints-exposing-endpoints这里找到，

cloud bus暴露的endpoint在http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html#_bus_endpoints这里