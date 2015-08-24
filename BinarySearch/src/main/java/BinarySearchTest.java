public class BinarySearchTest {
  public static void main(String[] args){
    int[] arr = new int[]{-45, -44, -12, 1, 12, 34, 55};
    int st = 56;
    BinarySearch bsrch  = new BinarySearch(arr, st);
    System.out.println(bsrch.doSearch());
  }
}
