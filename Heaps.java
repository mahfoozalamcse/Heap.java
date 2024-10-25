import java.util.*;
public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x-1)/2; // par index

            while (arr.get(x) < arr.get(par)) { // t.c. => logn
                //  swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(x, temp);
            }
        }
    
    // peek()
    public int peek(){
        return arr.get(0);
    }

    private void heapify(int i){
       int left = 2*i+1;
       int right = 2*i+2;
       int minInx = i;
       
       if(left < arr.size() && arr.get(minInx) > arr.get(left)){
          minInx = left;
       }

       if(right < arr.size() && arr.get(minInx) > arr.get(right)){
        minInx = right;
      }

      if (minInx != i) {
         // swap
         int temp = arr.get(i);
         arr.set(i, arr.get(minInx));
         arr.set(minInx, temp);

         heapify(minInx);
      }
    }
    // delete
    public int remove(){
        int data = arr.get(0);

        // step1 - swap first & last
        int temp = arr.get(0);
        arr.set(0, arr.size()-1);
        arr.set(arr.size()-1, temp);

        // step2 - delete last
        arr.remove(arr.size()-1);

        // step3 hipify

        heapify(0);
        return data;
    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }
}

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
