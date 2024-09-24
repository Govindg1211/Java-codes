class A{
    Integer n = 5;
    void info(){
        System.out.println("Dhwani Ghochu");
    }
}
class error{
    public static void main(String[] args) {
        A a=(A)new Object();
        System.out.println(a.n);
        a.info();
    }
}