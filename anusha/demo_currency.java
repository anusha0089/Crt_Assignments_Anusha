package anusha;
interface Hello{
	float indiaRupees(int x,String country);
}
public class demo_currency {
public static void main(String[] args) {
	Hello hello = (cr,cc)->{
		if(cc.equalsIgnoreCase("us")) {
		System.out.println(cr+" us to indian ruppes...");	
		return cr * 78.97f;
	}
	else if(cc.equalsIgnoreCase("uk")) {
	System.out.println(cr+" uk to indian ruppes...");
	return cr *110;
}
return 0;
};
System.out.println(hello.indiaRupees(100,"us"));
System.out.println(hello.indiaRupees(100,"uk"));
}
}
