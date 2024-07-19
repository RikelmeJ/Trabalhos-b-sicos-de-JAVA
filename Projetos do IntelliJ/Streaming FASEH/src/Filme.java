public  class  Filme {
    String  nomeDoFilme ;
    int  anoFilme ;
    int  duracao ;
    String  genero ;
    int avaliação;
    private  double  notasAvaliacoes ;
    private  int  totalAvaliações ;

    void  descreverFilme (){
        System.out. println ( "Nome do Filme: " + nomeDoFilme );
        System.out. println ( "Ano Lançamento: " + anoFilme );
        System.out. println ( "Duracao: " + duracao );
    }
    void  avaliarFilme ( int  nota ){
        //notasAvaliacoes = nota + notasAvaliacoes;
        notasAvaliacoes += nota ; //a mesma coisa da linha acima
        totalAvaliações ++;
    }
    double  mediaDasNotas (){
        return  notasAvaliacoes / totalAvaliações ;
    }
}