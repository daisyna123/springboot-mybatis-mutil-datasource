package org.spring.springboot;

/**
 * @DESCRIPTION 排序~~~
 * @AUTHER administrator zhangna
 * @create 2018-10-11
 */
public class demo {
    public static void main(String[] args) {
        //冒泡排序
        int count = 0;
        int [] a = {1,12,11,5,35,2,4,9};
        for(int i = 0 ;i<a.length-1;i++){
            for(int j = 0;j<a.length-i-1;j++){
                count++;
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
       /* for(int i = 0;i < a.length-1 ;i++){
            for(int j= a.length-1;j > i ;j--){
                count ++;
                if(a[j] < a[j-1]){
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
        }*/

        System.out.println("冒泡排序：");
        for(int i = 0 ;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("排序次数"+count);

        //选择排序

        int [] b = {1,12,11,5,35,2,4,9};
        count = 0;
       /* for(int i=0;i<b.length-1;i++){
            for(int j=i+1;j<b.length;j++){
                count++;
                if(b[i] > b[j]){
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }*/

        for(int i = 0;i < b.length-1;i++){
            int min = i;
            for(int j = i+1; j< b.length ;j++){
                count++;
                if(b[j]<b[min]){
                    min=j;
                }
            }
            if(min != i){
                int t = b[i];
                b[i] = b[min];
                b[min] = t;
            }
        }

        System.out.println("选择排序：");
        for(int i = 0 ;i<b.length;i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("排序次数"+count);

        //插入排序
        int [] c = {1,12,11,5,35,2,4,9};

        count = 0;
        int preIndex ;
        int current;
        for(int i = 1;i<c.length;i++){
            preIndex = i - 1;
            current = c[i];
            while(preIndex >= 0 && current < c[preIndex]){
                count++;
                c[preIndex + 1] = c[preIndex];
                preIndex--;
            }
            c[preIndex+1] = current;
        }
        System.out.println("插入排序：");
        for(int i = 0 ;i<c.length;i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println("排序次数"+count);


        //快速排序
    }
}
