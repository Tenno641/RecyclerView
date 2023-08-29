package com.example.day4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.day4.R;
import com.example.day4.adapter.RecyclerViewAdapter;
import com.example.day4.data.FlagsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.contactsRV);
        recyclerViewAdapter = new RecyclerViewAdapter(getContactsList());

        recyclerView.setAdapter(recyclerViewAdapter);

    }

    private List<FlagsModel> getContactsList() {
        List<FlagsModel> contacts = new ArrayList<>();
        contacts.add(new FlagsModel("Bahrain", R.drawable.flags_bahrain_white));
        contacts.add(new FlagsModel("Egypt", R.drawable.flags_egypt_white));
        contacts.add(new FlagsModel("Iraq", R.drawable.flags_iraq_white));
        contacts.add(new FlagsModel("Jordan", R.drawable.flags_jordan_white));
        contacts.add(new FlagsModel("Lebanon", R.drawable.flags_lebanon_white));
        contacts.add(new FlagsModel("Oman", R.drawable.flags_oman_white));
        contacts.add(new FlagsModel("Palestine", R.drawable.flags_palestine_white));
        contacts.add(new FlagsModel("Syria", R.drawable.flags_syria_white));
        contacts.add(new FlagsModel("Tunisia", R.drawable.flags_tunisia_white));
        contacts.add(new FlagsModel("UAE", R.drawable.flags_unitedarabemirates_white));
        contacts.add(new FlagsModel("Yemen", R.drawable.flags_yemen_white));
        return contacts;
    }

}