import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class HiCal
{

 class Interval
  {
      Integer start, end;
      public Interval(int _start, int _end)
      {
          start = _start;
          end = _end;
      }
      public String toString()
      {
          return "["+start+","+end+"]";
      }
  };
	 
  Interval[] meetings;

  HiCal(int[][] _meetings)
  {
      meetings = new Interval[_meetings.length];
      for(int i = 0 ; i < _meetings.length; i++)
      {
          meetings[i] = new Interval(_meetings[i][0], _meetings[i][1]);
      }
  }
                          
  ArrayList<Interval> condenseLists()
  {
      ArrayList<Interval> condensedList = new ArrayList<Interval>();
      Arrays.sort(meetings,new Comparator<Interval>() {
                                                                        public int compare(Interval i1, Interval i2){
                                                                            return i1.start.compareTo(i2.start);
                                                                        }
                                                                    });
      int i = 0;
      Interval mergedInterval = meetings[0];
      while(i < meetings.length - 1) {
    	  Interval nextInterval = meetings[i+1];
    	  if(nextInterval.start <= mergedInterval.end)
    	  {
    		  mergedInterval.end = Math.max(mergedInterval.end, nextInterval.end);
    	  }
    	  else
    	  {
    		  condensedList.add(mergedInterval);
    		  mergedInterval = nextInterval;
    	  }
    	  i++;
      }
      condensedList.add(mergedInterval);
      return condensedList;
  }
    
  public static void main(String[] args)
  {
      int[][] meetings = //new int[][] {{1, 10}, {2, 6}, {3, 5}, {7, 9}};
    		  //new int[][] {{1, 5}, {2, 3}};
    		  //new int[][] { {1, 2}, {2, 3} };
    		  new int[][]{{0, 1}, {3, 5}, {4, 8}, {10, 12}, {9, 10}};
      HiCal hcal = new HiCal(meetings);
      ArrayList<Interval> results = hcal.condenseLists();
      for(Interval i : results)
      {
          System.out.println(i);
      }
  }
}
          
          
                  
      
      
              
  
   
  

