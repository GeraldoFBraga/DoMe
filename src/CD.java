/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geraldo.braga
 */
public class CD extend Item{
    
    private String artist;
    private int numberOfTracks;
    

    public CD(String title, String artist, int numberOfTracks, double playingTime) {
        this.title = title;
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
        this.playingTime = playingTime;
        this.owned = false;
        this.comment = "";
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public void print(){
        
        System.out.print("CD: " + title + "(" + playingTime + " mins)");
        
        if(owned){
            System.out.println("*");
            
        }else{
            System.out.println();
        }
        
        System.out.println(" " + artist);
        System.out.println(" trilhas: " + numberOfTracks);
        System.out.println("  " + comment);
    }
    
    
    
            
    
}
