package HarckerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList>list=new ArrayList<ArrayList>();
        for(int i=0;i<n;i++)
        {
            int limit=sc.nextInt();
            ArrayList<Integer>list2=new ArrayList<Integer>();

            for(int j=0;j<limit;j++)
            {

                list2.add(sc.nextInt());
            }
            list.add(list2);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println((list.get(x-1)).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

