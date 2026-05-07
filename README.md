# Simulador de Paginação – Algoritmos de Substituição de Páginas

> Aplicação desktop desenvolvida em Java para simular algoritmos clássicos de substituição de páginas da memória virtual.

O **Simulador de Paginação** é um sistema criado para demonstrar visualmente o funcionamento dos principais algoritmos de gerenciamento de memória utilizados em Sistemas Operacionais.  
O projeto foi desenvolvido com interface gráfica utilizando **Java Swing**, permitindo comparar a quantidade de faltas de página entre diferentes algoritmos.

<p align="center">
  <img src="assets/tela.png" alt="Tela do simulador de paginação" width="900">
</p>

---

# Tecnologias Utilizadas

O sistema foi desenvolvido utilizando **Java** com interface gráfica em **Swing**, seguindo organização em pacotes para separação da lógica dos algoritmos e da interface.

[![Java][Java.com]][Java-url]
[![Swing][Swing.com]][Swing-url]

### Funcionalidades implementadas:
- Simulação do algoritmo **FIFO**
- Simulação do algoritmo **LRU**
- Simulação do algoritmo **Clock**
- Simulação do algoritmo **Ótimo**
- Comparação de faltas de página
- Exibição gráfica dos resultados

---

# Pré-requisitos

Antes de iniciar o projeto, certifique-se de que o seu ambiente atende aos seguintes requisitos:

- **Java JDK 17 ou superior**

Verifique sua versão com:

```bash
java -version
```

- **IDE Java**
  - IntelliJ IDEA
  - Eclipse
  - NetBeans
  - VSCode com extensão Java

- **Git instalado** (opcional)

---

# Instalação e Execução do Projeto

Siga os passos abaixo para executar o simulador no seu computador.

## 1. Clonar o repositório

Abra o terminal e execute:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

Entre na pasta do projeto:

```bash
cd nome-do-projeto
```

---

## 2. Abrir o projeto na IDE

Abra o projeto na sua IDE Java de preferência.

Certifique-se de que o JDK está configurado corretamente.

---

## 3. Executar o sistema

Localize a classe principal:

```bash
Tela.java
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

# Estrutura do Projeto

```bash
src/
│
├── algoritmos/
│   ├── FIFO.java
│   ├── LRU.java
│   ├── Clock.java
│   └── Otimo.java
│
├── gui/
│   ├── Tela.java
│   └── Grafico.java
│
└── util/
    └── Entrada.java
```

---

# Algoritmos Implementados

## FIFO (First In First Out)
Remove a página mais antiga da memória.

## LRU (Least Recently Used)
Remove a página menos utilizada recentemente.

## Clock
Utiliza bits de referência para simular uma fila circular.

## Ótimo
Remove a página que demorará mais tempo para ser utilizada novamente.

---

# Autor

Seu Nome  
Curso de Ciência da Computação

---

# Licença

Projeto desenvolvido exclusivamente para fins acadêmicos.

---

[Java.com]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/

[Swing.com]: https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge&logo=java&logoColor=white
[Swing-url]: https://docs.oracle.com/javase/tutorial/uiswing/
