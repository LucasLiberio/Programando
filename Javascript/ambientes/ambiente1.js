/* 
    var ==(igual) variavel + o nome que dara 
    function == função + o nome 
*/

 /* 
    / window.alert('window.alert') == aparece uma janela
    / window.confirm('window.confirm') == aparece uma janela para ok ou cancelar
    / window.prompt('window.prompt') == aparece uma janela para escrever

    var nome = window.prompt('Qual seu nome?') //pode ser colocado diretamente numa variavel.
    window.alert('Olá' + nome`!`) //a variavel n pode estar entre aspas
    window.confirm('tudo bem' + nome`?`)

-- a variavel recebe o valor dado no window.prompt, depois aparece outra janela mostrando o valor do window.alert, em seguida outra janela surge com valor da wondow.confirm para confirmar ou nao. --

*/

/*
    / Number.parseInt == so aceita numero inteiro

    var n1 = Number.parseInt(window.prompt('um numero')); 
    var n2 = Number.parseInt(window.prompt('um outro numero'));
    var s = n1 + n2;
    window.alert('o valor é ' + s)
    window.alert(`o valor entre ${n1} + ${n2} é igual a ${s}`)

-- a variavel n1 recebe o valor do window.prompt q Number.parseInt aceita so numero intero, o mesmo pro n2, que depois os valores dos dois é somado na variavel s, mostrando o valor de s no window.alert. -- 
*/

/*
    / document.write == escreve diretamente no documento
    / ___.toLocaleUpperCase() == deixa as letra em maiusculas
    / ___.toLocaleLowerCase() == deixa as letras em minusculas
    / ___.length == quantidade de caracteres

    var nome = window.prompt('Qual seu nome?')
    document.write(`Olá, <strong>${nome}</strong>! Seu nome tem ${nome.length} <br>`)
    document.write(`Seu nome em maiusculo é ${nome.toLocaleUpperCase()}<br>`)
    document.write(`Seu em minusculo é ${nome.toLocaleLowerCase()}`)

-- variavel nome recebe valor de window.prompt, é escrito o valor de document.write, escrevendo em maiuscula e minuscula o valor do window.prompt. --

    / ___.toFixed(quantidade de casas decimais) ex: 1554.54
    / ___.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}) ex: R$ 1554.54

    var n1 = 1545.5
    n1.toFixed(2) //1545.50
    n1.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}) //R$ 1,545.50

-- variavel n1 recebe o valor 1545.5, depois ___.toFixed(2) o torna em 1545.50, ___toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}) o torna em R$ 1,545.50. --
*/

/*
    / window.document.charset == estilo de linguagem de teclado
    / window.navigator.appName == nome do app de navagação
    / window.document.URL == diretorio do documento

    window.document.write('Olá, Mundo! | ') 
    window.document.write(window.document.charset + '| ')
    window.document.write(window.navigator.appName + '| ')
    window.document.write(window.document.URL)

-- escreve no documento o valor de window.write, o charset, o nome do app de navegar, e o diretorio do documento. --

    / window.document.body == é o caminha para ir ate o body
    / ___.style.background == mudando o estilo do fundo da pagina

    var corpo = window.document.body
    corpo.style.background = 'black'//muda a cor do body

-- variavel corpo recebe o diretorio ate body, depois acontece a mudandaça do estilo do background para a cor preta. --

    / window.document.getElementsByTagName('sinal do HTML')[posição] == pega uma tag do HTML (<p>) e sua posição sendo 0 a primeira posição de acordo com sua quantidade.
    / ___.innerText == insere o valor da variavel

    var p1 = window.document.getElementsByTagName('p')[0] //quando o Element tiver no plural tem chaves para selecionar qual //0 representa o primeiro a ser selecionado.
    window.document.write('esta escrito ' + p1.innerText + '| ')
    p1.style.color = 'blue' //muda a cor do primeiro p

-- variavel p1 recebe valor do window.document.getElementsByTagName('p')[0] que é o primeiro <p>, escrevendo o valor de window.document.write, mudando a cor do valor de p1.style.color para azul. --

    / ___.innerHTML == insere o valor da variavel com formatação em HTML

    var p2 = window.document.getElementsByTagName('p')[1]
    document.write(p2.innerText + '| ')/*pega so o texto*
    document.write(p2.innerHTML) /* vem com a formatação em html*

-- variavel p2 recebe o valor de window.document.getElementsByTagName que é o segundo <p>, escreve o valor dele sem a formatação em HTML no caso sem o strong, escreve-o novamente mas com a formatação passada em HTML. --

    / window.document.getElementById('id') == seleciona o elemento que tem o id informado

    var d = window.document.getElementById('msg') 
        /*seleciona pelo id*
    d.style.background = 'darkgray'
    d.innerText = 'Estou aguardando...'
            ou
    window.document.getElementById('msg').innerText == é o mesmo comando so q mais completo

-- variavel d recebe o valor de window.document.getElementById, depois torna o estilo do fundo do valor em darkgray, e inseri o valor de ___.innerText. --

    var d0 = window.document.querySelector('div#ms')
    d0.innerText = 'Estou aguardando...2'//seleciona a div id msg

    var d2 = window.document.getElementsByName('msg1')[0]
    d.innerText = 'Estou aguardando...3'//name

    var d3 = window.document.getElementsByClassName('msg2')[0]
    d.innerText = 'Estou aguardando...4'//class

-- Outras formas de selecionar um valor especifico para modifica-lo. --
*/

/*
    / ___.addEventListener('evento selecionado', nome do evento) == adiciona um evento

    var a = window.document.getElementById('area')
    a.addEventListener('click', clicar)
    a.addEventListener('mouseenter', entrar)
    a.addEventListener('mouseout', sair)

    function clicar() {
        a.innerText = 'Clicou!'
        a.style.background = 'red'
    }
    function entrar() {
        a.innerText = 'Entrou!'
    }
    function sair() {
        a.innerText = 'Saiu!'
        a.style.background = 'green'
    }

-- variavel a recebe o valor de window.document.getElementById, depois é adicionado 3 eventos, click com nome clicar, mouseenter com nome entrar, mouseout com nome sair. ao passar o mouse por cima da variavel aciona a função entrar() que inseri Entrou, ao sair com o mouse da variavel aciona a função saiu() que inseri o Saiu e transforma o seu fundo em verde, ao clicar na variavel aciona outra função clicar() oque inseri Clicou na variavel e transforma o seu fundo em vermelho. --

*/

