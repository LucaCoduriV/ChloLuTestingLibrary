package testingLib;

public interface Tester<T> {
    T runTest() throws Exception;
}
