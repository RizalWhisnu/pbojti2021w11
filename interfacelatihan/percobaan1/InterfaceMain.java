/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan.percobaan1;

/**
 *
 * @author hp
 */
import interfacelatihan.percobaan1.ICumlaude;
import interfacelatihan.percobaan1.Mahasiswa;
import interfacelatihan.percobaan1.PascaSarjana;
import interfacelatihan.percobaan1.Rektor;
import interfacelatihan.percobaan1.Sarjana;
/**
 *
 * @author Hamba Notebook
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pekrektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pekrektor.beriSertifikatCumlaude mhsBiasa);
        sarjanaCumlaude.kuliahDiKampus();
        pekrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pekrektor.beriSertifikatCumlaude(masterCumlaude);
        
    }
}