public class neww {
    static int a=0;
public static int func1(int x, int y)
{
  if(y!=1)
    {
        if(x!=256)
        {
            a++;
            func1(x<<1,y);
        }
        else
        {
            func1(1,y>>1);
        }
    }
    return a;
}

    public static void main(String[] args)
    {
        int x;
 x = func1(1,16);
        System.out.println(x);
    }
}
