import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Caixa;
import model.Cliente;
import model.Estoque;
import model.ItemPedido;
import model.Jogo;
import model.Livraria;
import model.Livro;
import model.Pedido;
import model.Produto;
import service.CadastroEstoqueService;
import service.CadastroProdutoService;
import service.EmissaoCompraService;
import service.impl.CadastroEstoqueServiceImpl;
import service.impl.CadastroProdutoServiceImpl;
import service.impl.EmissaoCompraServiceImpl;

public class LivrariaProdutoMain {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Livraria saraiva = new Livraria();

		CadastroProdutoService cadastroProduto = new CadastroProdutoServiceImpl(saraiva);
		CadastroEstoqueService cadastroEstoque = new CadastroEstoqueServiceImpl(saraiva);
		EmissaoCompraService emissaoCompra = new EmissaoCompraServiceImpl(saraiva);

		List<String> generosLivro = new ArrayList<>();
		generosLivro.add("Drama");
		Produto livro = new Livro(1L, "Metamorfose", BigDecimal.valueOf(35.0), saraiva, false,"Kafica", "Antofagica",
				generosLivro);

		List<String> generosJogo = new ArrayList<>();
		generosJogo.add("Esporte");
		Produto jogo = new Jogo(2L, "Fifa", BigDecimal.valueOf(299.0), saraiva, true,"EA Games", "EA Games", generosJogo);

		Set<Produto> produtos = new HashSet<>();
		produtos.add(livro);
		produtos.add(jogo);
		
		Caixa caixa = new Caixa();

		saraiva.setId(1L);
		saraiva.setProdutos(produtos);
		saraiva.setCaixa(caixa);

		Estoque estoqueLivro = new Estoque(livro.getId(), livro, 5);
		Estoque estoqueJogo = new Estoque(jogo.getId(), jogo, 25);

		cadastroEstoque.salvar(estoqueLivro);
		cadastroEstoque.salvar(estoqueJogo);

		Produto jogo2 = new Jogo(3L, "NBA", BigDecimal.valueOf(299.0), saraiva, false,"EA Games", "EA Games", generosJogo);
		cadastroProduto.salvar(jogo2);

		var jogo3 = cadastroProduto.buscar(jogo2.getId());
		jogo3.setNome("NHL");

		cadastroProduto.salvar(jogo3);

		Estoque estoqueJogo2 = new Estoque(jogo2.getId(), jogo2, 2);
		cadastroEstoque.salvar(estoqueJogo2);

		System.out.println(cadastroEstoque.listar());

		ItemPedido item1 = new ItemPedido(1L, jogo, 2);

		List<ItemPedido> itens = new ArrayList<>();
		itens.add(item1);
		
		Date date = sdf.parse("15/07/2000");
		
		Cliente cliente = new Cliente("Thales", "111.111.111-11", date);

		Pedido pedido = new Pedido(1L, saraiva, itens, cliente);
		
		emissaoCompra.emitir(pedido);
		
		System.out.println(cadastroEstoque.listar());
		System.out.println("Caixa: " + saraiva.getCaixa().getValor());
	}

}
