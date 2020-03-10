class CarParent{
private int x=100;
void show(){
	x=x+14;
System.out.println(x);
}
}
class CarChild extends CarParent{
public static void main(String[] args){
CarParent cp = new CarChild();
cp.show();
}
}