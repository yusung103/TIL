# Spring DI
DI(Dependency Injecton)는 **의존성 주입**을 의미한다
> 객체를 직접 생성하는 것이 아닌 Spring Container가 생성 후 주입시켜주는 방식

### Spring DI방법 3가지
- **생성자 주입 (Construct Injection)**
- **필드 주입 (Field Injection)**
- **setter 메서드 주입 (Setter Injection)**

```java
public class MyClass{

    // 필드 주입
    @Autowired
    private MyDependency myDependency;

    // 생성자 주입
    public Myclass(MyDependency myDependency){
        this.myDependency = myDependency;
    }

    // setter 메서드 주입
    public void setMyclass(MyDependency myDependency){
        this.myDependency = myDependency;
    }
}
```

스프링에서는 `@Autowired` 를 통하여 의존성 주입을 할 수 있다  
스프링 4.3 부터는 생성자 주입을 하는것을 권장한다  
생성자를 통해 의존성을 주입받는 방식은 래퍼런스 객체 없이는 **객체를 초기화할 수 없게 설계하였기 때문이다!**
