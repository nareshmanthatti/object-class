package equalls;

public class mobile {
	String mn;
	String mc;
	int mt;
	mobile(String mn,String mc,int mt)
	{
	this.mn=mn;
	this.mc=mc;
	this.mt=mt;
	}
	public boolean equals(Object obj)
	{
		mobile m2=(mobile)obj;
	return((this.mn==m2.mn));
	}
	public static void main(String[] args) {
		mobile m1=new mobile("mi","blue",2000);
		mobile m2=new mobile("mi","black",4555);
		System.out.println(m1.equals(m2));
	}

}
