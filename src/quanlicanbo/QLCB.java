/*
package quanlicanbo;

import java.util.Scanner;

public class QLCB {

    private CongNhan[] congNhans;
    private KySu[] kySus;

    public QLCB(CongNhan[] congNhans) {
    }

    public QLCB(CongNhan[] congNhans, KySu[] kySus) {
        this.congNhans = congNhans;
        this.kySus = kySus;
    }



    public CongNhan[] getCongNhans() {
        return congNhans;
    }

    public void setCongNhans(CongNhan[] congNhans) {
        this.congNhans = congNhans;
    }

    public KySu[] getKySus() {
        return kySus;
    }

    public void setKySus(KySu[] kySus) {
        this.kySus = kySus;
    }

    public void timCN()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập cấp bậc muốn tìm kiếm: ");
        int cap =sc.nextInt();
        sc.nextLine();

        for(int i=0;i<congNhans.length;i++)
        {
            if(cap ==congNhans[i].getBac() )
            {
                System.out.println(" Tìm thấy công nhân: \n" + congNhans[i]);
            }
        }


    }
}
*/
