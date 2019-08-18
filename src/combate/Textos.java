/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;

/**
 *
 * @author Gustavo
 */
public class Textos {
    
    // AKI SE CONSEGUIREM FAZER COM LISTA FICARIA MELHOR
    
    private String returnTxt;
    
    private String txt0 = "O personagem ao voltar de Flosd encontra sua casa pegando fogo, desesperado entra na casa para tentar salvar sua familia, tudo o que vê lá dentro são 3 corpos carbonizados, concluindo então que seus pais e seu irmão estão mortos. ";
    private String txt1 = "Antes de sair da sua casa para não morrer, ele encontra 3 sacolas estranhas em um compartimento secreto escondido em baixo do piso, com pouco tempo e muito desespero, ele só conseguirá pegar uma das três sacolas, observou rapidamente alguns detalhes curiosos nas sacolas";
    private String txt2 = "1 - Sacola com ilustração de espada \n2 - Sacola com ilustração de um livro\n3 - Sacola com ilustração de um arco";
    private String txt3 = "Ao abrir a sacola, ele observa que havia uma um pequeno cubo no qual se transforma em uma grande espada magicamente ao toca-lo .";
    private String txt4 = "Ao abrir a sacola, ele observa que havia um livro em e mais um cubo que ao toca-lo , transforma-se em um cajado.";
    private String txt5 = "Ao abrir a sacola, ele observa que havia uma um pequeno cubo no qual se transforma em um grnde arco magicamente ao tocá-lo .";
    private String txt6 = "Junto de seu equipamento , havia um bilhete *INSIRA UM BACKGROUND PARA A SACOLAS AQUI*";
    private String txt7 = "BACKGROUND \nAnos depois agora já adulto, o personagem chega em uma grande cidade da região Zentage em busca de uma pista.";
    private String txt8 = "1 - O personagem se direciona para a taverna em busca de informações\n2 - \n3 - .";
    private String txt9 = "Entrando na taverna o personagem se depara com um grupo de comerfciantes conversando, tal conversa tem um unico assunto um bando de criminosos que estão massacrando fazendeiros na região nos ultimos anos.";    
    private String txt10 = "1 - o personagem então questiona o grupo sobre o que eles sabiam de froma amigavel\n2 - \n3 - ";
    private String txt11 = "O grupo diz não saber muita coisa, porém contam sobre um dos criminosas que forá capturado por guardas da cidade a cerca de dois dias atrás.";
    private String txt12 = "1 - O personagem vai tentar ir falar com o rei para fazer perguntas ao prisioneiro\n2 - \n3 - ";
    private String txt13 = "O rei então refulta seu pedido, por não poder confiar no personagem, então ele sujere uma troca o personagem realiza um trabalho para o rei e em troca poderá falar com o prisioneiro.";
    private String txt14 = "QUEST \nMatar um Beholder que está destruindo fazendas ineiras na região, antes de partir o rei equipa o persongem com os equipamentos necessários para tal feito.";
    private String txt15 = "1 - Antes de serguir até o local indicado o personagem busca informações sobre a criatura que vai enfrentar. (NECESSÁRIO 10 GOLD)\n2 - O persongaem então se direciona pelo meio da cidade até o local dito pelo rei\n 3 -";
    private String txt16 = "    COMBATE";
    private String txt17 = "Pós combate \nO personagem mata o Beholder, arranca o maior olho de seu cabeça e leva como troféu ao rei. ";
    private String txt18 = "Ao mostrar o grande olho da criatura o Rei então permite que ele veja o prisioneiro.";
    private String txt19 = "1 - Após chegar a cela do prisioneiro o personagem começa a fazer perguntas para o mesmo \n2 - Após chegar na cela do prisioneiro o personagem interróga o prisioneiro com o auxilio de tortura \n3 - ";
    private String txt20 = "O prisioneiro ao ser enfagado sobre a localização da gangue conta que eles costumam passar a noite em uma cabana localizada ao pé da montanha Fahal.";
    private String txt21 = "O perrsongaem chega ao local na parte da tarde, passa um parte da noite observando o local, ele vê luzes de tochas e uma fogueira com aparentemente 4 dos criminosos como o prisioneiro lhe disse. Após algumas horas 3 dos homens entram na cabana para dormir enquanto um deles fica de vigia.";
    private String txt22 = "1 - O personagem decide agir de forma sorrateira, assim ele atordoa o gurda que estva sentado proximo a fogueira \n2 - \n3 - ";
    private String txt23 = "Após lidar com o criminoso que estava vigiando, o personagem abre a porta com cuidado, mas antes que pudesse ver algo uma armadilha é disparada acordando todos os bandidos que estvam dormindo.";
    private String txt24 = " COMBATE ";
    private String txt25 = "O prisioneiro ao ser enfagado sobre a localização da gangue conta que eles costumam passar a noite em uma cabana localizada ao pé da montanha Fahal, além disso também informa sobre entrada secrata localizada na parte de trás da cabana";
    private String txt26 = "O perrsongaem chega ao local na parte da tarde, passa um parte da noite observando o local, ele vê luzes de tochas e uma fogueira com aparentemente 4 dos criminosos como o prisioneiro lhe disse. Após algumas horas 3 dos homens entram na cabana para dormir enquanto um deles fica de vigia.";
    private String txt27 = "1 - O personagem decide agir de forma sorrateira, assim ele atordoa o gurda que estva sentado proximo a fogueira \n2 - \n3 -";
    private String txt28 = "Após lidar com o criminoso que estava vigiando, o personagem se dirige para parte de trás da cabana e adrenta pela entrada secreta, assim ele consegue eliminar mais um dos criminosos, porém antes de desmaiar o criminoso acorda seus comparsas com um sino.";
    private String txt29 = " COMBA TE";
    private String txt30 = "Após toda essa luta o ultimo criminosos se ajoelha devido a um ferimento em seu peito, e então o personagem pode ver seu rosto ... um rosto familiar, era seu próprio pai, diante essa revelação ele imobiliza seu pai e os outro comparsas dele, para que possam ser julgados e condenado pelo rei de zentage. TEM Q MELHORAR ISSO ";
    
    
    public String getTxt( int n) {
        switch(n){
            case 0:
                returnTxt = txt0;
            break;
            
            case 1:
                returnTxt = txt1;
            break;
            
            case 2:
                returnTxt = txt2;
            break;
            
            case 3:
                returnTxt = txt3;
            break;
            
            case 4:
                returnTxt = txt4;
            break;
            
            case 5:
                returnTxt = txt5;
            break;
            
            case 6:
                returnTxt = txt6;
            break;
            
            case 7: 
                returnTxt = txt7;
            break;
            
            case 8: 
                returnTxt = txt8;
            break;
            
            case 9: 
                returnTxt = txt9;
            break;
            
            case 10: 
                returnTxt = txt10;
            break;
            
            case 11: 
                returnTxt = txt11;
            break;
            
            case 12: 
                returnTxt = txt12;
            break;
            
            case 13: 
                returnTxt = txt13;
            break;
            
            case 14: 
                returnTxt = txt14;
            break;
            
            case 15: 
                returnTxt = txt15;
            break;
            
            case 16: 
                returnTxt = txt16;
            break;
            
            case 17: 
                returnTxt = txt17;
            break;
            
            case 18: 
                returnTxt = txt18;
            break;
            
            case 19: 
                returnTxt = txt19;
            break;
            
            case 20: 
                returnTxt = txt20;
            break;
            
            case 21: 
                returnTxt = txt21;
            break;
            
            case 22: 
                returnTxt = txt22;
            break;
            
            case 23: 
                returnTxt = txt23;
            break;
            
            case 24: 
                returnTxt = txt24;
            break;
            
            case 25: 
                returnTxt = txt25;
            break;
            
            case 26: 
                returnTxt = txt26;
            break;
            
            case 27: 
                returnTxt = txt27;
            break;
            
            case 28: 
                returnTxt = txt28;
            break;
            
            case 29: 
                returnTxt = txt29;
            break;
            
            case 30: 
                returnTxt = txt30;
            break;
            
        }
        return returnTxt;       
    }

    
    
}
