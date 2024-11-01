# ULID
Universally Unique Lexicographically Sortable Identifier 는 대소문자를 구별하지 않고 시간을 나타내는 10글자와 임의의 값 16글자로 이루어져 있다  
![!\[ULID\](/image/ULID)](image/ULID.png)

### 📌 등장 이유
UUID의 단점을 극복하고자 ULID가 탄생. ULID는 생성 순서를 ms단위로 기록할 수 있어서 생성 순서대로 정렬할 때 편리하다. 

### 📌 충돌 확률
1ms에 2^80개 까지 만들 수 있음  
-> 밀리 초당 1,000개의 이벤트를 처리한다고 가정했을 때 향후 100년 동안 충돌할 확률이 0.000126%에 불과하다