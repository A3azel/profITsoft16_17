package com.example.profITsoft16_17.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
@Document("Test")
public class Pep {
    @Id
    String id;
    @JsonProperty("also_known_as_en")
    String alsoKnownAsEn;
    @JsonProperty("date_of_birth")
    String dateOfBirth;
    @JsonProperty("died")
    boolean died;
    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("first_name_en")
    String firstNameEn;
    @JsonProperty("full_name")
    String fullName;
    @JsonProperty("full_name_en")
    String fullNameEn;
    @JsonProperty("is_pep")
    boolean isPep;
    @JsonProperty("last_name")
    String lastName;
    @JsonProperty("last_name_en")
    String lastNameEn;
    @JsonProperty("names")
    String names;
    @JsonProperty("patronymic")
    String patronymic;
    @JsonProperty("patronymic_en")
    String patronymicEn;
    @JsonProperty("photo")
    String photo;
    @JsonProperty("related_persons")
    List<RelatedPerson> relatedPersons;
    @JsonProperty("type_of_official")
    String typeOfOfficial;
    @JsonProperty("type_of_official_en")
    String typeOfOfficialEn;
    @JsonProperty("url")
    String url;
    @JsonProperty("last_job_title")
    String lastJobTitle;
    @JsonProperty("last_job_title_en")
    String lastJobTitleEn;
    @JsonProperty("last_workplace")
    String lastWorkplace;
    @JsonProperty("last_workplace_en")
    String lastWorkplaceEn;
    @JsonProperty("related_companies")
    List<RelatedCompany> relatedCompanies;
    @JsonProperty("also_known_as_uk")
    String alsoKnownAsUk;
    @JsonProperty("declarations")
    List<Declaration> declarations;
    @JsonProperty("reputation_assets_en")
    String reputationAssetsEn;
    @JsonProperty("reputation_assets_uk")
    String reputationAssetsUk;
    @JsonProperty("reputation_convictions_en")
    String reputationConvictionsEn;
    @JsonProperty("reputation_convictions_uk")
    String reputationConvictionsUk;
    @JsonProperty("reputation_crimes_en")
    String reputationCrimesEn;
    @JsonProperty("reputation_crimes_uk")
    String reputationCrimesUk;
    @JsonProperty("reputation_manhunt_en")
    String reputationManhuntEn;
    @JsonProperty("reputation_manhunt_uk")
    String reputationManhuntUk;
    @JsonProperty("reputation_sanctions_en")
    String reputationSanctionsEn;
    @JsonProperty("reputation_sanctions_uk")
    String reputationSanctionsUk;
    @JsonProperty("wiki_en")
    String wikiEn;
    @JsonProperty("wiki_uk")
    String wikiUk;
    @JsonProperty("city_of_birth_uk")//
    String cityOfBirthUk;
    @JsonProperty("city_of_birth_en")//
    String cityOfBirthEn;
    @JsonProperty("reason_of_termination")
    String reasonOfTermination;
    @JsonProperty("reason_of_termination_en")
    String reasonOfTerminationEn;
    @JsonProperty("termination_date_human")
    String terminationDateHuman;
    @JsonProperty("related_countries")
    List<RelatedCountry> relatedCountries;
}
