public class Test<T> {
    Expect<T> Describe(String description){
        return new Expect<T>(description);
    }
}
