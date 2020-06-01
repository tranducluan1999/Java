package classhcn;

public class Hcn {
    private int chieudai;
    private int chieurong;

    public Hcn() {
    }

    public Hcn(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public String toString() {
        return "Hcn{" + "chieudai=" + chieudai + ", chieurong=" + chieurong + '}';
    }
    public  void tinhChuVi()
    {

        System.out.println(" Chu vi là: " + ((this.chieudai+this.chieurong) * 2));

    }
    public void tinhdienTich()
    {
        System.out.println(" Diện tích là: " + (this.chieurong* this.chieudai ));


    }

    public  boolean ktra()
    {
        if(this.chieudai ==this. chieurong)
        {
            return  true;
        }
        else
        {
            return false;
        }

    }
}
