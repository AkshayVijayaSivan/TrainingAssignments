package com.akshay.training;

public class Lab2InheritanceAndPolymorphism {

	public static void main(String[] args) {
		Video vid=new Video(12321, "Dangerous",10000,100, "MJ", "Rock", 1990);
		System.out.println(vid.getNumberOfCopies());

	}

}

abstract class item{
	private int identificationNumber;
	private String title;
	private int numberOfCopies;

	
	public int getIdentificationNumber() {
		return identificationNumber;
	}


	public String getTitle() {
		return title;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public item(int identificationNumber,String title,int numberOfCopies){
		super();
		this.identificationNumber=identificationNumber;
		this.title=title;
		this.numberOfCopies=numberOfCopies;
	}
	
}
abstract class WrittenItem extends item{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem(int identificationNumber, String title, int numberOfCopies,String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author=author;
	}
	
}
class Book extends WrittenItem{

	public Book(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		
	}
	
}

class JournalPaper extends WrittenItem{
	private int yearPublished;
	

	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author,int yearPublished) {
		super(identificationNumber, title, numberOfCopies, author);
		this.yearPublished=yearPublished;
	}


	public int getYearPublished() {
		return yearPublished;
	}


	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
}

abstract class MediaItem extends item{
	private int runTime;
	public MediaItem(int identificationNumber, String title, int numberOfCopies,int runTime) {
		super(identificationNumber, title, numberOfCopies);
		this.runTime=runTime;
		
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;

	public Video(int identificationNumber, String title, int numberOfCopies, int runTime,String director,String genre,int year) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}

class CD extends MediaItem{
	private String artist;
	private String genre;

	public CD(int identificationNumber, String title, int numberOfCopies, int runTime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.artist=artist;
		this.genre=genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
