package main.java.example.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 212607215 on 12/8/2017.
 */
public class ReceivablesCycle implements Serializable{
    private Long cycleId;
    private String payor;
    private String payee;
    private String recordType;
    private String accountTypeCd;
    private String transactionQualifierCd;
    private Integer allowedMonth;
    private Integer earnedMonth;
    private String accountDescriptionCd;
    private String stateTaxCd;
    private String equipmentInitial;
    private String equipmentNumber;
    private String aarEquipmentType;
    private String referenceNumberQualifier;
    private String referenceNumber;
    private String referenceDescription;
    private String rateSource;
//    private String rateType;
    private Double timeRate;
    private Double mileRate;
    private Double appurtenanceRate;
    private Integer begDate;
    private Integer begHour;
    private Date begDateAndTime;
    private String begSplc;
    private String begRoad;
    private Integer endDate;
    private Integer endHour;
    private Date endDateAndTime;
    private String endSplc;
    private String endRoad;
    private Integer aarPoolCd;
    private String contractRefNumQualifer;
    private String contractRegAgencyCd;
    private String contractScac;
    private String issuingCarrierIdentifier;
    private String contractNumber;
    private String contractSuffix;
    private Date contractEffectiveDate;
    private Date contractExpirationDate;
    private String cycleStatusCd;
    private String payCode;
    private String carTypeGroupCd;
    private String timeIndicator;
    private Integer timeUnits;
    private String mileageSettlementCd;
    private Integer loadedMiles;
    private Integer emptyMiles;
    private Double totalAmount;
    private Double timeAmount;
    private Double mileAmount;
    private Double appurtenanceAmount;
    private Double penaltyAmount;
    private String penaltyCd;
    private Date createdOn;
    private String createdBy;
    private Date lastUpdatedOn;
    private String lastUpdatedBy;
    private String notes;
    private Boolean override;
    private String dataSource;

    public Long getCycleId() {
        return cycleId;
    }

    public void setCycleId(Long cycleId) {
        this.cycleId = cycleId;
    }

    public String getPayor() {
        return payor;
    }

    public void setPayor(String payor) {
        this.payor = payor;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getAccountTypeCd() {
        return accountTypeCd;
    }

    public void setAccountTypeCd(String accountTypeCd) {
        this.accountTypeCd = accountTypeCd;
    }

    public String getTransactionQualifierCd() {
        return transactionQualifierCd;
    }

    public void setTransactionQualifierCd(String transactionQualifierCd) {
        this.transactionQualifierCd = transactionQualifierCd;
    }

    public Integer getAllowedMonth() {
        return allowedMonth;
    }

    public void setAllowedMonth(Integer allowedMonth) {
        this.allowedMonth = allowedMonth;
    }

    public Integer getEarnedMonth() {
        return earnedMonth;
    }

    public void setEarnedMonth(Integer earnedMonth) {
        this.earnedMonth = earnedMonth;
    }

    public String getAccountDescriptionCd() {
        return accountDescriptionCd;
    }

    public void setAccountDescriptionCd(String accountDescriptionCd) {
        this.accountDescriptionCd = accountDescriptionCd;
    }

    public String getStateTaxCd() {
        return stateTaxCd;
    }

    public void setStateTaxCd(String stateTaxCd) {
        this.stateTaxCd = stateTaxCd;
    }

    public String getEquipmentInitial() {
        return equipmentInitial;
    }

    public void setEquipmentInitial(String equipmentInitial) {
        this.equipmentInitial = equipmentInitial;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getAarEquipmentType() {
        return aarEquipmentType;
    }

    public void setAarEquipmentType(String aarEquipmentType) {
        this.aarEquipmentType = aarEquipmentType;
    }

    public String getReferenceNumberQualifier() {
        return referenceNumberQualifier;
    }

    public void setReferenceNumberQualifier(String referenceNumberQualifier) {
        this.referenceNumberQualifier = referenceNumberQualifier;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getReferenceDescription() {
        return referenceDescription;
    }

    public void setReferenceDescription(String referenceDescription) {
        this.referenceDescription = referenceDescription;
    }

    public String getRateSource() {
        return rateSource;
    }

    public void setRateSource(String rateSource) {
        this.rateSource = rateSource;
    }

//    public String getRateType() {
//        return rateType;
//    }
//
//    public void setRateType(String rateType) {
//        this.rateType = rateType;
//    }

    public Double getTimeRate() {
        return timeRate;
    }

    public void setTimeRate(Double timeRate) {
        this.timeRate = timeRate;
    }

    public Double getMileRate() {
        return mileRate;
    }

    public void setMileRate(Double mileRate) {
        this.mileRate = mileRate;
    }

    public Double getAppurtenanceRate() {
        return appurtenanceRate;
    }

    public void setAppurtenanceRate(Double appurtenanceRate) {
        this.appurtenanceRate = appurtenanceRate;
    }

    public Integer getBegDate() {
        return begDate;
    }

    public void setBegDate(Integer begDate) {
        this.begDate = begDate;
    }

    public Integer getBegHour() {
        return begHour;
    }

    public void setBegHour(Integer begHour) {
        this.begHour = begHour;
    }

    public Date getBegDateAndTime() {
        return this.begDateAndTime == null ? null : (Date)this.begDateAndTime.clone();
    }

    public void setBegDateAndTime(Date begDateAndTime) {
        this.begDateAndTime = (begDateAndTime == null ? null : (Date)begDateAndTime.clone());
    }

    public String getBegSplc() {
        return begSplc;
    }

    public void setBegSplc(String begSplc) {
        this.begSplc = begSplc;
    }

    public String getBegRoad() {
        return begRoad;
    }

    public void setBegRoad(String begRoad) {
        this.begRoad = begRoad;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    public Date getEndDateAndTime() {
        return this.endDateAndTime == null ? null : (Date)this.endDateAndTime.clone();
    }

    public void setEndDateAndTime(Date endDateAndTime) {
        this.endDateAndTime = (endDateAndTime == null ? null : (Date)endDateAndTime.clone());
    }

    public String getEndSplc() {
        return endSplc;
    }

    public void setEndSplc(String endSplc) {
        this.endSplc = endSplc;
    }

    public String getEndRoad() {
        return endRoad;
    }

    public void setEndRoad(String endRoad) {
        this.endRoad = endRoad;
    }

    public Integer getAarPoolCd() {
        return aarPoolCd;
    }

    public void setAarPoolCd(Integer aarPoolCd) {
        this.aarPoolCd = aarPoolCd;
    }

    public String getContractRefNumQualifer() {
        return contractRefNumQualifer;
    }

    public void setContractRefNumQualifer(String contractRefNumQualifer) {
        this.contractRefNumQualifer = contractRefNumQualifer;
    }

    public String getContractRegAgencyCd() {
        return contractRegAgencyCd;
    }

    public void setContractRegAgencyCd(String contractRegAgencyCd) {
        this.contractRegAgencyCd = contractRegAgencyCd;
    }

    public String getContractScac() {
        return contractScac;
    }

    public void setContractScac(String contractScac) {
        this.contractScac = contractScac;
    }

    public String getIssuingCarrierIdentifier() {
        return issuingCarrierIdentifier;
    }

    public void setIssuingCarrierIdentifier(String issuingCarrierIdentifier) {
        this.issuingCarrierIdentifier = issuingCarrierIdentifier;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractSuffix() {
        return contractSuffix;
    }

    public void setContractSuffix(String contractSuffix) {
        this.contractSuffix = contractSuffix;
    }

    public Date getContractEffectiveDate() {
        return this.contractEffectiveDate == null ? null : (Date)this.contractEffectiveDate.clone();
    }

    public void setContractEffectiveDate(Date contractEffectiveDate) {
        this.contractEffectiveDate = (contractEffectiveDate == null ? null : (Date)contractEffectiveDate.clone());
    }

    public Date getContractExpirationDate() {
        return this.contractExpirationDate == null ? null : (Date)this.contractExpirationDate.clone();
    }

    public void setContractExpirationDate(Date contractExpirationDate) {
        this.contractExpirationDate = (contractExpirationDate == null ? null : (Date)contractExpirationDate.clone());
    }

    public String getCycleStatusCd() {
        return cycleStatusCd;
    }

    public void setCycleStatusCd(String cycleStatusCd) {
        this.cycleStatusCd = cycleStatusCd;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getCarTypeGroupCd() {
        return carTypeGroupCd;
    }

    public void setCarTypeGroupCd(String carTypeGroupCd) {
        this.carTypeGroupCd = carTypeGroupCd;
    }

    public String getTimeIndicator() {
        return timeIndicator;
    }

    public void setTimeIndicator(String timeIndicator) {
        this.timeIndicator = timeIndicator;
    }

    public Integer getTimeUnits() {
        return timeUnits;
    }

    public void setTimeUnits(Integer timeUnits) {
        this.timeUnits = timeUnits;
    }

    public String getMileageSettlementCd() {
        return mileageSettlementCd;
    }

    public void setMileageSettlementCd(String mileageSettlementCd) {
        this.mileageSettlementCd = mileageSettlementCd;
    }

    public Integer getLoadedMiles() {
        return loadedMiles;
    }

    public void setLoadedMiles(Integer loadedMiles) {
        this.loadedMiles = loadedMiles;
    }

    public Integer getEmptyMiles() {
        return emptyMiles;
    }

    public void setEmptyMiles(Integer emptyMiles) {
        this.emptyMiles = emptyMiles;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(Double timeAmount) {
        this.timeAmount = timeAmount;
    }

    public Double getMileAmount() {
        return mileAmount;
    }

    public void setMileAmount(Double mileAmount) {
        this.mileAmount = mileAmount;
    }

    public Double getAppurtenanceAmount() {
        return appurtenanceAmount;
    }

    public void setAppurtenanceAmount(Double appurtenanceAmount) {
        this.appurtenanceAmount = appurtenanceAmount;
    }

    public Double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(Double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public String getPenaltyCd() {
        return penaltyCd;
    }

    public void setPenaltyCd(String penaltyCd) {
        this.penaltyCd = penaltyCd;
    }

    public Date getCreatedOn() {
        return this.createdOn == null ? null : (Date)this.createdOn.clone();
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = (createdOn == null ? null : (Date)createdOn.clone());
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdatedOn() {
        return this.lastUpdatedOn == null ? null : (Date)this.lastUpdatedOn.clone();
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = (lastUpdatedOn == null ? null : (Date)lastUpdatedOn.clone());
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        StringBuffer desc = new StringBuffer();
        desc.append("\tpayor= " + payor +
                "\n\t payee='" + payee +
                "\n\t recordType='" + recordType +
                "\n\t accountTypeCd='" + accountTypeCd +
                "\n\t transactionQualifierCd='" + transactionQualifierCd +
                "\n\t allowedMonth=" + allowedMonth +
                "\n\t earnedMonth=" + earnedMonth +
                "\n\t accountDescriptionCd='" + accountDescriptionCd +
                "\n\t stateTaxCd='" + stateTaxCd +
                "\n\t equipmentInitial='" + equipmentInitial +
                "\n\t equipmentNumber='" + equipmentNumber +
                "\n\t aarEquipmentType='" + aarEquipmentType +
                "\n\t referenceNumberQualifier='" + referenceNumberQualifier +
                "\n\t referenceNumber='" + referenceNumber +
                "\n\t referenceDescription='" + referenceDescription +
                "\n\t rateSource='" + rateSource +
                "\n\t timeRate=" + timeRate +
                "\n\t mileRate=" + mileRate +
                "\n\t appurtenanceRate=" + appurtenanceRate +
                "\n\t begDate=" + begDate +
                "\n\t begHour=" + begHour +
                "\n\t begDateAndTime=" + begDateAndTime +
                "\n\t begSplc='" + begSplc +
                "\n\t begRoad='" + begRoad +
                "\n\t endDate=" + endDate +
                "\n\t endHour=" + endHour +
                "\n\t endDateAndTime=" + endDateAndTime +
                "\n\t endSplc='" + endSplc +
                "\n\t endRoad='" + endRoad +
                "\n\t aarPoolCd=" + aarPoolCd +
                "\n\t contractRefNumQualifer='" + contractRefNumQualifer +
                "\n\t contractRegAgencyCd='" + contractRegAgencyCd +
                "\n\t contractScac='" + contractScac +
                "\n\t issuingCarrierIdentifier='" + issuingCarrierIdentifier +
                "\n\t contractNumber='" + contractNumber +
                "\n\t contractSuffix='" + contractSuffix +
                "\n\t contractEffectiveDate=" + contractEffectiveDate +
                "\n\t contractExpirationDate=" + contractExpirationDate +
                "\n\t cycleStatusCd='" + cycleStatusCd +
                "\n\t payCode='" + payCode +
                "\n\t carTypeGroupCd='" + carTypeGroupCd +
                "\n\t timeIndicator='" + timeIndicator +
                "\n\t timeUnits=" + timeUnits +
                "\n\t mileageSettlementCd='" + mileageSettlementCd +
                "\n\t loadedMiles=" + loadedMiles +
                "\n\t emptyMiles=" + emptyMiles +
                "\n\t totalAmount=" + totalAmount +
                "\n\t timeAmount=" + timeAmount +
                "\n\t mileAmount=" + mileAmount +
                "\n\t appurtenanceAmount=" + appurtenanceAmount +
                "\n\t penaltyAmount=" + penaltyAmount +
                "\n\t penaltyCd='" + penaltyCd +
                "\n\t createdOn=" + createdOn +
                "\n\t createdBy='" + createdBy +
                "\n\t lastUpdatedOn=" + lastUpdatedOn +
                "\n\t lastUpdatedBy='" + lastUpdatedBy +
                "\n\t notes='" + notes +
                "\n\t override=" + override +
                "\n\t dataSource='" + dataSource
        );

        return desc.toString();
    }
}
