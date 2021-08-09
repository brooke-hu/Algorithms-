package 排序;

/**
 * @author 美女
 * @version 1.0
 */
public class Shell {
    public static void sort(Comparable[] a){
        int len=a.length;
        int h=1;
        while(h<len/3)h=3*h+1;
        while(h>=1){
            for(int i=h;i<len;i++){
                for(int j=i;j>=h&&Example.less(a[j],a[j-h]);j-=h)
                    Example.exch(a,j,j-h);
            }
            h=h/3;
        }
    }

}
