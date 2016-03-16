import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ClosestPair {

  public static void main(String[] args) throws IOException {
    //There is a lot of input so we use BufferedReader to read. Scanner would take too long!
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      int n = Integer.parseInt(sc.readLine());

      if (n==0) return;
      //Create our array of points.
      Point2D[] arr = new Point2D[n];
      for (int i = 0; i < n; i++) {
        //Read each line, split the input at the space and create a new Point2D for each point.
        String[] split = sc.readLine().split(" ");
        arr[i] = new Point2D.Double(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
      }
      //We want to start by pre-sorting the points by their X-Coordinate
      Comparator<Point2D> ComparatorByX = new Comparator<Point2D>() {
        @Override
        public int compare(Point2D o1, Point2D o2) {
          return Double.compare(o1.getX(), o2.getX());
        }
      };
      Arrays.sort(arr, ComparatorByX);

      //Find the closest pair.
      Point2D[] min = getClosestPair(arr);

      //Output the points. Don't worry if the output has a few extra zeroes.
      System.out.printf("%f %f %f %f \n",min[0].getX(),min[0].getY(),min[1].getX(),min[1].getY());

    }
  }

  //TODO: Should return an array of size 2 containing the closest 2 points in arr.
  private static Point2D[] getClosestPair(Point2D[] arr) {

    //Your job is to implement the ClosestPair divide & conquer algorithm seen in class.. Your input size is HUGE!
    //You will need to be as efficient as possible. N^2 will DEFINITELY not work.
    //Try to keep your operations to a minimum. Particularly inside your innermost loop.

    //Make sure you cover your base case (arr.length < 3)

    //You'll have to copy the array into two different parts at some point.
    //Consider looking at Arrays.copyOfRange(T[], int, int);

    //Remember that squareRoot is an expensive operation! Avoid using it a lot.
    //Calling point2D.distance() has a square root inside. Use distanceSq() instead.

    return new Point2D[]{best1, best2};
  }
}
