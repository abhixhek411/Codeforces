import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Matrix_Stabilization
{
    static Scanner sc=new Scanner(System.in);
    static void printYes(){
        System.out.println("YES");
    }
    static void printNo(){
        System.out.println("NO");
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    
    static void solveInLoop(){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            solve();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		solveInLoop();
		}
		  static void solve(){
		      int n=sc.nextInt();
              int m=sc.nextInt();
              int grid[][]=new int[n][m];
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    grid[i][j]=sc.nextInt();
                }
              }
              int t=-1;
              for(int i=0;i<n;i++){
                int l=-1;
                for(int j=0;j<m;j++){
                    int f=0;
                    int c=0;
                    int max=0;
                    int b=i+1;
                    int r=j+1;
                    if(l!=-1){
                        c++;
                        if(grid[i][j]>grid[i][l]){ max=Math.max(max,grid[i][l]);
                            f++;
                        }
            
                    }
                    if(t!=-1){
                        c++;
                        if(grid[i][j]>grid[t][j]){ max=Math.max(max,grid[t][j]);
                            f++;
                        }
                    }
                    if(r<m){
                        c++;
                        if(grid[i][j]>grid[i][r]){ max=Math.max(max,grid[i][r]);
                            f++;
                        }
                        
                    }
                    if(b<n){
                        c++;
                        if(grid[i][j]>grid[b][j]){ max=Math.max(max,grid[b][j]);
                            f++;
                        }
                        
                    }
                    if(max!=0 && f==c) grid[i][j]=max;
                    l++;

                }
                t++;
              }
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
              }
              
		  }
}
