package uts_ke2;


import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class mainclass2 {

    // to store current position 
    int currentFrame; 
    Clip clip; 
    
    AudioInputStream audioInputStream; 
    static String filePath; 
    
    public void Stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        currentFrame = 0; 
        clip.stop(); 
        clip.close(); 
    }
    
    
    public void Pause() {
           currentFrame = clip.getFrameLength(); 
           clip.stop();   
    }
    
    public void Play(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // create AudioInputStream object 
        audioInputStream =  AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile()); 
        // create clip reference 
        clip = AudioSystem.getClip();  
        filePath = path;
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
        //start the clip 
        clip.start(); 

        
    }
    
    public void Resume() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
        clip.open(audioInputStream); 
        clip.setFramePosition(currentFrame);  
        clip.start(); 
    }
    
}


