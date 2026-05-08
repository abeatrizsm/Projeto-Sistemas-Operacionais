
# Autora

Ana Beatriz Silveira Mendes - Matricula: 2410411

## Repositório GitHub
```txt
https://github.com/abeatrizsm/Projeto-Sistemas-Operacionais.git
```
---
# Resumo

Este trabalho apresenta o desenvolvimento de um simulador de algoritmos de substituição de páginas, utilizado para analisar o comportamento da memória virtual em sistemas operacionais. O sistema foi implementado na linguagem Java utilizando Java Swing para construção da interface gráfica. Foram implementados os algoritmos FIFO, LRU, Clock e Ótimo, permitindo comparar a quantidade de faltas de página geradas em diferentes cenários de execução. Os resultados demonstraram diferenças significativas entre os métodos, evidenciando como a estratégia de substituição influencia diretamente o desempenho do gerenciamento de memória.

---

# Introdução

A memória virtual é um dos principais mecanismos utilizados pelos sistemas operacionais modernos para permitir a execução eficiente de processos. Como a memória principal possui capacidade limitada, torna-se necessário utilizar técnicas de substituição de páginas para decidir quais páginas devem permanecer carregadas na memória.

Quando ocorre uma falta de página e não existem frames livres disponíveis, o sistema operacional precisa escolher qual página será removida para dar espaço à nova página requisitada. Essa decisão é realizada pelos algoritmos de substituição de páginas.

Diversos algoritmos foram desenvolvidos com esse objetivo, cada um utilizando estratégias diferentes para otimizar o uso da memória e reduzir a quantidade de faltas de página. Entre os principais algoritmos estudados estão FIFO, LRU, Clock e Ótimo.

O objetivo deste trabalho foi desenvolver um simulador capaz de executar esses algoritmos e comparar seus desempenhos através da quantidade de faltas de página geradas durante a execução.

---

# Metodologia

O projeto foi desenvolvido utilizando a linguagem Java juntamente com Swing para construção da interface gráfica.

A aplicação permite ao usuário:
- inserir uma sequência de páginas
- definir a quantidade de frames disponíveis
- executar a simulação
- visualizar os resultados numéricos
- analisar gráficos comparativos entre os algoritmos

O sistema foi organizado em pacotes separados para melhor organização:
- `algoritmos`: implementação dos algoritmos
- `gui`: interface gráfica
- `util`: processamento das entradas

Foram implementados os seguintes algoritmos:

## FIFO (First In First Out)

O algoritmo FIFO remove da memória a página que foi carregada primeiro.

### Vantagens
- Simples de implementar
- Baixo custo computacional
- Fácil entendimento.

### Desvantagens
- Não considera frequência ou uso recente
- Pode remover páginas muito utilizadas
- Pode apresentar maior quantidade de faltas de página.

## LRU (Least Recently Used)

O algoritmo LRU remove a página menos utilizada recentemente, considerando o histórico de acessos.

### Vantagens
- Geralmente apresenta menor número de faltas de página
- Mais eficiente em cenários reais

### Desvantagens
- Implementação mais complexa
- Maior custo computacional
- Necessita controle constante dos acessos

## Clock

O algoritmo Clock utiliza bits de referência para aproximar o comportamento do LRU utilizando menor custo computacional.

### Vantagens
- Mais eficiente que FIFO
- Menor custo que o LRU
- Muito utilizado em sistemas operacionais reais

### Desvantagens
- Não é tão preciso quanto o LRU
- Pode manter páginas pouco utilizadas por mais tempo

## Ótimo (Simulação Teórica)

O algoritmo Ótimo remove a página que demorará mais tempo para ser utilizada novamente.

> Este algoritmo foi utilizado apenas como simulação teórica e comparativa, pois sua implementação em sistemas reais é inviável devido à necessidade de conhecimento prévio das futuras referências de memória.

### Vantagens
- Produz o menor número possível de faltas de página
- Serve como referência ideal de desempenho

### Desvantagens
- Não implementável na prática
- Depende do conhecimento futuro das referências de páginas (e ainda não é possivel prever o futuro)

---
# Resultados e Discussão

Após a implementação do simulador, foram realizados testes utilizando diferentes sequências de páginas e quantidades de frames para comparar o desempenho dos algoritmos FIFO, LRU, Clock e Ótimo.

Os resultados apresentados abaixo foram obtidos diretamente através da execução do sistema desenvolvido.

## Caso de Teste 1

Sequência utilizada:

```txt
1 2 3 4 1 2 5 1 2 3 4 5
```

Quantidade de frames:

```txt
3
```

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 9 |
| LRU | 10 |
| Clock | 9 |
| Ótimo | 7 |

### Análise

Neste cenário, o algoritmo Ótimo apresentou o melhor desempenho, produzindo a menor quantidade de faltas de página. O FIFO e o Clock obtiveram resultados semelhantes, enquanto o LRU apresentou maior número de faltas devido ao padrão específico da sequência utilizada.

## Caso de Teste 2

Sequência utilizada:

```txt
7 0 1 2 0 3 0 4 2 3 0 3 2
```

Quantidade de frames:

```txt
4
```

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 7 |
| LRU | 6 |
| Clock | 6 |
| Ótimo | 6 |

### Análise

Neste caso, os algoritmos LRU, Clock e Ótimo apresentaram o mesmo desempenho. O FIFO apresentou apenas uma falta de página a mais, demonstrando desempenho relativamente próximo aos demais algoritmos.

## Caso de Teste 3

Sequência utilizada:

```txt
1 2 1 3 1 4 1 5 1 6
```

Quantidade de frames:

```txt
2
```

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 8 |
| LRU | 6 |
| Clock | 8 |
| Ótimo | 6 |

### Análise

Neste cenário, o LRU apresentou desempenho equivalente ao algoritmo Ótimo, aproveitando corretamente a frequência de reutilização da página 1. O FIFO e o Clock apresentaram maior número de faltas de página.

## Caso de Teste 4

Sequência utilizada:

```txt
2 3 2 1 5 2 4 5 3 2 5 2
```

Quantidade de frames:

```txt
3
```

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 9 |
| LRU | 7 |
| Clock | 8 |
| Ótimo | 6 |

### Análise

O algoritmo LRU apresentou melhor desempenho entre os algoritmos implementáveis, pois conseguiu manter na memória páginas utilizadas recentemente. O FIFO apresentou o maior número de faltas devido à sua política simples de substituição.

## Caso de Teste 5

Sequência utilizada:

```txt
1 2 3 4 5 1 2 3 4 5
```

Quantidade de frames:

```txt
3
```

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 10 |
| LRU | 10 |
| Clock | 10 |
| Ótimo | 7 |

### Análise

Neste teste houve pouca reutilização imediata das páginas, fazendo com que FIFO, LRU e Clock apresentassem o mesmo número de faltas de página. O algoritmo Ótimo novamente apresentou melhor desempenho devido à sua característica teórica ideal.

---

## Discussão Geral

Os resultados demonstraram que o desempenho dos algoritmos varia de acordo com o padrão de acesso às páginas e a quantidade de frames disponíveis.

O FIFO apresentou comportamento simples, porém menos eficiente em alguns cenários por não considerar frequência ou uso recente das páginas.

O LRU demonstrou melhor desempenho em boa parte dos testes, principalmente em sequências com forte reutilização de páginas.

O Clock apresentou resultados próximos ao LRU em vários cenários, mostrando-se uma alternativa eficiente com menor custo computacional.

Já o algoritmo Ótimo apresentou consistentemente os melhores resultados, sendo utilizado como referência teórica ideal para comparação dos demais algoritmos.


---

# Conclusão

O desenvolvimento do simulador permitiu compreender de forma prática o funcionamento dos algoritmos de substituição de páginas utilizados em sistemas operacionais.

Os testes realizados demonstraram que diferentes algoritmos apresentam desempenhos distintos dependendo do padrão de acesso às páginas e da quantidade de frames disponíveis.

O FIFO apresentou implementação simples, porém menor eficiência em alguns cenários. O LRU demonstrou melhor desempenho prático, enquanto o Clock apresentou um equilíbrio entre eficiência e custo computacional. Já o algoritmo Ótimo foi utilizado como referência teórica para comparação dos resultados.

Além de auxiliar no aprendizado acadêmico, o projeto possibilitou compreender conceitos fundamentais relacionados à memória virtual, gerenciamento de páginas e faltas de página em sistemas operacionais.


---

# Pré-requisitos

Antes de iniciar o projeto, certifique-se de que o seu ambiente atende aos seguintes requisitos:

- **Java JDK 17 ou superior**

Verifique sua versão com:

```bash
java -version
```

- **IDE Java**
  > a IDE usada foi o Intellij IDEA
---

# Instalação e Execução do Projeto

Siga os passos abaixo para executar o simulador no seu computador.

## 1. Clonar o repositório

Abra o terminal e execute:

```bash
git clone https://github.com/abeatrizsm/Projeto-Sistemas-Operacionais.git
```

Entre na pasta do projeto:

```bash
cd "Trabalho AV2"
```

---

## 2. Abrir o projeto na IDE

Abra o projeto na sua IDE Java de preferência.

Certifique-se de que o JDK está configurado corretamente.

---

## 3. Executar o sistema

Localize a classe principal:

```bash
Main.java
```

Execute o projeto pela IDE.

---

# Como utilizar

1. Digite a sequência de páginas no campo:

```bash
1 2 3 4 1 2 5 1 2 3 4 5
```

2. Informe a quantidade de frames:

```bash
3
```

3. Clique em **Simular**

O sistema exibirá:
- Quantidade de faltas de página de cada algoritmo
- Gráfico comparativo dos resultados

---




[Java.com]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/

[Swing.com]: https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge&logo=java&logoColor=white
[Swing-url]: https://docs.oracle.com/javase/tutorial/uiswing/
