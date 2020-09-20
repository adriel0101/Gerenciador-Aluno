package programajava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import programa.classes.Aluno;
import programa.classes.Disciplina;

public class cursojava {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();

        List<Aluno> alunosAprovado = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovado = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 5; qtd++) {

            /* Agora temos um objeto real na memoria */

            String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
            String idade = JOptionPane.showInputDialog("Qual a idade ?");
            String dataNacimento = JOptionPane.showInputDialog("Data de nacimento ?");
            String registrogeral = JOptionPane.showInputDialog("Registro geral ?");
            String numerocpf = JOptionPane.showInputDialog("Qual o CPF ?");
            String nomemae = JOptionPane.showInputDialog(" Nome da Mãe ?");
            String nomepai = JOptionPane.showInputDialog(" Nome do Pai ?");
            String datamatriculada = JOptionPane.showInputDialog("Data da Matricula ?");
            String nomeescola = JOptionPane.showInputDialog(" Nome da Escola ?");
            String seriematriculado = JOptionPane.showInputDialog(" Serié Matriculado ?");

            /*
             * String disciplina1 = JOptionPane.showInputDialog("Disciplina1 ?"); String
             * nota1 = JOptionPane.showInputDialog("Nota 1 ?");
             *
             * String disciplina2 = JOptionPane.showInputDialog("Disciplina2 ?"); String
             * nota2 = JOptionPane.showInputDialog("Nota 2 ?");
             *
             * String disciplina3 = JOptionPane.showInputDialog("Disciplina3 ?"); String
             * nota3 = JOptionPane.showInputDialog("Nota 3 ?");
             *
             * String disciplina4 = JOptionPane.showInputDialog("Disciplina4 ?"); String
             * nota4 = JOptionPane.showInputDialog("Nota 4 ?");
             */

            Aluno aluno1 = new Aluno();
            aluno1.setNome(nome);
            aluno1.setIdade(Integer.valueOf(idade));
            aluno1.setDataNacimento(dataNacimento);
            aluno1.setRegistroGeral(registrogeral);
            aluno1.setNumeroCpf(numerocpf);
            aluno1.setNomeMae(nomemae);
            aluno1.setNomePai(nomepai);
            aluno1.setDataMatricula(datamatriculada);
            aluno1.setNomeEscola(nomeescola);
            aluno1.setSerieMatriculado(seriematriculado);

            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina  " + pos + " ?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina  " + pos + " ?");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum disciplina? ");
            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {

                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina ? 1, 2, 3, ou 4");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;

                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover ?");
                }
            }

            alunos.add(aluno1);
        }

    }

}
