const si = require('systeminformation');
const readline = require('readline');

// Configurar a interface do terminal
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: true
});

// Função para atualizar as informações
async function monitorarCPU() {
    try {
        // Obter uso da CPU
        const cpuData = await si.currentLoad();
        console.clear();
        console.log("Monitor de CPU - Pressione Ctrl+C para sair");
        console.log("===========================================");
        console.log(`Uso da CPU: ${cpuData.currentLoad.toFixed(2)}%`);
        
        // Obter processos em execução
        const processos = await si.processes();
        console.log("\nTop Processos por uso de CPU:");
        const topProcessos = processos.list
            .sort((a, b) => b.cpu - a.cpu)
            .slice(0, 5); // Exibe os 5 principais
        topProcessos.forEach(proc => {
            console.log(`PID: ${proc.pid}, Nome: ${proc.name}, CPU: ${proc.cpu.toFixed(2)}%`);
        });
    } catch (err) {
        console.error("Erro ao obter informações:", err);
    }
}

// Atualizar as informações a cada 2 segundos
setInterval(monitorarCPU, 2000);
