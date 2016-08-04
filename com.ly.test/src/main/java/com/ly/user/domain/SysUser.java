package com.ly.user.domain;

import java.util.Date;

public class SysUser {
    private Integer sysUserId;

    private Double buyTotalAmount;

    private Integer buyerTotalRating;

    private String isAdmin;

    private String isCompleteUserInf;

    private String isDelete;

    private String isEmailActivate;

    private Date lastBuyTime;

    private Date lastPswMistakeTime;

    private Date lastPswModifyTime;

    private String loginId;

    private String oauthUserId;

    private Integer regOrgId;

    private Date registerDate;

    private Integer remainPswMistakeTimes;

    private String userEmail;

    private Integer userGradeLevelId;

    private String userIcon;

    private String userMobile;

    private String userName;

    private String userPsw;

    private String userSexCode;

    private String userSourceCode;

    private String userStatCode;

    private String userTag;

    private String userTel;

    private String cardNo;

    private String idCard;

    private String vUserId;

    private String vUserName;

    private String isExpUser;

    private String userExpName;

    private String userBatchId;

    private String isActivate;

    private String isSxFlag;

    private String sxUserLevel;

    private String upperUserId;

    private Integer entId;

    private String obkMemstate;

    private String uptmp;

    private String yptFlag;

    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Double getBuyTotalAmount() {
        return buyTotalAmount;
    }

    public void setBuyTotalAmount(Double buyTotalAmount) {
        this.buyTotalAmount = buyTotalAmount;
    }

    public Integer getBuyerTotalRating() {
        return buyerTotalRating;
    }

    public void setBuyerTotalRating(Integer buyerTotalRating) {
        this.buyerTotalRating = buyerTotalRating;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    public String getIsCompleteUserInf() {
        return isCompleteUserInf;
    }

    public void setIsCompleteUserInf(String isCompleteUserInf) {
        this.isCompleteUserInf = isCompleteUserInf == null ? null : isCompleteUserInf.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getIsEmailActivate() {
        return isEmailActivate;
    }

    public void setIsEmailActivate(String isEmailActivate) {
        this.isEmailActivate = isEmailActivate == null ? null : isEmailActivate.trim();
    }

    public Date getLastBuyTime() {
        return lastBuyTime;
    }

    public void setLastBuyTime(Date lastBuyTime) {
        this.lastBuyTime = lastBuyTime;
    }

    public Date getLastPswMistakeTime() {
        return lastPswMistakeTime;
    }

    public void setLastPswMistakeTime(Date lastPswMistakeTime) {
        this.lastPswMistakeTime = lastPswMistakeTime;
    }

    public Date getLastPswModifyTime() {
        return lastPswModifyTime;
    }

    public void setLastPswModifyTime(Date lastPswModifyTime) {
        this.lastPswModifyTime = lastPswModifyTime;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getOauthUserId() {
        return oauthUserId;
    }

    public void setOauthUserId(String oauthUserId) {
        this.oauthUserId = oauthUserId == null ? null : oauthUserId.trim();
    }

    public Integer getRegOrgId() {
        return regOrgId;
    }

    public void setRegOrgId(Integer regOrgId) {
        this.regOrgId = regOrgId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getRemainPswMistakeTimes() {
        return remainPswMistakeTimes;
    }

    public void setRemainPswMistakeTimes(Integer remainPswMistakeTimes) {
        this.remainPswMistakeTimes = remainPswMistakeTimes;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserGradeLevelId() {
        return userGradeLevelId;
    }

    public void setUserGradeLevelId(Integer userGradeLevelId) {
        this.userGradeLevelId = userGradeLevelId;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    public String getUserSexCode() {
        return userSexCode;
    }

    public void setUserSexCode(String userSexCode) {
        this.userSexCode = userSexCode == null ? null : userSexCode.trim();
    }

    public String getUserSourceCode() {
        return userSourceCode;
    }

    public void setUserSourceCode(String userSourceCode) {
        this.userSourceCode = userSourceCode == null ? null : userSourceCode.trim();
    }

    public String getUserStatCode() {
        return userStatCode;
    }

    public void setUserStatCode(String userStatCode) {
        this.userStatCode = userStatCode == null ? null : userStatCode.trim();
    }

    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag == null ? null : userTag.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getvUserId() {
        return vUserId;
    }

    public void setvUserId(String vUserId) {
        this.vUserId = vUserId == null ? null : vUserId.trim();
    }

    public String getvUserName() {
        return vUserName;
    }

    public void setvUserName(String vUserName) {
        this.vUserName = vUserName == null ? null : vUserName.trim();
    }

    public String getIsExpUser() {
        return isExpUser;
    }

    public void setIsExpUser(String isExpUser) {
        this.isExpUser = isExpUser == null ? null : isExpUser.trim();
    }

    public String getUserExpName() {
        return userExpName;
    }

    public void setUserExpName(String userExpName) {
        this.userExpName = userExpName == null ? null : userExpName.trim();
    }

    public String getUserBatchId() {
        return userBatchId;
    }

    public void setUserBatchId(String userBatchId) {
        this.userBatchId = userBatchId == null ? null : userBatchId.trim();
    }

    public String getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(String isActivate) {
        this.isActivate = isActivate == null ? null : isActivate.trim();
    }

    public String getIsSxFlag() {
        return isSxFlag;
    }

    public void setIsSxFlag(String isSxFlag) {
        this.isSxFlag = isSxFlag == null ? null : isSxFlag.trim();
    }

    public String getSxUserLevel() {
        return sxUserLevel;
    }

    public void setSxUserLevel(String sxUserLevel) {
        this.sxUserLevel = sxUserLevel == null ? null : sxUserLevel.trim();
    }

    public String getUpperUserId() {
        return upperUserId;
    }

    public void setUpperUserId(String upperUserId) {
        this.upperUserId = upperUserId == null ? null : upperUserId.trim();
    }

    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    public String getObkMemstate() {
        return obkMemstate;
    }

    public void setObkMemstate(String obkMemstate) {
        this.obkMemstate = obkMemstate == null ? null : obkMemstate.trim();
    }

    public String getUptmp() {
        return uptmp;
    }

    public void setUptmp(String uptmp) {
        this.uptmp = uptmp == null ? null : uptmp.trim();
    }

    public String getYptFlag() {
        return yptFlag;
    }

    public void setYptFlag(String yptFlag) {
        this.yptFlag = yptFlag == null ? null : yptFlag.trim();
    }
}