package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("ИдентификаторПользователяИБ")
    private String identifierUserIB;
    @JsonProperty("ПрофильДоступа_Key")
    private String profileAccess_Key;
    @JsonProperty("Подготовлен")
    private boolean prepared;
    @JsonProperty("Служебный")
    private boolean official;
    @JsonProperty("Подразделение")
    private String subdivision;
    @JsonProperty("УзелОбмена_Key")
    private String nodeExchange_Key;
    @JsonProperty("ФизическоеЛицо")
    private String individualFace;
    @JsonProperty("ИдентификаторПользователяСервиса")
    private String identifierUserService;
    @JsonProperty("СвойстваПользователяИБ_Type")
    private String propertiesUserIB_Type;
    @JsonProperty("СвойстваПользователяИБ_Base64Data")
    private String propertiesUserIB_Base64Data;
    @JsonProperty("Недействителен")
    private boolean notValid;
    @JsonProperty("ИмяПользователяИБ")
    private String nameUserIB;
    @JsonProperty("Комментарий")
    private String Comment;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("Эксперт")
    private boolean expert;
    @JsonProperty("ГруппаОбмена_Key")
    private String groupSharing_Key;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ДополнительныеРеквизиты")
    private List<ObjectNode> additionalDetails;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("КонтактнаяИнформация")
    private List<ObjectNode> contactInformation;
    @JsonProperty("Ref_Key")
    private String ref_Key;
}
