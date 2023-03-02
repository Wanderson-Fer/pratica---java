package locadora;

public class Veiculo {
    private final Integer codigo;
    private String modelo;
    private Double valor;

    public Marca marca;

    public Veiculo (Integer codigo, String modelo, Double valor, Marca marca) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.valor = valor;
        this.marca = marca;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Double calcularIpva() {
        Double ipva;
        
        if (this.valor <= 40000.0)
            ipva = this.valor * 3/100;
        else if (this.valor <= 60000.0)
            ipva = this.valor * 4/100;
        else
            ipva = this.valor * 5/100;

        return ipva;
        
    }
}
