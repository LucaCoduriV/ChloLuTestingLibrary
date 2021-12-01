package testingLib;

public class Test<T> {
    public Expect<T> Describe(String description){
        return new Expect<T>(description);
    }
}
