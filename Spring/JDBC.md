# JDBC
Java Database Connectivity로 Java 기반 애플리케이션의 데이터를 데이터베이스에 저장 및 업데이트하거나, 데이터베이스에 저장된 데이터를 Java에서 사용할 수 있도록 하는 자바 API이다. 

### 📌 등장 이유
각각 DBMS마다 커넥션을 연결하는 방법, SQL 전달 방법, 결과 응답을 받는 방법이 다 다름. 이 문제를 해결하기 위해 JDBC 등장!

---
### 📌 JDBC 표준 인터페이스

![표준 인터페이스](TIL/Spring/image/image.png)

3가지 기능을 표준 인터페이스로 정의하여 제공
- java.sql.Connection - 연결
- java.sql.Statement - SQL을 담은 내용
- java.sql.ResultSet - SQL 연결 요청
----
Spring Data JDBC, Spring Data JPA등 기술이 나오면서 직접적으로 JDBC를 만질 일은 없지만 동작 흐름 정도는 알아두자.

### 📌 JDBC 동작 흐름
![동작 흐름](TIL/Spring/image/image-1.png)
JDBC API를 사용하기 위해선 JDBC 드라이버를 로딩 후 데이터베이스를 연결해야한다.
#### 📎 JDBC 드라이버
- 데이터베이스와 통신을 하는 인터페이스
- Oracle, MySQL과 같은 데이터베이스에 알맞게 JDBC 드라이버를 구현하여 제공
- JDBC 구현체를 이용하여 특정 벤더 데이터베이스에 접근 가능
