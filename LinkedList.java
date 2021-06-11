import java.util.*;
public class LinkedList{

    public static class Node
    {
        int data;
        Node next;
    }

    public static class LinkList {
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            
                Node temp = new Node();
                temp.data=val;
                temp.next=null;
            if(size==0)
            {
                head=tail=temp;
            }
            else
            { 
                tail.next=temp;
                tail=temp;
                
            }
            size++;
  
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
          System.out.println(temp.data);
        }
        System.out.println(list.size);
    
        if (list.size > 0) {
          System.out.println(list.tail.data);
        } 
      }
      public static void main(String[] args) throws Exception {
        
        LinkedList list = new LinkedList();
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        while(str.equals("quit") == false){
          if(str.startsWith("addLast")){
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          } 
          str = scn.next();
        }
    
        testList(list);
      }
}