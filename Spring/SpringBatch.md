# SpringBatch
대량의 데이터를 처리, 주기적이고 반복적인 작업 실행할 때 사용
> 로깅/추적, 트랜잭션 관리, 작업 처리 통계, 작업 재시작, 건너뛰기, 리소스 관리 등 대용량 레코드 처리에 필수적인 기능 제공

배치가 실패하여 작업을 재시작하게 된다면 처음이 아닌 실패한 지점부터 실행. 중복 실행을 막기 위해 성공했던 Parameter로 중복 실행시 Exception이 발생.

### 📌 Batch 사용 사례
- 일매출 집계
- 구독 서비스
- 데이터 백업

### 📌 Spring Batch 용어
|이름|설명|
|:--:|:--:|
|Job|배치처리 과정을 하나의 단위로 만들어 놓은 객체. <br> 배치 처리과정 중 최상단에 위치 |
|JobInstance|Job의 실행 단위. Job을 실행하면 하나의 JobInstance가 생성.|
|JobParameters|JobInstance의 구별 객체. 외에도 개발자 JobInstance에 전달되는 매개변수 <br> String, Double, Long, Date 4가지 형식 지원 |
|JobExcution|JobInstance에 대한 실행 시도 객체. |
