import java.util.Arrays;
public class Competition {
    int [] scores = new int [5];
    public Competition(int a,int b, int c, int d, int e)
    {
        if(a<=5&&a>=1)
        {scores[0]=a;}
        else if(b<=5&&b>=1)
        {scores[1]=b;}
        else if(c<=5&&c>=1)
        {scores[2]=c;}
        else if(d<=5&&d>=1)
        {scores[3]=d;}
        else if(e<=5&&e>=1)
        {scores[4]=e;}
        else{System.out.println("error");}
    }

    public int result()
    {
        Arrays.sort(scores);
        return scores[1]+scores[2]+scores[3];
    }

    public static void main(String[] args) {
       Competition zawody = new Competition(1,2,3,4,5);
       System.out.println(zawody.result());
    }

}
