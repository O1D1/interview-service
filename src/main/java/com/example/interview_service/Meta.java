package com.example.interview_service;

public class Meta {
    private String createdAt;
    private String updatedAt;
    private String barcode;
    private String qrCode;

    //Getter und Setter
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }
    public String getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }
    public String getBarcode(){
        return barcode;
    }
    public void setBarcode(String barcode){
        this.barcode = barcode;
    }
    public String getQrCode(){
        return qrCode;
    }
    public void setQrCode(String qrCode){
        this.qrCode = qrCode;
    }
}
