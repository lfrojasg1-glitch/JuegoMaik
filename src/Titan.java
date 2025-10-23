public class Titan {
    String nombre;
    Integer golpe;
    Integer vida;
    Integer curacion;


    public Titan(String nombre, Integer vida, Integer golpe, Integer curacion) {
        this.nombre = nombre;
        this.golpe = golpe;
        this.vida = vida;
        this.curacion = curacion;
    }

    public void mostrarInfo() {

        System.out.println("El nombre del tital es: " + this.nombre);
        System.out.println("El vida del tital es: " + this.vida);
        System.out.println("El golpe es: " + this.golpe);
        System.out.println("El tital recuperara: " + this.curacion);
    }

    public void atacar(Titan titanBestia) {
        titanBestia.vida -= this.golpe;

        System.out.println(this.nombre + " ha quitado " + this.golpe + " de vida a " + titanBestia.nombre + " y quedo con " + titanBestia.vida);
    }

    public void curar(Titan titanSalvador) {
        titanSalvador.vida += this.curacion;

        System.out.println(this.nombre + " ha curado " + this.curacion + " de vida a " + titanSalvador.nombre + " y quedo con " + titanSalvador.vida);
    }

    public static void main(String[] args) {
        Titan titanMandibula = new Titan("Titan Mandibula", 6000, 2222, 111);
        Titan titanBestia = new Titan("Titan Bestia", 8000, 4444, 22);
        Titan titansalvador = new Titan("Titan Salvador", 0, 0, 1111);

        titanBestia.atacar(titanMandibula);
        titanMandibula.atacar(titanBestia);
        titansalvador.curar(titanMandibula);
        titanMandibula.atacar(titanBestia);
        titanMandibula.atacar(titanBestia);
        titanBestia.atacar(titanMandibula);
        titansalvador.curar(titanBestia);

        if (titanMandibula.vida > titanBestia.vida) {
            System.out.println("El ganador fue el Titan Mandibula");
        } else if (titanBestia.vida > titanMandibula.vida) {
            System.out.println("El ganador fue el Titan Bestia ");
        }
    }
}


