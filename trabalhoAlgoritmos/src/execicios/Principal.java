package execicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1= new Aluno("Diego Oliveira","123456789-00");
		for (int pos=1; pos<4;pos++) {
			String dcp = JOptionPane.showInputDialog("Insira a Disciplina "+pos+" ?");
			String nt = JOptionPane.showInputDialog("Insira a Nota "+pos+" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(dcp);
			disciplina.setNota(Double.valueOf(nt));
			aluno1.getDisciplinas().add(disciplina);
		}
		JOptionPane.showMessageDialog(null, "A média do aluno é : "+aluno1.getMediaNotas());
		JOptionPane.showMessageDialog(null, "o Aluno está : "+(aluno1.getAlunoAprovado()));
		/*System.out.println("A média do aluno é : "+aluno1.getMediaNotas());
		System.out.println("o Aluno está : "+(aluno1.getAlunoAprovado()?" Aprovado ":" Reprovado "));
	*/

	}

}
