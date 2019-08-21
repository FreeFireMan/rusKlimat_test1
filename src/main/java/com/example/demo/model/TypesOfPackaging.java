package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypesOfPackaging {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Комментарий")
    private String Comment;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("ИдентификаторИсточника")
    private String sourseID;


}
