package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * A class to hold details of audio files.
 * @author Abtin Zandi
 * @version 2021/20/10
 */
public class MusicCollection
{
    // A player for the music files.
    private MusicPlayer player;
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // Music name
    private ArrayList<String> tracks;
    //Music Type
    private ArrayList<String> Type;
    //Music Artist
    private ArrayList<String> Artist;
    //Music Album
    private ArrayList<String> Album;
    //Music rate
    private ArrayList<Float> rate;
    //is our Music in favorite list ?
    private ArrayList<Boolean> favorite;
    //music file size
    private ArrayList<Float> size;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        player = new MusicPlayer();
        files = new ArrayList<>();
        tracks = new ArrayList<>();
        Artist = new ArrayList<>();
        Type = new ArrayList<>();
        Album = new ArrayList<>();
        rate = new ArrayList<>();
        favorite = new ArrayList<>();
        size = new ArrayList<>();

    }

    /***
     * set the music detail
     * we will make a new music track with our new given details
     * @param musicName
     * @param musicArtist
     * @param musicType
     * @param musicAlbum
     * @param musicRate
     * @param musicSize
     */

    public void addMusic(String musicName,String musicArtist,String musicType,String musicAlbum,float musicRate,float musicSize)
    {
        tracks.add(musicName);
        Artist.add(musicArtist);
        Type.add(musicType);
        Album.add(musicAlbum);
        rate.add(musicRate);
        size.add(musicSize);
        favorite.add(false);
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /***
     * search your music name and add it to your Favorite list
     */
    public void setFavorite(){
        System.out.println("please Enter the name of track");
        Scanner input = new Scanner(System.in);
        String  choice = input.nextLine();
        for(String name : tracks){
            if(name.equals(choice)){
                int index = tracks.indexOf(name);
                favorite.set(index,true);

            }
        }
    }

    /**
     * this method will remove your music
     */
    public void removeMusic(){
        System.out.println("please Enter the Name of Track");
        Scanner input = new Scanner(System.in);
        String  choice = input.nextLine();
        Iterator it = tracks.iterator();
        Iterator it1 = favorite.iterator();
        Iterator it2 = Artist.iterator();
        Iterator it3 = Album.iterator();
        Iterator it4 = Type.iterator();
        Iterator it5 = size.iterator();
        Iterator it6 = rate.iterator();
        while (it.hasNext() && it1.hasNext() && it2.hasNext() && it3.hasNext() && it4.hasNext() && it5.hasNext() && it6.hasNext()){
            String test = (String) it.next();
            boolean test1 = (Boolean)it1.next();
            String test2 = (String)it2.next();
            String test3 = (String)it3.next();
            String test4 = (String)it4.next();
            float test5 = (Float)it5.next();
            float test6 = (Float)it6.next();

            if(test.equals(choice)){
                int index = tracks.indexOf(test);
                System.out.println("------------------------------------------------------------------");
                System.out.printf("Music Name: %s\nMusic Artist: %s\nMusic Type: %s\nMusic Album: %s\nMusic rate: %f\nMusic size: %f\n",test,test2,test4,test3,test6,test5);
                System.out.println("------------------------------------------------------------------");
                System.out.println("Are you sure?\n1) yes\netc.No");
                String sure = input.nextLine();
                if (sure.charAt(0) == '1' && sure.length() == 1){
                    it.remove();
                    it1.remove();
                    it2.remove();
                    it3.remove();
                    it4.remove();
                    it5.remove();
                    it6.remove();
                }

        }

        }
        }

    /**
     * In this method we can edit our music information
     */
    public void editMusic(){
        while (1==1)
        {
            System.out.println("1)Music name\netc.Exit");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            if (choice.charAt(0) == '1' && choice.length() == 1){
                System.out.println("Music name");
                String name = input.nextLine();
                Boolean correct = false;
                for(String musicName : tracks){
                    if(musicName.equals(name)){
                        int index = tracks.indexOf(name);
                        correct = true;
                        System.out.println("------------------------------------------------------------------");
                        System.out.printf("Music Name: %s\nMusic Artist: %s\nMusic Type: %s\nMusic Album: %s\nMusic rate: %f\nMusic size: %f\n",tracks.get(index),Artist.get(index),Type.get(index),Album.get(index),rate.get(index),size.get(index));
                        System.out.println("------------------------------------------------------------------");
                        while (1==1){
                            System.out.println("1) Music name\n2) Music Artist\n3) Music Type\n4) Music Album\n5) Music rate\n6) Music size\netc.Exit");
                            String secChoice = input.nextLine();
                            Scanner newinpute = new Scanner(System.in);
                            if(secChoice.charAt(0) == '1' && secChoice.length() == 1){
                                System.out.println("Music name");
                                String newName = newinpute.nextLine();
                                tracks.set(index,newName);
                            }
                            else if(secChoice.charAt(0) == '2' && secChoice.length() == 1){
                                System.out.println("Music  Artist");
                                String newArtist = newinpute.nextLine();
                                Artist.set(index,newArtist);

                            }
                            else if(secChoice.charAt(0) == '3' && secChoice.length() == 1){
                                System.out.println("Music  Type");
                                String newType = newinpute.nextLine();
                                Type.set(index,newType);

                            }
                            else if(secChoice.charAt(0) == '4' && secChoice.length() == 1){
                                System.out.println("Music  Album");
                                String newAlbum = newinpute.nextLine();
                                Album.set(index,newAlbum);
                            }
                            else if(secChoice.charAt(0) == '5' && secChoice.length() == 1){
                                System.out.println("Music  rate");
                                float newRate = newinpute.nextFloat();
                                rate.set(index,newRate);
                            }
                            else if(secChoice.charAt(0) == '6' && secChoice.length() == 1){
                                System.out.println("Music  size");
                                float newSize = newinpute.nextFloat();
                                size.set(index,newSize);
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
                if(correct == false){
                    System.out.println("ERROR !");
                }
            }
            else{
                break;
            }
        }
    }

    /**
     * this method will get your music name and it will search it in music list
     * then it will connect with search print method ...
     */
    public void musicSearch(String name){
            Scanner input = new Scanner(System.in);
            Boolean correct = false;
            for(String musicName : tracks){
                    if(musicName.equals(name)){
                        int index = tracks.indexOf(name);
                        searchPrint(index);
                        correct = true;
                    }
            }
           if(correct == false){
            System.out.println("ERROR !");
            }

    }

    /***
     * Search print
     * this method will show you your searched music
     * @param index
     */
    public void searchPrint(int index){
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Music Name: %s\nMusic Artist: %s\nMusic Type: %s\nMusic Album: %s\nMusic rate: %f\nMusic size: %f\n",tracks.get(index),Artist.get(index),Type.get(index),Album.get(index),rate.get(index),size.get(index));
        System.out.println("------------------------------------------------------------------");
    }

    /***
     * this method will show you all of musics information
     */
    public void musicPrint(){
        for(int index = 0;index < tracks.size();index-=-1)
        {
            System.out.println("------------------------------------------------------------------");
            System.out.printf("Music Name: %s\nMusic Artist: %s\nMusic Type: %s\nMusic Album: %s\nMusic rate: %f\nMusic size: %f\n",tracks.get(index),Artist.get(index),Type.get(index),Album.get(index),rate.get(index),size.get(index));
            System.out.println("------------------------------------------------------------------");
        }
    }

    /***
     * this method will show you all of Favorite musics information
     */
    public void favoriteMusicPrint(){
        System.out.println("Favorite list");
        for(int index = 0;index < tracks.size();index-=-1){
            if(favorite.get(index) == true){
                System.out.println("------------------------------------------------------------------");
                System.out.printf("Music Name: %s\nMusic Artist: %s\nMusic Type: %s\nMusic Album: %s\nMusic rate: %f\nMusic size: %f\n",tracks.get(index),Artist.get(index),Type.get(index),Album.get(index),rate.get(index),size.get(index));
                System.out.println("------------------------------------------------------------------");
            }
        }
    }

}