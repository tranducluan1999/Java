package chuadethiquanlikhachsan;

public class Hotel {
    private int day;
    private String kindofhotel;
    private float roomprice;

    public Hotel() {
    }

    public Hotel(int day, String kindofhotel, float roomprice) {
        this.day = day;
        this.kindofhotel = kindofhotel;
        this.roomprice = roomprice;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getKindofhotel() {
        return kindofhotel;
    }

    public void setKindofhotel(String kindofhotel) {
        this.kindofhotel = kindofhotel;
    }

    public float getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(float roomprice) {
        this.roomprice = roomprice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", kindofhotel='" + kindofhotel + '\'' +
                ", roomprice=" + roomprice +
                '}';
    }
}
