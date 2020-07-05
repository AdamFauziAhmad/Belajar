package com.example.android.jurnalburung;

public class Bird {
    private String Judul;
//    private String Deskripsi;
    private int Thumbnail;

    public Bird(String judul, int thumbnail) {
        Judul = judul;
        Thumbnail = thumbnail;
    }

//    public Bird(String judul, String deskripsi, int thumbnail) {
//        Judul = judul;
////        Deskripsi = deskripsi;
//        Thumbnail = thumbnail;
//    }

    public String getJudul() {
        return Judul;
    }

//    public String getDeskripsi() {
//        return Deskripsi;
//    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

//    public void setDeskripsi(String deskripsi) {
//        Deskripsi = deskripsi;
//    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
