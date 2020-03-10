class PrivateCheck{
static void show(){
System.out.println("Parent Class");
}
}
class Chiid extends PrivateCheck{
static void show(){
System.out.println("Chiid class");
}
public static void main(String[] args){
PrivateCheck pc = new Chiid();
pc.show();
}
}