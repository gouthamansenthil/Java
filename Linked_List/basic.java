import java.util.*;
class Node 
{
    int data;
    Node addr;
    Node(int data) {
        this.data=data;
        addr=null;
    }
}
class LinkedList 
{
    Node head;                     //Empty LL

    void append(int data) {							//55
        Node nn=new Node(data);         //Step 1: Isolated Node
				
        //Step 2 - Linking
        if(head==null)  								//if 3000==null
            head=nn;								//1000.head=3000
        else {
            Node temp=head;							//3000
            while(temp.addr!=null)			//3000.addr!=null => null != null
            {
                temp=temp.addr;
            }
            temp.addr=nn;								//3000.addr = 5500
        }
    }
		
		void display()
		{
			if(head==null)
				System.out.println("EMPTY");
			else
			{
				Node temp=head;			//3000
				while(temp != null)	//null != null
				{
					System.out.printf("%d ",temp.data);		//4000.data => 55
					temp=temp.addr;		//temp = 4000.addr=>null
				}
				System.out.println();
			}
		}
		
		void addAtBegin(int data)
		{
			Node nn=new Node(data);
			
			if(head==null)		//if(this.head==null)
				head=nn;				//this.head=nn
			else
			{
				nn.addr=head;
				head=nn;
			}
		}
		void addafterPos(int data,int targetPos){     
			Node nn=new Node(data);
			if(head==null)		//if(this.head==null)
				head=nn;				//this.head=nn
			else
			{
				Node temp=head;
				int pos=1;
				while(temp!=null && pos<targetPos) {
					temp=temp.addr;
					pos++;
				}
				if(temp!=null) {
					nn.addr=temp.addr;
					temp.addr=nn;
				} else {
					System.out.println("Position out of bounds");
				}
			}
		}
}
public class basic {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int data;
        
				LinkedList ll=new LinkedList();
				while(true)
				{
					System.out.println("Enter choice: ");
					System.out.println("1. Append");
					System.out.println("2. Display");		
					System.out.println("3. Exit");
					System.out.println("4. Add at Beginning");
					int ch=ip.nextInt();
					switch(ch)
					{
            case 1: 									//append
								System.out.println("Enter data: ");
								data=ip.nextInt();			//55
                ll.append(data);					//1000.append(55);
								break;
						case 2:
								System.out.println("The linked list is: ");
								ll.display();
								break;
						case 3:
								System.out.println("Exit");
								System.exit(0);
								break;
						case 4:
								System.out.println("Enter data: ");
								data=ip.nextInt();
								ll.addAtBegin(data);
								break;
						default:
								System.out.println("Invalid Choice!!!");
								break;
					}
				}
    }
}