package methodobjects;

public class Basepage {
	
	public static final Integer N =1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	Integer x = 0;
	Integer y = 0;
	public Integer facing = N;
	public Basepage(Integer x , Integer y ,Integer facing)
	{
		this.x = x;
		this.y = y;
		this.facing = facing;
	}


}
