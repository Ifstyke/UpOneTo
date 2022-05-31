# 前端开发步骤
1. 添加路由，router目录下
2. 添加页面，views目录下创建
3. 添加API接口，api目录下
4. 在页面中调用

# 比较重要的功能
1. 数据字段模块：EasyExcel的使用

# 数据字典模块
## 缓存：为了提高查询数据
- 什么数据适合做缓存
    - 不经常修改的数据、固定的数据、经常查询的数据
- Spring Cache + Redis 缓存数据
    - Spring Cache 是一个非常优秀的缓存组件。自 Spring 3.1 起，提供了类似于 @Transactional 注解事务的注解 Cache 支持，且提供了 Cache 抽象，方便切换各种底层 Cache（如：redis)
    - 使用 Spring Cache 的好处
      1. 提供基本的 Cache 抽象，方便切换各种底层 Cache
      2. 通过注解 Cache 可以实现类似于事务一样，缓存逻辑透明的应用到我们的业务代码上，且只需要更少的代码就可以完成
      3. 提供事务回滚时也自动回滚缓存
      4. 支持比较复杂的缓存逻辑

# 使用Nginx来请求转发功能
# NoSQL
## 为什么使用NoSQL
1. 对数据库高并发读写
2. 对海量数据的高效率存储和访问
3. 对数据库的高扩展性和高可用性

# 后台系统，医院管理模块
## 通过service_hosp远程调用service_cmn模块，使用Nacos作为注册中心
- 启动nacos时报错解决方法，删除nacos/data目录下的derby-data目录
- 将service_cmn和service_hosp模块注册到nacos中
    1. 添加依赖
        ```xml
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
                <version>2.2.0.RELEASE</version>     
            </dependency>
        ```
       **这里千万注意踩坑，Spring Cloud Alibaba 版本和Spring Boot版本有着对应关系，如果不对应，会出现添加依赖错误，参考见博客：https://blog.csdn.net/m0_37352076/article/details/120650897**
    
# 微信登录实现——OAuth2
## OAuth针对一些特定问题解决方案
* 开放系统间授权问题
* 单点登录问题