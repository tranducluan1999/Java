package rectanglemanagement;

import java.util.Scanner;

public class Rectangle {

    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void nhap()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Nhập chiều rộng: ");
        width =sc.nextFloat();

        System.out.println(" Nhập chiều dài: ");
        height =sc.nextFloat();
    }

    public void xuat()
    {
        System.out.println(" Chiều dài: " + height);
        System.out.println(" Chiều rộng: " + width);
    }

    public void chuVi()
    {
        float cv =(width+height) *2;
        System.out.println(" Chu vi hcn là: " + cv);
    }

    public void dienTich()
    {
        float hcn = width * height;
        System.out.println(" Diện tích hcn là: " + hcn);
    }
}
