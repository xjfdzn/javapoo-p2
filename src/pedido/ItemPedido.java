package pedido;

import java.math.BigDecimal;
import java.util.List;

import produto.Produto;

public class ItemPedido {
	private Integer quantidade;
	private BigDecimal precoDecimal;
	private BigDecimal precoTotal;
	private String observacao;

	
	List<Produto> produto;


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getPrecoDecimal() {
		return precoDecimal;
	}


	public void setPrecoDecimal(BigDecimal precoDecimal) {
		this.precoDecimal = precoDecimal;
	}


	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}


	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}

