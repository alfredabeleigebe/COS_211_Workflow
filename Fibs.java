public class Fibs {
    void whileloop(){
        double n = 1d;
        double i = 0d;
        double j = 1d;
        while( n <= 100){
            double z = i + j;
            i = j;
            j = z;
            System.out.println(z);
            n ++;
        }
    }
//    double inf = Double.POSITIVE_INFINITY;
//    double i = 0;
//    void i_loop() {
//        for (i = 0; i < inf; i++);
//    }
//    double j = 1;
//    void j_loop() {
//        for (j = 0; j < inf; j++);
//    }

}

