package com.example.rbrazuk.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    final List<String> taskArray = new ArrayList<>();

    public void addTask(View view){
        EditText taskInput = (EditText) findViewById(R.id.taskInput);

        String newTask = taskInput.getText().toString();
        System.out.println(newTask);
        taskArray.add(newTask);
        taskInput.setText("");
        ((LinearLayout) findViewById(R.id.dummy_id)).requestFocus();

       


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView taskList = (ListView) findViewById(R.id.tasksList);

        taskArray.add("do stuff");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,taskArray);

        taskList.setAdapter(arrayAdapter);

        ((LinearLayout) findViewById(R.id.dummy_id)).requestFocus();



    }
}
