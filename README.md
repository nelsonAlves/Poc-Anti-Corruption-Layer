# Poc-Anti-Corruption-Layer
Como implementar o Pattern Ant-corruption-Layer

O padrão Anti-Corruption Layer (Camada Anti-Corrupção) é utilizado para isolar sistemas diferentes que possuem modelos de dados incompatíveis ou diferentes. Ele atua como uma camada intermediária que traduz as informações entre os sistemas, evitando que a lógica de um sistema afete diretamente o outro.

A implementação do padrão Anti-Corruption Layer em Java com Spring e banco de dados Oracle envolve a criação de adaptadores e tradutores para mapear os modelos de dados entre os sistemas. Vou fornecer um exemplo simples para ilustrar a ideia. Neste exemplo, consideraremos dois sistemas chamados "Novo Lattes" e "Antigo Lattes" com modelos de dados diferentes.