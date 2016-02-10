#Ascii Art(Easy)

Joan is a hard-core OS programmer who insists on using a command-line terminal for everything. She really enjoys the monospace font that it has. When she writes documents (Mostly man pages) she illustrates them using ASCII art images. That is to say, her images are composed of a paragraph of ASCII characters in such a way that it looks like a picture.

Over time, Joan has made a lot of pictures, and wants to search her pictures to see if she’s used the same ASCII characters elsewhere. In other words, Joan wants to know whether a sample image contains a given template image. She has tasked you with writing the comparison program.

Joan is very creative, so in every one of her files, her images contain a wide variety of ASCII characters dispersed somewhat evenly about the monochrome canvas.

###Input
The first line of the input contains four integers WS,HS,WT,HTWS,HS,WT,HT where 0<WS,HS<=1000,0<WT<=WS,0<HT<=HS0<WS,HS<=1000,0<WT<=WS,0<HT<=HS.

This is followed by a sample ASCII image comprised of HSHS lines containing WSWS characters. Then follow HTHT lines containing WTWT characters that comprise the template image.

###Output
If you find the entire template image in the sample image, your program should output two integers XX and YY on one line, where (X,Y)(X,Y) is the position of the top left character of the top-most, left-most match. If such a match does not exist, your program will output "no match".

Positions on the image start from (0,0)(0,0) at the top left and continue until (WS,HS)(WS,HS). Assume 0<=X<=WS−WT0<=X<=WS−WT and 0<=Y<=HS−HT0<=Y<=HS−HT.

#### Sample Input 1
```
42 11 4 3
#----------------------------------------#
# ______________________________________ #
#/           Does an ASCII cow          \#
#\         produce Unicode milk?        /#
# -------------------------------------- #
#       \   ^__^                         #
#        \  (oo)\_______                 #
#           (__)\       )\/\             #
#               ||----w |                #
#               ||     ||                #
#----------------------------------------#
^__^
(oo)
(__)
```

#### Sample Output 1
```
12 5
```

#### Sample Input 2
```
14 8 2 1
*------------*
| /))))))))) |
|//) __   __\|
|C==/_o|^|o_\|
||      _\  )|
| \   .--. / |
|_/`-. __./_ |
*------------*
<3
```

#### Sample Output 2
```
no match
```
