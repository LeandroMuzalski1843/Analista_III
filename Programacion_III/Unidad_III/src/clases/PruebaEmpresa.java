package clases;

public class PruebaEmpresa {
    public static void main(String[] args) {
        Empresa tradeEnterpriseTotalOrganization = new Empresa("Trade Enterprise Total Organization", "TETO",100);
        tradeEnterpriseTotalOrganization.incrementarValuacion(0.20);
        System.out.println(tradeEnterpriseTotalOrganization.getValuacion());
    }
}
