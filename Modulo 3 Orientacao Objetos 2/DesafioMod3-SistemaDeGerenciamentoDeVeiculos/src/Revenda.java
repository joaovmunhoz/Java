//5. Crie uma classe Revenda:

public class Revenda{
    //Crie 5 atributos do tipo Veiculo
    Veiculo veiculo1;
    Veiculo veiculo2;
    Veiculo veiculo3;
    Veiculo veiculo4;
    Veiculo veiculo5;

    //Crie um método adicionarVeiculo(Veiculo veiculo): para adicionar um veículo.
    public void adicionarVeiculo (Veiculo veiculo) {
        if (this.veiculo1 == null) {
            this.veiculo1 = veiculo;// caso não tenha sido cadastrado o veiculo1, o novo veiculo inserido sera o veiculo1 e assim por diante
            System.out.println("Veiculo 1 inserido");
        } else if (this.veiculo2 == null) {
            this.veiculo2 = veiculo;
            System.out.println("Veiculo 2 inserido");
        } else if (this.veiculo3 == null) {
            this.veiculo3 = veiculo;
            System.out.println("Veiculo 3 inserido");
        } else if (this.veiculo4 == null) {
            this.veiculo4 = veiculo;
            System.out.println("Veiculo 4 inserido");
        } else if (this.veiculo5 == null) {
            this.veiculo5 = veiculo;
            System.out.println("Veiculo 5 inserido");
        } else {
            System.out.println("REVENDA CHEIA\nnao foi possivel adicionar um novo veiculo");
        }
    }
    //Crie um método removerVeiculo(String placa): para remover um veículo
    public void removerVeiculo(String placa){
        if (veiculo1.placa.equals(placa)){
            veiculo1 = null;
            System.out.println("Veiculo removido com sucesso");
        }else if (veiculo2.placa.equals(placa)){
            veiculo2 = null;
            System.out.println("Veiculo removido com sucesso");
        }else if (veiculo3.placa.equals(placa)){
            veiculo3 = null;
            System.out.println("Veiculo removido com sucesso");
        }else if (veiculo4.placa.equals(placa)){
            veiculo4 = null;
            System.out.println("Veiculo removido com sucesso");
        }else if (veiculo5.placa.equals(placa)){
            veiculo5 = null;
            System.out.println("Veiculo removido com sucesso");
        }else System.out.println("O veiculo que esta procurando nao se encontra em nossa revenda.");
    }
    //Crie um método listarVeiculos(): para listar todos os veículos
    public String listarVeiculos(){
        String lista = "\nLISTA DE VEICULOS DA REVENDA\n";
        if (veiculo1 != null) lista += veiculo1.exibirDetalhes();
        if (veiculo2 != null) lista += veiculo2.exibirDetalhes();
        if (veiculo3 != null) lista += veiculo3.exibirDetalhes();
        if (veiculo4 != null) lista += veiculo4.exibirDetalhes();
        if (veiculo5 != null) lista += veiculo5.exibirDetalhes();
        return lista;
    }
    //Crie um método adicionarDesconto(String placa, double valorDesconto):
    // para adicionar um desconto no veículo específico
    public void adicionarDesconto(String placa, double valorDesconto){
        if (veiculo1.placa.equals(placa)){
            veiculo1.aplicarDesconto(valorDesconto);
        }else if (veiculo2.placa.equals(placa)){
            veiculo2.aplicarDesconto(valorDesconto);
        }else if (veiculo3.placa.equals(placa)){
            veiculo3.aplicarDesconto(valorDesconto);
        }else if (veiculo4.placa.equals(placa)){
            veiculo4.aplicarDesconto(valorDesconto);
        }else if (veiculo5.placa.equals(placa)){
            veiculo5.aplicarDesconto(valorDesconto);
        }else System.out.println("O veiculo que voce esta procurando nao se encontra em nossa revenda.");
    }
}
