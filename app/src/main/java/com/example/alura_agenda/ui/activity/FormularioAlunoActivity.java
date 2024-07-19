package com.example.alura_agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alura_agenda.R;
import com.example.alura_agenda.dao.AlunoDAO;
import com.example.alura_agenda.ui.activity.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDAO dao = new AlunoDAO();

        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_Telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String nome = campoNome.getText().toString();
                        String telefone = campoTelefone.getText().toString();
                        String email = campoEmail.getText().toString();

                        Aluno alunoCriado = new Aluno(nome, telefone, email);
                        Toast.makeText(FormularioAlunoActivity.this,
                                alunoCriado.getNome() + " - "
                                        + alunoCriado.getTelefone() + " - "
                                        + alunoCriado.getEmail(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}