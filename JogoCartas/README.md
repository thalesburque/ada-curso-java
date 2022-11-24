# Exercício de Jogo de Cartas

O intuito do exercício a seguir é treinar e fixar os conceito de interfaces e classes abstratas.

Você deve implementar um sistema simplificado de um jogo de cartas, sem nenhum funcionamento de jogo necessário, mas implementando algumas regras e componentes, como cartas e tabuleiros.

## Regras de Implementação

### Cartas:

Toda carta tem:
- Um método para ver o nome.
- Um método para ver o tipo.
- Um método para ver o custo.

Carta de Ataque:
Toda carta de ataque tem:
Um método para ver poder.
Um método para ver resistência.

Cartas de Ataque Especiais:
Além de todos os comportamentos da Carta e da Carta de Ataque um método para exibir efeitos.

### Tabuleiro:
Todos os tabuleiros tem os métodos:

- De inserir um deck.
- Receber uma carta de ataque e verifica se ela pode ser jogada ou não.
- Retorna se um jogador vence.

Tabuleiro Versus:
- Tem dois decks de 50 cartas e insere os dois ao início do jogo.
- Cabem 5 cartas de ataque e 2 cartas de ataque especiais em cada lado do campo..
- Vence quando a vida do adversário chega a 0.

Tabuleiro Party:
- Tem cinco decks de 80 cartas e insere os cinco ao início do jogo.
- Cabem 34 cartas de ataque no total no campo, somando todos os jogadores.
- Vence quando a vida de todos os adversários chega a 0.

Observação: Um deck é uma coleção de cartas.

#### Dicas finais

Crie quantas entidades quiser para facilitar a resolução do exercício.

Tente prestar a atenção e pensar bem em quando devem ser implementadas classes abstratas ou interfaces.

Tente ser declarativo em relação ao nome dos métodos, classes, interfaces e variáveis.

Não guarde as dúvidas para você, compartilhe com os professores e a turma, as vezes mais colegas estão com o mesmo problema, ou é uma questão que não foi pensada inicialmente pelos professores.

Aproveite o exercício para fixar os conceitos ensinados em aula.