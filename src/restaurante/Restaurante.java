package restaurante;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import cozinha.Cozinha;
import forma_pagamento.FormaPagamento;
import produto.Produto;
import usuario.Usuario;

public class Restaurante {
	
	private String nome;
	private BigDecimal taxaFrete;
	private boolean ativo;
	private boolean aberto;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;
	
	
	private List<Cozinha> cozinha;
	private List<FormaPagamento> formasPagamento;
	private List<Produto> produtos;
	private List<Endereco> endereco;
	
	private List<Usuario> responsaveis;

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public BigDecimal getTaxaFrete() {
		return taxaFrete;
	}
	public void setTaxaFrete(BigDecimal taxaFrete) {
		this.taxaFrete = taxaFrete;
	}

	
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	
	
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	
	
	public List<Cozinha> getCozinha() {
		return cozinha;
	}
	public void setCozinha(List<Cozinha> cozinha) {
		this.cozinha = cozinha;
	}

	
	
	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}
	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	
	
	public List<Usuario> getResponsaveis() {
		return responsaveis;
	}
	public void setResponsaveis(List<Usuario> responsaveis) {
		this.responsaveis = responsaveis;
	}
	
	
}


