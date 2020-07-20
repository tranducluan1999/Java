package exception;


import javafx.scene.chart.ScatterChart;
import jdk.nashorn.internal.ir.CatchNode;

public class Activity81 {

    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[4] = 6;
            System.out.println(" arr[5] " + arr[4]);
        }
        catch (IndexOutOfBoundsException e)
            {
                System.out.println(" Truy cập quá giới hạn của phần tử mảng" + e);
            }
        try
        {
            int zero =0;
            int averger = 10/zero;

        }
        catch (ArithmeticException e )
        {
            System.out.println(" Không được chia cho số 0 " + e);
        }
        try
        {
            String obj = null;
            System.out.println(obj.length());
        }
       catch (NullPointerException e )
        {
            System.out.println(" Lỗi không có giá trị " +e);
        }

        finally {
            System.out.println(" Finished!");
        }

    }


}
