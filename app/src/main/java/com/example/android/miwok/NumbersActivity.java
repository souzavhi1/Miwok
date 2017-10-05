package com.example.android.miwok;

/**
 * Created by VictorHugo on 21/09/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

//import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String [] words = new String[10];
        //words[0] = "zero";

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //Log.v("NumbersActivity","Word at index0: " + words);
        //Log.v("NumbersActivity","Word at index0: " + words.get(0));

        // Acha uma Viewid e armazena em uma variavel
        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Cria um objeto e armazena na variavel e o tipo de dados é um TextView
        //TextView wordView = new TextView(this);
        //Modifica o texto a ser exibido da textview armazenada na variável.
        //wordView.setText(words.get(0));
        // Adiciona uma view filha em uma view pai
        //rootView.addView(wordView);

        // Loop While
        //int count = 0;
        //while (count < words.size()) {
        //   TextView wordView = new TextView(this);
        //    wordView.setText(words.get(count));
        //    rootView.addView(wordView);
        //   count += 1;

        //Loop For
        //for (int count = 0;count < words.size(); count++) {
        //    TextView wordView = new TextView(this);
        //    wordView.setText(words.get(count));
         //   rootView.addView(wordView);
        //}

        //Array Adapter, usando uma lista de itens reciclável
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }

}