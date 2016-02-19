# Crafting Mines

Steve is a miner in a blocky, 2D world. In this world, materials can be mined one block at a time. Steve is mining the depths looking for diamonds. He’s got a trusty pickaxe that can mine all the cobblestone he wants, but he unfortuntely can’t mine obsidian.

Steve has asked you to find out how to get to the diamonds. Steve is not too greedy so he’s fine with finding just one diamond. He is, however, quite lazy, so he’s asking you to find the diamond that will require him to mine the least amount of cobblestone.

It should be worth noting that steve can only mine in 4 directions: up, down, left and right.

### Input

The first line of the input contains four integers W,H,SX,SYW,H,SX,SY where 10<WS,HS<=100010<WS,HS<=1000 and 0<SX<=WS,0<SY<=HS0<SX<=WS,0<SY<=HS. SXSX and SYSY represent Steve’s position (in blocks) from the topleft of the map.

This is followed by a mine map comprised of HH lines containing WW characters.

In this map:
  * The ’O’ characters represent obsidian, which Steve can’t go through
  * The ’-’ characters represent cobblestone.
  * The ’*’ characters represent diamonds.
  * The ’S’ character represents Steve’s current position.

### Output

If you find the closest diamond(in terms of least cobblestone mined), output its position (row and collumn separated by a space) on the first line. Followed by a line stating the number of blocks you mined(including the diamond block).

In the case where there is more than one diamond at a given distance, output the leftmost then topmost one.

However, it is quite posible that Steve can’t reach any diamonds (Because he is surrounded by cobblestone) in which case, output a single line saying: "No Luck!".

#### Sample Input 1
```
16 8 6 4
---OOOOOOOOOOOOO
--OOOOOOOOOOOOOO
-O*------OOOOOOO
OOOOOOOO-OOOOOO-
OOOOOOS--OOOOO--
OOOOOOOO-OOO----
OO*------OOOO---
OO*OOOOOO*O-----
```

#### Sample Output 1
```
2 2
Blocks: 10
```

#### Sample Input 2
```
16 11 13 0
-------OOOOO-S--
------OOOOOOO---
----OOOOOOOOOO--
---OOOOOOOOOOOO-
--OOOOOOOOOOOOO-
--OOOOOOOOOOOOOO
-OOOOOOOOOOOOOOO
OOOOOOOOOOOOOOOO
OOO*OOOOOOOOOOOO
OOOOOOOOOOOOOOOO
OOOOOOOOOOOO*OOO
```

#### Sample Output 2
```
No luck!
```

#### Sample Input 3
```
15 11 2 4
----*----------
---------------
---------------
-------*-------
--S------------
---------------
---------------
---------------
OO----------*--
OOOO-------OOOO
OOOOOOOOOOOOOOO
```

#### Sample Output 3
```
4 0
Blocks: 6
```
