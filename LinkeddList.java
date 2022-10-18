
/* LinkedList Implementation using Collection framework in Java
 * Operation perfomed
 * add (First,Last)             Timecomplexity = O(1)
 * print                        Timecomplexity = O(n)
 * delete(First,Last)
 * Tracking size of LinkedList(size)
 */
import java.util.LinkedList;

public class LinkeddList {
    public static void main(String args[]) {
        LinkedList<String> List = new LinkedList<String>();

        // Inserting & Tracking the size of LinkedList

        List.addFirst("is");
        List.addFirst("Name");
        System.out.println(List);

        List.addFirst("My");
        List.addLast("Tingu");
        System.out.println(List);

        System.out.println(List.size());

        /*
         * [My, Name, is, Tingu]
         * Size=4
         */

        // Printing & Tracking the size of LinkedList

        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " -> ");
        }

        System.out.println("null");
        System.out.println(List.size());

        /*
         * My -> Name -> is -> Tingu -> null
         * size=4
         */

        // Deleting & Tracking the size of LinkedList

        List.removeFirst();
        System.out.println(List);
        System.out.println(List.size());

        /*
         * Before:My -> Name -> is -> Tingu -> null
         * Size  :4
         * After :[Name, is, Tingu]
         * Size  :3
         */

        List.removeLast();
        System.out.println(List);
        System.out.println(List.size());

        /*
         * Before:[Name, is, Tingu]
         * Size  :3
         * After :[Name, is]
         * Size  :2
         */

         //Deleting Specific element
         
         List.remove(1);
         System.out.println(List);
         System.out.println(List.size());


         /*
          * Before:[Name,is]
            size  :2
            After :[Name]
            Size  :1
          */

    }
}
