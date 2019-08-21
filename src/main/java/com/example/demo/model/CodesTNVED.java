package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CodesTNVED {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("Автор_Key")
    private String Author_Key;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("Редактор_Key")
    private String editor_Key;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("НаименованиеПолное")
    private String nameFull;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("ИдентификаторИсточника")
    private String sourseID;
    @JsonProperty("Parent_Key")
    private String parent_Key;
    @JsonProperty("Ref_Key")
    private String ref_Key;
}
