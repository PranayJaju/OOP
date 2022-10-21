class Q
{
	int n;
	boolean ctrl=true;
	synchronized void put(int n)
	{
		if(!ctrl)
		{
			try{wait();}
			catch(InterruptedException ie){;;}
		}
	    this.n=n;
	    System.out.println("Put: "+n);
	    ctrl=false;
	    notify();
	}
	synchronized int get()
	{
		if(ctrl)
		{
			try{wait();}
			catch(InterruptedException ie){;;}
		}
	    System.out.println("Got: "+n);
	    ctrl=true;
	    notify();
	    return n;
	}
}

class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this).start();
	}
	public void run()
	{
        int i=0;
        while(i<10)
        	q.put(i++);
	}
}

class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this).start();
	}
	public void run()
	{
		int i;
		do
		{
			i=q.get();
		}while(i!=9);
	}
}

class PCDemo
{
	public static void main(String args[])
	{
		Q q=new Q();
		new Producer(q);
        new Consumer(q);
	}
}