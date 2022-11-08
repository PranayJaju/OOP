import java.util.*;
class Node<T>
{
	T data;
	Node<T> next;
	Node(T ele){data=ele; next=null;}
}

class LinkedList<T>
{
	Node<T> head, end;
	LinkedList(){head=null;}
	public void append(T ele)
	{
		Node<T> newNode=new Node<>(ele);
		if(head==null)
		{
			head=newNode;
			end=newNode;
		}
		else
		{
			end.next=newNode;
			end=newNode;
		}
	}
	public T delete(int index)
	{
		Node<T> current=head, prev=null;
		for(int i=0; i<index; i++)
		{
			prev=current;
			current=current.next;
		}
		if(prev==null)
			head=current.next;
		else 
			prev.next=current.next;
		return current.data;
	}
	public void printList()
	{
		Node<T> temp=head;
		while(temp!=end)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}

class Link
{
	public static void main(String[] args)
	{
		LinkedList<Integer> lli=new LinkedList();
		LinkedList<String> lls=new LinkedList();

		lli.append(23); lli.append(69); lli.append(34);
		lls.append("abc"); lls.append("xyz"); lls.append("ijk"); lls.append("pqrs");

		lli.printList();
		lls.printList();
	}
}