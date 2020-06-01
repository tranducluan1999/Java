package cauhoi;

public class CauHoi {
    private String noidung;
    private String dathunhat;
    private String dathuhai;
    private String dathuba;
    private String dathutu;
    private String dadung;
    private int dokho;

    public CauHoi() {
    }

    public CauHoi(String noidung, String dathunhat, String dathuhai, String dathuba, String dathutu, String dadung, int dokho) {
        this.noidung = noidung;
        this.dathunhat = dathunhat;
        this.dathuhai = dathuhai;
        this.dathuba = dathuba;
        this.dathutu = dathutu;
        this.dadung = dadung;
        this.dokho = dokho;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getDathunhat() {
        return dathunhat;
    }

    public void setDathunhat(String dathunhat) {
        this.dathunhat = dathunhat;
    }

    public String getDathuhai() {
        return dathuhai;
    }

    public void setDathuhai(String dathuhai) {
        this.dathuhai = dathuhai;
    }

    public String getDathuba() {
        return dathuba;
    }

    public void setDathuba(String dathuba) {
        this.dathuba = dathuba;
    }

    public String getDathutu() {
        return dathutu;
    }

    public void setDathutu(String dathutu) {
        this.dathutu = dathutu;
    }

    public String getDadung() {
        return dadung;
    }

    public void setDadung(String dadung) {
        this.dadung = dadung;
    }

    public int getDokho() {
        return dokho;
    }

    public void setDokho(int dokho) {
        this.dokho = dokho;
    }

    @Override
    public String toString() {
        return "CauHoi{" +
                "noidung='" + noidung + '\'' +
                ", dathunhat='" + dathunhat + '\'' +
                ", dathuhai='" + dathuhai + '\'' +
                ", dathuba='" + dathuba + '\'' +
                ", dathutu='" + dathutu + '\'' +
                ", dadung='" + dadung + '\'' +
                ", dokho='" + dokho + '\'' +
                '}';
    }
}

