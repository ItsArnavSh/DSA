class fibonacci_recursion
{
    public static int fib(int num)
    {
        if(num<2)
            return 1;
        else
            return(fib(num-1)+fib(num-2));
    }
    public static void main(String args[])
    {
        System.out.println("The 6th fibonacci number is "+fib(6));
    }
}