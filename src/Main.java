import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Criar um algoritimo usando for que leia duas notas de 3 alunos, e para cada
        aluno, calcule a media e eciba na tela a situação aprovado ou reprovado (media 6)
        */
        //1= para cada aluno sera atribuida uma media que foi resultada atraves de 2 notas x3;
        for (int i = 0; i < 3; i++){
        String aluno = JOptionPane.showInputDialog("Digite o nome: ");
            float n1,n2;
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota: "));
            float media = (n1 +n2) /2;
        if(media >= 6){
            System.out.println("Nome aluno= " + aluno + "\nMedia = " + media + "\nsua situação " +  " Aprovado\n");
        }else {
            System.out.println("Nome aluno= " + aluno + "\nMedia = " + media + "\nsua situação " +  " Reprovado\n");
        }
        }
    }
}