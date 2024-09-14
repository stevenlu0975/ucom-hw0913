

# 0913hw

0913 hw
- Sorting
- Lottery

 
## 目录

- [0913hw](#0913hw)
  - [目录](#目录)
    - [環境](#環境)
    - [如何使用](#如何使用)
          - [作業一](#作業一)
          - [作業二](#作業二)
    - [文件目录说明](#文件目录说明)

### 環境

```
java version "21.0.4" 2024-07-16 LTS
Java(TM) SE Runtime Environment (build 21.0.4+8-LTS-274)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.4+8-LTS-274, mixed mode, sharing)
```

### 如何使用





###### 作業一

1. 產生降冪結果

```
java -cp hw0913-0.0.1-SNAPSHOT.jar com.systex.main.Sorting 1
```
2. 產生升冪結果
```
java -cp hw0913-0.0.1-SNAPSHOT.jar com.systex.main.Sorting 0
```
###### 作業二
說明:
第一個參數為要產生多少組號碼，第二個參數為要排除的數字

```
java -cp hw0913-0.0.1-SNAPSHOT.jar com.systex.main.Lottery 3 " 1 2 3 4 5" 
```

### 文件目录说明
eg:

```
filetree 
|   .gitignore
|   pom.xml
|   README.md
|   
|       
+---src
|   +---main
|   |   +---java
|   |   |   \---com
|   |   |       \---systex
|   |   |           +---main
|   |   |           |       Lottery.java
|   |   |           |       Sorting.java
|   |   |           |       
|   |   |           \---model
|   |   |                   LotteryGenerator.java
|   |   |                   MyDate.java
|   |   |                   
|   |   \---resources
|   \---test
|       +---java
|       \---resources


```









