package org.ensaj.voiture;
import jakarta.transaction.Transactional;
import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;
@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {
    private VoitureRepository voitureRepository;
    private ClientService clientService;
    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }
    @FeignClient(name="clients")
    interface ClientService{
        @GetMapping(path="/clients/{id}")
        public Client clientById(@PathVariable Long id);
    }
    @Transactional
    @Bean
    CommandLineRunner initialiserBaseMySQL(VoitureRepository voitureRepository, ClientService clientService){
        return args -> {
            Client c1 = clientService.clientById(1L);
            Client c2 = clientService.clientById(2L);
            Client c3 = clientService.clientById(3L);
            System.out.println("**************************");
            System.out.println("Id est :" + c1.getId());
            System.out.println("Nom est :" + c1.getNom());
            System.out.println("**************************");
            voitureRepository.save(new Voiture(Long.parseLong("1"), "Mercedes", "AMG G63", "2023", c1.getId()));
            voitureRepository.save(new Voiture(Long.parseLong("2"), "Volvo", "SUV", "2023", c2.getId()));
            voitureRepository.save(new Voiture(Long.parseLong("3"), "AUDI", "Q8", "2023", c3.getId()));

        };
    }

}
