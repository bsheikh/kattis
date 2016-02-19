# Graph Representations

Below are three graphs taken from your Textbook. Output their representation using the format specified below. Your solution may use an algorithm or a Hard-Coded answer.

![Figure 1](/Graph Representations/Images/Figure-1.png)

![Figure 2](/Graph Representations/Images/Figure-1.png)

![Figure 3](/Graph Representations/Images/Figure-1.png)

### Input

Input will consist of a single line of input that will say either "Graph 1", "Graph 2", or "Graph 3";

### Output

Your output should be the Adjacency matrix representation of the specified graph followed by an empty line. Then, print the Adjacency List representation of the specified graph.

The matrix format for a graph with NN vertices consists of N+1N+1 lines. The first line contains an asterisk followed by the names of all NN vertices separated by spaces. Every line afterward consists of a vertex name, followed by NN instances of 0s or 1s that indicate whether the vertices represented by this row and column are connected.

The Adjacency List format consists of NN lines where each line starts with a vertex name. After the name follows a vertical bar and then the names of all connected vertices separated by spaces.

#### Sample Input 1
```
Graph 1
```

#### Sample Output 1
```
* a b c d e f
a 0 0 1 1 0 0
b 0 0 1 0 0 1
c 1 1 0 0 1 0
d 1 0 0 0 1 0
e 0 0 1 1 0 1
f 0 1 0 0 1 0

a | c d
b | c f
c | a b e
d | a e
e | c d f
f | b e
```
