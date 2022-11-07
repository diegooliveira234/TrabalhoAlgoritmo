package trabalhoAlgoritmos;

public class ModelCar {
	
	/*Atributos da Classe Caro*/
	private String marca;
	private String cor;
	private String modelo;
	private String tipoCarroceria;
	private double valor;
	private int velocidade;
	private int ano;
	private boolean importado;
	private String combustivel;
	private boolean ligado;
	
	/*Métodos (Ações ) que o objeto realiza*/
	public void ligarCarro() {
		if(ligado==false) {
		ligado=true;
		System.out.println("O carro está ligado");
		}else {
			System.out.println("O carro já está ligado");
		}
	}
	public void desligarCarro() {
		if (ligado==true) {
		ligado=false;
		System.out.println("O carro agora está ligado");
		}else {
			System.out.println("O carro já está desligado");
		}
	}
	public void acelerarCarro(int acelerar) {
		this.velocidade=acelerar;
		velocidade=+acelerar;
	}
	public void freiarCarro(int freio) {
		this.velocidade=freio;
		velocidade=-freio;
	}
	public void fazerCurva(String ladocurva) {
		if (ladocurva.equals("Direita")) {
			System.out.println(" estou fazendo a curva para direita ");
		}else {
			System.out.println(" estou fazendo a curva para esquerda ");
		}
	}

	/*Estado doObjeto (Status)*/
	public void fichaTecnica() {
		System.out.println(" Marca : "+getMarca());
		System.out.println(" Modelo : "+getModelo());
		System.out.println(" Cor : "+getCor());
		System.out.println(" Ano : "+getAno());
		System.out.println(" Valor : "+getValor());
		System.out.println(" Importado : "+isImportado());
		System.out.println(" Combustível : "+getCombustivel());
		System.out.println(" Carroceria : "+getTipoCarroceria());
		System.out.println(" Velocidade : "+getVelocidade());
	}
	
	/* Getters e Setters*/
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isImportado() {
		return importado;
	}
	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
}
