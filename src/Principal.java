public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "O poderoso chefão";
        filme1.anoLancamento = 1970;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 180;

        filme1.avalia(9);
        filme1.avalia(7);
        filme1.avalia(4);
        filme1.avalia(10);
        filme1.avalia(9);
        filme1.avalia(5);

        filme1.somaDasAvaliacoes = filme1.pegaMedia();

        filme1.exibeFichaTecnica();

    }
}


