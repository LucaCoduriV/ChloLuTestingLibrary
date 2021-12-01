public class ToBe<T> {
    private final T value;
    private final Exception e;
    private final String description;

    public ToBe(String description, T value, Exception exception){
        this.description = description;
        this.value = value;
        e = exception;
    }

    public void toBe(T expectedValue){
        printDescription();
        checkException();
        if(value == expectedValue){
            printOk();
        }else{
            System.out.println("Error, expected " + value + " to be " + expectedValue );
        }

    }

    public void toBeTruthy(){
        printDescription();
        checkException();
        if((boolean)value){
            printOk();
        }
        else{
            System.out.println("Error, expected " + value + " to be False." );
        }
    }

    public void toBeFalsy(){
        printDescription();
        checkException();
        if(!(boolean)value){
            printOk();
        }else{
            System.out.println("Error, expected " + value + " to be False." );
        }
    }

    public void toThrowException(Exception e){
        printDescription();
        if(this.e == null )
            System.out.println("Error: No Exception was thrown.");
        else if(!this.e.getClass().getSimpleName().equals(e.getClass().getSimpleName()))
            System.out.println("Error: Awaited " + this.e.getClass().getSimpleName() + " but got " + e.getClass().getSimpleName());
        else
            printOk();
    }

    public void toThrowException(){
        printDescription();
        if(e != null) printOk();
        else System.out.println("Error");
    }

    private void checkException(){
        if(e != null)
        System.out.println("Exception thrown: " + e.getMessage());
    }

    private void printOk(){
        System.out.println("Ok");
    }

    private void printDescription(){
        System.out.print(description + ": ");
    }

}
