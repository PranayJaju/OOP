interface Series
{
	int GetNext();
	void reset();
	void setStart(int new_start);
}

class ByTwos implements Series
{
    int start_point, current_point;
    public ByTwos(int start_point)
    {
        this.start_point=start_point;
        current_point=start_point-2;
    }

	public int GetNext()
	{
	    return current_point+=2;
	}

	public void reset()
	{
	    current_point=start_point-2;
	}

	public void setStart(int new_start)
	{
        start_point=new_start;
	}
}

class TwoSeries
{
	public static void main(String args[])
	{
	    ByTwos bt=new ByTwos(0);

	    for(int i=1; i<=4; i++)
	        System.out.print(bt.GetNext()+"  ");
        System.out.println();

	    bt.setStart(13);
	    bt.reset();
	    for(int i=0; i<5; i++)
	    	System.out.print(bt.GetNext()+"  ");
	    System.out.println();
	}
}