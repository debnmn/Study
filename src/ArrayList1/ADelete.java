package ArrayList1;

import java.util.Arrays;

public class ADelete {
    public static void main(String[] args) {
        int[] oldarray = new int[] {3, 4, 5, 6, 7};// 原始数组
        int num = 2;   // 删除索引为 2 的元素，即删除第三个元素 5
        int[] newArray = new int[oldarray.length-1];// 新数组，长度为原始数组减去 1

        for(int i=0;i<newArray.length; i++) {
            // 判断元素是否越界
            if (num < 0 || num >= oldarray.length) {
                throw new RuntimeException("元素越界... ");
            }
            //
            if(i<num) {
                newArray[i] = oldarray[i];
            }
            else {
                newArray[i] = oldarray[i+1];
            }
        }
        // 打印输出数组内容
        System.out.println(Arrays.toString(oldarray));
        oldarray = newArray;
        System.out.println(Arrays.toString(oldarray));
    }
}
