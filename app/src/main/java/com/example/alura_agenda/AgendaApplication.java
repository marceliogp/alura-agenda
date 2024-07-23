package com.example.alura_agenda;

import android.app.Application;

import com.example.alura_agenda.dao.AlunoDAO;
import com.example.alura_agenda.ui.activity.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();

    }

    private static void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        //for (int i = 0; i < 2; i++) {
        //    dao.salva(new Aluno("Marcélio " + String.valueOf(i), "61984015755", "marceliogp@gmail.com"));
        //    dao.salva(new Aluno("Ana Paula " + String.valueOf(i), "61984015756", "ana.brito13@gmail.com"));
        //}
        dao.salva(new Aluno("Marcélio ", "61984015755", "marceliogp@gmail.com"));
        dao.salva(new Aluno("Ana Paula ", "61984015756", "ana.brito13@gmail.com"));
    }
}
