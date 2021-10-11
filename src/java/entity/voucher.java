/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Dell Inc
 */
public class voucher {
    int codeID,
            UserID;
    String code;
    int existTime;
    int discount;

    public voucher() {
    }

    public voucher(int codeID, int UserID, String code, int existTime, int discount) {
        this.codeID = codeID;
        this.UserID = UserID;
        this.code = code;
        this.existTime = existTime;
        this.discount = discount;
    }

    public int getCodeID() {
        return codeID;
    }

    public void setCodeID(int codeID) {
        this.codeID = codeID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getExistTime() {
        return existTime;
    }

    public void setExistTime(int existTime) {
        this.existTime = existTime;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "voucher{" + "codeID=" + codeID + ", UserID=" + UserID + ", code=" + code + ", existTime=" + existTime + ", discount=" + discount + '}';
    }
    
}
