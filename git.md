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

### branch
여러 개발자들이 동시에 다양한 적업을 할 수 있게 만들어주는 기능  
메인 브랜치에서 자신의 작업 전용 브랜치를 만듬. 그리고 각자 작업을 진행한 후, 작업이 끝난 사람은 메인 브랜치에 자신의 브랜치의 변경 사항을 적용함

### 버전관리(Version Control)  
프로젝트가 거주할 수 있는 디렉토리나 저장 공간. repo라고도 줄여 사용함

### 작업 폴더(Working Directory)
**작업이 일어나는 폴더**

### Staging Area(Index)
**작업 폴더에서 작업한 변경 내용을 기록하는 곳** (git 저장소에 commit하기 전에 올려두는 공간)  
stage에서 commit을 하게 되면 git 저장소로 변경 내용이 저장됨

---

### [git 명령어] 
### 1. Git Config
> Git에서 환경에서 사용하는 CLI(Command Line Interface 텍스트의 형식으로 명령어를 실행)

```git config --list``` : git 환경파일을 조회  

```git status``` : git의 상태를 조회. (commit, push 등..에 대한 상태)  

```git log``` : 현재 브랜치의 git에 대한 로그정보 조회  

```git log -n(숫자)``` : 현재 브랜치의 n개의 최신 commit 내용 조회  

```touch git``` : .gitignore 파일을 생성

---

### 2. Git Remote / Branch / Check-out
> Git Remote, Branch, check-out에서 사용하는 CLI 명령어

```git remote -v``` : 원격 저장소 목록을 조회  

```git remote rename<이전 리모트명> <수정 리모트명>``` : <수정 리모트명>으로 원격 저장소 명을 변경  

```git branch``` : 브랜치를 모두 조회  

```git branch -r``` : 원격 브랜치를 모두 조회  

```git branch -v``` : 등록된 브랜치에 대한 상세 정보를 조회  

```git branch <브랜치명>``` : <브랜치명>으로 생성  

```git branch -m <이전 브랜치명> <수정 브랜치명>``` : <수정 브랜치명>으로 수정  

```git branch <브랜치명> -d``` : <브랜치명> 기준으로 브랜치 삭제  

```git branch <브랜치명> -D``` : <브랜치명> 특정 브랜치 강제 삭제  

```git checkout <브랜치명>``` : 자신이 사용할 브랜치 명을 지정  

```git checkout -b <브랜치명>``` : 자신이 사용할 브랜치를 새로 만들어서 이동  

```git checkout master <브랜치명>``` : 내가 사용할 브랜치를 마스터 브랜치로 지정

---

### 3. Git 동장 관련 CLI
> Git에서 직접적인 동작을 수행하는 CLI 명령어

```git inti``` : 해당 위치에 git 저장소를 생성, .git 파일로 숨김파일이 생성된다  

```git clone <Github Repository URL>``` : 현재 디렉토리 위치에 Github 원격 저장소 내용을 복제  

```git clone <Github Repository URL> <경로>``` : <경로>에 Github 원격 저장소 내용을 복제  

```git add .``` : 현재 디렉토리 기준으로 모든 파일들을 Stage에 올림  

```git add <파일명>``` : 해당 파일을 Stage에 올림  

```git add <디렉토리명>``` : 해당 디렉토리 및 안에 파일들을 Stage에 올림  

```git commit -m "커밋 메시지명"``` : Git에 추가한 파일을 Commit  

```git commit --amend``` : 현재 commit의 commit 메시지 수정  

```git commit -am "메시지 명"``` : add 와 commit을 동시에 이용  

```git push``` : 로컬 저장소에 이쓴 내용을 '원격 저장소'에 저장  

```git pull``` : 원격 저장소에 있는 최신 내용을 '로컬 저장소'로 저장  

```git merge <브랜치명>``` : 현재 체크아웃 중인 브랜치 기준으로 <브랜치명>을 병합  

```git reset 'HEAD 파일'``` : git의 commit을 취소  

```git reset --hard``` : 변화된 내용들을 이전 상태로 되돌리고, 커밋, 수정 중 내용 모두 초기화  

```git reset --soft``` : 변화된 내용들을 이전 상태로 되돌리고, 커밋만 초기화, 수정 중인 내용은 유지