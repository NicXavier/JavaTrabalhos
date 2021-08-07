package Repeticao;

import java.text.NumberFormat;

public class Funcionario {
	private int codigo;
	private String nome;
	private double salario;
	
	public Funcionario(int c, String n, double s)
	{
		this.codigo = c;
		this.nome = n;
		this.salario = s;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String formatarMoeda()
	{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			String formatarMoeda = nf.format(salario);
			return formatarMoeda;
	}
	public void imprimir() 
	{
		System.out.println("Código: "+codigo+" Funcionário: "+nome+" Salário: "+this.formatarMoeda()+"\n");
	}
}
