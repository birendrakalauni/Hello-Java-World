class Demo{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double c, double d)
    {
        return c+d;
    }
    public static void main(String []args){
        Demo demo = new Demo();
        System.out.println(demo.add(5,6));
        System.out.println(demo.add(5.5,6.5));    
    }
}