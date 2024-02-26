package com.visll_k.t2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class option1 extends AppCompatActivity {


    ListView lv;
    ProgramAdapter programAdapter;

    String[] Monday = {"Time: 530 \n Period : MAD \n Room: 501",
            "Time: 530 \n Period : MAD \n Room: 501",
            "Time: 530 \n Period : MAD \n Room: 501",};

    String[] Tuesday = {"Time: 530 \n Period : wt \n Room: 501",
            "Time: 530 \n Period : wt \n Room: 501",
            "Time: 530 \n Period : wt \n Room: 501",
    };

    String[] Wednesday = {"Time: 530 \n Period : rl \n Room: 501",
            "Time: 530 \n Period : rl \n Room: 501",
            "Time: 530 \n Period : rl \n Room: 501",

    };

    String[] Thursday = {"Time: 530 \n Period : fip \n Room: 501",
            "Time: 530 \n Period : fip \n Room: 501",
            "Time: 530 \n Period : fip \n Room: 501",

    };

    String[] Friday = {"Time: 530 \n Period : MAD \n Room: 501",
            "Time: 530 \n Period : MAD \n Room: 501",
            "Time: 530 \n Period : MAD \n Room: 501",

    };

    String[] Saturday = {"Time: 530 \n Period : no \n Room: 501",
            "Time: 530 \n Period : no \n Room: 501",
            "Time: 530 \n Period : no \n Room: 501",

    };

    String[] details = Monday.clone();

    Button mon, tue, wed, thur, fri, sat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);

        mon = findViewById(R.id.mon);
        tue = findViewById(R.id.tue);
        wed = findViewById(R.id.wed);
        thur = findViewById(R.id.Thu);
        fri = findViewById(R.id.fri);
        sat = findViewById(R.id.sat);
        lv = findViewById(R.id.listview);

        programAdapter = new ProgramAdapter(this, details);
        lv.setAdapter(programAdapter);

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Monday.clone());
            }
        });

        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Tuesday.clone());
            }
        });

        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Wednesday.clone());
            }
        });

        thur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Thursday.clone());
            }
        });

        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Friday.clone());
            }
        });

        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                programAdapter.setDetails(Saturday.clone());
            }
        });

    }
}
