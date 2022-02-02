package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MusicCollection musicCollection = new MusicCollection();

        musicCollection.addMusic("Bad Day","Daniel Powter","Classic","Single Track",10,7);
        musicCollection.addMusic("Some Thing Just Like This","Chain smokers","Pop","Single Track",9,8);
        musicCollection.addMusic("Big Shark","Russ Millions","Rap","AD vision",9,5);
        musicCollection.addMusic("Natural","Imagine Dragons","Rock","Origins",10,12);


        Scanner input = new Scanner(System.in);
	while (1==1){
	    System.out.println("1) Songs list\n2) Edit Songs\n3) Favorite list\n4) New song\n5) Remove\n6)Search\n7)player\netc.Exit");
	    String  choice = input.nextLine();
	    if(choice.charAt(0) == '1' && choice.length() == 1){
	        musicCollection.musicPrint();
        }
        else if(choice.charAt(0) == '2' && choice.length() == 1){
            musicCollection.editMusic();
        }
        else if(choice.charAt(0) == '3' && choice.length() == 1){
            System.out.println("1) Favorite list\n2) new favorite music");
            String  secondChoice = input.nextLine();
            if(secondChoice.charAt(0) == '1' && secondChoice.length() == 1){
                musicCollection.favoriteMusicPrint();
            }
            else if(secondChoice.charAt(0) == '2' && secondChoice.length() == 1){
                musicCollection.setFavorite();
            }
        }
        else if(choice.charAt(0) == '4' && choice.length() == 1){
            //Music name
            System.out.printf("Music name: ");
            String name = input.nextLine();

            //Music Artist name
            System.out.printf("Music Artist name: ");
            String artist = input.nextLine();

            //Music type
            System.out.printf("Music type: ");
            String type = input.nextLine();

            //Music name
            System.out.printf("Music Album Name: ");
            String album = input.nextLine();

            //Music rate
            System.out.printf("Music rate: ");
            Float rate = input.nextFloat();

            //Music size
            System.out.printf("Music size: ");
            Float size = input.nextFloat();

            //Music name
            System.out.printf("Music File Address: ");
            String address = input.nextLine();

            musicCollection.addMusic(name,artist,type,album,rate,size);
            musicCollection.addFile(address);

        }
        else if(choice.charAt(0) == '5' && choice.length() == 1){
            musicCollection.removeMusic();

        }
        else if(choice.charAt(0) == '6' && choice.length() == 1){

            System.out.println("Please Enter the Name of Track");
            Scanner input2 = new Scanner(System.in);
            String  choice2 = input2.nextLine();
            musicCollection.musicSearch(choice2);

        }

        else if(choice.charAt(0) == '7' && choice.length() == 1){

            System.out.print("Please Enter the Name of Track :");
            Scanner input2 = new Scanner(System.in);
            String  choice2 = input2.nextLine();
            musicCollection.musicSearch(choice2);
            MusicPlayer player = new MusicPlayer();
            player.startPlaying(choice2);
            System.out.println("\npress eny key to Stop");
            String stop = input2.nextLine();
            if(stop.length() > 0){
                player.stop();
            }
        }

        else{
            break;
        }
    }
    }
}
