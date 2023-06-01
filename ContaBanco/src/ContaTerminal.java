
public class ContaTerminal {
	private static int numero;
	private String agencia;
	private String nomeCliente;
	private float saldo;
	
	ContaTerminal(String agencia, String nomeCliente, float saldo) {
		ContaTerminal.numero++;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
