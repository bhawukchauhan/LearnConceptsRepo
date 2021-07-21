package com.BuchalkaTim;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.Test;

import playlistInnerClass.Album;
import playlistInnerClass.Song;
import playlistInnerClass.SongsPlayList;

public class SongInnerClassTest {
	
  @Test
  public void f() {
	  /*
	  Song song = new Song("first song", 2.23);  
	  //System.out.println("song title : " + song.getTitle());
	  //System.out.println("song duration : " + song.getDuration());
	  
	  Album album = new Album("Posty", "Post Malone");
	  album.checkAndAddSong(song);
	  album.checkAndAddSong(song);
	  album.checkAndAddSong(new Song("2nd song", 2.5));
	  album.checkAndAddSong(new Song("3rd song", 1.50));


	  System.out.println("################ Album ########################");
	  for(Song i : album.getSongList()) {
		  System.out.println(i.toString());
	  }
	  
	  album.removeSong("2nd song"); 
	  album.showAlbumSongs();
	  album.removeSong(null);
	  album.showAlbumSongs();
	  */
	  
  }
  
  @Test
  public void fAlbum() {
	  SongsPlayList pList = new SongsPlayList();
	  
	  Album album = new Album("Stormbringer", "Deep Purple");
	  album.checkAndAddSong(new Song("Stormbringer", 4.6));
	  album.checkAndAddSong(new Song("Love don't mean a thing", 4.22));
	  album.checkAndAddSong(new Song("Holy man", 4.3));
	  album.checkAndAddSong(new Song("Hold on", 5.6));
	  album.checkAndAddSong(new Song("Lady double dealer", 3.21));
	  album.checkAndAddSong(new Song("You can't do it right", 6.23));
	  album.checkAndAddSong(new Song("High ball shooter", 4.27));
	  album.checkAndAddSong(new Song("The gypsy", 4.2));
	  album.checkAndAddSong(new Song("Soldier of fortune", 3.13));
	  pList.setAlbumsOwned(album);

	  album = new Album("For those about to rock", "AC/DC");
	  album.checkAndAddSong(new Song("For those about to rock", 5.44));
	  album.checkAndAddSong(new Song("I put the finger on you", 3.25));
	  album.checkAndAddSong(new Song("Lets go", 3.45));
	  album.checkAndAddSong(new Song("Inject the venom", 3.33));
	  album.checkAndAddSong(new Song("Snowballed", 4.51));
	  album.checkAndAddSong(new Song("Evil walks", 3.45));
	  album.checkAndAddSong(new Song("C.O.D.", 5.25));
	  album.checkAndAddSong(new Song("Breaking the rules", 5.32));
	  album.checkAndAddSong(new Song("Night of the long knives", 5.12));
	  pList.setAlbumsOwned(album);
	  
	  /*
	  LinkedList<Song> playList = new LinkedList<Song>();	  
	  albums.get(0).addToPlayList("You can't do it right", playList);
	  albums.get(0).addToPlayList("Holy man", playList);
	  albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
	  albums.get(0).addToPlayList(9, playList);
	  albums.get(1).addToPlayList(3, playList);
	  albums.get(1).addToPlayList(2, playList);
	  albums.get(1).addToPlayList(24, playList);  // There is no track 24
	  */
	  
	  System.out.println("################ Album ########################");
	  for(Album i : pList.getAlbumsOwned()) {
		  i.showAlbumSongs();
	  }
	  
	  pList.getpList().showPlayList();
	  pList.getpList().addToPlayList("song12");
	  pList.getpList().addToPlayList("High ball shooter");
	  pList.getpList().addToPlayList("Snowballed");
	  pList.getpList().addToPlayList("The gypsy");
	  pList.getpList().addToPlayList("I put the finger on you");
	  pList.getpList().addToPlayList("Lady double dealer");
	  pList.getpList().addToPlayList("Evil walks");
	  pList.getpList().showPlayList();
	  pList.getpList().menuPlayList();
	  /*
		ListIterator<Song> listIterator = pList.getPlayList().listIterator();
		if (listIterator.hasNext())
			System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		listIterator.previous();
		if (listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		listIterator.next();
		System.out.println(listIterator.next());
		if (listIterator.hasNext())1
		
			System.out.println(listIterator.next());
		if (listIterator.hasNext())
			System.out.println(listIterator.next());
		if (listIterator.hasNext())
			System.out.println(listIterator.next());
		if (listIterator.hasNext())
			System.out.println(listIterator.next());
			*/
	  
	  
  }
  

}
