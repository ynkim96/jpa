## Hibernate란?

하이버네이트는 자바 언어를 위한 ORM 프레임워크이다. 
JPA의 구현체로, JPA 인터페이스를 구현하며, 내부적으로 JDBC API를 사용한다.
JPA는 관계형 데이터베이스와 객체의 패러다임 불일치 문제를 해결할 수 있다는 점과 영속성 컨텍스트(엔티티를 저장하는 환경) 제공이 큰 특징이다.
***
### JPA Start
***
#### pom.xml
```ruby
<dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.4.2.Final</version>
</dependency>
```
***

#### persistence.xml
###### 위치 : resources/META-INF/persistence.xml
```ruby
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
    <persistence-unit name="hello">
        <properties>
            <!-- 필수 속성 -->
            <property name="jakarta.persistence.jdbc.driver" value="org.h2.Driver"/>
            <property name="jakarta.persistence.jdbc.user" value="sa"/>
            <property name="jakarta.persistence.jdbc.password" value=""/>
            <property name="jakarta.persistence.jdbc.url" value="jdbc:h2:tcp://localhost/~/test"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>

            <!-- 옵션 -->
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
            <property name="hibernate.use_sql_comments"  value="true"/>
            <property name="hibernate.hbm2ddl.auto" value="create" />
        </properties>
    </persistence-unit>
</persistence>
