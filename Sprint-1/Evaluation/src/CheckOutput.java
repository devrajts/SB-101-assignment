public class CheckOutput {
    public static void main(String args[])
    {
        try
        {
            System.out.print("A");
            int num = 99/0;
            System.out.print("B");
        }
        catch(ArithmeticException ex)
        {
            System.out.print("C");
        }
        catch(Exception ex)
        {
            System.out.print("D");
        }
        System.out.print("E");
    }

}

// output for the above code is ACE because at the starting code is started from try printing "A",
// then calculating num where a num cannot be devided by zero so it will print arithmaticException and output will be "c",
// then last statement of printing is "E" at the end of the code. so the output will be "ACE.
