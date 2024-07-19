package com.example.alura_agenda.ui.activity;

//public class ListaAlunoActivity {
//}

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.alura_agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_alunos);

        List<String> alunos = new ArrayList<>(
                Arrays.asList("Marcélio G. Pereira", "Fran", "Alex", "Maria", "Ana", "Bruna")
        );

        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);

        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));

    }
}