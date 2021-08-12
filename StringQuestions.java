
public class StringQuestions {

	public boolean isRotation(String s1,String s2)
	{
		String temp=s1+s1;
		if(s1.length()==s2.length() && temp.indexOf(s2)!=-1)
		{
			return true;
		}
		return false;
	}
	public boolean isShuffle(String results,String s,String s2)
	{
		if(results.length()!=s.length()+s2.length())
		{
			return false;
		}
		else
		{
			char s1[]=s.toCharArray();
			char s4[]=s2.toCharArray();
			for(int i=0;i<s1.length;i++)
			{
				if(results.indexOf(s1[i])==-1)
				{
					return false;
				}
			}
			for(int i=0;i<s4.length;i++)
			{
				if(results.indexOf(s4[i])==-1)
				{
					return false;
				}
			}
		}
		return true;
	}
	
}
