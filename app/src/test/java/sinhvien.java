public class sinhvien {
    private String msv;
    private String tensv;
    private String quequan;

    public sinhvien(String msv, String tensv, String quequan) {
        this.msv = msv;
        this.tensv = tensv;
        this.quequan = quequan;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
}
