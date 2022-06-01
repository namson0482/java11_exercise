package java11.newfeatures;

import java.util.function.Consumer;

interface DefaultInterface {
    default String getName() {
        return "default function";
    }

    static String getNameStatic() {
        return "Static function";
    }

    static String getNameStatic_2() {
        return "Static function 2";
    }
}

class SupperClass1 implements DefaultInterface {

    public SupperClass1() {
    }
}

public class TestDefaultStaticInterface {

    public static void main(String[] args) {
        SupperClass1 supperClass1 = new SupperClass1();
        Consumer consumer = x -> System.out.println(x);
        Consumer consumer1 = System.out::println;

        consumer1.accept(supperClass1.getName());
    }
}
