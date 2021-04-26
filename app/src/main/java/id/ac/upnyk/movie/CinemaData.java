package id.ac.upnyk.movie;

import java.util.ArrayList;

public class CinemaData {
    private static String[] cinemaNames = {
            "INDO XXI",
            "DNY PREMIERE",
            "J-WALK CGV",
            "TRANSMART JOGJA CGV",
            "LIVING WORD SLEMAN",
            "AMPLAZ XXI",
            "LIPPO CGV",
            "HOLIDAY BANTUL CGV"

    };

    private static String[] cinemaAddress = {
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja",
            "Alamat: Jogja"


    };
    private static int[] cinemaImages = {
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,

    };
    public static ArrayList<Cinema>getListData(){
        ArrayList<Cinema> list = new ArrayList<>();
        for(int position = 0;position <cinemaImages.length;position++){
            Cinema cinema = new Cinema();
                cinema.setName(cinemaNames[position]);
                cinema.setAddress(cinemaAddress[position]);
                cinema.setPhoto(cinemaImages[position]);
                list.add(cinema);
            }
            return list;
        }
    }

