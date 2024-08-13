# JPA
JPA(Java Persistance API) 자바의 ORM기술을 쉽게 구현할 수 있도록 돕는 API를 의미한다  
> 데이터베이스의 CRUD를 간편 수행할 수 있게 해준다
> > 자바에서 객체를 DB에 저장하고 관리하기 위한 인터페이스와 기능을 제공하는 API

JpaRepository에 상속하는 메서드 이름만 적어놓으면 알아서 해결해 주는 좋은 ORM이다  
메서드 이름은 findAll(필드), deleteby(필드)처럼 메서드 명칭만 적어주면 개발자는 SQL문을 따로 적지 않아도 쿼리문을 만들어 준다 -> 이 때 엔티티라는 클래스를 사용한다

<br>

**1. 엔티티 클래스 정의**  
> DB와 테이블과 맵핑될 테이블을 정의
``` java
@Entity // 엔티티 클래스임을 선언
@Table(name = "users") // 해당 엔티티 클래스와 DB에 맵핑될 테이블 이름을 지정
public class User{

    @Id // 주식별자 PK(Primary Key)임을 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 엔티티 식별자 값을 자동으로 생성
    private Long id;

    // 해당 column의 제약조건을 설정하는 어노테이션
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
```
<br>

**2. Respository 인터페이스 정의**
> 엔티티를 조작하기 위한 인터페이스를 정의
```java
// 해당 인터페이스가 데이터 접근 계층의 컴포넌트임을 선언
// "Repository"를 의미
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    // DB에서 username이 일치하는 User 엔티티 객체를 반환하는 메서드
    Optional<User> findByUsername(String username);
}
```
<br>

**3. Service 클래스 정의**
> 엔티티를 사용하는 비즈니스 로직을 구현하는 서비스 클래스
> > UserRepository를 주입받아 사용
```java
@Service
public class UserService{
    // UserRepository를 주입받음
    @Autowired // 가독성을 위해 표시
    private final UserRepository userRepository;

    // 새로운 사용자 생성, 생성된 사용자 반환
    public User createUser(User user){
        return userRepository.save(user);
    }

    // username에 해당하는 사용자 정보 조회
    // 해당 사용자가 존재하는 경우 해당 정보를, 아닌 경우 null을 반환
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    // other method...
}
```
<br>

**4. Controller 클래스 정의**
> HTTP 요청을 처리하는 컨트롤러 클래스
> > UserService를 주입받아 사용
```java
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor // 새로운 필드를 추가할 때 생성자를 만들어야 한다는 번거러움을 줄여줌
public class UserController{

    @Autowired
    private final UserService userService;

    // 새로운 사용자 생성, 생성된 사용자 반환
    @PostMapping
    public User createUser(@RequestBody User user){

        return userService.createUser(user);
    }

    // username에 해당하는 사용자 정보 조회
    // 해당 사용자가 존재하는 경우 해당 정보를, 아닌 경우 null을 반환
    @GetMapping("/{username}")
    public User getUser(@PathVariable User user){
        
        Optional<User> user = userService.findByUsername(username);
        if(user.isPresent){
            return user.get();
        } else {
            throw new UserNotFoundException(username);
        }
    }

    // other method...
}
```