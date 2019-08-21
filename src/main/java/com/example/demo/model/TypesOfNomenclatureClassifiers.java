package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypesOfNomenclatureClassifiers {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("КаталогПоУмолчанию_Key")
    private String catalogDefault_Key;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("Описание")
    private String opisaynie;
    @JsonProperty("ПорядокСортировкиВОсновнойКлассификации")
    private int orderSortInMainClassification;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("ВнешняяТорговаяПлощадка")
    private boolean foreignMarket;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("Организация_Key")
    private String organization_Key;
    @JsonProperty("ДляПодбораАналогов")
    private boolean forMatchingAnalog;
    @JsonProperty("КаталогПоУмолчанию@navigationLinkUrl")
    private String catalogDefaultNavigationLinkUrl;



}
