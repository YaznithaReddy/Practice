package firstPackage;

class Functions {
	public static void main(String[]args){
		Functions obj1=new Functions();
		obj1.method1();
		obj1.method1(10);
		int i=obj1.method2();
		System.out.println(i);
		String k=obj1.method1(10,20.56);
	}
	void method1(){
		System.out.println("Default Method 1");
		return;}
	void method1(int a){
		System.out.println("Int Arg Method 1");
		System.out.println(a);}
	String method1(int a,double b){
		System.out.println("Int and Double Arg Method 1");
		return "Welcome";}
	int method2(){
		System.out.println("Default Method 2");
		return 100;}
	}
