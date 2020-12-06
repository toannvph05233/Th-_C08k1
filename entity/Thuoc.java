package entity;

import javax.persistence.*;

@Entity
@Table(name = "Thuoc")
public class Thuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSo;
    private String ten;
    private String tacDung;
    private String chiDinh;
    private String chongChiDinh;

    public Thuoc() {
    }

    public Thuoc(String ten, String tacDung, String chiDinh, String chongChiDinh) {
        this.ten = ten;
        this.tacDung = tacDung;
        this.chiDinh = chiDinh;
        this.chongChiDinh = chongChiDinh;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacDung() {
        return tacDung;
    }

    public void setTacDung(String tacDung) {
        this.tacDung = tacDung;
    }

    public String getChiDinh() {
        return chiDinh;
    }

    public void setChiDinh(String chiDinh) {
        this.chiDinh = chiDinh;
    }

    public String getChongChiDinh() {
        return chongChiDinh;
    }

    public void setChongChiDinh(String chongChiDinh) {
        this.chongChiDinh = chongChiDinh;
    }
}
