package sg.edu.rp.c346.id21023135.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tvC203);
        tv2 = findViewById(R.id.tvC206);
        tv3 = findViewById(R.id.tvC218);
        tv4 = findViewById(R.id.tvC235);
        tv5 = findViewById(R.id.tvC346);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName","Web Appln Development in php");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue","W65H");
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("ModuleCode2", "C206");
                intent2.putExtra("ModuleName2","Software Development Process");
                intent2.putExtra("AcademicYear2", 2020);
                intent2.putExtra("Semester2", 1);
                intent2.putExtra("ModuleCredit2", 3);
                intent2.putExtra("Venue2","E66K");
                startActivity(intent2);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent3.putExtra("ModuleCode3", "C218");
                intent3.putExtra("ModuleName3","UI/UX Design for Apps");
                intent3.putExtra("AcademicYear3", 2020);
                intent3.putExtra("Semester3", 1);
                intent3.putExtra("ModuleCredit3", 4);
                intent3.putExtra("Venue3","E66B");
                startActivity(intent3);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent4.putExtra("ModuleCode4", "C235");
                intent4.putExtra("ModuleName4","IT Security and Management");
                intent4.putExtra("AcademicYear4", 2020);
                intent4.putExtra("Semester4", 1);
                intent4.putExtra("ModuleCredit4", 3);
                intent4.putExtra("Venue4","E66G");
                startActivity(intent4);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent5.putExtra("ModuleCode5", "C346");
                intent5.putExtra("ModuleName5","Android Programming");
                intent5.putExtra("AcademicYear5", 2020);
                intent5.putExtra("Semester5", 1);
                intent5.putExtra("ModuleCredit5", 4);
                intent5.putExtra("Venue5","E62E");
                startActivity(intent5);
            }
        });
    }
}