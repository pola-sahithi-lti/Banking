import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mysongs.Song;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		Song s3 = new Song("Tanhayee","Sonu Nigam","Dil Chatha Hai",2003);
		Song s4 = new Song("Ranjha","B Praak","Shershaah",2021);
		Song s5 = new Song("Raataan Lambiyan","Jubin Nautiyal","Shershaah",2021);
		Song s6 = new Song("Samajavaragamana","Sid Sriram","Ala Vaikuntapuram lo",2020);
		
		ArrayList<Song> jukeBox = new ArrayList<Song>();
		jukeBox.add(s1);
		jukeBox.add(s2);
		jukeBox.add(s3);
		jukeBox.add(s4);
		jukeBox.add(s5);
		jukeBox.add(s6);
		
		Comparator<Song> comparator = new SongNameComparator();
		Collections.sort(jukeBox,comparator); //-- will refer Comparable in Song class
			
		for(Song s : jukeBox) {
			System.out.println("Song : "+s);
		}
	}

}

class ArtistComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getSongArtist()+" with "+o2.getSongArtist());
		return o1.getSongArtist().compareTo(o2.getSongArtist());
	}
	
}
class SongNameComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getSongName()+" with "+o2.getSongName());
		return o1.getSongName().compareTo(o2.getSongName());
	}
	
}

class AlbumComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getMovie()+" with "+o2.getMovie());
		return o1.getMovie().compareTo(o2.getMovie());
	}
	
}
