## 📌 DTO
`Data Transfer Object`로 **데이터 전송 객체**를 뜻함.  
계층간 데이터 교환을 위한 객체로 데이터만을 담아 전달.
- DB에서 데이터를 얻어 service나 controller 등으로 보낼 때 사용하는 객체.
- 로직을 갖지 않고 `getter/setter` 메서드만을 가짐.

## 📌 DAO
`Data Aeecss Object`로 **DB 데이터에 접근하기 위한 객체**를 뜻함.
- 프로젝트의 서비스 모델에 해당하는 부분과 데이터베이스를 연결하는 역할.
- 효율적인 커넥션 관리와 보안성.

## 📌 VO
`Value Object`로 **값 그 자체를 표현**하는 객체.  
객체의 정보가 변경되지 않는 불변성을 보장.
- VO 내부에 선언된 속성의 모든 값들이 VO 객체마다 값이 같아야 똑같은 객체라고 판별함.
- 서로 다른 이름을 갖는 VO 인스턴스라도 모든 속성 값이 같다면 두 인스턴스는 같은 객체로 인식.
- getter/setter 이외의 로직도 가질 수 있음.
```java
public class Money {
    private final int value;

    public Money(int value) {
        this.value = value;
    }

    public int getHalfValue() {
        return value/2;
    }

    @Override
    public boolean equals(Object o) {
    	if(this == o) return true;
        if(!(o instanceof Money)) retrun false;
        Money money = (Money) o;
        return value == money.value;
    }
    
    @Override
    public boolean hashCode() {
    	return Objects.hash(value);
    }
}
```
예로 여러 만원짜리 지폐의 고유번호가 달라도 같은 만원으로 보는 것처럼 값 자체로만 비교.

## 📌 Entity
**실제 DB 테이블과 매핑**되는 객체.  
DB 테이블에 존재하는 컬럼들을 필드로 가지는 객체로 DB 테이블과 1:1로 매핑되며 가지지 않는 컬럼을 필드로 가져선 안됨.
- 객체의 불변성을 보장해야함
- setter 메서드를 지양하고 생성자 또는 Builder를 사용
- 상속 ❌, 구현체 ❌

