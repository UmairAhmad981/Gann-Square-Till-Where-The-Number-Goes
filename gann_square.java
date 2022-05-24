import java.util.Scanner;
public class gann_square
{
    public static void main (String Args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Total mathber till where the square continues");
        int n=in.nextInt();
        int math=((int)Math.ceil(Math.sqrt(n)));
        int counter = math;
        String[] count=new String[math*math];
        String[][] mat = new String[math][math];
        int matrix=(math*math)-1;
        int zz=0,d=1;
        boolean a=true,b=true;
        for(int j=0;j<math*math;j++)
        {
            if(zz<n){
                count[zz]="\t"+(zz+1);
                zz++;
            }
            else{
                count[zz]="\t";
                zz++;
            }
        }
        int i =0 ,j =0;
        outer:
        while(matrix>0)
        {
            
            for (int x = 0 ; x<math-1;x++)
            {
                mat[i][j] = ""+ count[matrix];
                matrix--; j++;
                if ( matrix ==0)
                {
                    break outer;
                }
            }
            
            for (int x = 0;x<math-1;x++)
            {
                if(!a)
                {
                    math--;
                    a=true;
                }
                mat[i][j] = ""+count[matrix];
                matrix--;i++;
            }
            for (int x = 0;x<math-1;x++)
            {
                mat[i][j] = ""+count[matrix];
                matrix--;j--;
                if ( matrix ==0)
                {
                    break outer;
                }
            }
            for (int x = 0;x<math-1;x++)
            {
                if(a&&b)
                {
                    math--;
                    b=false;
                    a=false;
                }
                else if(b==false)
                {
                    b=true;
                }
                mat[i][j] = ""+count[matrix];
                matrix--;i--;
            }
        }
        mat[i][j] = "\t"+1;
        for(int x=0;x<counter;x++)
        {
            for (int z=0;z<counter;z++)
            {
                System.out.print(mat[x][z]+"\t");
            }
            System.out.println();
        }
    }
}