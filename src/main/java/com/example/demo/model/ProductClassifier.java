package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductClassifier {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("Parent_Key")
    private String parent_Key;
    @JsonProperty("ИдентификаторИсточника")
    private String sourseID;
    @JsonProperty("ДатаСоздания")
    private String dateCreate;
    @JsonProperty("ХарактеристикиГруппы")
    private List<ObjectNode> groupFestures;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("Owner_Key")
    private String owner_Key;
    @JsonProperty("Описание")
    private String opisaynie;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("ЭтоМакет")
    private boolean thisMaket;
    @JsonProperty("ХарактеристикиНоменклатурыГруппы")
    private List<ObjectNode> groupNomenclatureFeatures;
    @JsonProperty("Owner@navigationLinkUrl")
    private String ownerNavigationLinkUrl;


}
