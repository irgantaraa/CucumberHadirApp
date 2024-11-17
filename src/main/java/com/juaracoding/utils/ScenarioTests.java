package com.juaracoding.utils;

public enum ScenarioTests {
    // Izin Pulang Cepat Test Scenario
    T1("Menampilkan data izin pulang cepat dengan input tanggal yang sesuai"),
    T2("Menampilkan data izin pulang cepat dengan input nama dan tanggal yang sesuai"),
    T3("Menampilkan data izin pulang cepat dengan input nama tidak valid"),
    T4("Menampilkan data izin pulang cepat dengan input angka"),
    T5("Menampilkan data izin pulang cepat tanpa mengisi nama, tanggal, dan filter"),
    T6("Menampilkan data izin pulang cepat dengan input tanggal tanpa memilih start date"),
    T7("Menampilkan data izin pulang cepat dengan input tanggal tanpa memilih end date"),
    T8("Menampilkan data izin pulang cepat dengan input tanggal yang akan datang"),
    T9("Menampilkan data izin pulang cepat dengan filter departemen"),
    T10("Menampilkan data izin pulang cepat dengan filter tidak valid"),
    T11("Menampilkan data izin pulang cepat dengan filter nama dan departemen"),
    T12("Menggunakan tombol Batal untuk keluar dari modal filter"),
    T13("Menghapus filter yang dipilih dengan tombol X"),

    // Cuti Test Scenario
    T14("Menampilkan data cuti dengan input tanggal yang sesuai"),
    T15("Menampilkan data cuti dengan input nama dan tanggal yang sesuai"),
    T16("Menampilkan data cuti dengan input nama tidak valid"),
    T17("Menampilkan data cuti dengan input angka"),
    T18("Menampilkan data cuti tanpa mengisi nama, tanggal, dan filter"),
    T19("Menampilkan data cuti dengan input tanggal tanpa memilih start date"),
    T20("Menampilkan data cuti dengan input tanggal tanpa memilih end date"),
    T21("Menampilkan data cuti dengan input tanggal yang akan datang"),
    T22("Menampilkan data cuti dengan filter departemen"),
    T23("Menampilkan data cuti dengan filter tidak valid"),
    T24("Menampilkan data cuti dengan filter nama dan departemen"),
    T25("Menggunakan tombol Batal untuk keluar dari modal filter"),
    T26("Menghapus filter yang dipilih dengan tombol X"),
    T27("Ajukan cuti dengan tanggal yang sudah berlalu"),
    T28("Melakukan edit pada data cuti salah satu karyawan"), // Dipindahkan ke sini

    // CutiMobile Test Scenario
    T29("Menampilkan informasi cuti pada halaman pengajuan"),
    T30("Mengajukan cuti dengan data valid"),
    T31("Mengajukan cuti dengan data kosong atau tidak valid"),
    T32("Ajukan cuti dengan memilih tipe cuti dan field lain kosong"),
    T33("Ajukan cuti dengan memilih tanggal cuti dan field lain kosong"),
    T34("Ajukan cuti dengan mengisi form catatan dan field lain kosong"),

    // Pengajuan Sakit dan Verifikasi Surat Sakit
    T35("Pengguna mengajukan sakit dengan tanggal dan surat sakit valid"),
    T36("Verifikasi hanya menerima file gambar untuk surat sakit"),
    T37("Verifikasi peringatan jika surat sakit tidak di-upload atau tidak valid"),
    T38("Verifikasi peringatan ajukan surat sakit tanpa input tanggal"),
    T39("Tombol 'Batal' membatalkan tanggal yang dipilih"),
    T40("Tombol 'Reset' menghapus tanggal dan file"),

    // Jabatan Test Scenario
    T41("Pencarian dengan level yang valid (Positif)"),
    T42("Pencarian dengan input tidak valid (Negatif)"),
    T43("Pencarian dengan input menggunakan huruf (Negatif)"),
    T44("Menambahkan jabatan dengan data valid (Positif)"),
    T45("Menambahkan jabatan dengan form kosong (Negatif)"),
    T46("Menambahkan jabatan dengan form nama kosong (Negatif)"),
    T47("Menambahkan jabatan dengan form level kosong (Negatif)"),
    T48("Mengedit jabatan dengan data valid (Positif)"),
    T49("Mengedit jabatan dengan nama dan level kosong (Negatif)"),
    T50("Mengedit jabatan dengan nama kosong (Negatif)"),
    T51("Mengedit jabatan dengan level kosong (Negatif)"),
    T52("Menghapus jabatan (Positif)"),
    T53("Mereset pencarian (Positif)");

    private String scenarioTestName;

    ScenarioTests(String value) {
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}
