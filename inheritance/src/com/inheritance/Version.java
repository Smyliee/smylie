package com.inheritance;

class Version {
    int kit(){
        return 5;
    }

}
class versionB extends Version {
    int kit(){
        return 10;
    }
    public static void main(String[] args){
        Version objA = new Version();
        objA.kit();
        versionB objB = new versionB();
        objB.kit();
//        versionB objC = new Version();
//        objC.kit();
        Version objD = new versionB();
        int a=objD.kit();
        System.out.println(a);



    }
}
