package 排序;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author 美女
 * @version 1.0
 */
//用选择排序升序排列
public class Selection {
    public static void sort(Comparable[] a){
        int len=a.length;
        for(int i=0;i<len;i++){
            int k=i;
            for(int j=i+1;j<len;j++){
                if(Example.less(a[j],a[k]))k=j;
            }
            Example.exch(a,i,k);

        }
    }



}
