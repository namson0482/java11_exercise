package java11.newfeatures;

@FunctionalInterface
public interface InterfaceGreeting {

    String getGreeting(String name);

    default String hello(String name) {
        return "default: Hello " + name;
    }

    default String helloWorld(String name) {
        return "default World: " + name;
    }
}
