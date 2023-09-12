package com.polije.tif;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.polije.tif.adapter.MahasiswaAdapter;
import com.polije.tif.model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Ahmad Muhyiddin(E41221654)");
        }

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));

        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));

        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));

        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));

        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560","987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","9876548765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","0098758124"));
    }
}