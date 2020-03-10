/*from jdk 1.5 parent function and child class function can change*/
class Base{
Base show(){
System.out.println("Base Class Method..");
return new Base();
}
}
class Childss extends Base{
Childss show(){
System.out.println("Child class Method");
return new Childss();
}
public static void main(String[] args){
Base d = new Childss();
Base kk =d.show();
kk.show();
}
}