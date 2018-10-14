server的测试访问地址是这样子的：  
http://localhost:8068/config-client/dev  
或者  
http://localhost:8068/config-client/dev/master

即格式（label-->分支）：
http://localhost:8888/Xc-Customer-Service/dev/develop ==> {url} /{filename} / {profile}/{label}

正确结果：
```
{"name":"config-client","profiles":["dev"],"label":null,"version":"00d32612a38898781bce791a4a845e60a7fbdb4e","state":null,"propertySources":[{"name":"https://github.com/forezp/SpringcloudConfig//respo/config-client-dev.properties","source":{"foo":"foo version 2","democonfigclient.message":"hello spring io"}}]}
```


文件：address-dev.properties
访问地址：http://localhost:8068/address/dev
```
{"name":"address","profiles":["dev"],"label":null,"version":"00d32612a38898781bce791a4a845e60a7fbdb4e","state":null,"propertySources":[{"name":"https://github.com/forezp/SpringcloudConfig//respo/address-dev.properties","source":{"spring.rabbitmq.host":"localhost","spring.rabbitmq.port":"5672","server.port":"8882","hystrix.command.default.execution.timeout.enabled":"false ","management.security.enabled":"false"}}]}
```
