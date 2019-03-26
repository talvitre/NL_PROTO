package com.example.nlprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MusicSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_sheet);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("MY SONG");

        goToInstrumentPanel();
        goToNotePanel();
    }

    private void goToInstrumentPanel(){
        Button btnInstr = (Button)findViewById(R.id.button4);
        btnInstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicSheet.this, InstrumentPanel.class));
            }
        });
    }

    private void goToNotePanel(){
        Button btnNote = (Button)findViewById(R.id.button5);
        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicSheet.this, NotePanel.class));
            }
        });
    }

}
