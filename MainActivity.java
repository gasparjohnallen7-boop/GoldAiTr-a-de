package com.goldai.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){ super.onCreate(b); setContentView(R.layout.activity_main);
  Button refresh=findViewById(R.id.refresh);
  refresh.setOnClickListener(v -> Toast.makeText(this,"Analysis refreshed. Live data is not connected in this demo.",Toast.LENGTH_SHORT).show());
 }
}
