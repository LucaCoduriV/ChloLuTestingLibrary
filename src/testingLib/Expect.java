package testingLib;

public class Expect<T> {

    private final String description;

    Expect(String description){
        this.description = description;
    }

    public ToBe<T> expect(Tester<T> test){
        T value = null;
        try {
            value = test.runTest();
        }
        catch (Exception e){
            return new ToBe<T>(description, null, e);
        }
        return new ToBe<T>(description, value, null);
    }
}
