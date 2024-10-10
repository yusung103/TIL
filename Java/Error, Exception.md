# Error❗️
> 프로그램 코드에 의해 수습될 수 없는 심각한 오류

메모리 부족(OutOfMemoryError)이나 스택오버플로우(StackOverflowError)와 같이 복구할 수 없는 심각한 오류이고 예측이 불가능하다. 즉 JVM 실행에 문제가 생긴 것이므로 개발자가 대처할 방법이 없다.

그러나 프로그래밍에선 오류를 발생 시점에 따라 크게 3가지로 분류한다
- 📌 논리 에러 (Logic Error)
- 📌 컴파일 에러 (Compillation Error)
- 📌 런타임 에러 (RunTime Error)

---

### 📌 논리 에러 (Logic Error)
이른바 `버그` 라고 하는 논리 에러는 프로그램이 실행하고 작동하는데는 아무런 문제가 없지만 개발자가 예상한것과 달라 사용자가 의도한 작업을 수행하지 못하게 되어 서비스 이용에 지장이 생길 수 있다.

- 재고량이 음수가 나오는 경우
- 게임 캐릭터 체력이 0인데 죽지 않는 경우

📎 논리적 오류는 에러 메시지를 띄워주지 않는다. 개발자는 프로그램의 전반적인 코드와 알고리즘을 체크할 필요가 있다.

### 📌 컴파일 에러 (Compillation Error)
컴파일 단계에서 오류를 발견하면 컴파일러가 에러 메시지를 출력해주는 것을 말한다.

- 맞춤법
- 문장부호(;)
- 선언되지 않은 변수 사용

📎 컴파일 에러가 난다면 오류 메시지를 보고 코드를 수정하면 된다

### 📌 런타임 에러 (Runtime Error)
프로그램 실행중에 에러가 발생해서 잘못된 결과를 얻거나, 외부적인 요인으로 기계적 결함으로 인해 프로그램이 비정상적으로 종료 될 수 있다

- 대체로 개발시 설계 미숙(논리적)으로 발생하는 에러가 대부분

런타임 에러를 방지하기 위해 프로그램의 실행 도중 발생할 수 있는 경우의 수를 고려하여 대비를 해야한다

---

- `StackOverflowError`: 호출의 깊이가 깊어지거나 재귀가 지속되어 stack overflow 지속시 발생되는 에러
- `OutOfMemoryError`: JVM이 할당한 메모리의 부족으로 더 이상 객체를 할당할 수 없을 때 던져지는 에러, **Garbage Collector**에 의해 추가적으로 메모리가 확보되지 않을때 던져지기도 한다
  - Garbage Collector
    - 메모리 누수를 방지하기 위한 불필요한 메모리를 JVM이 알아서 정리해주는 기능
# Exception❗️
> 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에서 발생

예외는 오류와 다르게 개발자가 예외처리를 해줄 수 있다  
- 📌 예외 복구
- 📌 예외 회피
- 📌 예외 전환
---
### 📌 예외 복구
예외 상황을 파악하고 문제를 해결하고 정상 상태로 돌려놓는 방법이다.  
예외를 잡아서 일정 시간이나 조건만큼 대기하고 재시도를 반복. 최대 재시도를 넘길경우 예외 발생
```java
final int MAX_RETRY = 100;
int maxRetry = MAX_RETRY;
while(maxRetry > 0) {
    try {
        ...
    } catch (someException e) {
        // 로그 출력
    } finally {
        // 리소스 반납 및 정리 작업
    }
}
throw new RetryFailedException();
```

### 📌 예외 회피
예외 처리를 직접 담당하지 않고 호출한 메서드를 위임해 회피하는 방법
```java
public void add() throw SQLException {
    ...
}

public void add() throw SQLException {
    try {
        ...
    } catch(someException e) {
        // 로그 출력
        throw e;
    }
}
```

### 📌 예외 처리
메서드 밖으로 예외처리를 하지만 적절한 예외로 전환해서 넘기는 방법
```java
public void add(User user) throw 
DuplicateUserIdException, SQLException {
    try {
        ...
    } catch (SQLException e) {
        ...
    }
    else throw e;
}
```