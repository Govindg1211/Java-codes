class A{
    int x=5, y=9;
    void fun(){
        System.out.println("A");
        int k=5;
        for(int i=0;i<2;i++){
            System.out.println(k+i);
        }
    }
}
class B extends A{
    int x;
    void fun(){
        System.out.println("B");
    }
}
class  ques {
    public static void main(String[] args) {
        
        A obj1 = new B();
        obj1.fun();
        System.out.println(obj1.x+""+obj1.y);
    }
}