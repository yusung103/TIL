# 깃 기본 용어 정리
### [기본]

### 레포지토리(repository)
git을 초기화했을 때, 생성되는 '.git'이름의 폴더. 해당 적업 폴더의 모든 변경사항들과 히스토리들이 저장되는 저장소

### 로컬 저장소(local repository)
**내 PC에서 관리하는 git 저장소**  
로컬 git 저장소를 만들어주려는 디렉토리로 이동해서 아래 명령어를 실행하면 .git 폴더 생성  
```$ git init```  
이 명령어는 깃 저장소를 초기화시킨다. 실행하기 전까지는 일반 폴더이다. 이것을 입력한 후에야 추가적인 깃 명령어를 줄 수 있다.  
.git 폴더에 커밋, 스테이지 등 저장소에 필요한 뼈대 파일이 저장되어 있음

### 원격 저장소(remote repository)
**로컬 저장소를 업로드 하는 곳**  
ex) GitHub, Bitbucket, GitLab 등  
clone 명령어로 기존 원격 저장소를 로컬에 받을 수 있음  
```$ git clone https:// git저장소 주소```

### 버전관리(Version Control)  
프로젝트가 거주할 수 있는 디렉토리나 저장 공간. repo라고도 줄여 사용함

### 작업 폴더(Working Directory)
**작업이 일어나는 폴더**

### Staging Area(Index)
**작업 폴더에서 작업한 변경 내용을 기록하는 곳** (git 저장소에 commit하기 전에 올려두는 공간)  
stage에서 commit을 하게 되면 git 저장소로 변경 내용이 저장됨

---

### [git 명령어] 

### status
**파일의 상태를 확인하는 명령어**   
커밋된 파일 & 스테이지에 있는 파일 : tracked  
그 외 : untracked  
```$ git status```

### add
**작업 폴더에서 작업한 변경을 stage에 올릴 때 사용하는 명령어**  
add한 파일이 tracked 상태가 됨(git이 관리하는 대상이 됨)  
파일을 지정해서 올릴 수도 있고, 경로를 지정해서 변경된 모든 파일을 올릴 수도 있음  
```$ git add 파일1, 파일2```  
```$ git add .```

### commit
**git add 명령어로 스테이지에 추가한 수정 파일을 git 저장소에 저장**  
※ 주의 : 스테이지에 올려놓지 않은(untracked) 파일은 커밋되지 않음  
```$ git commit -m "커밋 메시지"```

### fetch
**로컬에는 없지만 원격 저장소에 올라가 있는 데이터를 모두 가져옴**(업데이트)  
자동으로 merge 작업을 하지는 않음  
```$ git fetch origin```

### push
**commit한 파일을 원격 저장소에 올리는 명령어**  
git push <원격 저장소 이름><브랜치 이름>  
```$ git push origin master```

### pull
**최신의 remote repository 변경사항들을 local(old)으로 가져와 적용**  
push 하기 전에 pull을 하지 않으면 이미 원격저장소에 변경사항이 일어났을 대 push에 실패함, 수시로 원격 저장소에 있는 변경사항을 pull 받는 것이 충돌 예방에 최선  
```$ git pull origin master```

### merge
브랜치 병합  
**현재 작업 중인 브랜치에 합칠 커밋을 지정해서 병합**  
<commit> 위치에는 주로 병합할 branch 이름을 넣고, 커밋 체크섬을 넣어도 됨(숫자랑 영어로 조합된 40글자 SHA-1해시 값, 커밋 고유 번호)  
```$ git merge <commit>```

### branch
메인  프로젝트를 기반으로 시도하는 실험이나 개발을 할 수 있는 환경을 말함  
```$ git branch``` : 생성되어 있는 브랜치를 확인  
```$ git branch {name}``` : name의 이름으로 새로운 브랜치를 생성

### checkout
**브랜치 전환**  
예를 들어 현재 feature 브랜치에서 작업을 하다가 develop 브랜치로 전환을 하려면 아래와 같이 명령어를 실행하면 됨  
```$ git checkout develop```  

현재 브랜치를 name으로 변경하고 싶으면 아래와 같이 명령어를 실행하면 됨  
```$ git checkout {name}```

### git reset
**작업된 파일들을 특정 커밋 위치로 리셋**  
```$ git reset {soft/mixed/hard}```