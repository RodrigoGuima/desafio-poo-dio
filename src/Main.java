import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de fullstack");
        mentoria2.setDescricao("descrição mentoria fullstack");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        String[] nomesDev = {"Camila", "João", "Miguel", "Maitê"};
        for (int i = 0; i < nomesDev.length; i++) {
            String nomeDev = nomesDev[i];
            System.out.println("\n------- INICIO DEV: " + nomeDev + " -----");
            Dev dev = new Dev();
            dev.setNome(nomeDev);
            dev.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos " + nomeDev + ":" + dev.getConteudosInscritos());

            for(int j = 0; j <= i; j++) dev.progredir();

            System.out.println("-");
            System.out.println("Conteúdos Inscritos " + nomeDev + ":" + dev.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos " + nomeDev + ":" + dev.getConteudosConcluidos());
            System.out.println("XP:" + dev.calcularTotalXp());
            System.out.println(nomeDev + " já realizou " + dev.calcularPorcentagemRestante() + "% do bootcamp" );
        }
        //        for (String s : new String[]{"Camila", "João", "Miguel", "Maitê"}) {
        //
        //        }


        //        Dev dev = new Dev();
        //        dev.setNome("Camila");
        //        dev.inscreverBootcamp(bootcamp);
        //        System.out.println("Conteúdos Inscritos Camila:" + dev.getConteudosInscritos());
        //        dev.progredir();
        //        dev.progredir();
        //        System.out.println("-");
        //        System.out.println("Conteúdos Inscritos Camila:" + dev.getConteudosInscritos());
        //        System.out.println("Conteúdos Concluídos Camila:" + dev.getConteudosConcluidos());
        //        System.out.println("XP:" + dev.calcularTotalXp());
        //        System.out.printf("Camila já concluio %.2f%% do bootcamp: \n", dev.calcularPorcentagemRestante());
        //
        //        System.out.println("-------");
        //
        //        dev = new Dev();
        //        devJoao.setNome("Joao");
        //        devJoao.inscreverBootcamp(bootcamp);
        //        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        //        devJoao.progredir();
        //        devJoao.progredir();
        //        devJoao.progredir();
        //        System.out.println("-");
        //        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        //        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        //        System.out.println("XP:" + devJoao.calcularTotalXp());
        //        System.out.println("João já concluio " + devJoao.calcularPorcentagemRestante() + "% do bootcamp" );

    }

}
