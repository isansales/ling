6![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
    flowchart TD
   start((Início)) --> input1[\Digite sua nota entre 0 e 100\]
   input1 -->2[\Digite sua frequência em %\]
   input-->2a{Nota >= 50\n e \n frequência>=100}
   verification --> |Sim| A[/ Aprovado /]
   verification --> |Não| B[/ Reprovado /]
   output1-->finish([Final])
   output2-->finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
   start((Início)) --> A[\Digite n1\] 
   A --> B[\Digite n2\]
   B --> C[\Resultado n1+n2\]
   C --> finish([Final])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
       A((inicio)) --> B[\Digite um número\]
      B --> C{Sev o número >= 0?}
      C -- Sim --> D[Exibir 'Positivo']
      C -- Não --> E[Exibir 'Negativo']
      D --> F[Fim]
      E --> F
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\Informe sua idade\]
      B --> C{Se o número for >=16}
      C --> D{Possuí Título de Eleitor?}
      D --> Sim -->E[Pode votar]
      C --> Não --> F[Não pode votar]
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   A((Início)) --> B[\Número 1\]
        B --> C[\Número 2\]
        C --> D{Número 1 > Número 2?}
        D -- Sim --> E[\Número 1 é o maior\]
        D -- Não --> F{Número 2 > Número 1?}
        F -- Sim --> G[\Número 2 é o maior\]
        F -- Não --> H[\Os números são iguais\]
        E --> I[Fim]
        G --> I
        H --> I
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
        A((Início)) --> B[Digite o número 1]
        B --> C[Digite o número 2]
        C --> D[Digite o número 3]
        D --> E{Número 1 > Número 2?}
        E -- Sim --> F{Número 1 > Número 3?}
        E -- Não --> G{Número 2 > Número 3?}
        F -- Sim --> H[\Exibir N úmero 1 é o maior\]
        F -- Não --> I{Número 1 = Número 3?}
        I -- Sim --> J[\Exibir Número 1 e 3 são iguais\]
        I -- Não --> K[\Exibir Número 3 é o maior\]
        G -- Sim --> L[\Exibir Número 2 é o maior\]
        G -- Não --> M{Número 2 = Número 3?}
        M -- Sim --> N[\Exibir 'Número 2 e 3 são iguais'\]
        M -- Não --> K
        H --> O((Fim))
        J --> O
        L --> O
        K --> O
        N --> O

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
        A((Início)) --> B[\digite o numero n\]
        B --> C{n >= 0?}
        C -- Não --> D[\Número inválido\]
        C -- Sim --> E[\Inicializar fatorial = 1\]
        E --> F{n > 0?}
        F -- Sim --> G[\fatorial = fatorial * n\]
        G --> H[\n = n - 1\]
        H --> F
        F -- Não --> I[\Exibir Fatorial = fatorial\]
        D --> J((fim))
        I --> J1
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
        A((Início)) --> B[Digite um número]
        B --> C{Número % 2 = 0?}
        C -- Sim --> D[\Exibir 'O número é par'\]
        C -- Não --> E[\Exibir 'O número é ímpar'\]
        D --> F((fim))
     E --> F
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
     flowchart TD
        A((Início)) --> B[\Digite um número n\]
        B --> C{n <= 1?}
        C -- Sim --> D[\O número não é pri11mo\]
        C -- Não --> E[\Iniciar divisor = 2\]
        E --> F{divisor < n?}
        F -- Sim --> G{n % divisor == 0?}
        G -- Sim --> H[\O número não é primo\]
        G -- Não --> I[\Incrementar divisor\]
        I --> F
        F -- Não --> J[\O número é primo\]
        D --> K((fim))
        H --> K
        J --> K
   ```