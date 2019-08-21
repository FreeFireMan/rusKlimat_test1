package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatesNDS {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("ИдентификаторИсточника")
    private String sourseID;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("Комментарий")
    private String Comment;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Ref_Key")
    private String ref_Key;
}
