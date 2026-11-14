Java CSV Summary Generator

Funcionalidades:
- Leitura Eficiente: Utiliza BufferedReader para processar arquivos de texto linha por linha.
- Criação Dinâmica de Diretórios: Cria automaticamente uma pasta chamada out no diretório do arquivo de origem caso ela ainda não exista.
- Processamento de Dados: Realiza o split de strings baseado em vírgulas e converte os dados textuais de forma segura para tipos numéricos (Double e Integer).
- Geração de Relatório: Escreve os resultados calculados (Nome, Total) em um novo arquivo chamado summary.csv usando BufferedWriter.

Tecnologias Utilizadas
-Java (java.io package: BufferedReader, BufferedWriter, File, FileReader, FileWriter).
-Java.util (Scanner para entrada via console).

Como Usar:
- Pré-requisitos: Tenha o Java Development Kit (JDK) instalado na sua máquina.
- Clone o repositório.
- Compile e Execute: Abra o projeto na sua IDE favorita (como Eclipse, IntelliJ ou VS Code) e execute a classe Main.java
- Informe o Caminho do Arquivo: Quando o console solicitar, digite o caminho completo do seu arquivo CSV de entrada (por exemplo: C:\caminho\para\seu\arquivo.csv ou B:\pasta\source.csv
- O programa processará os dados e criará uma pasta out contendo o arquivo summary.csv no mesmo local do arquivo original.

EX:
- Entrada (source.csv)
- Plaintext
- Tv, 1000.00, 2
- Mouse, 50.00, 3

- Saída Gerada (summary.csv):
- Plaintext
- Tv,2000.0
- Mouse,150.0
