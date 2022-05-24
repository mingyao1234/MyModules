package sg.edu.rp.c346.id21023135.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    Button btnBack;
    TextView tvModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        btnBack = findViewById(R.id.buttonBack);
        tvModule = findViewById(R.id.textView1);
        Intent intentReceived = getIntent();
        if (intentReceived.getStringExtra("ModuleCode") != null) {
            String mcode = intentReceived.getStringExtra("ModuleCode");
            String mname = intentReceived.getStringExtra("ModuleName");
            int acyear = intentReceived.getIntExtra("AcademicYear", 2020);
            int sem = intentReceived.getIntExtra("Semester", 1);
            int mcredit = intentReceived.getIntExtra("ModuleCredit", 3);
            String venue = intentReceived.getStringExtra("Venue");
            tvModule.setText("Module Code: " + mcode +
                    "\nModule Name: " + mname +
                    "\nAcademic Year: " + acyear +
                    "\nSemester: " + sem +
                    "\nModule Credit: " + mcredit +
                    "\nVenue: " + venue);
        } else if (intentReceived.getStringExtra("ModuleCode2") != null){
            String mcode2 = intentReceived.getStringExtra("ModuleCode2");
            String mname2 = intentReceived.getStringExtra("ModuleName2");
            int acyear2= intentReceived.getIntExtra("AcademicYear2", 2020);
            int sem2 = intentReceived.getIntExtra("Semester2", 1);
            int mcredit2 = intentReceived.getIntExtra("ModuleCredit2", 4);
            String venue2 = intentReceived.getStringExtra("Venue2");
            tvModule.setText("Module Code: " + mcode2 +
                    "\nModule Name: " + mname2 +
                    "\nAcademic Year: " + acyear2 +
                    "\nSemester: " + sem2 +
                    "\nModule Credit: " + mcredit2 +
                    "\nVenue: " + venue2);
        } else if (intentReceived.getStringExtra("ModuleCode3") != null) {
            String mcode3 = intentReceived.getStringExtra("ModuleCode3");
            String mname3 = intentReceived.getStringExtra("ModuleName3");
            int acyear3 = intentReceived.getIntExtra("AcademicYear3", 2020);
            int sem3 = intentReceived.getIntExtra("Semester3", 1);
            int mcredit3 = intentReceived.getIntExtra("ModuleCredit3", 4);
            String venue3 = intentReceived.getStringExtra("Venue3");
            tvModule.setText("Module Code: " + mcode3 +
                    "\nModule Name: " + mname3 +
                    "\nAcademic Year: " + acyear3 +
                    "\nSemester: " + sem3 +
                    "\nModule Credit: " + mcredit3 +
                    "\nVenue: " + venue3);
        } else if (intentReceived.getStringExtra("ModuleCode4") != null) {
            String mcode4 = intentReceived.getStringExtra("ModuleCode4");
            String mname4 = intentReceived.getStringExtra("ModuleName4");
            int acyear4 = intentReceived.getIntExtra("AcademicYear4", 2020);
            int sem4 = intentReceived.getIntExtra("Semester4", 1);
            int mcredit4 = intentReceived.getIntExtra("ModuleCredit4", 3);
            String venue4 = intentReceived.getStringExtra("Venue4");
            tvModule.setText("Module Code: " + mcode4 +
                    "\nModule Name: " + mname4 +
                    "\nAcademic Year: " + acyear4 +
                    "\nSemester: " + sem4 +
                    "\nModule Credit: " + mcredit4 +
                    "\nVenue: " + venue4);
        } else {
            String mcode5 = intentReceived.getStringExtra("ModuleCode5");
            String mname5 = intentReceived.getStringExtra("ModuleName5");
            int acyear5 = intentReceived.getIntExtra("AcademicYear5", 2020);
            int sem5 = intentReceived.getIntExtra("Semester5", 1);
            int mcredit5 = intentReceived.getIntExtra("ModuleCredit5", 3);
            String venue5 = intentReceived.getStringExtra("Venue5");
            tvModule.setText("Module Code: " + mcode5 +
                    "\nModule Name: " + mname5 +
                    "\nAcademic Year: " + acyear5 +
                    "\nSemester: " + sem5 +
                    "\nModule Credit: " + mcredit5 +
                    "\nVenue: " + venue5);
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });
    }
}