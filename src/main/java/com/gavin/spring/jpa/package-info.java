/**
 * Used on the package level to declare that the default behavior for parameters and return values is to not accept or produce null values.
 */
@org.springframework.lang.NonNullApi
package com.gavin.spring.jpa;

/*
## 数据源配置
spring.datasource.url=jdbc:mysql://172.16.10.79:3306/mytestdb?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql=true


hbm2ddl.auto：自动创建|更新|验证数据库表结构
dialect：设置数据库引擎为InnoDB
show-sql：打印sql语句，方便调试

hbm2ddl.auto有四个属性：

create：每次加载 hibernate 时都会删除上一次的生成的表，然后根据你的 model 类再重新来生成新表，哪怕两次没有任何改变也要这样执行，这就是导致数据库表数据丢失的一个重要原因。[删除-创建-操作]
create-drop ：每次加载 hibernate 时根据 model 类生成表，但是 sessionFactory 一关闭，表就自动删除。[删除-创建-操作-再删除]
update：最常用的属性，第一次加载 hibernate 时根据 model 类会自动建立起表的结构（前提是先建立好数据库），以后加载 hibernate 时根据 model 类自动更新表结构，即使表结构改变了，但表中的行仍然存在，不会删除以前的行。要注意的是当部署到服务器后，表结构是不会被马上建立起来的，是要等应用第一次运行起来后才会。[没表-创建-操作 | 有表-更新没有的属性列-操作]
validate：每次加载 hibernate 时，验证创建数据库表结构，只会和数据库中的表进行比较，不会创建新表，但是会插入新值。[启动验证表结构，验证不成功，项目启动失败]
使用 update 值对于开发阶段来说非常好，但是对于生产阶段，应该保留这个属性值为 validate，并使用数据库迁移工具来管理数据库结构的修改，如 Flyway。

 */