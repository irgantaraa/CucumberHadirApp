Feature: Manajemen Jabatan

#Scenario: 1
  Scenario: Pencarian dengan level yang valid (Positif)
    Given Admin sudah login
    When Admin mencari karyawan dengan level valid
    Then Admin harus melihat hasil pencarian

# Scenario: 2
  Scenario: Pencarian dengan input tidak valid (Negatif)
    Given Admin sudah login
    When Admin mencari dengan data tidak valid
    Then Admin harus melihat tidak ada hasil

# Scenario: 3
  Scenario: Pencarian dengan input menggunakan huruf (Negatif)
    Given Admin sudah login
    When Admin mencari dengan huruf
    Then Admin melihat tidak ada hasil di tabel

# Scenario: 4
  Scenario: Pencarian dengan level yang valid (Positif)
    Given Admin sudah login
    When Admin menambahkan jabatan dengan data valid
    Then Jabatan harus berhasil ditambahkan

# Scenario: 5
  Scenario: Menambahkan jabatan dengan form kosong (Negatif)
    Given Admin sudah login
    When Admin mencoba menambahkan jabatan dengan form kosong
    Then Admin melihat pesan kesalahan validasi karena form kosong

# Scenario: 6
  Scenario: Menambahkan jabatan dengan form nama kosong (Negatif)
    Given Admin sudah login
    When Admin mencoba menambahkan jabatan dengan field nama kosong
    Then Pesan kesalahan harus muncul untuk field nama

# Scenario: 7
  Scenario: Menambahkan jabatan dengan form level kosong (Negatif)
    Given Admin sudah login
    When Admin mencoba menambahkan jabatan dengan field level kosong
    Then  Pesan kesalahan pada field level

# Scenario: 8
  Scenario: Mengedit jabatan dengan data valid (Positif)
    Given Admin sudah login
    When Admin mengedit jabatan dengan data baru
    Then Jabatan harus berhasil diperbarui

# Scenario: 9
  Scenario: Mengedit jabatan dengan nama dan level kosong (Negatif)
    Given Admin sudah login
    When Admin mengedit jabatan dengan nama dan level kosong
    Then Pesan kesalahan harus ditampilkan untuk nama dan level

# Scenario: 10
  Scenario: Mengedit jabatan dengan nama kosong (Negatif)
    Given Admin sudah login
    When Admin mengedit jabatan dengan nama kosong dan level terisi
    Then Pesan kesalahan harus muncul untuk nama jabatan yang kosong

# Scenario: 11
  Scenario: Mengedit jabatan dengan level kosong (Negatif)
    Given Admin sudah login
    When Admin mengedit jabatan dengan nama terisi dan level kosong
    Then Pesan kesalahan harus muncul untuk level jabatan yang kosong

# Scenario: 12
  Scenario: Menghapus jabatan (Positif)
    Given Admin sudah login
    When Admin menghapus jabatan
    Then Jabatan harus terhapus

# Scenario: 13
  Scenario: Mereset pencarian (Positif)
    Given Admin sudah login
    When Admin melakukan pencarian dan mengklik Reset
    Then Pencarian harus dibersihkan