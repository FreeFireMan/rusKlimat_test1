package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationDatabases {
    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Организация_Key")
    private String organization_Key;
    @JsonProperty("КонфигурационнаяЕдиница_Key")
    private String configurationUnit_Key;
    @JsonProperty("DeletionMark")
    private boolean deletionMark;
    @JsonProperty("БазаSQL")
    private String baseSQL;
    @JsonProperty("СерверSQL")
    private String serverSQL;
    @JsonProperty("База")
    private String base;
    @JsonProperty("Predefined")
    private boolean predefined;
    @JsonProperty("PredefinedDataName")
    private String predefinedDataName;
    @JsonProperty("ОсновнаяБизнесЕдиница")
    private boolean basicBusinessUnit;
    @JsonProperty("НеизменяемыйВладелец")
    private boolean immutableOwner;
    @JsonProperty("РазрешенныеИнформационныеБазы")
    private List<ObjectNode> allowedInformationBases;
    @JsonProperty("Описание")
    private String opisaynie;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("Пароль")
    private String password;
    @JsonProperty("ВыгружатьКурсыВалют")
    private boolean unloadCoursesCurrency;
    @JsonProperty("Пользователь")
    private String user;
    @JsonProperty("КонтролироватьШКМТР")
    private boolean toControlShKMTR;
    @JsonProperty("ConnectionString")
    private String connectionString;
    @JsonProperty("ИдентификаторИсточника")
    private String sourseID;
    @JsonProperty("ДатаОбновленияOLAP")
    private String updateDateOLAP;
    @JsonProperty("РегистрацияДляЗагрузкиИзФайла")
    private boolean registrationForDownloadFromFile;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("УправлениеДатамиЗапретаРедактирования")
    private boolean manageDatesForBanEditing;
    @JsonProperty("DataVersion")
    private String dataVersion;
    @JsonProperty("ВалютаУправленческогоУчета_Key")
    private String currencyManagementAccount_Key;
    @JsonProperty("Сервер_Key")
    private String server_Key;
    @JsonProperty("Ref_Key")
    private String ref_Key;
    @JsonProperty("Сервер@navigationLinkUrl")
    private String serverNavigationLinkUrl;
    @JsonProperty("ВалютаУправленческогоУчета@navigationLinkUrl")
    private String currencyManagementAccountNavigationLinkUrl;


}
