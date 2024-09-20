# Spring AOP
AOP(Aspect-Oriented Programming) 관점 지향 프로그래밍을 의미한다
> **관점**을 기준으로 다양한 기능을 분리하여 보는 프로그래밍
> > 관점(Aspect)? 부가 기능과 그 적용처를 정의하고 모듈화 시켜놓은 것

### 👉 AOP를 사용하는 목적  
보통 애플리케이션이라면 핵심적인 **핵심 비즈니스 로직**(처리하려는 목적 기능) 이 있고, 애플리케이션 전체를 관통하는 **부가 기능 로직**이 있다    
이를 **횡단 관심사(cross-cutting Concerns)** 라고 한다  

횡단 관심사는 핵심 비즈니스 로직의 코드와 분류하여 코드의 간결성과 유연함, 무한한 확장을 가능하게 하도록 한다 (종류는 로깅, 보안, 트랜잭션이 있다)

### 👉 AOP의 필요성
사용자는 모든 비즈니스 함수가 실행 될 때(event) 특정 행위를(action) 할 수 있길 원한다  
이런 행위 대상은 클래스, 메서드로 특정할 수 있다  
이런 특정 행위들을 한데모아(Aspect Class) 모듈형태로 분리하여 별도로관리 할 수 있다 

가독성은 물론 재사용성을 제공하는데 큰 도움이 된다!

### 👉 AOP를 구현하는 방법 3가지
* 컴파일 과정에서 삽입하는 방식
* 바이트코드를 메모리에 로드하는 과정에 삽입하는 방식
* 프락시 패턴을 이용한 방식
  * 🙋‍♀️ 프락시란? : 특정 객체를 직접 참조하지 않고 대행(프락시)하는 객체를 통해 접근하는 패턴

이 가운데 Spring은 디자인 패턴 중 하나인 프락시 패턴을 통해 AOP기능을 제공한다  

## 🙌 정리
스프링 AOP 목적은 모듈화하여 재사용이 가능한 구성을 만들고, 모듈화된 객체를 편하게 적용함으로써 개발자가 **편안하게 비즈니스 로직을 구현**하는데 집중할 수 있게 도와준다!