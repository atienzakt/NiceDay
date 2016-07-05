package practice.katienza.niceday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Card> contents = new ArrayList<Card>();
        contents.add(new Card("Beach","Beach",R.drawable.beach,"Beach"));
        contents.add(new Card("Flower","Flower",R.drawable.flower,"Flower"));
        contents.add(new Card("Garden","Garden",R.drawable.garden,"Garden"));
        contents.add(new Card("Sakura","Sakura",R.drawable.sakura,"Sakura"));
        contents.add(new Card("Sunset","Sunset",R.drawable.sunset,"Sunset"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.base_recycler);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(llm);
        recyclerView.addItemDecoration(new OverlapDecoration());
        CardAdapter cardAdapter = new CardAdapter(contents);
        recyclerView.setAdapter(cardAdapter);

    }
}
