package com.mysongs;

public class Song implements Comparable<Song>{
	
	private String songName;
	private String songArtist;
	private String movie;
	private int year;
	
	public Song(String songName, String songArtist, String movie, int year) {
		super();
		this.songName = songName;
		this.songArtist = songArtist;
		this.movie = movie;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + ", songArtist=" + songArtist + ", movie=" + movie + ", year=" + year
				+ "]";
	}

	
	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongArtist() {
		return songArtist;
	}

	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		System.out.println("The Song "+year+" is compared to "+o.year);
		return Integer.compare(year, o.year);
	}
	
	
	
	

}
