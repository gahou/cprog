# cprog
競技プログラミング諸々用
過去に解いた問題から一部アルゴリズムをライブラリ化しています

## Main.java

入出力部分のフォーマット
main関数で入力を受け付けてsolver関数でその値をゴニョゴニョする想定

## グラフ理論

### Dijkstra.java
ダイクストラ法
負の閉路がない単一開始点からの最短コストを求める
ルートは保持していない
O(V^2)

### Warshall.java
ワーシャルフロイド法
n点間の最短距離マトリクスを返す
O(V^3)

### Kruskal.java未実装
クラスカル法

## 探索系

### Bsearch.java未実装

二分探索を行う

## 幾何系

### Projection.java未実装
垂線の足を求める

### Reflection.java未実装
ある直線に対象な点の座標を求める

### Clockwise.java未実装
2つのベクトルの時計回り反時計回りの関係性を求める

### Paraorth.java未実装
2直線の平行垂直判定を行う

### Intersection.java未実装
2線分の交差判定を行う

### Polygonv.java未実装
多角形の面積を求める

### Convex.java未実装
多角形が凸かどうか調べる

