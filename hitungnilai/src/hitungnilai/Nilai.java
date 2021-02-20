/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungnilai;

/**
 *
 * @author Server SMKS AL QUDSY
 */
class Nilai {
 private double nQuiz;
    private double nUts;
    private double nUas;
    private String indeks;
    private String keterangan;
    
    public Nilai(double nQuiz, double nUTS, double nUas){
        this.nQuiz = nQuiz;
        this.nUts = nUTS;
        this.nUas = nUas;
    }

    public double getnQuiz() {
        return nQuiz;
    }

    public double getnUts() {
        return nUts;
    }

    public double getnUas() {
        return nUas;
    }

    public double hitungNilaiAkhir(){
        return (nQuiz*0.2)+(nUts*0.3)+(nUas*0.5);
    }
    public String nilaiIndeks ( double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
            indeks = "A";
        }else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
            indeks = "B";
        }else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
            indeks = "C";
        }else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
            indeks = "D";
        }else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
            indeks = "E";
    }
    return indeks;

}
    public String indeksKeterangan (String parIndeks){
            switch (parIndeks) {
                case "A":
                    keterangan = "Sangat Baik";
                    break;
                case "B":
                    keterangan = "Baik";
                    break;
                case "C":
                    keterangan = "Cukup";
                    break;
                case "D":
                    keterangan = "Kurang";
                    break;
                case "E":
                    keterangan = "Sangat Kurang";
                    break;
                default:
                    break;
            }
        return keterangan;
   
    }
}