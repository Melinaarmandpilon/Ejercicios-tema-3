package ejerciciotema9.clase;

import ejerciciotema8.clase.Persona;

public class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
