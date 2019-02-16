# springcloud 配置中心

* 主要分为服务端与客户端

  > 服务端：
  >
  > 1.加入pom文件
  >
  >  <dependency>
  > 			<groupId>org.springframework.cloud</groupId>
  > 			<artifactId>spring-cloud-config-server</artifactId>
  > 		</dependency>
  > 		<dependency>
  > 			<groupId>org.springframework.cloud</groupId>
  > 			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
  > </dependency>

  > 2.开启程序入口 ：@EnableDiscoveryClient     @EnableConfigServer
  >
  > 3.加入配置文件：
  >
  > spring.application.name=config-server -- 服务名称
  > server.port=8020 --服务端口
  > spring.cloud.config.server.git.uri=https://github.com/miketom156/springcloudConfig  --git库地址，浏览器地址的拷
  > spring.cloud.config.server.git.search-paths=/** --库下文件目录的搜索
  > spring.cloud.config.label=master  --库分支
  > #spring.cloud.config.username=fox9916  --库的验证用户名非必须
  > #spring.cloud.config.password=fox9916  --库的验证密码非必须
  > spring.cloud.config.server.git.skipSslValidation=true  ---跳过https安全验证
  > eureka.client.serviceUrl.defaultZone=http://127.0.0.1:8000/eureka/  --服务注册 中心

 2.客户端的配置

  >1.加入pom文件
  >
  ><dependency>
  >			<groupId>org.springframework.cloud</groupId>
  >			<artifactId>spring-cloud-starter-config</artifactId>
  ></dependency>
  >
  >2.开启程序入口：
  >
  >3.加入bootstrap.properties文件
  >
  >spring.cloud.config.discovery.enabled=true  --启动服务发现
  >spring.cloud.config.discovery.serviceId=CONFIG-SERVER --配置中心名称
  >spring.cloud.config.name=application --对应git的文件{application}-{profile}.properties,这个不是必须，默认读取spring.application.name作为application的，application与git的文件中的名称要相对应
  >spring.cloud.config.label=master --git的分支
  >spring.cloud.config.profile=test--对应配置文件profile
  >spring.cloud.config.uri=http://localhost:8020/ --配置中心地址
  >eureka.client.serviceUrl.defaultZone=http://127.0.0.1:8000/eureka/ --服务注册中心地址
  >
  >4.application.properties
  >
  >spring.application.name=user-service-provider  --注册到注册中心的服务名称
  >server.port=8001