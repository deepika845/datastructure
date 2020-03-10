class FunctionOverloadCheck{
void mess(){
System.out.println("No agument mess method.");
}
int mess(int k){
System.out.println("Argument method"+k);
return 0;
}
public static void main(String[] args){
FunctionOverloadCheck foc = new FunctionOverloadCheck();
foc.mess(10);
foc.mess();
}
}