
public class OddEven {
  static int[] input;
  OddEven(int[] _input)  {
    input = _input;
  }
  public static void main(String[] args){
    
    input = new int[] {2, 1, 3, 4, 7, 9 ,24, 98};
    if(input.length == 0 || input.length %2 != 0)
      System.out.println("Invalid input");
    int wIndex = -1;
    
    for(int i = 0 ; i < input.length; i++) {
      if(IsRightPlace(input[i], i+1)) continue;
      if(wIndex == -1) {
        wIndex = i;
        continue;
      }
      if(matchForSwap(input[i], wIndex)) {
        swap(i, wIndex);
        if(IsRightPlace(input[i], i+1))
          wIndex = -1;
        else
          wIndex = i;
      }
    }
    
    for(int j = 0 ; j< input.length; j++) {
      System.out.print(input[j] + " ");
    }
      
  }
           
    
    
    
    
  
  
  private static boolean matchForSwap(int value, int wIndex) {
    if(value %2 == 0 && wIndex+1 % 2== 0)
      return true;
    if( value %2 != 0 && wIndex+1 %2 != 0)
      return true;
    return false;
  }
    
  private static void swap(int index1, int index2){
   int temp = input[index1];
    input[index1] = input[index2];
    input[index2] = temp;
  }
    
  
  private static boolean IsRightPlace(int value, int index) {
    if(value % 2 == 0 && index % 2== 0)
      return true;
    if(value % 2 != 0 && index % 2 != 0)
      return true;
    return false;
  }
   
}
