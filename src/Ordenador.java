public class Ordenador {
    private int memoriaMaxima;
    private int memoriaInstalada;

    public Ordenador(int memoriaMaxima) {
        if (memoriaMaxima > 0) {
            this.memoriaMaxima = memoriaMaxima;
        } else
        this.memoriaMaxima = 1024;

    }

    public int getMemoriaMaxima() {
        return this.memoriaMaxima;
    }

    public int obtenerMemoriaDisponible() {
        return this.memoriaMaxima - this.memoriaInstalada;
    }

    public void vaciaMemoria() {
        this.memoriaInstalada = 0;
    }

    public boolean intalar256() {
        if (obtenerMemoriaDisponible() < 256) {
            return false;
        } else {
            this.memoriaInstalada += 256;
            return true;
        }
    }

    public boolean intalarMemoria(int masMemoria) {
        if (obtenerMemoriaDisponible() >= masMemoria && masMemoria > 0) {
            this.memoriaInstalada += masMemoria;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Este ordenador puede tenr hasta " + this.memoriaMaxima + " Mb de memoria. Todavia es posible instalar " + this.obtenerMemoriaDisponible() + " Mb";
    }

}
