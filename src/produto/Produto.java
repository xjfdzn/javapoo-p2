package produto;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
	
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private boolean ativo;
	
	private List<FotoProduto> fotoProduto;

	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	
	
	public List<FotoProduto> getFotoProduto() {
		return fotoProduto;
	}
	public void setFotoProduto(List<FotoProduto> fotoProduto) {
		this.fotoProduto = fotoProduto;
	}
	
	
}
