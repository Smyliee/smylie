class Apache extends Bike{
    @Override
    void run() {
        System.out.println(" run");
    }

    public static void main(String[] args){
        Apache n = new Apache();
        n.run();
        Bike b = new Apache();
        b.run();

    }
}
