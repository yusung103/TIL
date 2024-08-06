# Memory 
> 기억장치라고도 불리는 하드웨어는 CPU가 실행할 프로그램을 저장하는 곳

- **주 기억장치 (Main Memory Unit)**
  - RAM(휘발성), ROM(비휘발성)으로 구성
- 보조기억장치 (Auxiliary Memory Unit)
  - 하드디스크, USB 등을 지칭
- **캐시 메모리 (Cache Memory)**
  - 전원이 차단되면 데이터가 사라짐 = 휘발성
  - 주 기억장치에서 실행할 프로그램의 일부분을 꺼내봐서 CPU의 사용 직전에 보관하는 장소
  - 자주 사용되는 코드, 데이터, 프로그램 등이 저장
- 레지스터 (Register)
  - 캐시 메모리와 같이 휘발성 메모리
  - CPU 연산에 사용되는 기억장치
  - But 기억용량이 작지만 속도는 가장 빠름

## 📌 주 기억장치
- CPU가 직접 접근할 수 있음
- 현재 실행 및 수행되는 프로그램과 데이터를 저장하는 공간
### 🙋 RAM (Random Access Memory)
임의로 원하는 데이터에 접근 할 수 있는 방식을 가진 메모리
- 전원이 차단되면 저장된 내용을 잃는 휘발성 메모리
- CPU에서 실행할 대상 지정
- address라는 개념으로 데이터를 찾아감
#### 🧑‍💻 역할
- 여러 프로그램을 동시에 실행할 수 있게 함 (멀티태스킹)
  - 용량이 작으면 느려짐, 용량이 크면 여러 프로그램 원활하게 실행
- 데이터 임시 저장
- CPU의 굉장히 빠른 속도를 최대한 효율적으로 사용하기 위해 추가하는 물리적 장치

### 🙋 ROM (Read Only Memory)
컴퓨터의 기본 Boot loader와 **BIOS** 같은 프로그램 및 설정을 저장하는데 사용되는 메모리
- 전원이 차단되어도 데이터가 저장되는 비휘발성 메모리
- BIOS (Basic Input Output System)
  - 컴퓨터의 기본 입/출력장치나 메모리 등 하드웨어 작동에 필요한 명령을 모아놓은 프로그램