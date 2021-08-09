package 排序;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author 美女
 * @version 1.0
 */
public class Example {
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }
    //交换数值
    public static void exch(Comparable[] a,int i,int k){
        Comparable t=a[i];
        a[i]=a[k];
        a[k]=t;
    }
    //单行打印数组
    public static void show(Comparable a[]){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+" ");
        }

    }

    public static boolean isSorted(Comparable[] a){
        //测试数组元素是否有序
        for (int i = 0; i < a.length; i++) {
            if(less(a[i],a[i-1]))return false;

        }
        return true;
    }



    public static void main(String[] args) {
        //从标准输入读入字符串，并排序输出

        String[] a= new In("src/排序/tiny.txt").readAllStrings();
        show(a);
        System.out.println("");
        Selection.sort(a);
        show(a);
        System.out.println("");

        a= new In("src/排序/tiny.txt").readAllStrings();
        Insertion.sort(a);
        show(a);
        System.out.println("");

        a= new In("src/排序/tiny.txt").readAllStrings();
        Shell.sort(a);
        show(a);

    }

}
