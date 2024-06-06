import cidade.Cidade;
import cozinha.Cozinha;
import estado.Estado;
import forma_pagamento.FormaPagamento;
import grupo.Grupo;
import pedido.ItemPedido;
import pedido.Pedido;
import permissao.Permissao;
import produto.Produto;
import restaurante.Endereco;
import restaurante.Restaurante;
import usuario.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestarRestaurante {

    public static void main(String[] args) {
        // Cidade
        Cidade cidade = new Cidade();
        cidade.setNome("Jundiaí");

        // Estado
        Estado estado = new Estado();
        estado.setNome("SP");

        // Cozinha
        Cozinha cozinha = new Cozinha();
        cozinha.setNome("Japonesa");

        // Formas de Pagamento
        FormaPagamento formaPagamento1 = new FormaPagamento("PIX");
        FormaPagamento formaPagamento2 = new FormaPagamento("Cartão de Crédito");

        List<FormaPagamento> formasPagamento = new ArrayList<>();
        formasPagamento.add(formaPagamento1);
        formasPagamento.add(formaPagamento2);
        
        
        // Usuario
        Usuario usuario = new Usuario();
        usuario.setNome("José Santos");
        usuario.setEmail("churrascaria@dozé.com");;
        
        
        // Grupos
        Grupo grupo = new Grupo();
        grupo.setNome("Administrador");
        Grupo grupo2 = new Grupo();
        grupo2.setNome("Padrão");

        usuario.setGrupos(List.of(grupo, grupo2));

        // Item do Pedido
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(2);
        itemPedido.setPrecoDecimal(new BigDecimal("25.00"));
        itemPedido.setPrecoTotal(new BigDecimal("50.00"));
        itemPedido.setObservacao("Mal Passado");


        
        // Produto
        Produto produto = new Produto();
        produto.setNome("Picanha");
        itemPedido.setProduto(List.of(produto));

        

        // Pedido
        Pedido pedido = new Pedido();
        pedido.setCodigo("PED123");
        pedido.setSubtotal(new BigDecimal("100.00"));
        pedido.setTaxaFrete(new BigDecimal("10.00"));
        pedido.setValorTotal(new BigDecimal("110.00"));
        pedido.setDataCriacao(LocalDateTime.now());
        pedido.setDataConfirmacao(LocalDateTime.now().plusHours(1));
        pedido.setDataEntrega(LocalDateTime.now().plusHours(2));
        pedido.setDataCancelamento(LocalDateTime.now().plusHours(3));
        pedido.setCliente(List.of(new Usuario()));

        pedido.setItens(List.of(itemPedido));
        pedido.setFormaPagamento(formasPagamento);

        // Restaurante
        Restaurante restaurante = new Restaurante();
        restaurante.setNome("Churrascaria do Zé");
        restaurante.setTaxaFrete(new BigDecimal("5.00"));

        // Produto do Restaurante
        Produto produtoRestaurante = new Produto();
        produtoRestaurante.setNome("Costela");
        produtoRestaurante.setDescricao("Costela suculenta grelhada");
        produtoRestaurante.setPreco(new BigDecimal("35.00"));
        produtoRestaurante.setAtivo(true);

        // Produtos do Restaurante
        restaurante.setProdutos(List.of(produtoRestaurante));

        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Cidade: " + cidade.getNome() + " - " + estado.getNome());
        System.out.println("-----------------------------------");
        System.out.println("Nome do Usuário: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Grupos:");
        for (Grupo grupo1 : usuario.getGrupos()) {
            System.out.println("- " + grupo1.getNome());
        }
        System.out.println("-----------------------------------");
        System.out.println("Cozinha: " + cozinha.getNome());
        System.out.println("-----------------------------------");
        System.out.println("Código do Pedido: " + pedido.getCodigo());
        System.out.println("Item do Pedido: " + itemPedido.getQuantidade() + "x " + produto.getNome());
        System.out.println("OBS: " + itemPedido.getObservacao());
        System.out.println("");
        System.out.println("Valor Total do Pedido: R$" + pedido.getValorTotal());
        System.out.println("Produto do Restaurante: " + produtoRestaurante.getNome());
        System.out.println("Horario do Pedido: " + pedido.getDataCriacao());
        System.out.println("Entrega: " + pedido.getDataEntrega());
        System.out.println("-----------------------------------");
        System.out.println("Formas de Pagamento:");
        for (FormaPagamento forma : formasPagamento) {
            System.out.println("- " + forma.getDescricao());
        }

    }
}

