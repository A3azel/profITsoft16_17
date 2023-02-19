package com.example.profITsoft16_17.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Document("Test")
public class Pep {
    @Id
    String id;
    @Field("also_known_as_en")
    String alsoKnownAsEn;
    @Field("date_of_birth")
    String dateOfBirth;
    @Field("died")
    boolean died;
    @Field("first_name")
    String firstName;
    @Field("first_name_en")
    String firstNameEn;
    @Field("full_name")
    String fullName;
    @Field("full_name_en")
    String fullNameEn;
    @Field("is_pep")
    boolean isPep;
    @Field("last_name")
    String lastName;
    @Field("last_name_en")
    String lastNameEn;
    @Field("names")
    String names;
    @Field("patronymic")
    String patronymic;
    @Field("patronymic_en")
    String patronymicEn;
    @Field("photo")
    String photo;
    @Field("related_persons")
    List<RelatedPerson> relatedPersons;
    @Field("type_of_official")
    String typeOfOfficial;
    @Field("type_of_official_en")
    String typeOfOfficialEn;
    @Field("url")
    String url;
    @Field("last_job_title")
    String lastJobTitle;
    @Field("last_job_title_en")
    String lastJobTitleEn;
    @Field("last_workplace")
    String lastWorkplace;
    @Field("last_workplace_en")
    String lastWorkplaceEn;
    @Field("related_companies")
    List<RelatedCompany> relatedCompanies;
    @Field("also_known_as_uk")
    String alsoKnownAsUk;
    @Field("declarations")
    List<Declaration> declarations;
    @Field("reputation_assets_en")
    String reputationAssetsEn;
    @Field("reputation_assets_uk")
    String reputationAssetsUk;
    @Field("reputation_convictions_en")
    String reputationConvictionsEn;
    @Field("reputation_convictions_uk")
    String reputationConvictionsUk;
    @Field("reputation_crimes_en")
    String reputationCrimesEn;
    @Field("reputation_crimes_uk")
    String reputationCrimesUk;
    @Field("reputation_manhunt_en")
    String reputationManhuntEn;
    @Field("reputation_manhunt_uk")
    String reputationManhuntUk;
    @Field("reputation_sanctions_en")
    String reputationSanctionsEn;
    @Field("reputation_sanctions_uk")
    String reputationSanctionsUk;
    @Field("wiki_en")
    String wikiEn;
    @Field("wiki_uk")
    String wikiUk;
    @Field("reason_of_termination")
    String reasonOfTermination;
    @Field("reason_of_termination_en")
    String reasonOfTerminationEn;
    @Field("termination_date_human")
    String terminationDateHuman;
    @Field("related_countries")
    List<RelatedCountry> relatedCountries;
}
