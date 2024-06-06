package pedido;

public class StatusPedido {

	private static final String CRIADO = "CRIADO";
	private static final String CONFIRMADO = "CONFIRMADO";
	private static final String ENTREGUE = "ENTREGUE";
	private static final String CANCELADO = "CANCELADO";
	public static String getCriado() {
		return CRIADO;
	}
	public static String getConfirmado() {
		return CONFIRMADO;
	}
	public static String getEntregue() {
		return ENTREGUE;
	}
	public static String getCancelado() {
		return CANCELADO;
	}
}
