package com.example.pj_lab11;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.CameraAdapter;
import Model.Camera;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CameraAdapter cameraAdapter;
    List<Camera> cameraList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the product list
        cameraList = new ArrayList<>();
        cameraList.add(new Camera("Canon EOS R10 ", "Mirrorless Camera", 50000, "https://www.bigcamera.co.th/media/catalog/product/cache/69a3da6bcd95df779892f4b24fa6a6f7/1/6/1653353121_1708097_1.jpg"));
        cameraList.add(new Camera("EOS 200D II", "DSLR", 45000, "https://th.canon/media/image/2019/04/10/bc342d12af8c417393a4f78e4c10955e_EOS+200D+MKII+BK+Front.png"));

        cameraAdapter = new CameraAdapter(this, cameraList);
        recyclerView.setAdapter(cameraAdapter);
    }
}