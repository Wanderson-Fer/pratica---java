package rhsystem;

public class Bairro {
    private final Integer codigo;
    private String name;

    public Bairro(Integer codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    // Getters

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
}
