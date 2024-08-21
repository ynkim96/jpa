### Hibernate란?
하이버네이트는 자바 언어를 위한 ORM 프레임워크이다. 
JPA의 구현체로, JPA 인터페이스를 구현하며, 내부적으로 JDBC API를 사용한다.
JPA는 관계형 데이터베이스와 객체의 패러다임 불일치 문제를 해결할 수 있다는 점과 영속성 컨텍스트(엔티티를 저장하는 환경) 제공이 큰 특징이다.

### Hibernate 장점
##### 1. 생산성
Hibernate는 SQL을 직접 사용하지 않고, 메서드 호출만으로 쿼리가 수행돼요. 즉, SQL 반복 작업을 하지 않음으로 생산성이 높다.
##### 2. 유지보수
테이블 컬럼이 변경되었을 때, 테이블과 관련된 DAO의 파라미터, 결과, SQL 등을 대신 수행해줘요. 이로 인해 유지보수 측면에서 높다.
##### 3. 특정 벤더에 종속적이지 않음
설정 파일에서 JPA에게 어떤 DB를 사용하고 있는지를 알려주기만 하면 얼마든지 DB를 바꿀 수 있다. 

### Hibernate 단점
##### 1. 성능
메서드 호출만으로 쿼리를 수행하는 것은 직접 SQL을 작성하는 것보다는 성능상 좋지 않아요
##### ** 세밀함
메서드 호출만으로 DB 데이터를 조작하기에는 한계가 있어요. 이를 보완하기 위해 JPQL을 지원해요
NativeQuery를 지원하여 SQL 자체 쿼리도 작성할 수 있어요





### 설정 

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
