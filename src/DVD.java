/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geraldo.braga
 */
public class DVD extend Item{

   
    private String director;
    

    public DVD(String title, String director, int playTime, boolean owned, String comment) {
        this.title = title;
        this.director = director;
        this.playTime = playTime;
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

    public void print() {
        System.out.print("DVD: " + title + " (" + playTime + "mins");

        if (owned) {
            System.out.println("*");
        } else {
            System.out.println("");

        }

        System.out.println("    " + director);
        System.out.println("    " + comment);

    }
}
