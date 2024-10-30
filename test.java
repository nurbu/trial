public class test {

    public static void main(String[] args) {
       String s = "IV";

       char [] c = s.toCharArray();
    for(int i =0;i<c.length;i++)
    {
       if(c[i] =='I')
       {
        c[i]='1';
       }
       System.err.println(c[i]);
    }

    }
}