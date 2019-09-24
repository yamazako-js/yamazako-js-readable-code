# プログラムの動作確認手順

プログラムの動作を確認するために jar を用意しています。
以下の手順に従って、動作の確認ができます。

※ あらかじめ Java 11 がインストールしてある必要があります。

1. 以下の task.jar をローカルの任意の場所にダウンロードする

https://github.com/yamazako-js/yamazako-js-readable-code/blob/master/task.jar

例 /usr/task.jar

2. 辞書ファイルを用意する

サンプルの辞書ファイルを置いています。

https://github.com/yamazako-js/yamazako-js-readable-code/blob/master/sample-dictionary-data.txt

3. 以下のコマンドを実行する

java -jar /usr/task.jar [辞書ファイルのパス]

例 java -jar /usr/task.jar /usr/sample-dictionary-data.txt


※ 以下のようなエラーが出たら、コマンドラインで `java -version` を実行し、 Java 11 がインストールされていることの確認を行ってください。

```
Error: A JNI error has occurred, please check your installation and try again
Exception in thread "main" java.lang.UnsupportedClassVersionError: Main has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class
```