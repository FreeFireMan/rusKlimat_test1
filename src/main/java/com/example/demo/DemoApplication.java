package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.rusKlimat.api.RusKlimatApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    RusKlimatApi api;


    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }
    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String str1 = "http://api.rusklimat.ru/rest/Contentplatform/mtp/a0a7de95-9a5c-4eb2-8000-7c3136e5efe7";
        String str2 = "http://api.rusklimat.ru/rest/ContentPlatform/TypesOfNomenclatureClassifiers/390b7b88-ff1d-4d30-b697-17947f208944?$format=json";
        String str3 = "http://api.rusklimat.ru/rest/ContentPlatform/ProductClassifier/4d4441c6-217d-4602-9016-e9733b519ad3?$format=json";
        String str4 = "http://api.rusklimat.ru/rest/ContentPlatform/NomenclatureUnits/8160ece4-d340-49d2-8e66-7dd512e41fea?$format=json";
        String str5 = "http://api.rusklimat.ru/rest/ContentPlatform/TypesOfPackaging/101c8612-6e31-11e3-931a-ac162d7b6f40?$format=json";
        String str6 = "http://api.rusklimat.ru/rest/ContentPlatform/InternetSites/ccac9a38-a76e-49ca-a572-dacca3719aa9?$format=json";
        String str7 = "http://api.rusklimat.ru/rest/ContentPlatform/RatesNDS/9f94b36b-4e10-4745-9f5f-91babd38cc28?$format=json";
        String str8 = "http://api.rusklimat.ru/rest/ContentPlatform/InformationDatabases/7b166548-4eb8-11e4-931a-ac162d7b6f40?$format=json";
        String str9 = "http://api.rusklimat.ru/rest/ContentPlatform/ReferenceInformationExchange/53b147b8-40e5-11e5-a45b-ac162d7b6f40?$format=json";
        String str10 = "http://api.rusklimat.ru/rest/ContentPlatform/TypesOfNomenclatureFeatures/476f3061-b9f0-11e5-b14a-ac162d7b6f40?$format=json";
        String str11 = "http://api.rusklimat.ru/rest/ContentPlatform/CodesTNVED/19262167-abcd-4ce6-b13a-cab358e45273?$format=json";
        String str12 = "http://api.rusklimat.ru/rest/ContentPlatform/Users/7563a725-ae30-11e2-9176-80c16e786bf8?$format=json";

        String jsonWriter = "";
        Mtp node =mapper.readValue(api.fetchPage(str1).toString(), Mtp.class);
        TypesOfNomenclatureClassifiers typeOfN =  mapper.readValue(api.fetchPage(str2).toString(), TypesOfNomenclatureClassifiers.class);
        ProductClassifier productClassifier =  mapper.readValue(api.fetchPage(str3).toString(), ProductClassifier.class);
        NomenclatureUnits nomenclatureUnits =  mapper.readValue(api.fetchPage(str4).toString(), NomenclatureUnits.class);
        TypesOfPackaging еypesOfPackaging =  mapper.readValue(api.fetchPage(str5).toString(), TypesOfPackaging.class);
        InternetSites internetSites =  mapper.readValue(api.fetchPage(str6).toString(), InternetSites.class);
        RatesNDS ratesNDS =  mapper.readValue(api.fetchPage(str7).toString(), RatesNDS.class);
        InformationDatabases informationDatabases =  mapper.readValue(api.fetchPage(str8).toString(), InformationDatabases.class);
        ReferenceInformationExchange referenceInformationExchange =  mapper.readValue(api.fetchPage(str9).toString(), ReferenceInformationExchange.class);
        TypesOfNomenclatureFeatures typesOfNomenclatureFeatures =  mapper.readValue(api.fetchPage(str10).toString(), TypesOfNomenclatureFeatures.class);
        CodesTNVED codesTNVED =  mapper.readValue(api.fetchPage(str11).toString(), CodesTNVED.class);
        Users users =  mapper.readValue(api.fetchPage(str12).toString(), Users.class);

        System.out.println(users);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        jsonWriter = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(users);
        System.out.println(jsonWriter);



        exit(0);
    }


}
