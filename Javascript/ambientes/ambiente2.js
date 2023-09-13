document.body.style.background = 'lightgrey'

document.write(`<h2>Ambientes do Javascript<h2>`)

document.write(`<aside>
<a href="ambientes/ambiente1.js" target="ambiente">amb1</a>
<a href="ambientes/ambiente2.js" target="ambiente">amb2</a>
<a href="pags/ex005.html" target="ambiente">DOM</a>
</aside>`)

document.write(`<iframe name="ambiente" src="ambientes/ambiente1.js" width="100%" height="500px" allowtransparency="true" frameborder="0" sandbox="allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts" referrerpolicy="no-referrer" style="border-radius: 10px" ></iframe>`)

document.write(`Exercícios:`)

document.write(`<p>ex1:</p> <div id="area" style="width: 200px; height: 200px; line-height: 200px; text-align: center; background-color: white">
Interaja...
</div>`)
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
            a.style.background = 'lightgreen'
        }
        function sair() {
            a.innerText = 'Saiu!'
            a.style.background = 'green'
        }

//var ==(igual) variavel + o nome que dara

// var nome = window.prompt('Qual seu nome?') //pode ser colocado diretamente numa variavel.
// window.alert('Olá' + nome+'!')
// window.confirm('tudo bem' + nome+'?')

/*var n1 = Number.parseInt(window.prompt('um numero')); 
var n2 = Number.parseInt(window.prompt('um outro numero'));
var s = n1 + n2;
window.alert('o valor é ' + s)
window.alert(`o valor entre ${n1} + ${n2} é igual a ${s}`)*/

/*
    var nome = window.prompt('Qual seu nome?')
    document.write(`Olá, <strong>${nome}</strong>! Seu nome tem ${nome.length} <br>`)
    document.write(`Seu nome em maiusculo é ${nome.toLocaleUpperCase()}<br>`)
    document.write(`Seu em minusculo é ${nome.toLocaleLowerCase()}`)
*/

/*
    var n1 = 1545.5
    n1.toFixed(2) //1545.50
    n1.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}) //R$ 1,545.50
*/