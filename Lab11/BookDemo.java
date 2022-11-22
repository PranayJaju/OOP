/*Consider a class Book with following data members:
a. serial_num - String
b. title - String
c. author - String
d. co_author - String(array)
Provide a parameterized constructor and methods in this class to perform the following task:
i. Display the details of a book.
ii. For each author display the books where he is the main author followed by the books where he is the co-author.
Write a driver class BookDemo that collects the details of array of books and accomplishes the given tasks.*/

import java.util.*;

class Book
{
	String serial_num, title, author, co_authors[];

	Book(String sn, String t, String a, String coa[])
	{
		serial_num=sn;
		title=t;
		author=a;
		co_authors=coa;
	}

	void display()
	{
		System.out.println("Serial No: "+serial_num);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.print("Co-Authors:");
		for(String x: co_authors)
			System.out.print(x+"  ");
		System.out.println();
	}

	static void AuthorBooks(Book[] b)
	{
		String a[]=new String[b.length]; int i=0;
		out:for(Book x: b)
		{
			for(int j=0; j<i; j++)
				if(a[j].equals(x.author)) continue out;
			a[i++]=x.author;
		}

		for(int j=0; j<i; j++)
		{
			System.out.printf("Books where %s is author:\n", a[j]);
			for(Book x:b)
				if(a[j].equals(x.author))
					x.display();

			System.out.printf("\nBooks where %s is co-author:\n", a[j]);
			for(Book x:b)
				for(String c:x.co_authors)
					if(a[j].equals(c))
						x.display();
			System.out.println("_________________________");
		}

	}
}

class BookDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many books:");
		int b_no=sc.nextInt();
		Book b[]=new Book[b_no];
		for(int i=0; i<b_no; i++)
		{
			System.out.println("Enter serial no:");
			String sno=sc.next();
			System.out.println("Enter title:");
			String title=sc.next();
			System.out.println("Enter author name:");
			String aut=sc.next();
			System.out.println("Enter no.of co-author: ");
			int coaNo=sc.nextInt();
			String coAut[]=new String[coaNo];
			if(coaNo>0)
			{
				System.out.println("Enter coauthors: ");
				for(int j=0; j<coaNo; j++)
					coAut[j]=sc.next();
			}
			b[i]=new Book(sno, title, aut, coAut);
			System.out.println("-------------------");
		}

		for(Book x: b)
		{
			x.display();
			System.out.println("**************");
		}
		System.out.println("\n^^^^^^^^^^^^^^^^^^");
		Book.AuthorBooks(b);
	}
}