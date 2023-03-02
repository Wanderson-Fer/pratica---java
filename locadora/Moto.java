package locadora;

public class Moto extends Veiculo {
    private Integer cilindradas;

    Moto (Integer codigo, String modelo, Double valor, Marca marca, Integer cilindradas) {
        super(codigo, modelo, valor, marca);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public Double calcularIpva() {
        Double ipva;
        if (this.cilindradas <= 160)
            ipva = getValor() * 3/100;
        else if (this.cilindradas <= 350)
            ipva = getValor() * 4/100;
        else
            ipva = getValor() * 5/100;

        return ipva;
    }

    public void paraString() {
        System.out.println("+----------------------------------------+");

        System.out.println("+ Modelo: " + this.getModelo());
        System.out.println("+ Marca: " + this.marca.getNome());
        System.out.println("+ Cilindradas: " + this.getCilindradas());
        System.out.println("+ Valor: " + this.getValor());
        System.out.println("+ IPVA: " + this.calcularIpva());

        System.out.println("+----------------------------------------+");
    }

}
