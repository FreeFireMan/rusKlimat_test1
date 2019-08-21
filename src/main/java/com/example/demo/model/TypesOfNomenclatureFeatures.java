package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypesOfNomenclatureFeatures {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Порядок")
    private float order;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Ref_Key")
    private String ref_Key;
}
