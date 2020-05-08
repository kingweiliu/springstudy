# springstudy 对应 一些spring的练习 https://spring.io/guides#getting-started-guides

* RestService     -------  [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)  
/rest/greeting  
/rest/getuid/{id}  
* schedulingtask ------- [Scheduling Tasks ](https://spring.io/guides/gs/scheduling-tasks/)  
默认关闭，定时输出一行日志
  
* ConsumingRest ------- [Consuming a RESTful Web Servizce ](https://spring.io/guides/gs/consuming-rest/)  
/consume/accessrest  
访问其他的restful服务
  
* uploadfiles ---------[Uploading Files](https://spring.io/guides/gs/uploading-files/)  
/upload/  
/upload/files/{filename:.+}  
增加的html文件: uploadForm.html  
上传没有前几个做的快，主要的技术点  
1. 这个练习加了前端界面的展示，引入 thymeleaf 模板， 然后从Controller中的函数怎么对应到 模板的uploadFrom.html文件，中间花了功夫
2. 引入了StorageService接口， 其中的实现是从样例中抠出来的。
3. 注解 ConfigurationProperties 的使用

upload 功能在更改了 path 路径后不能用

* relationdataaccess ----- [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)  
/jdbc/newuser  
/jdbc/getalluser  
jdbc数据库访问    

* secureweb-----[Securing a Web Application](https://spring.io/guides/gs/securing-web/)  
用户名：user  
密码：password  
增加的html文件： hello.html  home.html  login.html

* authenticatingldap  ------ [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
没有成功

* handlingformsubmission ---- [Handling Form Submission
](https://spring.io/guides/gs/handling-form-submission/)  
/formsub/greeting  
增加的html文件  greeting.html  result.html


