package equalls;
public class car {
	String cn;
	String cc;
	int cco;
	car(String cn,String cc,int cco)
	{
		this.cn=cn;
		this.cc=cc;
		this.cco=cco;
		
	}
	public boolean equals(Object obj)
	{
		car c2=(car)obj;
		return(this.cn==c2.cc);
	}
    public static void main(String[] args) {
		car c1=new car("benz","blue",100000);
		car c2=new car("bmw","black",54644);
		System.out.println(c1.equals(c2));
	}
}
