package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class classePrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ex1
//        List<Produtos> listaProdutos = new ArrayList<>();
//        List<pedidos> listaPedidos = new ArrayList<>();
//        
//        int escolha;
//        System.out.println("Digite 1 para adicionar um produto, 2 para para afzer pedido ao fornecedor ou 3 para sair: ");
//        escolha = sc.nextInt();
//        sc.nextLine();
//        
//        
//        
//        while (escolha ==1){
//            Produtos pd = new Produtos(null, null, 0);
//            
//            System.out.println("Produto:");
//            pd.setNome(sc.nextLine());
//            
//            System.out.println("Número:");
//            pd.setNumero(sc.nextLine());
//            
//            System.out.println("Estoque:");
//            pd.setEstoque(sc.nextInt());
//            
//            listaProdutos.add(pd);
//            
//            System.out.println("Digite 1 para adicionar um produto, 2 para para afzer pedido ao fornecedor ou 3 para sair:");
//            escolha = sc.nextInt();
//            sc.nextLine();
//        }
//        for (Produtos produto : listaProdutos){
//            System.out.println(produto.getFinais());
//        }
//        System.out.println("--------------------------------------------------------");
//        System.out.println("Produtos em alerta: ");
//        for (Produtos produto : listaProdutos){
//            if (produto.getEstoque() < 3){
//                System.out.println(produto.getFinais());
//            }
//        }
//       
//        while(escolha==2){
//        pedidos ps = new pedidos(null, null, 0);
//        
//            System.out.println("Produto:");
//            ps.setProduto(sc.nextLine());
//            
//            System.out.println("Quantidade:");
//            ps.setQuatntidade(sc.nextInt());
//            
//            listaPedidos.add(ps);
//            
//            System.out.println("Digite 1 para adicionar um produto, 2 para para afzer pedido ao fornecedor ou 3 para sair: ");
//            escolha = sc.nextInt();
//            sc.nextLine();
//        
//        }
//        for (pedidos pedido : listaPedidos){
//            System.out.println(pedido.getFinal());
//        }
       





//ex2
        //funcionarios
//    funcionarios func1 = new funcionarios("Jairo Jorge", "Urologista", 3000, "limpar o parque");
//    funcionarios func2 = new funcionarios("Jão Gomes", "Gari", 1500, "limpar a cidade");
//    
//    //departamentos
//    departamentos dp1 = new departamentos("RH");
//    departamentos dp2 = new departamentos("auxiliar");
//    
//    //criando funcionarios
//    dp1.addFuncionario(func2);
//    dp2.addFuncionario(func1);
//    
//    projetos p1 = new projetos("limpar o parque", null);
//    projetos p2 = new projetos ("arrumar a empresa", null);
//    
//    //adicionando projetos
//    func1.addProjetos(p2);
//    func2.addProjetos(p1);
//    
//    //mostrar projetos
//    func1.exibirProjetos();
//    func2.exibirProjetos();
//    
//        System.out.println("Média salárial departametno de RH: " + dp1.mediaSalarial());
//        System.out.println("Média salárial departametno de auxiliar: " + dp2.mediaSalarial());
       




//ex3
        //usuarios
//        usuarios u1 = new usuarios("Clebin");
//        usuarios u2 = new usuarios("Cleito Rasta");
//
//        //publicações
//        publicacoes p1 = new publicacoes("Bom dia!");
//        publicacoes p2 = new publicacoes("Quanto foi o jogo? ");
//
//        //comentários
//        comentarios c1 = new comentarios("Bom dia pra você também");
//        comentarios c2 = new comentarios("2x0 pro colorado");
//
//        //adicionando publicações
//        u1.addPublicacao(p2);
//        u2.addPublicacao(p1);
//
//        //adicionando comentários
//        p1.addComentarios(c1);
//        p2.addComentarios(c2);
//        
//        u1.exibir();
//        u2.exibir();
        
    
    
    
    
    //ex4
    
    //passageiros
//    passageiros p1 = new passageiros("Arnaldo César Coelho");
//    passageiros p2 = new passageiros("Daniel Orivaldo da Silva");
//    
//    
//    //reservas
//    reservas r1 = new reservas("New York, EUA");
//    reservas r2 = new reservas("Boston, EUA");
//    reservas r3 = new reservas("Califórnia, EUA");
//    
//    //voos
//    voos v1 = new voos("157", "Disponível");
//    voos v2 =  new voos("2006", "Disponível");
//    voos v3 = new voos ("1909", "Indisponível");
//    
//    //adicionando reservas
//    p1.addReservas(r1);
//    p2.addReservas(r2);
//    
//    //adicionando voos´nas reservas
//    r1.addVoos(v1);
//    r2.addVoos(v2);
//    r3.addVoos(v3);
//    
//    p1.exibir();
//        System.out.println("-------------------------------------");
//    p2.exibir();
    


    //ex5
    
    //médicos
//    medicos m1 = new medicos("Arnold Schwarzenegger");
//    medicos m2 = new medicos("Tio Miro");
//    
//    //pacientes
//    pacientes p1 = new pacientes("Michael Jordan");
//    pacientes p2 = new pacientes("Neymar");
//    
//    //consultas
//    consultas c1 = new consultas("Ecográfia no dedo", "15/07");
//    consultas c2 = new consultas("Revisão nos dentes", "10/08");
//    
//    //adicionando pacientes aos médicos
//    m1.addPacientes(p1);
//    m2.addPacientes(p2);
//    
//    //adicionando consultas aos pacientes
//    p1.addConcultas(c1);
//    p2.addConcultas(c2);
//    
//    m1.exibir();
//        System.out.println("---------------------------------------");
//    m2.exibir();
    
    




      //ex6
      
      //vendedores
//      vendedores v1  = new vendedores("Marco Véio");
//      vendedores v2 = new vendedores("Fausto Silva");
//      
//      //marcas
//      marcas m1 = new marcas("Honda");
//      marcas m2 = new marcas("Ford");
//      
//      //modelos
//      carros c1 = new carros("Civic", 60000);
//      carros c2 = new carros("Fusion", 75000);
//      
//      //estoque
//      estoqueCarros e1 = new estoqueCarros();
//      
//      //adicionando carros a suas devidas marcas
//      m1.addCarros(c1);
//      m2.addCarros(c2);
//    
//      //adicionando carros aos vendedores
//      v1.addCarros(c1);
//      v2.addCarros(c2);
//      
//      //adicionando carros aos estoque
//      e1.addCarros(c1);
//      e1.addCarros(c2);
//      
//      //média de valores 
//      m1.media();
//      m2.media();
//      
//      //exibir
//        System.out.println("Vendedores:");
//        v1.exibir();
//        System.out.println("--------------------------------");
//        v2.exibir();
//        System.out.println("******************************");
//        
//        System.out.println("Marcas: ");
//        m1.exibir();
//        System.out.println("-----------------------------");
//        m2.exibir();
//        
//        System.out.println("************************");
//        System.out.println("Estoque: ");
//        e1.exibir();
       
      

        //ex7
        
        //livros
        livros l1 = new livros ("O código Da Vinci", 10);
        livros l2 = new livros("A cartomante", 8);
        
        //autores
        autores a1 = new autores ("Dan Brown");
        autores a2 = new autores ("Machado de Assis");
        
        //leitores
        leitores le1 = new leitores("Francisquinha do cuzcuz");
        leitores le2 = new leitores("Serjão Berranteiro");
        
        //emprestimos
        emprestimos e1 = new emprestimos("15/10");
        emprestimos e2 = new emprestimos("20/10S");
        
        //adicionando livros ao seus devidos autores
        a1.addLivro(l1);
        a2.addLivro(l2);
        
        //adicionando livros para os leitores
        le1.addLivros(l1);
        le2.addLivros(l2);
        
        //adicionando os leitores ao empréstimo
        e1.addLeitores(le1);
        e2.addLeitores(le2);
        
        //exibir
        System.out.println("Livros e autores: ");
        a1.exibir();
        a2.exibir();
        System.out.println("*************************");
        System.out.println("Empréstimos: ");
        e1.exibir();
        e2.exibir();
    }

}
