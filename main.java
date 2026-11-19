public class main {
    String name ="John";
    int age = 70;
//    String email,
    public static void main(String[] args) {
        float calcvel = calculatevelocity(100,20);
        System.out.println(calcvel);
        float calcarea = sumOfCode(100);
        System.out.println(calcarea);
//        System.out.println(name);
    }
    static float calculatevelocity(float distance, float time){
        float velocity = distance/time;
        return velocity;
    }
    public static float sumOfCode(float r) {
        return (22 / 7) * r * r;
    }


}
//java is an object oriented programming language
//java extension is .java. C++ is .cpp
//for a function to execute it has to be called within the same method
//c++ and java are strongly typed languages. Meaning you have to specify each data type as its being called
//Entry point for code execution is the main method
//void means a method doesnt return bull
//lines have to end w semicolons\
//access modifiers are for defining methods, either default, public, private or protected