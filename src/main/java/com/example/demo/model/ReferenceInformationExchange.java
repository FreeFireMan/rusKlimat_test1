package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReferenceInformationExchange {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("КаталогНеподписаннойНоменклатуры")
    private String catalogUnsignedNomenclature;
    @JsonProperty("Склад")
    private boolean stock;
    @JsonProperty("ЛинейнаяВыгрузкаОбъектов")
    private boolean linerUnloadingObjects;
    @JsonProperty("ВыгружатьМножественныеХарактеристики")
    private boolean unloadMultipleFeatures;
    @JsonProperty("ReceivedNo")
    private String receivedNo;
    @JsonProperty("ВыгружатьСтороннийКлассификаторДляПодбораАналогов")
    private boolean unloadOutsiderClassifierForAnalogSelection;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Шлюз")
    private boolean gateway;
    @JsonProperty("ГруппаОбмена_Key")
    private String groupSharing_Key;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("ИБВладелецПоУмолчанию_Key")
    private String iBOwnerDefault_Key;
    @JsonProperty("ИнформационнаяБаза_Key")
    private String informationBase_Key;
    @JsonProperty("SentNo")
    private String sentNo;
    @JsonProperty("НеИспользуется")
    private boolean notUsed;
    @JsonProperty("Автоподписка")
    private List<ObjectNode> autoSubscription;
    @JsonProperty("ВыгружатьТаблицыКлассификаций")
    private boolean uploadTablesClassifications;
    @JsonProperty("ВыгружатьТаблицуПодписчиков")
    private boolean uploadTablesSubscription;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ВыгружатьКопииФайлов")
    private boolean uploadCopyFiles;
    @JsonProperty("ИБВладелецПоУмолчанию@navigationLinkUrl")
    private String yBOwnerDefaultNavigationLinkUrl;
    @JsonProperty("ИнформационнаяБаза@navigationLinkUrl")
    private String informationBaseNavigationLinkUrl;
    @JsonProperty("ГруппаОбмена@navigationLinkUrl")
    private String groupExchangeNavigationLinkUrl;

}
