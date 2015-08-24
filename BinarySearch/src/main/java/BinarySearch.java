
public class BinarySearch {
  int[] arr;
  int searchTerm;
  BinarySearch(int[] _arr, int _searchTerm) {
    arr = _arr;
    searchTerm = _searchTerm;
  }
  
  public boolean doSearch(){
    return _doSearch(0, arr.length - 1);
  }
  
  private boolean _doSearch(int lo, int hi) {
   int mid = lo + (hi - lo + 1) / 2;
   if(arr[mid] == searchTerm) { return true;}
   if(lo >= hi) return false;
   if(searchTerm < arr[mid]){
     return _doSearch(lo, mid - 1);
   }
   return _doSearch(mid, hi);
  }
   
}
