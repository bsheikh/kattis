import java.util.Scanner;

public class AsciiArtEasy {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int ws = sc.nextInt();
    int hs = sc.nextInt();
    int wt = sc.nextInt();
    int ht = sc.nextInt();
    sc.nextLine();

    char[][] search = new char[hs][ws];
    char[][] template = new char[ht][wt];

    for (int i = 0; i < hs; i++) {
      search[i]= sc.nextLine().toCharArray();
    }
    for (int i = 0; i < ht; i++) {
      template[i] = sc.nextLine().toCharArray();
    }
    int resultX = -1;
    int resultY = -1;

    for (int y = 0; y <= hs - ht; y++) {
      for (int x = 0; x <= ws - wt; x++) {
        boolean match = true;
        for (int i = 0; i < ht; i++) {
          boolean lineMatch = true;
          for (int j = 0; j < wt; j++) {
            char searchChar = search[y + i][x + j];
            char tempChar = template[i][j];
            if (searchChar != tempChar){
              lineMatch = false;
              break;
            }
          }
          if (lineMatch == false){
            match = false;
            break;
          }

        }
        if (match == true) {
          resultX = x;
          resultY = y;
        }
      }
    }
    if(resultX != -1) System.out.println(resultX+ " " +  resultY);
    else System.out.println("no match");
  }
}
