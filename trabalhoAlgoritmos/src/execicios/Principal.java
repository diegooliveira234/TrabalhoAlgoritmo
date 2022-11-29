package execicios;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1= new Aluno("Diego Oliveira","123456789-00");
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Java Web");
		disciplina1.setNota(85);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Algoritmos");
		disciplina2.setNota(80);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("HTML");
		disciplina3.setNota(45);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("CSS");
		disciplina4.setNota(15);
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println("A média do aluno é : "+aluno1.getMediaNotas());
		System.out.println("o Aluno está : "+(aluno1.getAlunoAprovado()?" Aprovado ":" Reprovado "));
	

	}

}
