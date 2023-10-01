// Returning the number missing in he array using cyclic sort
import java.util.*;
public class MissingnNumber {
    public static void main(String[] args) {
        //return the only no that is missing in the range

        int[] arr={4,2,5,0};
        System.out.println(missing(arr));
        
    
         
    }

    static List<Integer> missing(int[] arr){
        int i=0;
       while (i<arr.length) {
        int correctidx=arr[i];
        if (arr[i]<arr.length && arr[i]!=arr[correctidx]) {
            swap(arr, i,correctidx);
            
        } else {
            i++;
        }

      
        
       }
    List<Integer> ans = new ArrayList<>();
      for (int j = 0; j < arr.length; j++) { 
            if (arr[j]!=j) {
              ans.add(j);
                
            }
            else{

            }
            
        }
        // if  n is missing from array 
        return ans;

    }


    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
    }
     


    
}
