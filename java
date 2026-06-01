// 1. Seleciona os elementos do HTML que vamos usar
const botaoCurtir = document.getElementById('botao-curtir');
const contadorLikes = document.getElementById('contador-likes');

// 2. Cria uma variável para guardar a quantidade de curtidas
let quantidadeLikes = 0;

// 3. Adiciona o evento de clique no botão
botaoCurtir.addEventListener('click', () => {
    // Soma 1 ao total de curtidas
    quantidadeLikes++;
    
    // Atualiza o texto do span com o novo valor
    contadorLikes.textContent = quantidadeLikes;
});
