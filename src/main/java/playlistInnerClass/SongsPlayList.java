package playlistInnerClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SongsPlayList {

	private ArrayList<Album> albumsOwned;
	private PlayList pList = null;
	
	public SongsPlayList() {
		this.albumsOwned = new ArrayList<Album>();
		this.pList = new PlayList();
	}

	public ArrayList<Album> getAlbumsOwned() {
		return albumsOwned;
	}

	public void setAlbumsOwned(Album album) {
		this.albumsOwned.add(album);
	}

	public PlayList getpList() {
		return pList;
	}


	

	public class PlayList {
		private LinkedList<Song> playList = null;

		public PlayList() {
			this.playList = new LinkedList<Song>();
		}
		
		public void addToPlayList(String songName) {
			Song song = null;
			int songIndexInAlbum = -1;

			for (Album a : albumsOwned) {
				songIndexInAlbum = a.checkSongAlreadyExists(songName);
				if (songIndexInAlbum >= 0) {
					song = a.getSongList().get(songIndexInAlbum);
					this.playList.add(song);
					break;
				}
			}

			if (songIndexInAlbum < 0)
				System.out.println("Song " + songName + " not found in albums owned");
		}

		public void showPlayList() {
			System.out.println("$$$$$$$$$$$$$$$ playlist $$$$$$$$$$$$$$$$$$$$$$");
			for (Song s : playList) {
				System.out.println((playList.indexOf(s) + 1) + ". " + s.toString());
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}

		@SuppressWarnings("resource")
		public void menuPlayList() {
			Scanner scanner = new Scanner(System.in);
			int option;
			boolean quit = false;

			ListIterator<Song> listIterator = playList.listIterator();
			String traverseDirection = "forward";
			// listIterator.next();
			// listIterator.previous();

			displayMenuOptions();
			while (!quit) {
				option = scanner.nextInt();
				System.out.println("Option selected : " + option);
				switch (option) {
				case 0:
					System.out.println("Quitting playlist\n");
					quit = true;
					break;
				case 1:
					System.out.println("Display menu options\n");
					displayMenuOptions();
					break;
				case 2:
					System.out.println("Skip forward to the next song\n");
					if (listIterator.hasNext()) {
						if (traverseDirection.equalsIgnoreCase("back"))
							listIterator.next();
						System.out.println(listIterator.next().toString());
						traverseDirection = "forward";
					} else
						System.out.println("At the last song, can't go to the next song in the playlist");
					break;
				case 3:
					System.out.println("Skip backwards to the previous song\n");
					if (listIterator.hasPrevious()) {
						if (traverseDirection.equalsIgnoreCase("forward"))
							listIterator.previous();
						System.out.println(listIterator.previous().toString());
						traverseDirection = "back";
					} else
						System.out.println("Can't go back than first song in the playlist");
					break;
				case 4:
					System.out.println("Replay the current song\n");
					if (traverseDirection.equalsIgnoreCase("forward"))
						if (listIterator.hasPrevious())
							System.out.println(playList.get(listIterator.previousIndex()).toString());
					if (traverseDirection.equalsIgnoreCase("back"))
						if (listIterator.hasNext())
							System.out.println(playList.get(listIterator.nextIndex()).toString());
					break;
				case 5:
					showPlayList();
					break;
				case 6:
					System.out.println("Removing the current song from the playlist\n");
					listIterator.remove();
					if (traverseDirection.equalsIgnoreCase("forward")) {
						// playList.remove(listIterator.previousIndex());
						if (listIterator.hasNext())
							System.out.println(listIterator.next().toString());
					} else if (traverseDirection.equalsIgnoreCase("back")) {
						// playList.remove(listIterator.nextIndex());
						if (listIterator.hasPrevious())
							System.out.println(listIterator.previous().toString());
					}
					break;
				default:
					System.out.println("Invalid option, try again");
					displayMenuOptions();
				}
			}
		}

		private void displayMenuOptions() {
			System.out.println("Choose from the list of menu options for play list of songs\n" 
					+ "0 - Quit\n"
					+ "1 - Display menu options\n"
					+ "2 - Skip forward to the next song\n"
					+ "3 - Skip backwards to the previous song\n"
					+ "4 - Replay the current song\n"
					+ "5 - Show playlist\n" 
					+ "6 - Remove the current song\n");
		}
		
		public LinkedList<Song> getPlayList() {
			return playList;

		}
	}


}
