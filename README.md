# hadoop-definitive-guide-examples
hadoop definitive guide example tutorial


## How to Use

```bash
# MacOS
./gradlew build 

# Windows
gradlew build
```
하시고 나면 `/build/libs/` 경로에 `hadoop-book.jar` 실행파일이 생깁니다. 

하둡에서 실행하실 때에는 아래와 같은 명령어로 원하는 클래스르 실행시키실 수 있습니다.
```bash
hadoop jar ./build/libs/hadoop-book.jar 실행할_클래스명 전달할_파라미터들
```
