package classquestion;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class vidu {

    public static void main(String[] args) {
        char result, con = 'y';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cách nào cho phép người dùng khai báo "
                + "1 giá trị số nguyên trong 4 đáp án sau?");
        // dấu \" sẽ được hiển thị ra màn hình là "
        System.out.println("a. int number = 123;");
        System.out.println("b. int number = \"123\";");
        System.out.println("c. int number = '1';");
        System.out.println("d. boolean number = 1;");

        do {
            System.out.println("Nhập vào câu trả lời: ");
            result = scanner.next().charAt(0);

            if (result == 'a') {
                System.out.println("Kết quả đúng!");
                break;  // thoát khỏi vòng lặp nếu chọn đáp án đúng
            } else if (result == 'q') {
                // nếu người dùng nhấn phím 'q' thì sẽ kết thúc chương trình
                System.out.println("Thoát chương trình!");
            } else if (result == 'b' || result == 'c' || result == 'd') {
                System.out.println("Bạn chọn không đúng!");
            } else {
                System.out.println("Câu trả lời phải nằm trong 4 lựa chọn a, b, c hoặc d.");
            }
            System.out.println("Đoán lại? Nhấn phím y để tiếp tục, nhấn q để thoát!");
            con = scanner.next().charAt(0);
            if (con == 'q') {
                System.out.println("Thoát chương trình!");
            }

        } while (con == 'y'); // nếu người dùng nhấn phím 'y' thì quay lại thực hiện vòng lặp
    }


}
