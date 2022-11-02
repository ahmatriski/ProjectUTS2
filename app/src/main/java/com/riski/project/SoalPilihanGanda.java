package com.riski.project;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Siapa nama presiden Indonesia yang pertama ?",
            "Ideologi dasar bagi negara Indonesia adalah ...",
            "Siapa nama Gubernur Provinsi Lampung Sekarang ...",
            "Ibukota negara Indonesia saat ini adalah ...",
            "Siapa Nama Pahlawan Yang Berasal Dari Lampung ?",
            "Salah Satu Negara Yang Menjajah Indonesia adalah ...",
            "Siapa Nama Presiden Yang memimpin Indonesia Saat Ini adalah ...",
            "Teks yang dibacakan Ir. Soekarno yang menyatakan Indonesia merdeka dalah teks ...",
            "Negara yang memiliki wilayah terbesar di dunia adalah ...",

    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Ir. Soekarno","Joko Widodo","Susilo Bambang Yudhoyono"},
            {"UUD 1945","Pancasila","Bhinneka Tunggal Ika"},
            {"Ir. Arinal Djunaidi","Ganjar Pranowo","Musa Ahmad"},
            {"Jakarta", "Lampung", "Banjarmasin"},
            {"Radin Intan II","Cut nyak dien","Patimura"},
            {"Iran","Belanda","Malaysia"},
            {"Ir. Soekarno","Joko Widodo","Susilo Bambang Yudhoyono"},
            {"Proklamasi","Pancasila","Pembukaan UUD 1945"},
            {"Chili","Rusia","Portugal"},

    };

    //membuat array untuk jawaban benar
    private String jawabanBenar [] = {
            "Ir. Soekarno",
            "Pancasila",
            "Ir. Arinal Djunaidi",
            "Jakarta",
            "Radin Intan II",
            "Belanda",
            "Joko Widodo",
            "Proklamasi",
            "Rusia",

    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
