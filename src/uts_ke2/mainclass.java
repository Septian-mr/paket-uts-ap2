package uts_ke2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class mainclass 
{
    // Definisi untuk MP3
    FileInputStream FIS;
    BufferedInputStream BIS;
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    public String fileLocation;
    

    
    public void Stop(){
        if(player != null){
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;
             
        }
    }
    
    public void Pause() throws IOException{
        if(player != null){
            try{
               pauseLocation =  FIS.available();
               player.close();
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
            }
           
        }
    }
    
    public void Play(String path) throws UnsupportedAudioFileException, LineUnavailableException{
        
        try {
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            songTotalLength = FIS.available();
            fileLocation = path + "";
           
        } catch (FileNotFoundException  | JavaLayerException ex ) {
            JOptionPane.showMessageDialog(null, "File tidak ditemukan!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
        } 
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                    
                    if(player.isComplete() && MyPlayere.count == 1){
                        Play(fileLocation);
                    }
                   
                } catch (JavaLayerException ex) {
                    Logger.getLogger(mainclass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException | LineUnavailableException ex) {
                    JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
                }
            }
        }.start();
        
    }
    
    public void Resume(){
        
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            FIS.skip(songTotalLength - pauseLocation);
    
        } catch (FileNotFoundException  | JavaLayerException ex ) {
            JOptionPane.showMessageDialog(null, "File tidak bisa dibuka!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
        } 
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                    
                } catch (JavaLayerException ex) {
                    Logger.getLogger(mainclass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
        
    }
   
}
