
public class CrookedDie1 extends Die
{

	public CrookedDie1()
	{
		// StdOut.println("In CrookedDie1()");
	}

	public int getLastRoll()
	{
		return 3;
	}

	public void roll()
	{
		// do nothing...
	}

	public void setLastRoll(int last)
	{

	}

	public String toString()
	{
		return "A CrookedDie1 object, and... " + super.toString();
	}

}
