public class LinkedList {
        public class Node
        {
            int data;
            Node next;
            Node(int value)//constructor
            {
                data=value;
                next=null;
            }

        }
    Node head;
        public void insertatstart(int val)
        {
            Node new_node=new Node(val);
            new_node.next=head;
            head=new_node;
        }
        public void insertatend(int val)
        {
            Node new_node=new Node(val);
            if(head==null)
            {
                head=new_node;
                new_node.next=null;
            }
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        //-------------------------------------
        public void insertmid(Node prev,int val)
        {
            Node new_node=new Node(val);
            if(prev==null) {
                head = new_node;
                new_node.next = null;
            }
            new_node.next=prev.next;
            prev.next=new_node;
        }
        public void delete(int key)
        {
            Node temp,prev;
            temp=head;
            prev=null;
            while((temp!=null) && (temp.data==key))
            {
                head=temp.next;//head changed
                return;
            }
            while((temp!=null) && (temp.data!=key))
            {
                prev=temp;
                temp=temp.next;
            }
            if(temp==null)
            {
                return;
            }
            prev.next=temp.next;
        }
    public void print()
        {
            Node tempnode=head;
            while(tempnode!=null)
            {
                System.out.println(tempnode.data+" ");
                tempnode=tempnode.next;
            }
        }
        public static void main(String[] args)
        {
            LinkedList l1=new LinkedList();
            l1.insertatstart(3);
            l1.insertatend(4);
            l1.insertatstart(1);
            l1.insertmid(l1.head.next,5);
            l1.delete(3);
            System.out.println("\nCreated Linked list is: ");
            l1.print();
        }
    }
