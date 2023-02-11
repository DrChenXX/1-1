package com.example.test.datatype;

public class KechengdagangRequest {
    private String peiyangfanganid;
    private String kechengmingcheng;
    private String kechengbianhao;
    private String kechengleibie;
    private String Shangchuan;
    private String yeshu;

    public KechengdagangRequest() {
    }

    public KechengdagangRequest(String peiyangfanganid, String kechengmingcheng, String kechengbianhao, String kechengleibie, String shangchuan, String yeshu) {
        this.peiyangfanganid = peiyangfanganid;
        this.kechengmingcheng = kechengmingcheng;
        this.kechengbianhao = kechengbianhao;
        this.kechengleibie = kechengleibie;
        Shangchuan = shangchuan;
        this.yeshu = yeshu;
    }

    public String getPeiyangfanganid() {
        return peiyangfanganid;
    }

    public void setPeiyangfanganid(String peiyangfanganid) {
        this.peiyangfanganid = peiyangfanganid;
    }

    public String getKechengmingcheng() {
        return kechengmingcheng;
    }

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }

    public String getKechengbianhao() {
        return kechengbianhao;
    }

    public void setKechengbianhao(String kechengbianhao) {
        this.kechengbianhao = kechengbianhao;
    }

    public String getKechengleibie() {
        return kechengleibie;
    }

    public void setKechengleibie(String kechengleibie) {
        this.kechengleibie = kechengleibie;
    }

    public String getShangchuan() {
        return Shangchuan;
    }

    public void setShangchuan(String shangchuan) {
        Shangchuan = shangchuan;
    }

    public String getYeshu() {
        return yeshu;
    }

    public void setYeshu(String yeshu) {
        this.yeshu = yeshu;
    }

    @Override
    public String toString() {
        return "KechengdagangRequest{" +
                "peiyangfanganid='" + peiyangfanganid + '\'' +
                ", kechengmingcheng='" + kechengmingcheng + '\'' +
                ", kechengbianhao='" + kechengbianhao + '\'' +
                ", kechengleibie='" + kechengleibie + '\'' +
                ", Shangchuan='" + Shangchuan + '\'' +
                ", yeshu='" + yeshu + '\'' +
                '}';
    }
}
