package execicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String dcp1 = JOptionPane.showInputDialog("Insira a Disciplina ");
		String n1 = JOptionPane.showInputDialog("Insira a Nota ");
		String dcp2 = JOptionPane.showInputDialog("Insira a Disciplina ");
		String n2 = JOptionPane.showInputDialog("Insira a Nota ");
		String dcp3 = JOptionPane.showInputDialog("Insira a Disciplina ");
		String n3 = JOptionPane.showInputDialog("Insira a Nota ");
		String dcp4 = JOptionPane.showInputDialog("Insira a Disciplina ");
		String n4 = JOptionPane.showInputDialog("Insira a Nota ");
		Aluno aluno1= new Aluno("Diego Oliveira","123456789-00");
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina(dcp1);
		disciplina1.setNota(Double.parseDouble(n1));
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina(dcp2);
		disciplina2.setNota(Double.parseDouble(n2));
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina(dcp3);
		disciplina3.setNota(Double.parseDouble(n3));
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina(dcp4);
		disciplina4.setNota(Double.parseDouble(n4));
		aluno1.getDisciplinas().add(disciplina4);
		JOptionPane.showMessageDialog(null, "A média do aluno é : "+aluno1.getMediaNotas());
		JOptionPane.showMessageDialog(null, "o Aluno está : "+(aluno1.getAlunoAprovado()?" Aprovado ":" Reprovado "));
		/*System.out.println("A média do aluno é : "+aluno1.getMediaNotas());
		System.out.println("o Aluno está : "+(aluno1.getAlunoAprovado()?" Aprovado ":" Reprovado "));
	*/

	}

}
