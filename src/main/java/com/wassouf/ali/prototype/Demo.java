package com.wassouf.ali.prototype;

import com.wassouf.ali.prototype.classes.Album;
import com.wassouf.ali.prototype.classes.EntertainmentProduct;
import com.wassouf.ali.prototype.classes.Movie;
import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static void main(String... args) throws CloneNotSupportedException
    {
        Movie movie = new Movie("Fantastic four");
        Album album = new Album("Kamikazi", 10);
        List<EntertainmentProduct> kamikaziCopies = new ArrayList<>();
        List<EntertainmentProduct> fantasticFourCopies = new ArrayList<>();
        for(int i = 0; i < 3 ; i++){
            kamikaziCopies.add(album.clone());
            fantasticFourCopies.add(movie.clone());
        }
        System.out.println(kamikaziCopies);
        System.out.println(fantasticFourCopies);
    }
}
