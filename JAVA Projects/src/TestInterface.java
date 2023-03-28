interface TestInterface {
     String testName2 = "raman ";
     int testMarks1 = 49 ;
     int testMarks2 = 79 ;
    int rollNumber = 7;
    String printName2(String testName2);
    int printSum(int testMarks1, int testMarks2);
    //void printrollnnumber(int rollNumber){
       // this.ro
   // }
}
    class Testcase implements TestInterface {
       int printSum2(int testMarks1, int testMarks2) {
           int marks = testMarks1 + testMarks2;
           return (marks);
       }

       public String printName2(String testName2){
           return testName2;
       }

        @Override
        public int printSum(int testMarks1, int testMarks2) {
            return 0;
        }

        public static void main(String[] args) {
           Testcase test1 = new Testcase();

           System.out.println("Name : " + test1.printName2("sam"));
           System.out.println("Sum of Marks : " + test1.printSum2(33, 45));

       }
   }

