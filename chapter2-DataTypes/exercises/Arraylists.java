import java.util.ArrayList;

public class Arraylists

  {
    public static void main ( String[] args )
    {
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("abc");
      arr.add("dan");
      arr.add("rahul");
      for (int i = 0; i < 2; i++) {
        System.out.println(arr.get(i));
      }
    }
  }
