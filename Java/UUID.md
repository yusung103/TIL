# UUID
> `Univarsally Unique IDentifier `  
> 네트워크 상에서 고유성이 보장되는 id를 만들기 위한 표준 규약

네트워크는 ID를 관리하는 중앙 관리자가 없기 때문에 중복확인이 불가능함. 때문에 중복되는 확률이 '0'에 가까운, 매우 낮은 확률을 가지는 방법을 표준화 한 것이 `UUID`. 

### 📌 UUID의 구성
UUID는 `8-4-4-4-12` 의 형태로 각 문자는 16진수로 이루어져 있음.  
`f47ac10b-58cc-4372-a567-0e02b2c3d479`  
|Field|Bytes|Hex Digits|Bite|내용|
|:--:|:--:|:--:|:--:|:--:|
|time_low|4|8|32|시간 하위 32비트|
|time_mid|2|4|16|시간 중간 16비트|
|time_hi_and_version|2|4|16|최상위 비트에서 4비트 "version", 시간의 high 12비트|
|clock_seq_hi_and  _res_clock_seq_low|2|4|16|UUID 4기준 난수|
|node|6|2|48|노드 ID의 48|

### 📌 종류
UUID 버전은 1, 3, 4, 5버전이 있음. 이중 가장 많이 쓰는 버전은 1, 4버전이다.  
1 버전 같은 경우 타임 스탬프 기준으로 생성. (호스트 ID, 시퀀스 번호 및 현재 시각으로 UUID 발급)  
4 버전은 랜덤 생성 (무작위 UUID).

📎 주로 버전 1보다 4를 많이 사용함. 버전 1같은 경우 호스트 ID로 발급이 이루어지고 있기 때문에 조금이나마 유출 가능성이 있어서 랜덤으로 UUID를 발급 받기 때문에 보안성이 높아 버전 4를 더 사용한다.

### 📌 충돌 확률
UUID는 중복되기 어려운 값들을 수 없이 길게 나열해서 단일 값을 보장함. UUID가 충돌할 확률은 1/2^122 이며 충돌은 거의 불가능에 가깝다

### 📌 UUID 만들기
#### 📎 Java
```java
import java.util.UUID;

Stirng uuid = UUID.randomUUID().toString();
System.println.out(uuid);
```

#### 📎 Kotlin
```kotlin
import java.util.UUID

val uuid = UUID.randomUUID().toString()
println(uuid)
```