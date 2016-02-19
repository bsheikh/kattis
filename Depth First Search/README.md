# Depth First Search

Given an arbitrary graph in Adjecency List format, traverse it using a DFS algorithm. Print out the name of each node on a separate line in the order they are visited.

Nodes will have names that are a single letter long. These are case sensitive. When given the option to select from a group of nodes, first pick upper-case nodes then select alphabetically.

![Figure 1](/Depth First Search/README.md)

For example, in this case, we have to pick a node to begin. So we pick the first alphabetical node, a. Then we can pick from either c or d, so we pick c.

### Input

The first line of the input will indicate NN (1<=N<=531<=N<=53), the number of vertices in the graph. The next line will contain NN letters in ASCII order, separated by spaces. Each letter is a vertex label.

The next NN lines contain the graph edges in Adjecency list format.

The Adjecency List format consists of NN lines where each line starts with a vertex name. After the name follows a vertical bar and then the names of all connected vertices separated by spaces.

### Output

Your output should contain a single character (the vertex label) per line. These should be in the order you traversed the graph.

#### Sample Input 1
```
6
a b c d e f
a | c d
b | c f
c | a b e
d | a e
e | c d f
f | b e
```

#### Sample Output 1
```
a
c
b
f
e
d
```
