package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

//public class NumbersActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//       setContentView(R.layout.activity_numbers);
//    }
//}

public class NumberClickListener implements View.OnClickListener {

    @Override
    public void onClick (View view){
        Toast.makeText(view.getContext(),"Open the list of numbers", Toast.LENGTH_SHORT).show();
    }

}