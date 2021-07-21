package playlist;


public class Song {
private String title;
private double duration;

public Song(String title, double duration) {
	String songName = title;
	if (songName != null && songName.isBlank() != true) {
			if (duration> 0) {
				this.title = title;
				this.duration = duration;
			}
			else
				System.out.println("Invalid song duration");
	} else {
		System.out.println("Invalid song name");
	}

}

@Override
public String toString() {
	return "Song title=" + title + ", duration=" + String.format("%.2f", duration);
}

public String getTitle() {
	return title;
}

public double getDuration() {
	return duration;
}

}
