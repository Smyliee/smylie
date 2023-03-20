  abstract class Test {
    String testName;
    int testMarks1 ;
    int testMarks2 ;
     int rollNumber ;

    abstract int sumMarks(int testMarks1,int testMarks2);

    abstract  String stringName(String testName);

//    int getRollNumber(int rollNumber)
//    {
//        return rollNumber;
//    }

}
 class English extends Test {

    int sumMarks(int testMarks1,int testMarks2) {
        int marks = testMarks1+testMarks2;
        return (marks);
    }
    String stringName(String testName ) {
        return testName;
    }
    public static void main(String[] args){
        English test1 = new English();
        System.out.println("Name : " +test1.stringName("Raghav"));
        System.out.println("Sum of Marks : " + test1.sumMarks(33,45));


    }

}
