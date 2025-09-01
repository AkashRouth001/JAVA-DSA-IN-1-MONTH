/*1. Basic for loop
//👉 Used when you know exactly how many times you want to loop.
public class for_loop {
    public static void main(String[] args){
        int count =0;
        for(int i =0;i<6;i++){
            count++;
        }
        System.out.println("count="+count);
    }
}*/


/*2. For loop with multiple variables
//👉 Useful for comparing two values at once.
public class for_loop {
    public static void main(String[] args){
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}*/


/*3. Skipping values with continue
//👉 Skip unwanted iterations.

public class for_loop {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;  // skip even numbers
            System.out.println("Odd: " + i);
        }

    }
}*/


/*4.Breaking out with break
//👉 Exit loop early when a condition is met.

public class for_loop {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;  // stop when i = 5
            System.out.println("Value: " + i);
        }

    }
}*/


//5. For loop with floating-point numbers
//👉 Shows you can use for loops with double or float (not very common, but good to know).

public class for_loop {
    public static void main(String[] args){
        for (double i = 0.5; i <= 2.0; i += 0.5) {
            System.out.println("Value: " + i);
        }
    }
}


