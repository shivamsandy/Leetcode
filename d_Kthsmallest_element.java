import java.util.Collections;
import java.util.PriorityQueue;

public class d_Kthsmallest_element {
    public static void main(String[] args) {
        int arr[]  = {1,4,6,3,6,7,8};
        int k  =3;

        System.out.println(Kthsmallest_element(arr,k));

    }
    public static int Kthsmallest_element(int arr[] , int k) {
         PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
          for(int x  :arr){
            pq.add(x);
          }
          while(pq.size()>k){
            pq.remove();
          }
        return pq.peek() ;

    }

    // chatgpt
//  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

// for(int x : arr){
//     pq.add(x);
//     if(pq.size() > k){
//         pq.remove();
//     }
// }
    
}