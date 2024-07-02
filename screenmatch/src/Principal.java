import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Gone Girl");
        miPelicula.setFechaDeLanzamiento(2014);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());


















//        String nombrePelicula = miPelicula.getNombre();
//        int fechaDeLanzamiento = miPelicula.getFechaDeLanzamiento();
//        int duracionEnMinutos = miPelicula.getDuracionEnMinutos();
//        boolean incluidoEnElPlan = miPelicula.isIncluidoEnElPlan();
//
//        System.out.println("Nombre: " + nombrePelicula);
//        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
//        System.out.println("Duracion en minutos: " + duracionEnMinutos);
//        System.out.println("Incluido en el plan: " + incluidoEnElPlan);
















//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Coraline and the secret door";
//        otraPelicula.fechaDeLanzamiento = 2009;
//        otraPelicula.duracionEnMinutos = 100;
//
////        otraPelicula.muestraFichaTecnica();
    }

}
