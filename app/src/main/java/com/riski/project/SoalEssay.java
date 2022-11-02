package com.riski.project;

public class SoalEssay {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Siapa nama presiden Indonesia yang pertama ?",

    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "soekarno",

    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "Ir. Soekarno",

    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
