package String;

import java.util.StringTokenizer;

public class StringSplitEmp {
    public static void main(String args[]){

        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "-";  // 指定分割字符
        temp = str.split(delimeter); // 分割字符串
        // 普通 for 循环
        for(int i =0; i < temp.length ; i++){
            System.out.println(temp[i]);
            System.out.println("");
        }

        System.out.println("------java for each循环输出的方法-----");
        String str2 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";  // 指定分割字符， . 号需要转义
        temp1 = str2.split(delimeter1); // 分割字符串
        for(String x :  temp1){
            System.out.println(x);
            System.out.println("");
        }

        String str1 = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str1);

        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
