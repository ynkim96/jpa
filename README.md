### JPA 


#### @Entity
##### 해당 어노테이션은 클래스가 JPA 엔티티임을 나타내며, @Entity가 선언된 클래스는 데이터베이스의 테이블과 매핑됩니다.
- 클래스는 기본 생성자를 가져야 합니다.
- 기본 키(@Id)를 정의해야 합니다.



#### @Table( name:테이블 이름지정, schema: 스키마 이름지정, uniqueConstraints: 유니크 제약 조건 지정)
##### 해당 어노테이션은 엔티티 클래스가 매핑될 DB 테이블의 이름을 지정합니다. 생략할 경우 클래스 이름이 테이블 이름으로 사용됩니다.









#### @Id

