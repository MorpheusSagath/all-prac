import java.util.Scanner;

public class MainClExcept {
    public static void main(String[] args){
        try {
            genExceptionsOfJava();
            genException();
        }
        catch (MyException1 exception1)
        {
            System.out.println("Catch exception...");
            System.out.println(exception1.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally... the end");
        }
        genExceptionExtendsRT();

    }
    public static void genExceptionsOfJava() throws Exception
    {
        throw new Exception("ha ha classic");
    }
    public static void genException() throws MyException1
    {
        throw new MyException1("this exception exist because yes");
    }
    public static void genExceptionExtendsRT() throws ThisClassExtendsRunTimeException
    {
         throw new ThisClassExtendsRunTimeException("Oops... this exception is exception");
    }
}