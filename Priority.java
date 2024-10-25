import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Priority
 */
public class Priority {

    
     // here class object compare please undersand and revise how compare

     static class Student implements Comparable<Student>{ // overrriding
        String name;
        int rank;

        public Student(String name , int rank){

            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
     }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));  // O(log n)
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 11));
        pq.add(new Student("D", 2));
        pq.add(new Student("E", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}

      // java collection framework use priority queue


//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// reversed order only
//         pq.add(3);
//         pq.add(1);
//         pq.add(2);
//         pq.add(5);
//         pq.add(9);
        
//        while (!pq.isEmpty()) {
//          System.out.println(pq.peek());
//          pq.remove();
//        }
//     }
// }