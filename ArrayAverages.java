import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    
    double average = 0;

    for(int row = 0; row < ray.length; row++)
    {
      //reset the sum
      average = 0;
      //add each col in a single row
      for(int col = 0; col < ray[row].length; col++)
      {
        average += ray[row][col];
      }
      //calculate and print the average after gathering the sum of the row and dividing by the ammount of cols
      average /= ray[row].length; 
      System.out.println("The average of row " + row + " is: " + average);
      
    }
  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
      double average = 0;

    for(int col = 0; col < ray[0].length; col++)
    {
      //reset the sum
      average = 0;
      //add each row in a single col
      for(int row = 0; row < ray.length; row++)
      {
        average += ray[row][col];
      }
      //calculate and print the average after gathering the sum of the col and dividing by the ammount of rows
      average /= ray.length; 
      System.out.println("The average of column " + col + " is: " + average);
      
    }
  }

  public void arrayAverage(){
    double average = 0;

    //Add each position to the sum
    for(int row = 0; row < ray.length; row++)
      for(int col = 0; col < ray[row].length; col++)
        average += ray[row][col];


    //divide by the total amount the positions
    average /= (ray.length*ray[0].length);

    //print the average
    System.out.println("The average of array is: " + average);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
