/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program hitung gaji karyawan
 */
public class PBOIF210119043Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static String nama;
    public static String alamat;
    public static int uangTransport;
    public static int tunjangan;
    public static int gajiPokok;
    public static int totalGaji=0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai karyawan = new GajiPegawai();
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("-------------------");
        System.out.print("Nama Karyawan : ");
        nama = scanner.nextLine();
        karyawan.setNama(nama);
        
        System.out.print("Alamat : ");
        alamat = scanner.nextLine();
        karyawan.setAlamat(alamat);
        
        System.out.print("Uang Transport : Rp. ");
        uangTransport = scanner.nextInt();
        karyawan.setUangTransport(uangTransport);
        
        System.out.print("Uang Tunjangan : Rp. ");
        tunjangan = scanner.nextInt();
        karyawan.setUangTunjangan(tunjangan);
        
        System.out.print("Gaji Pokok : Rp. ");
        gajiPokok = scanner.nextInt();
        karyawan.setGajiPokok(gajiPokok);
        
        // set var total gaji dengan parameter hitung total gaji
        karyawan.setTotalGaji(karyawan.totalGaji(karyawan.getUangTunjangan(), karyawan.getUangTransport(), karyawan.getGajiPokok()));
        
        //tampil semua data
        karyawan.tampilData(karyawan.getNama(), karyawan.getAlamat(), karyawan.getUangTunjangan(), karyawan.getUangTransport(), karyawan.getGajiPokok(), karyawan.getTotalGaji());
    }
    
}
