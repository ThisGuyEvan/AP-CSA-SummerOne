
public class Main {
  public static void main(String[] args) {

    // These variables are the dimensions of the frame.
    int length = 10; //20
    int width = 6;  //9
    // These variables create the size of the "cone". 
    int height = 5; //10

    frame(length, width);
    downCone(height, length);
    upCone(height, length);
    frame(length, width);
  }


// This method or function creates a frame for whatever masterpiece.
  public static void frame(int x, int y){
    String line = "-";


// Because I do not understand lists yet in Java, I resort to mainly using loops.


// I thought that there might be another idea or method that I could use to simplfy this ,but I do not understand string-builder and string-buffers.
    for (int j = 0; j < x; j++){
      line += "-";
    }
    
    System.out.println(line);
// As the variable's name states, This is basically hollowing the frame. I again thought of other ideas (spliting, remove, lists and some more) however I am so limited to what I can use right now so I improvised by juset subtracting 2 from the length and replacing the leftovers with " ". 
    String hollow = " ";
    for (int i = 0; i < x-2; i++){
      hollow += " ";
    }
// Here I just joined them together. 18x Spaces and 2x | which makes 20, the length.
    for (int e = 0; e < y-2; e++){
      System.out.println("|" + hollow + "|");
    }
    System.out.println(line);
  }


//This was most challenging part of the whole assignment because I attempted to create a cone based off of the frames size, however later you can see I failed. Of course given more time I might have figured it out,

// The reason why I created the upCone and downCone methods is because if I were to combine them, it would have been to confusing to code and read. For example, up and down cone are a complete flip of each other.
  public static void upCone(int a, int b){
    // The idea of spacing came to me when I saw your code with the cones and I thought that it was too hard coded.
    String spacing = "";
    for (int c = 0; c < b/2; c++){
      spacing += " ";
    }
    //Ater many trials I went with the idea of a diameter because it was eaiser to read and it just made a lot more sense because the spacing and diameter aren't the samething.
    String diameter = "";
    // This is a simple for loop that just combines the ideas of spacing and diameter.
    for (int d = 0; d < a; d++){
      System.out.println(spacing + "/" + diameter + "\\");
      b -= 2;
      spacing = "";
      for (int z = 0; z < b/2; z++){
        spacing += " ";
      }
      diameter += "  ";
    }
  }


  //Like I said this is a complete flip of upCone.
  public static void downCone(int a, int b){
    String spacing = "";

    String diameter = "";
 // This for loop was hard coded. Not enough time to solve this because the spacings are so different. I tried b -= 4 and b/4 in a different fort loop to make this method dependent on the size of the frame.
    for (int d = 0; d < a; d++){
      spacing += " ";
      b -= 2;
      diameter = "";
      for (int w = 0; w < b/2; w++){
        diameter += "  ";
      }
      // Remove the \n for a hour glass like image?
      System.out.println(spacing + "\\" + diameter + "/");
    }
  }
}


// Well my opbjective was to make a hourglass by just inputing dimensions for a frame.

// Also I could eaisly make a stick figure with this code. by just finding the center of downcone and replacing the space with " | " and removing the last frame. 

// If you think about it, it can also be houses. 