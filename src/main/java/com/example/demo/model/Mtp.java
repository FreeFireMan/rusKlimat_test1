package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;



import java.util.List;

@Data
public class Mtp {

    @JsonProperty("odata.metadata")
    private String metadata;
    @JsonProperty("Архивный")
    private Boolean arhiv;
    private String PredefinedDataName;
    @JsonProperty("Марка_Key")
    private String marka_key;
    @JsonProperty("КоэффициентПересчетаОбъема")
    private int cofiPerVolume;
    @JsonProperty("ОбязательныеВидыСертификационныхДокументов")
    private List<ObjectNode> obViduSertifDocum;
    @JsonProperty("ОсновноеИзображение_Key")
            private String osnovIzobr_Key;
    @JsonProperty("Комплектующие")
            private List<ObjectNode> komplect;
    private boolean DeletionMark;
    @JsonProperty("ИдентификаторИсточника")
            private String indifikator;
    private String Description;
    @JsonProperty("СтранаПроисхождения_Key")
            private String stranaProizh_Key;
    @JsonProperty("КодТН_ВЭД_Key")
            private String kodTN_VED_Key;
    @JsonProperty("Описание")
    private String opisanie;
    @JsonProperty("ОсновнаяЕдиницаИзмерения_Key")
    private String oosnovEdinicaIzmer_Key;
    @JsonProperty("ТипПозиции")
    private String typePosition;
    @JsonProperty("РегистрацияНаСайтах")
    private List<ObjectNode> registrationOnSites;
    @JsonProperty("ИБВладелец_Key")
    private String IBVladelec_Key;
    @JsonProperty("НаименованиеОтПроизводителяАнгл")
    private String NaimenovOtProizvoditelya;
    @JsonProperty("Оригинал_Key")
    private String original_Key;
    @JsonProperty("Кратность")
    private String cratnost;
    @JsonProperty("ОбъемБольшеПаллеты")
    private boolean volumeBigPallet;
    @JsonProperty("ПолноеНаименование")
    private String fullName;
    @JsonProperty("АктуальнаяНоменклатура_Key")
    private String CarrentNomenklature_Key;
    private boolean Predefined;
    @JsonProperty("ДополнительнаяКлассификация")
    private List<ObjectNode> dopClassification;
    @JsonProperty("ВстроенныеОпции")
    private List<ObjectNode> includesOption;
    @JsonProperty("ЕдиницаХраненияОстатков_Key")
    private String edinicaHraneniyaOstatkov_Key;
    @JsonProperty("НеКонтролироватьСертификат")
    private boolean noControllSertification;
    @JsonProperty("НаименованиеСЦ")
    private String nameSC;
    @JsonProperty("ПредварительнаяКарточка")
    private boolean previewCard;
    @JsonProperty("ТранспортнаяУпаковка_Key")
    private String transportPakage_Key;
    @JsonProperty("Характеристики")
    private List<ObjectNode> Specifications;
    @JsonProperty("ЭтоМакет")
    private boolean thisMaket;
    @JsonProperty("СтатьяЗатрат_Key")
    private String stateZatrat_Key;
    @JsonProperty("СтавкаНДС_Key")
    private String stavkaNDS_Key;
    @JsonProperty("ИспользоватьНаСайтах")
    private boolean usingOnSites;
    @JsonProperty("ГарантийныеСроки")
    private List<ObjectNode> warrantyRange;
    @JsonProperty("Категории")
    private List<ObjectNode> categories;
    @JsonProperty("Материал")
    private String material;
    @JsonProperty("НаименованиеОтПроизводителяРус")
    private String namefromVendorRus;
    @JsonProperty("Производитель_Key")
    private String vendor_Key;
    @JsonProperty("БазаИсточник_Key")
    private String baseSourse_Key;
    @JsonProperty("ОсновнаяКлассификация")
    private List<ObjectNode> mainClassificaion;
    @JsonProperty("НоменклатураСоВстроеннымиОпциями")
    private boolean nomenclatureWithBuiltInOption;
    @JsonProperty("ДатаРедактирования")
    private String dateEditing;
    @JsonProperty("ЭталоннаяПозиция_Key")
    private String referencePosition_Key;
    @JsonProperty("ПределШтабелирования")
    private int limitPile;
    private String DataVersion;
    @JsonProperty("Автор_Key")
    private String Author_Key;
    @JsonProperty("АртикулПроизводителя")
    private String articleManufacture;
    @JsonProperty("ТипЗаказногоОборудования")
    private String typeOfCustomEquipment;
    @JsonProperty("ВводВАМ")
    private boolean enterVAM;
    @JsonProperty("СрокСлужбы")
    private String lifeTime;
    @JsonProperty("КлассификацияДляСайтов")
    private List<ObjectNode> ClasificationForSites;
    @JsonProperty("Комплект")
    private boolean kit;
    @JsonProperty("Запчасть")
    private boolean sparePart;
    @JsonProperty("КонтрольСерийныхНомеров")
    private boolean controlSerialNumber;
    @JsonProperty("ПродажаЗапрещена")
    private boolean saleProhibited;
    @JsonProperty("ДополнительныеРеквизиты")
    private List<ObjectNode> additionalDetails;
    @JsonProperty("ЕдиницаОтчетов_Key")
    private String unitReport_Key;
    @JsonProperty("ВидНоменклатуры")
    private String formnomenclature;
    @JsonProperty("ДатаСоздания")
    private String dateCreate;
    @JsonProperty("Бесплатный")
    private boolean free;
    private String Code;
    @JsonProperty("БазоваяЕИ_Key")
    private  String baseEI_Key;
    @JsonProperty("Штрихкоды")
    private List<ObjectNode> barcodes;
    @JsonProperty("Артикул")
    private String article;
    @JsonProperty("ОсновнаяНоменклатура_Key")
    private String primaryNomenclature_Key;
    @JsonProperty("Комментарий")
    private String Comment;
    @JsonProperty("ИндивидуальнаяУпаковка_Key")
    private String individualPacking_Key;
    @JsonProperty("Редактор_Key")
    private String editor_Key;
    @JsonProperty("ЗаписьНеНормализуема")
    private boolean recordNotNormalized;
    @JsonProperty("Модель")
    private String model;
    @JsonProperty("ЕстьАналоги")
    private boolean thereAreAnalogs;
    private String Ref_Key;
    @JsonProperty("ТранспортнаяУпаковка@navigationLinkUrl")
    private String transportPackagingNavigationLinkUrl;
    @JsonProperty("БазаИсточник@navigationLinkUrl")
    private String baseSourseNavigationLinkUrl;
    @JsonProperty("Марка@navigationLinkUrl")
    private String markNavigationLinkUrl;
    @JsonProperty("Автор@navigationLinkUrl")
    private String authorNavigationLinkUrl;
    @JsonProperty("ЕдиницаХраненияОстатков@navigationLinkUrl")
    private String unitStoregeResiduesNavigationLinkUrl;
    @JsonProperty("ИБВладелец@navigationLinkUrl")
    private String ownerIBNavigationLinkUrl;
    @JsonProperty("Редактор@navigationLinkUrl")
    private String editorNavigationLinkUrl;
    @JsonProperty("ОсновнаяЕдиницаИзмерения@navigationLinkUrl")
    private String primaryUnitNavigationLinkUrl;
    @JsonProperty("БазоваяЕИ@navigationLinkUrl")
    private String baseEINavigationLinkUrl;
    @JsonProperty("ИндивидуальнаяУпаковка@navigationLinkUrl")
    private String individualPackiungNavigationLinkUrl;
    @JsonProperty("ЕдиницаОтчетов@navigationLinkUrl")
    private String unitReportNavigationLinkUrl;
    @JsonProperty("СтавкаНДС@navigationLinkUrl")
    private String rateVATNavigationLinkUrl;









}
