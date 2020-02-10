package headFirst;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        }
        catch(MidiUnavailableException e){
            System.out.println("No Midi");
        }
    }

    public static void main(String[] args){
        MusicTest1 musicTest1 = new MusicTest1();
        musicTest1.play();
    }
}
