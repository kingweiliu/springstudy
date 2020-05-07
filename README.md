# springstudy 对应 一些spring的练习 https://spring.io/guides#getting-started-guides

* RestService     -------  [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)  
* schedulingtask ------- [Scheduling Tasks ](https://spring.io/guides/gs/scheduling-tasks/)  
* ConsumingRest ------- [Consuming a RESTful Web Service ](https://spring.io/guides/gs/consuming-rest/)  
* uploadfiles ---------[Uploading Files](https://spring.io/guides/gs/uploading-files/)
上传没有前几个做的快，主要的技术点 
1. 这个练习加了前端界面的展示，引入 thymeleaf 模板， 然后从Controller中的函数怎么对应到 模板的uploadFrom.html文件，中间花了功夫
2. 引入了StorageService接口， 其中的实现是从样例中抠出来的。
3. 注解 ConfigurationProperties 的使用