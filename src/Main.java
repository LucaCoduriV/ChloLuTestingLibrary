import testingLib.Test;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int value = 10;


        new Test<>().Describe("Value should throw RunTimeException").expect(Main::tenEqualsTwelve).toThrowException(new RuntimeException());
        new Test<>().Describe("Value should throw IOException").expect(Main::tenEqualsTwelve).toThrowException(new IOException());
        new Test<>().Describe("Value should be 10").expect(()->value).toBe(10);
        new Test<>().Describe("Value should be 12").expect(()->value).toBe(12);
        new Test<>().Describe("true should be true").expect(()->true).toBe(true);
        new Test<>().Describe("true should be false").expect(()->true).toBe(false);
        new Test<>().Describe("true should be true").expect(()->true).toBeTruthy();
        new Test<>().Describe("true should be false").expect(()->true).toBeFalsy();
    }

    static boolean tenEqualsTwelve(){
        if(10 != 12){
            throw new RuntimeException();
        }
        return false;
    }
}
