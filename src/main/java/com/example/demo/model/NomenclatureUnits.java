package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NomenclatureUnits {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("ТочностьОкругленияДляЕИМест")
    private int roundingAccuracyForIEPlace;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("КоличествоНаПаллете")
    private int quantityOnPallet;
    @JsonProperty("Ширина")
    private float width;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("КоэффициентПересчета")
    private int coefficientFactor;
    @JsonProperty("Длина")
    private float length;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("Высота")
    private float height;
    @JsonProperty("ЕдиницаПоКлассификатору_Key")
    private String unitClassifier_Key;
    @JsonProperty("ВесНетто")
    private int netWeight;
    @JsonProperty("Автор_Key")
    private String Author_Key;
    @JsonProperty("Вес")
    private int Weight;
    @JsonProperty("МетодПересчета")
    private String countMethod;
    @JsonProperty("КоличествоВУпаковке")
    private int amountInPackage;
    @JsonProperty("Коэффициент")
    private int coefficient;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Объем")
    private float volume;
    @JsonProperty("ЭтоМакет")
    private boolean thisMaket;
    @JsonProperty("Редактор_Key")
    private String editor_Key;
    @JsonProperty("Owner_Key")
    private String owner_Key;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("Автор@navigationLinkUrl")
    private String authorNavigationLinkUrl;
    @JsonProperty("Owner@navigationLinkUrl")
    private String owneNavigationLinkUrl;
    @JsonProperty("Редактор@navigationLinkUrl")
    private String editorNavigationLinkUrl; @
            JsonProperty("ЕдиницаПоКлассификатору@navigationLinkUrl")
    private String unitClassifier_KeyNavigationLinkUrl;





}
