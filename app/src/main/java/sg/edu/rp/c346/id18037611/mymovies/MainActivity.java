package sg.edu.rp.c346.id18037611.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity<CustomAdapter> extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> alMovieList;
    CustomeAdapter caMovie;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        tvTitle = findViewById(R.id.textViewTitle);
        alMovieList = new ArrayList<>();

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        Calendar time3 = Calendar.getInstance();

        time1.set(Calendar.DAY_OF_MONTH,15);
        time1.set(Calendar.MONTH, 11);
        time1.set(Calendar.YEAR, 2014);

        time2.set(Calendar.DAY_OF_MONTH,15);
        time2.set(Calendar.MONTH, 5);
        time2.set(Calendar.YEAR, 2015);

        time3.set(Calendar.DAY_OF_MONTH,15);
        time3.set(Calendar.MONTH, 5);
        time3.set(Calendar.YEAR, 2020);

        Movie item1 = new Movie("The Avengers", 2012, "pg13", 4f,"Action|Sci-Fi", time1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        alMovieList.add(item1);
        Movie item2 = new Movie("Planes", 2013, "pg", 2f,"Animation|Comedy", time2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        alMovieList.add(item2);
        Movie item3 = new Movie("Sonic the Hedgehog", 2020, "pg", 4f,"Action|Adventure|Comedy", time2, "Cathay - AMK Hub", "Sonic");
        alMovieList.add(item3);

        caMovie = new CustomeAdapter(this, R.layout.row, alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                Movie movieSelected = alMovieList.get(position);
                String title = movieSelected.getTitle();
                String info = movieSelected.getYear() + " - " + movieSelected.getGenre();
                String rating = movieSelected.getRated();
                String description = movieSelected.getDescription();
                Calendar watched = movieSelected.getWatched_on();
                String theatre = movieSelected.getIn_theatre();
                float rating_score = movieSelected.getRating();

                String watched_date = watched.get(Calendar.DAY_OF_MONTH)+"/"+watched.get(Calendar.MONTH)+"/"+watched.get(Calendar.YEAR);

                Intent intent = new Intent(MainActivity.this, Movie2.class);
                intent.putExtra("Title", title);
                intent.putExtra("Info", info);
                intent.putExtra("Rating", rating);
                intent.putExtra("Description", description);
                intent.putExtra("Theatre", theatre);
                intent.putExtra("Watched_Date", watched_date);
                intent.putExtra("Rating_Score", String.valueOf(rating_score));
                startActivity(intent);
            }
        });
    }
}
