import java.io.File;

import jaco.mp3.player.MP3Player;

public class PlaySong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String songPath = "/Users/amit/Documents/MyMaterial/UI-Stuff/Html5_Project/WebContent/audio/BMB-Zinda.mp3";
		MP3Player mp3= new MP3Player(new File(songPath));
				mp3.play();
				Thread.sleep(10000);

	}

}
