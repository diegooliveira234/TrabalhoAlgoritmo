package execicios;

import execicios.interfaces.Autenticar;

public class Secretario extends Pessoa implements Autenticar {
private String registro;
private String nivelCargo;
private String experiencia;
private String login;
private String senha;
public String getRegistro() {
	return registro;
}
public void setRegistro(String registro) {
	this.registro = registro;
}
public String getNivelCargo() {
	return nivelCargo;
}
public void setNivelCargo(String nivelCargo) {
	this.nivelCargo = nivelCargo;
}
public String getExperiencia() {
	return experiencia;
}
public void setExperiencia(String experiencia) {
	this.experiencia = experiencia;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
@Override
public boolean permitirAcesso() {
	
	return (senha.equals("admin")&&(login.equals("admin")));
}


}
