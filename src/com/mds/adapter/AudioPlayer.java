package com.mds.adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Lance le mp3 " + fileName);
		} else {
			System.out.println("Le format n'est pas supporté");
		}
	}
}
