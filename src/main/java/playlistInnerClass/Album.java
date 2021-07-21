package playlistInnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songList = null;

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songList = new ArrayList<Song>();
	}

	public void checkAndAddSong(Song song) {
		String songName = song.getTitle();
		double songDuration = song.getDuration();

		if (songName != null && songName.isBlank() != true) {
			if (songDuration > 0) {
				if (checkSongAlreadyExists(songName) >= 0)
					System.out.println(songName + " already exists in Album");
				else
					this.songList.add(song);
			} else
				System.out.println("Can't add song to album - Invalid song duration");
		} else {
			System.out.println("Can't add song to album - Invalid song name");
		}
	}

	public int checkSongAlreadyExists(String songName) {
		int matchFoundAtIndex = -1;
		for (Song sg : this.songList) {
			if (sg.getTitle().equalsIgnoreCase(songName)) {
				matchFoundAtIndex = this.songList.indexOf(sg);
				break;
			}
		} 
		return matchFoundAtIndex;
	}

	public ArrayList<Song> getSongList() {
		return songList;
	}

	public void removeSong(String songName) {
		int songIndex = -1;
		if (songName != null && songName.isBlank() != true) {
			songIndex = checkSongAlreadyExists(songName);
			if (songIndex >= 0)
				this.songList.remove(songIndex);
			else
				System.out.println("Can't remove - song doesn't exist in album");
		} else
			System.out.println("Can't remove song from album - Invalid song name");
	}

	public void showAlbumSongs() {
		if(songList.size() > 0) {
			  System.out.println("################ "  + name + " ########################");
			  System.out.println("Artist : "  + artist);
			  for(Song i : songList) {
				  System.out.println((songList.indexOf(i) + 1) + ". " + i.toString());
			  }
		}
		else
			System.out.println("No songs in this album");
	}

	@Override
	public String toString() {
		return "Album name=" + name + ", Artist=" + artist;
	}

}
