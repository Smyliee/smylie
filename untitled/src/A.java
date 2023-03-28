class A {
    public void msg(){
        System.out.println("hello java");
    }

}
class C extends A{
    public void msg(){
        System.out.println("hello java 1");
    }
}
class Simple extends A  {
     public void msg(){
        System.out.println("hello java");
    }
    public static void main (String [] args ){
        Simple obj = new Simple();
        A obj1 = new Simple();
        A obj2 = new A();

        obj.msg();
        obj1.msg();
        obj2.msg();
    }
}
