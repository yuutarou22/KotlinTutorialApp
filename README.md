# KotlinTutorialApp🦜
Kotlinの学習用リポジトリ

## 概要🙂
以前から気になっていた言語でもあり、Kotlin関係のお仕事が増えてきているという実情も踏まえて学習を進めます。
まずは公式のチュートリアルで学習を進める。

https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin/#0

## 参考（忘れているのが多いので書き残しておく）🤔
- メニューバー、ツールバー
  - https://qiita.com/folivora/items/eaa1e6a92ac2b2ea4220
  - https://qiita.com/hirotann618/items/393c45a581f1b6b6178f
- when, if
  - https://qiita.com/AAkira/items/3d5b694d488fe029d7b9
- 画面遷移
  - https://www.usaco-pg.com/2017/05/01/kotlin-android-intent/
  - https://akira-watson.com/android/activity-1.html
- TextView内での中央表示
  - http://programming-cafe.com/android/xml/center-characters-textview/
- LinearLayout内の均等配置
  - https://cpoint-lab.co.jp/article/201803/1716/
- Mathクラスの乱数メソッド
  - https://blog.java-reference.com/java-math-random/

## メモ✍️
```
// TextViewの文字列を取得してインクリメントする
num = num_text.getText().toString().toInt()
num++
```
⬆️のコードを⬇️のように実装しようとした。
```
// 一気にインクリメントしちゃえー。
num = (num_text.getText().toString().toInt())++
```
Variable expectedとエラーがでた。

- NullSafetyという仕様が関連しているよう。(よくわからん)
  - https://qiita.com/koher/items/d9411a00986f14683a3f
