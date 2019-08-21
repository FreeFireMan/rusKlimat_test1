package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternetSites {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("IsFolder")
    private String isFolder;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ВидКлассификатора_Key")
    private String viewOfClassifier_Key;
    @JsonProperty("Parent_Key")
    private String parent_Key;
    @JsonProperty("ВидКлассификатора@navigationLinkUrl")
    private String viewOfClassifierNavigationLinkUrl;


}
