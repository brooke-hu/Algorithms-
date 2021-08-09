package 排序;

/**
 * @author 美女
 * @version 1.0
 */
public class Insertion {
    public static void sort(Comparable[]a){
        for (int i = 1; i < a.length; i++) {
            //j为本次排序的对象
            for(int j=i;j>0&&Example.less(a[j],a[j-1]);j--)
                Example.exch(a,j,j-1);
        }

    }

}
