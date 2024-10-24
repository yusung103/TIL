# Dirty Checking
영속성 컨테이너가 관리하는 엔티티의 상태를 감지해서 **트랜젝션이 끝나는 지점에 수정된 부분을 DB에 저장**하는 기능. `Dirty`는 **상태의 변화가 생긴 정도**, `Drity checking`은 **상태 변경 검사**를 의미. 

### 📌 더티 체킹 조건
**📎 영속성 컨텍스트에서 관리되는 엔티티**
- 영속성 컨텍스트는 엔티티를 처음 조회할때 시작, 이후 변경을 감지함
- 준영속, 비영속 상태의 엔티티는 더티 체킹 대상이 되지 못함

**📎 Transactinal이 커밋 되었을 때**
- 트랜잭션이 커밋 되기 전에는 영속성 컨텍스트가 추적만 하고 DB에는 반영하지 않음.
- 트랜잭션이 커밋될 때 영속성 컨텍스트는 엔티티의 변경된 상태를 DB에 반영.

### 📌 Spring Data JPA
Spring Data JPA는 `@Transactional` 으로 더티 체킹을 수행할 수 있음.

아래 코드는 id를 찾아 name을 수정하는 메서드. setName으로 name만 수정했고 다른 것은 save() 하지도 않았다.
```java
@Transactional
public void update(Long id, String nickName) {
    Member member = memberRepository.findOne(id);
    member.setNickName(nickName);
}
```

더티 체킹은 기본적으로 모든 필드를 update 한다. nickName 이외에 다른 필드들도 update 쿼리를 날린다.

DB 입장에서 쿼리의 재사용이 가능하지만, 필드가 많은 경우 전체 update를 하기엔 부담스러울 수 있다. 이를 위해 `@DynamicUpdate`를 붙여주면 된다

---- 
`@DynamicUpdate`를 사용해 변경된 필드만 update할 수 있다.
```java
@Entity
@Getter
@Setter
@DynamicUpdate //추가
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String email;

    private String password;
```