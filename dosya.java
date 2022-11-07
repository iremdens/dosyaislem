
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author irem
 */
public class dosya {

    public static void main(String[] args) throws IOException {
        String ayrac = new String(new char[15]).replace("\0", "-");
        String okunanVeri = null;
        File dosya = new File("C:\\Users\\winem\\Desktop\\fileReader-dosya-okuma.txt");
        FileReader fileReader;
        FileWriter yazici = new FileWriter(dosya);
        BufferedWriter yaz = new BufferedWriter(yazici);

        char[] metin = null;
        yaz.write(metin);
        yaz.close();
        System.out.println("Yazma İşlemi Başarılı");
        char veriler[] = new char[(int) dosya.length()];
        System.out.println(ayrac + "\n< Java FileReader Dosya Okuma İşlemi >\n" + ayrac);
        try {
            fileReader = new FileReader(dosya);
            fileReader.read(veriler);
            okunanVeri = new String(veriler);
            System.out.println(veriler);
        } catch (FileNotFoundException e) {
            System.out.println("-> Aradığınız Dosyaya Ulaşamadım.\n-> Hata Mesajım: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("-> Aradığınız Dosya Üzerinde Veri Okuyamıyorum.\n-> Hata Mesajım: " + e.getMessage());
        } finally {
            System.out.println(ayrac);
        }
        try {
            BufferedReader dosya = new BufferedReader(new FileReader("dosya.txt"));
            String satir;
            while ((satir = dosya.readLine()) != null) {
                System.out.println(satir);
                dosya.close();
            }
            catch(IOException e){
                
                System.out.println("hata"+e);
                }

        }
    }
}
