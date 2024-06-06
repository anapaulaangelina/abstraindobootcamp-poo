
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());
        System.out.println("----------");

        Dev devRonnie = new Dev();
        devRonnie.setNome("Ronnie");
        devRonnie.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Ronnie:" + devRonnie.getConteudosInscritos());
        devRonnie.progredir();
        devRonnie.progredir();
        devRonnie.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Ronnie:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devRonnie.calcularTotalXp());
    }

}
