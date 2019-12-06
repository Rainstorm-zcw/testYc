package com.example.testyc.persistence.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class TWlStoreInfo implements Serializable {
    /**
     * 管理号
     */
    @ApiModelProperty("管理号")
    private String guid;

    /**
     * 仓库名称（公司名称）
     */
    @ApiModelProperty("仓库名称（公司名称）")
    private String storeName;

    /**
     * 仓库代码（公司流水代码）
     */
    @ApiModelProperty("仓库代码（公司流水代码）")
    private String storeCode;

    /**
     * 信息状态：00冻结 10待审核 15审核拒绝 20审核通过
     */
    @ApiModelProperty("信息状态：00冻结 10待审核 15审核拒绝 20审核通过")
    private String infoStatus;

    /**
     * WMS仓库代码
     */
    @ApiModelProperty("WMS仓库代码")
    private String wmsDeptId;

    /**
     * 仓库简称
     */
    @ApiModelProperty("仓库简称")
    private String storeShortName;

    /**
     * 联系人
     */
    @ApiModelProperty("联系人")
    private String storeContactPerson;

    /**
     * 联系人电话
     */
    @ApiModelProperty("联系人电话")
    private String storeContactPnone;

    /**
     * 省
     */
    @ApiModelProperty("省")
    private String addressProvince;

    /**
     * 市
     */
    @ApiModelProperty("市")
    private String addressCity;

    /**
     * 区
     */
    @ApiModelProperty("区")
    private String addressArea;

    /**
     * 仓库地址
     */
    @ApiModelProperty("仓库地址")
    private String storeAddress;

    /**
     * 邮政编码
     */
    @ApiModelProperty("邮政编码")
    private String storePostalCode;

    /**
     * 公司简介
     */
    @ApiModelProperty("公司简介")
    private String companyProfile;

    /**
     * 仓库特色描述（json str形式存储）
     */
    @ApiModelProperty("仓库特色描述（json str形式存储）")
    private String storeFeatureDesc;

    /**
     * 法人
     */
    @ApiModelProperty("法人")
    private String storeArtificialPerson;

    /**
     * 注册资金（万元）
     */
    @ApiModelProperty("注册资金（万元）")
    private String registeredCapital;

    /**
     * 仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）
     */
    @ApiModelProperty("仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）")
    private String workScope;

    /**
     * 主要设备（json str形式存储）
     */
    @ApiModelProperty("主要设备（json str形式存储）")
    private String mainDevice;

    /**
     * 仓储费用描述（冗余字段）
     */
    @ApiModelProperty("仓储费用描述（冗余字段）")
    private String storePriceDesc;

    /**
     * 仓储费用（元/天/吨）
     */
    @ApiModelProperty("仓储费用（元/天/吨）")
    private Double storePrice;

    /**
     * 短驳费（元/吨）
     */
    @ApiModelProperty("短驳费（元/吨）")
    private Double storeShortPrice;

    /**
     * 吊费（元/吨）
     */
    @ApiModelProperty("吊费（元/吨）")
    private Double storeLiftingPrice;

    /**
     * 仓内面积（平方）
     */
    @ApiModelProperty("仓内面积（平方）")
    private Double storeInnerArea;

    /**
     * 外仓面积（平方/亩）
     */
    @ApiModelProperty("外仓面积（平方/亩）")
    private Double storeOuterArea;

    /**
     * 库容量（万吨）
     */
    @ApiModelProperty("库容量（万吨）")
    private Double storeCapability;

    /**
     * 仓储能力描述
     */
    @ApiModelProperty("仓储能力描述")
    private String storeCapabilityDesc;

    /**
     * 设备描述（存放设备的文字描述）
     */
    @ApiModelProperty("设备描述（存放设备的文字描述）")
    private String equipmentDesc;

    /**
     * 资质认证描述
     */
    @ApiModelProperty("资质认证描述")
    private String qualificationDesc;

    /**
     * 是否提供加工服务，0：不提供，1：提供
     */
    @ApiModelProperty("是否提供加工服务，0：不提供，1：提供")
    private String procFlag;

    /**
     * 加工业务描述
     */
    @ApiModelProperty("加工业务描述")
    private String procBizDesc;

    /**
     * 宝盈通系统使用，0：不使用，1：使用，2：使用其他系统
     */
    @ApiModelProperty("宝盈通系统使用，0：不使用，1：使用，2：使用其他系统")
    private String baosaasFlag;

    /**
     * 其他业务系统描述
     */
    @ApiModelProperty("其他业务系统描述")
    private String otherSysDesc;

    /**
     * 欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）
     */
    @ApiModelProperty("欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）")
    private String oyAlliance;

    /**
     * 包装类型
     */
    @ApiModelProperty("包装类型")
    private String coverType;

    /**
     * 平面图
     */
    @ApiModelProperty("平面图")
    private String planeMap;

    /**
     * 传真
     */
    @ApiModelProperty("传真")
    private String fax;

    /**
     * 当前所在位置的经度，单位为度，[‐180,180]
     */
    @ApiModelProperty("当前所在位置的经度，单位为度，[‐180,180]")
    private Double lng;

    /**
     * 当前所在位置的纬度，单位为度，[‐84,84]
     */
    @ApiModelProperty("当前所在位置的纬度，单位为度，[‐84,84]")
    private Double lat;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 数据信息来源：1为用户发布 2为平台录入
     */
    @ApiModelProperty("数据信息来源：1为用户发布 2为平台录入")
    private String infoSource;

    /**
     * 数据有效标志
     */
    @ApiModelProperty("数据有效标志")
    private String aliveFlag;

    /**
     * 创建日期
     */
    @ApiModelProperty("创建日期")
    private Date createDate;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String createPerson;

    /**
     * 修改日期
     */
    @ApiModelProperty("修改日期")
    private Date modiDate;

    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private String modiPerson;

    /**
     * 仓库关注度，仓库详情页每被点击一次，此字段+1
     */
    @ApiModelProperty("仓库关注度，仓库详情页每被点击一次，此字段+1")
    private Long attentionDegree;

    /**
     * 公司标签，半角逗号分隔的字符串
     */
    @ApiModelProperty("公司标签，半角逗号分隔的字符串")
    private String companyLabel;

    /**
     * 图片地址
     */
    @ApiModelProperty("图片地址")
    private String imgpath;

    /**
     * 主营业务（主营品种）
     */
    @ApiModelProperty("主营业务（主营品种）")
    private String mainBusiness;

    /**
     * 头像路径（只存后缀）
     */
    @ApiModelProperty("头像路径（只存后缀）")
    private String headImgPath;

    /**
     * 加工类型（以半角逗号分隔的中文形式存储）
     */
    @ApiModelProperty("加工类型（以半角逗号分隔的中文形式存储）")
    private String procScope;

    /**
     * 到达最近高速路时间，单位为分钟
     */
    @ApiModelProperty("到达最近高速路时间，单位为分钟")
    private Double highwayTimes;

    /**
     * 到达最近铁路的时间，单位为分钟
     */
    @ApiModelProperty("到达最近铁路的时间，单位为分钟")
    private Double railwayTimes;

    /**
     * 到达最近码头的时间，单位为小时
     */
    @ApiModelProperty("到达最近码头的时间，单位为小时")
    private Double waterwayTimes;

    /**
     * 附近的餐馆，单位为个
     */
    @ApiModelProperty("附近的餐馆，单位为个")
    private Integer eatery;

    /**
     * 附近快餐厅，单位为个
     */
    @ApiModelProperty("附近快餐厅，单位为个")
    private Integer snack;

    /**
     * 附近加油站，单位为个
     */
    @ApiModelProperty("附近加油站，单位为个")
    private Integer gasStation;

    /**
     * 附近修车行，单位为个
     */
    @ApiModelProperty("附近修车行，单位为个")
    private Integer repair;

    /**
     * 附近宾馆，单位为个
     */
    @ApiModelProperty("附近宾馆，单位为个")
    private Integer hotel;

    /**
     * 附近快捷酒店，单位为个
     */
    @ApiModelProperty("附近快捷酒店，单位为个")
    private Integer expressHotel;

    /**
     * 公司类型：10仓库 20货主 30 平台方
     */
    @ApiModelProperty("公司类型：10仓库 20货主 30 平台方")
    private String commanyType;

    /**
     * WMS货主代码
     */
    @ApiModelProperty("WMS货主代码")
    private String wmsOwnerId;

    /**
     * 公司邮箱地址
     */
    @ApiModelProperty("公司邮箱地址")
    private String commanyEmail;

    /**
     * 公司开票结算银行
     */
    @ApiModelProperty("公司开票结算银行")
    private String bank;

    /**
     * 公司开票结算银行帐号
     */
    @ApiModelProperty("公司开票结算银行帐号")
    private String accountBank;

    /**
     * 换单工作时间段
     */
    @ApiModelProperty("换单工作时间段")
    private String changeBillTime;

    /**
     * 装载工作时间段
     */
    @ApiModelProperty("装载工作时间段")
    private String loadCartTime;

    /**
     * 企业法人营业执照地址
     */
    @ApiModelProperty("企业法人营业执照地址")
    private String farenCertificate;

    /**
     * 组织机构代码证地址
     */
    @ApiModelProperty("组织机构代码证地址")
    private String zuzhiCertificate;

    /**
     * 税务登记证地址
     */
    @ApiModelProperty("税务登记证地址")
    private String shuiwuCertificate;

    /**
     * 统一认证的t_s_company表的comp_id
     */
    @ApiModelProperty("统一认证的t_s_company表的comp_id")
    private String companyId;

    /**
     * 资料来源
     */
    @ApiModelProperty("资料来源")
    private String fromSite;

    /**
     * 资料来源更新时间
     */
    @ApiModelProperty("资料来源更新时间")
    private Date siteUpdateDate;

    /**
     * 是否显示在云仓黄页上  1显示 0 不显示
     */
    @ApiModelProperty("是否显示在云仓黄页上  1显示 0 不显示")
    private String isShow;

    /**
     * 存放公司LOGO文件名
     */
    @ApiModelProperty("存放公司LOGO文件名")
    private String logoPath;

    /**
     * T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号
     */
    @ApiModelProperty("T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号")
    private String changeLogGuid;

    /**
     * 业务人员
     */
    @ApiModelProperty("业务人员")
    private String saleUserId;

    /**
     * 运营人员
     */
    @ApiModelProperty("运营人员")
    private String operateUserId;

    /**
     * 是否可以操作业务 N 无权限操作  Y 有权限操作
     */
    @ApiModelProperty("是否可以操作业务 N 无权限操作  Y 有权限操作")
    private String isOperateBusiness;

    /**
     * 是否拥有仓库身份:N否，Y是
     */
    @ApiModelProperty("是否拥有仓库身份:N否，Y是")
    private String storeSign;

    /**
     * 是否拥有货主身份:N否，Y是
     */
    @ApiModelProperty("是否拥有货主身份:N否，Y是")
    private String ownerSign;

    /**
     * 是否拥有平台身份:N否，Y是
     */
    @ApiModelProperty("是否拥有平台身份:N否，Y是")
    private String platformSign;

    /**
     * 公司别名，如果有多个，以英文半角逗号分隔
     */
    @ApiModelProperty("公司别名，如果有多个，以英文半角逗号分隔")
    private String nickStoreName;

    /**
     * 仓库授权委托书传真件 如果为1 则表示有 空则表示无
     */
    @ApiModelProperty("仓库授权委托书传真件 如果为1 则表示有 空则表示无")
    private String ycAuthorizationFax;

    /**
     * 仓库授权委托书原件  如果为1 则表示有 空则表示无
     */
    @ApiModelProperty("仓库授权委托书原件 如果为1 则表示有 空则表示无")
    private String ycAuthorizationTrue;

    /**
     * 统计入库量标记，1不统计，2统计
     */
    @ApiModelProperty("统计入库量标记，1不统计，2统计")
    private String putinAmount;

    /**
     * 统计加工量标记，1不统计，2统计
     */
    @ApiModelProperty("统计加工量标记，1不统计，2统计")
    private String processAmount;

    /**
     * 换单室联系人
     */
    @ApiModelProperty("换单室联系人")
    private String exchangePerson;

    /**
     * 换单室联系人电话
     */
    @ApiModelProperty("换单室联系人电话")
    private String exchangePhone;

    /**
     * 仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无
     */
    @ApiModelProperty("仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无")
    private String applicationFax;

    /**
     * 仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无
     */
    @ApiModelProperty("仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无")
    private String applicationTrue;

    /**
     * 是否在图片上添加战略合作库标记 如果为1则添加
     */
    @ApiModelProperty("是否在图片上添加战略合作库标记 如果为1则添加")
    private String cooperationFlag;

    /**
     * 仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    @ApiModelProperty("仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）")
    private String storeVirtualShelvesFlag;

    /**
     * 货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    @ApiModelProperty("货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）")
    private String ownerVirtualShelvesFlag;

    /**
     * 是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0
     */
    @ApiModelProperty("是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0")
    private String ifBindCap;

    /**
     * 服务须知是否显示
     */
    @ApiModelProperty("服务须知是否显示")
    private String notes;

    /**
     * 仓单须知显示（1.显示，0不显示）
     */
    @ApiModelProperty("仓单须知显示（1.显示，0不显示）")
    private String receiptNodes;

    /**
     * 货主云仓授权委托书传真件(空:没有，1:存在)
     */
    @ApiModelProperty("货主云仓授权委托书传真件(空:没有，1:存在)")
    private String tradeAuthorizationFax;

    /**
     * 货主云仓授权委托书原件(空:没有，1:存在)
     */
    @ApiModelProperty("货主云仓授权委托书原件(空:没有，1:存在)")
    private String tradeAuthorizationTrue;

    /**
     * 货主云仓无纸化传真件(空:没有，1:存在)
     */
    @ApiModelProperty("货主云仓无纸化传真件(空:没有，1:存在)")
    private String tradeApplicationFax;

    /**
     * 货主云仓无纸化原件(空:没有，1:存在)
     */
    @ApiModelProperty("货主云仓无纸化原件(空:没有，1:存在)")
    private String tradeApplicationTrue;

    /**
     * 税号
     */
    @ApiModelProperty("税号")
    private String taxNum;

    /**
     * 金融CAP客户id
     */
    @ApiModelProperty("金融CAP客户id")
    private String capOwnerId;

    /**
     * 经营法人全称
     */
    @ApiModelProperty("经营法人全称")
    private String legalFullName;

    /**
     * 营业执照名称
     */
    @ApiModelProperty("营业执照名称")
    private String busLicenceName;

    /**
     * T代码
     */
    @ApiModelProperty("T代码")
    private String tcode;

    /**
     * 代理仓储标记 0否 1是
     */
    @ApiModelProperty("代理仓储标记 0否 1是")
    private String agentStoreFlag;

    /**
     * 4级地址(街道)
     */
    @ApiModelProperty("4级地址(街道)")
    private String street;

    /**
     * 5级地址(门牌号)
     */
    @ApiModelProperty("5级地址(门牌号)")
    private String houseNumber;

    /**
     * 是否拥有加工厂身份:N否，Y是
     */
    @ApiModelProperty("是否拥有加工厂身份:N否，Y是")
    private String machingSign;

    /**
     * 是否拥有码头身份:N否，Y是
     */
    @ApiModelProperty("是否拥有码头身份:N否，Y是")
    private String wharfSign;

    /**
     * 是否拥有铁路身份:N否，Y是
     */
    @ApiModelProperty("是否拥有铁路身份:N否，Y是")
    private String railwaySign;

    /**
     * 是否拥有收货点身份:N否，Y是
     */
    @ApiModelProperty("是否拥有收货点身份:N否，Y是")
    private String receivingpointSign;

    /**
     * 台讯标志 0否，1是
     */
    @ApiModelProperty("台讯标志 0否，1是")
    private String taixunFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 管理号
     * @return GUID 管理号
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 管理号
     * @param guid 管理号
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * 仓库名称（公司名称）
     * @return STORE_NAME 仓库名称（公司名称）
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 仓库名称（公司名称）
     * @param storeName 仓库名称（公司名称）
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 仓库代码（公司流水代码）
     * @return STORE_CODE 仓库代码（公司流水代码）
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 仓库代码（公司流水代码）
     * @param storeCode 仓库代码（公司流水代码）
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 信息状态：00冻结 10待审核 15审核拒绝 20审核通过
     * @return INFO_STATUS 信息状态：00冻结 10待审核 15审核拒绝 20审核通过
     */
    public String getInfoStatus() {
        return infoStatus;
    }

    /**
     * 信息状态：00冻结 10待审核 15审核拒绝 20审核通过
     * @param infoStatus 信息状态：00冻结 10待审核 15审核拒绝 20审核通过
     */
    public void setInfoStatus(String infoStatus) {
        this.infoStatus = infoStatus == null ? null : infoStatus.trim();
    }

    /**
     * WMS仓库代码
     * @return WMS_DEPT_ID WMS仓库代码
     */
    public String getWmsDeptId() {
        return wmsDeptId;
    }

    /**
     * WMS仓库代码
     * @param wmsDeptId WMS仓库代码
     */
    public void setWmsDeptId(String wmsDeptId) {
        this.wmsDeptId = wmsDeptId == null ? null : wmsDeptId.trim();
    }

    /**
     * 仓库简称
     * @return STORE_SHORT_NAME 仓库简称
     */
    public String getStoreShortName() {
        return storeShortName;
    }

    /**
     * 仓库简称
     * @param storeShortName 仓库简称
     */
    public void setStoreShortName(String storeShortName) {
        this.storeShortName = storeShortName == null ? null : storeShortName.trim();
    }

    /**
     * 联系人
     * @return STORE_CONTACT_PERSON 联系人
     */
    public String getStoreContactPerson() {
        return storeContactPerson;
    }

    /**
     * 联系人
     * @param storeContactPerson 联系人
     */
    public void setStoreContactPerson(String storeContactPerson) {
        this.storeContactPerson = storeContactPerson == null ? null : storeContactPerson.trim();
    }

    /**
     * 联系人电话
     * @return STORE_CONTACT_PNONE 联系人电话
     */
    public String getStoreContactPnone() {
        return storeContactPnone;
    }

    /**
     * 联系人电话
     * @param storeContactPnone 联系人电话
     */
    public void setStoreContactPnone(String storeContactPnone) {
        this.storeContactPnone = storeContactPnone == null ? null : storeContactPnone.trim();
    }

    /**
     * 省
     * @return ADDRESS_PROVINCE 省
     */
    public String getAddressProvince() {
        return addressProvince;
    }

    /**
     * 省
     * @param addressProvince 省
     */
    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince == null ? null : addressProvince.trim();
    }

    /**
     * 市
     * @return ADDRESS_CITY 市
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 市
     * @param addressCity 市
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    /**
     * 区
     * @return ADDRESS_AREA 区
     */
    public String getAddressArea() {
        return addressArea;
    }

    /**
     * 区
     * @param addressArea 区
     */
    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea == null ? null : addressArea.trim();
    }

    /**
     * 仓库地址
     * @return STORE_ADDRESS 仓库地址
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * 仓库地址
     * @param storeAddress 仓库地址
     */
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    /**
     * 邮政编码
     * @return STORE_POSTAL_CODE 邮政编码
     */
    public String getStorePostalCode() {
        return storePostalCode;
    }

    /**
     * 邮政编码
     * @param storePostalCode 邮政编码
     */
    public void setStorePostalCode(String storePostalCode) {
        this.storePostalCode = storePostalCode == null ? null : storePostalCode.trim();
    }

    /**
     * 公司简介
     * @return COMPANY_PROFILE 公司简介
     */
    public String getCompanyProfile() {
        return companyProfile;
    }

    /**
     * 公司简介
     * @param companyProfile 公司简介
     */
    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile == null ? null : companyProfile.trim();
    }

    /**
     * 仓库特色描述（json str形式存储）
     * @return STORE_FEATURE_DESC 仓库特色描述（json str形式存储）
     */
    public String getStoreFeatureDesc() {
        return storeFeatureDesc;
    }

    /**
     * 仓库特色描述（json str形式存储）
     * @param storeFeatureDesc 仓库特色描述（json str形式存储）
     */
    public void setStoreFeatureDesc(String storeFeatureDesc) {
        this.storeFeatureDesc = storeFeatureDesc == null ? null : storeFeatureDesc.trim();
    }

    /**
     * 法人
     * @return STORE_ARTIFICIAL_PERSON 法人
     */
    public String getStoreArtificialPerson() {
        return storeArtificialPerson;
    }

    /**
     * 法人
     * @param storeArtificialPerson 法人
     */
    public void setStoreArtificialPerson(String storeArtificialPerson) {
        this.storeArtificialPerson = storeArtificialPerson == null ? null : storeArtificialPerson.trim();
    }

    /**
     * 注册资金（万元）
     * @return REGISTERED_CAPITAL 注册资金（万元）
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 注册资金（万元）
     * @param registeredCapital 注册资金（万元）
     */
    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    /**
     * 仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）
     * @return WORK_SCOPE 仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）
     */
    public String getWorkScope() {
        return workScope;
    }

    /**
     * 仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）
     * @param workScope 仓储业务范围（品种类型, 以半角逗号分隔的中文形式存储）
     */
    public void setWorkScope(String workScope) {
        this.workScope = workScope == null ? null : workScope.trim();
    }

    /**
     * 主要设备（json str形式存储）
     * @return MAIN_DEVICE 主要设备（json str形式存储）
     */
    public String getMainDevice() {
        return mainDevice;
    }

    /**
     * 主要设备（json str形式存储）
     * @param mainDevice 主要设备（json str形式存储）
     */
    public void setMainDevice(String mainDevice) {
        this.mainDevice = mainDevice == null ? null : mainDevice.trim();
    }

    /**
     * 仓储费用描述（冗余字段）
     * @return STORE_PRICE_DESC 仓储费用描述（冗余字段）
     */
    public String getStorePriceDesc() {
        return storePriceDesc;
    }

    /**
     * 仓储费用描述（冗余字段）
     * @param storePriceDesc 仓储费用描述（冗余字段）
     */
    public void setStorePriceDesc(String storePriceDesc) {
        this.storePriceDesc = storePriceDesc == null ? null : storePriceDesc.trim();
    }

    /**
     * 仓储费用（元/天/吨）
     * @return STORE_PRICE 仓储费用（元/天/吨）
     */
    public Double getStorePrice() {
        return storePrice;
    }

    /**
     * 仓储费用（元/天/吨）
     * @param storePrice 仓储费用（元/天/吨）
     */
    public void setStorePrice(Double storePrice) {
        this.storePrice = storePrice;
    }

    /**
     * 短驳费（元/吨）
     * @return STORE_SHORT_PRICE 短驳费（元/吨）
     */
    public Double getStoreShortPrice() {
        return storeShortPrice;
    }

    /**
     * 短驳费（元/吨）
     * @param storeShortPrice 短驳费（元/吨）
     */
    public void setStoreShortPrice(Double storeShortPrice) {
        this.storeShortPrice = storeShortPrice;
    }

    /**
     * 吊费（元/吨）
     * @return STORE_LIFTING_PRICE 吊费（元/吨）
     */
    public Double getStoreLiftingPrice() {
        return storeLiftingPrice;
    }

    /**
     * 吊费（元/吨）
     * @param storeLiftingPrice 吊费（元/吨）
     */
    public void setStoreLiftingPrice(Double storeLiftingPrice) {
        this.storeLiftingPrice = storeLiftingPrice;
    }

    /**
     * 仓内面积（平方）
     * @return STORE_INNER_AREA 仓内面积（平方）
     */
    public Double getStoreInnerArea() {
        return storeInnerArea;
    }

    /**
     * 仓内面积（平方）
     * @param storeInnerArea 仓内面积（平方）
     */
    public void setStoreInnerArea(Double storeInnerArea) {
        this.storeInnerArea = storeInnerArea;
    }

    /**
     * 外仓面积（平方/亩）
     * @return STORE_OUTER_AREA 外仓面积（平方/亩）
     */
    public Double getStoreOuterArea() {
        return storeOuterArea;
    }

    /**
     * 外仓面积（平方/亩）
     * @param storeOuterArea 外仓面积（平方/亩）
     */
    public void setStoreOuterArea(Double storeOuterArea) {
        this.storeOuterArea = storeOuterArea;
    }

    /**
     * 库容量（万吨）
     * @return STORE_CAPABILITY 库容量（万吨）
     */
    public Double getStoreCapability() {
        return storeCapability;
    }

    /**
     * 库容量（万吨）
     * @param storeCapability 库容量（万吨）
     */
    public void setStoreCapability(Double storeCapability) {
        this.storeCapability = storeCapability;
    }

    /**
     * 仓储能力描述
     * @return STORE_CAPABILITY_DESC 仓储能力描述
     */
    public String getStoreCapabilityDesc() {
        return storeCapabilityDesc;
    }

    /**
     * 仓储能力描述
     * @param storeCapabilityDesc 仓储能力描述
     */
    public void setStoreCapabilityDesc(String storeCapabilityDesc) {
        this.storeCapabilityDesc = storeCapabilityDesc == null ? null : storeCapabilityDesc.trim();
    }

    /**
     * 设备描述（存放设备的文字描述）
     * @return EQUIPMENT_DESC 设备描述（存放设备的文字描述）
     */
    public String getEquipmentDesc() {
        return equipmentDesc;
    }

    /**
     * 设备描述（存放设备的文字描述）
     * @param equipmentDesc 设备描述（存放设备的文字描述）
     */
    public void setEquipmentDesc(String equipmentDesc) {
        this.equipmentDesc = equipmentDesc == null ? null : equipmentDesc.trim();
    }

    /**
     * 资质认证描述
     * @return QUALIFICATION_DESC 资质认证描述
     */
    public String getQualificationDesc() {
        return qualificationDesc;
    }

    /**
     * 资质认证描述
     * @param qualificationDesc 资质认证描述
     */
    public void setQualificationDesc(String qualificationDesc) {
        this.qualificationDesc = qualificationDesc == null ? null : qualificationDesc.trim();
    }

    /**
     * 是否提供加工服务，0：不提供，1：提供
     * @return PROC_FLAG 是否提供加工服务，0：不提供，1：提供
     */
    public String getProcFlag() {
        return procFlag;
    }

    /**
     * 是否提供加工服务，0：不提供，1：提供
     * @param procFlag 是否提供加工服务，0：不提供，1：提供
     */
    public void setProcFlag(String procFlag) {
        this.procFlag = procFlag == null ? null : procFlag.trim();
    }

    /**
     * 加工业务描述
     * @return PROC_BIZ_DESC 加工业务描述
     */
    public String getProcBizDesc() {
        return procBizDesc;
    }

    /**
     * 加工业务描述
     * @param procBizDesc 加工业务描述
     */
    public void setProcBizDesc(String procBizDesc) {
        this.procBizDesc = procBizDesc == null ? null : procBizDesc.trim();
    }

    /**
     * 宝盈通系统使用，0：不使用，1：使用，2：使用其他系统
     * @return BAOSAAS_FLAG 宝盈通系统使用，0：不使用，1：使用，2：使用其他系统
     */
    public String getBaosaasFlag() {
        return baosaasFlag;
    }

    /**
     * 宝盈通系统使用，0：不使用，1：使用，2：使用其他系统
     * @param baosaasFlag 宝盈通系统使用，0：不使用，1：使用，2：使用其他系统
     */
    public void setBaosaasFlag(String baosaasFlag) {
        this.baosaasFlag = baosaasFlag == null ? null : baosaasFlag.trim();
    }

    /**
     * 其他业务系统描述
     * @return OTHER_SYS_DESC 其他业务系统描述
     */
    public String getOtherSysDesc() {
        return otherSysDesc;
    }

    /**
     * 其他业务系统描述
     * @param otherSysDesc 其他业务系统描述
     */
    public void setOtherSysDesc(String otherSysDesc) {
        this.otherSysDesc = otherSysDesc == null ? null : otherSysDesc.trim();
    }

    /**
     * 欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）
     * @return OY_ALLIANCE 欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）
     */
    public String getOyAlliance() {
        return oyAlliance;
    }

    /**
     * 欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）
     * @param oyAlliance 欧冶加盟库：1:协议加盟 2:资产加盟  0:未加盟  3:管理加盟 (可多选，json str形式存储）
     */
    public void setOyAlliance(String oyAlliance) {
        this.oyAlliance = oyAlliance == null ? null : oyAlliance.trim();
    }

    /**
     * 包装类型
     * @return COVER_TYPE 包装类型
     */
    public String getCoverType() {
        return coverType;
    }

    /**
     * 包装类型
     * @param coverType 包装类型
     */
    public void setCoverType(String coverType) {
        this.coverType = coverType == null ? null : coverType.trim();
    }

    /**
     * 平面图
     * @return PLANE_MAP 平面图
     */
    public String getPlaneMap() {
        return planeMap;
    }

    /**
     * 平面图
     * @param planeMap 平面图
     */
    public void setPlaneMap(String planeMap) {
        this.planeMap = planeMap == null ? null : planeMap.trim();
    }

    /**
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 当前所在位置的经度，单位为度，[‐180,180]
     * @return LNG 当前所在位置的经度，单位为度，[‐180,180]
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 当前所在位置的经度，单位为度，[‐180,180]
     * @param lng 当前所在位置的经度，单位为度，[‐180,180]
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 当前所在位置的纬度，单位为度，[‐84,84]
     * @return LAT 当前所在位置的纬度，单位为度，[‐84,84]
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 当前所在位置的纬度，单位为度，[‐84,84]
     * @param lat 当前所在位置的纬度，单位为度，[‐84,84]
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 数据信息来源：1为用户发布 2为平台录入
     * @return INFO_SOURCE 数据信息来源：1为用户发布 2为平台录入
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * 数据信息来源：1为用户发布 2为平台录入
     * @param infoSource 数据信息来源：1为用户发布 2为平台录入
     */
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource == null ? null : infoSource.trim();
    }

    /**
     * 数据有效标志
     * @return ALIVE_FLAG 数据有效标志
     */
    public String getAliveFlag() {
        return aliveFlag;
    }

    /**
     * 数据有效标志
     * @param aliveFlag 数据有效标志
     */
    public void setAliveFlag(String aliveFlag) {
        this.aliveFlag = aliveFlag == null ? null : aliveFlag.trim();
    }

    /**
     * 创建日期
     * @return CREATE_DATE 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     * @return CREATE_PERSON 创建人
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * 创建人
     * @param createPerson 创建人
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * 修改日期
     * @return MODI_DATE 修改日期
     */
    public Date getModiDate() {
        return modiDate;
    }

    /**
     * 修改日期
     * @param modiDate 修改日期
     */
    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    /**
     * 修改人
     * @return MODI_PERSON 修改人
     */
    public String getModiPerson() {
        return modiPerson;
    }

    /**
     * 修改人
     * @param modiPerson 修改人
     */
    public void setModiPerson(String modiPerson) {
        this.modiPerson = modiPerson == null ? null : modiPerson.trim();
    }

    /**
     * 仓库关注度，仓库详情页每被点击一次，此字段+1
     * @return ATTENTION_DEGREE 仓库关注度，仓库详情页每被点击一次，此字段+1
     */
    public Long getAttentionDegree() {
        return attentionDegree;
    }

    /**
     * 仓库关注度，仓库详情页每被点击一次，此字段+1
     * @param attentionDegree 仓库关注度，仓库详情页每被点击一次，此字段+1
     */
    public void setAttentionDegree(Long attentionDegree) {
        this.attentionDegree = attentionDegree;
    }

    /**
     * 公司标签，半角逗号分隔的字符串
     * @return COMPANY_LABEL 公司标签，半角逗号分隔的字符串
     */
    public String getCompanyLabel() {
        return companyLabel;
    }

    /**
     * 公司标签，半角逗号分隔的字符串
     * @param companyLabel 公司标签，半角逗号分隔的字符串
     */
    public void setCompanyLabel(String companyLabel) {
        this.companyLabel = companyLabel == null ? null : companyLabel.trim();
    }

    /**
     * 图片地址
     * @return IMGPATH 图片地址
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * 图片地址
     * @param imgpath 图片地址
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    /**
     * 主营业务（主营品种）
     * @return MAIN_BUSINESS 主营业务（主营品种）
     */
    public String getMainBusiness() {
        return mainBusiness;
    }

    /**
     * 主营业务（主营品种）
     * @param mainBusiness 主营业务（主营品种）
     */
    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness == null ? null : mainBusiness.trim();
    }

    /**
     * 头像路径（只存后缀）
     * @return HEAD_IMG_PATH 头像路径（只存后缀）
     */
    public String getHeadImgPath() {
        return headImgPath;
    }

    /**
     * 头像路径（只存后缀）
     * @param headImgPath 头像路径（只存后缀）
     */
    public void setHeadImgPath(String headImgPath) {
        this.headImgPath = headImgPath == null ? null : headImgPath.trim();
    }

    /**
     * 加工类型（以半角逗号分隔的中文形式存储）
     * @return PROC_SCOPE 加工类型（以半角逗号分隔的中文形式存储）
     */
    public String getProcScope() {
        return procScope;
    }

    /**
     * 加工类型（以半角逗号分隔的中文形式存储）
     * @param procScope 加工类型（以半角逗号分隔的中文形式存储）
     */
    public void setProcScope(String procScope) {
        this.procScope = procScope == null ? null : procScope.trim();
    }

    /**
     * 到达最近高速路时间，单位为分钟
     * @return HIGHWAY_TIMES 到达最近高速路时间，单位为分钟
     */
    public Double getHighwayTimes() {
        return highwayTimes;
    }

    /**
     * 到达最近高速路时间，单位为分钟
     * @param highwayTimes 到达最近高速路时间，单位为分钟
     */
    public void setHighwayTimes(Double highwayTimes) {
        this.highwayTimes = highwayTimes;
    }

    /**
     * 到达最近铁路的时间，单位为分钟
     * @return RAILWAY_TIMES 到达最近铁路的时间，单位为分钟
     */
    public Double getRailwayTimes() {
        return railwayTimes;
    }

    /**
     * 到达最近铁路的时间，单位为分钟
     * @param railwayTimes 到达最近铁路的时间，单位为分钟
     */
    public void setRailwayTimes(Double railwayTimes) {
        this.railwayTimes = railwayTimes;
    }

    /**
     * 到达最近码头的时间，单位为小时
     * @return WATERWAY_TIMES 到达最近码头的时间，单位为小时
     */
    public Double getWaterwayTimes() {
        return waterwayTimes;
    }

    /**
     * 到达最近码头的时间，单位为小时
     * @param waterwayTimes 到达最近码头的时间，单位为小时
     */
    public void setWaterwayTimes(Double waterwayTimes) {
        this.waterwayTimes = waterwayTimes;
    }

    /**
     * 附近的餐馆，单位为个
     * @return EATERY 附近的餐馆，单位为个
     */
    public Integer getEatery() {
        return eatery;
    }

    /**
     * 附近的餐馆，单位为个
     * @param eatery 附近的餐馆，单位为个
     */
    public void setEatery(Integer eatery) {
        this.eatery = eatery;
    }

    /**
     * 附近快餐厅，单位为个
     * @return SNACK 附近快餐厅，单位为个
     */
    public Integer getSnack() {
        return snack;
    }

    /**
     * 附近快餐厅，单位为个
     * @param snack 附近快餐厅，单位为个
     */
    public void setSnack(Integer snack) {
        this.snack = snack;
    }

    /**
     * 附近加油站，单位为个
     * @return GAS_STATION 附近加油站，单位为个
     */
    public Integer getGasStation() {
        return gasStation;
    }

    /**
     * 附近加油站，单位为个
     * @param gasStation 附近加油站，单位为个
     */
    public void setGasStation(Integer gasStation) {
        this.gasStation = gasStation;
    }

    /**
     * 附近修车行，单位为个
     * @return REPAIR 附近修车行，单位为个
     */
    public Integer getRepair() {
        return repair;
    }

    /**
     * 附近修车行，单位为个
     * @param repair 附近修车行，单位为个
     */
    public void setRepair(Integer repair) {
        this.repair = repair;
    }

    /**
     * 附近宾馆，单位为个
     * @return HOTEL 附近宾馆，单位为个
     */
    public Integer getHotel() {
        return hotel;
    }

    /**
     * 附近宾馆，单位为个
     * @param hotel 附近宾馆，单位为个
     */
    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    /**
     * 附近快捷酒店，单位为个
     * @return EXPRESS_HOTEL 附近快捷酒店，单位为个
     */
    public Integer getExpressHotel() {
        return expressHotel;
    }

    /**
     * 附近快捷酒店，单位为个
     * @param expressHotel 附近快捷酒店，单位为个
     */
    public void setExpressHotel(Integer expressHotel) {
        this.expressHotel = expressHotel;
    }

    /**
     * 公司类型：10仓库 20货主 30 平台方
     * @return COMMANY_TYPE 公司类型：10仓库 20货主 30 平台方
     */
    public String getCommanyType() {
        return commanyType;
    }

    /**
     * 公司类型：10仓库 20货主 30 平台方
     * @param commanyType 公司类型：10仓库 20货主 30 平台方
     */
    public void setCommanyType(String commanyType) {
        this.commanyType = commanyType == null ? null : commanyType.trim();
    }

    /**
     * WMS货主代码
     * @return WMS_OWNER_ID WMS货主代码
     */
    public String getWmsOwnerId() {
        return wmsOwnerId;
    }

    /**
     * WMS货主代码
     * @param wmsOwnerId WMS货主代码
     */
    public void setWmsOwnerId(String wmsOwnerId) {
        this.wmsOwnerId = wmsOwnerId == null ? null : wmsOwnerId.trim();
    }

    /**
     * 公司邮箱地址
     * @return COMMANY_EMAIL 公司邮箱地址
     */
    public String getCommanyEmail() {
        return commanyEmail;
    }

    /**
     * 公司邮箱地址
     * @param commanyEmail 公司邮箱地址
     */
    public void setCommanyEmail(String commanyEmail) {
        this.commanyEmail = commanyEmail == null ? null : commanyEmail.trim();
    }

    /**
     * 公司开票结算银行
     * @return BANK 公司开票结算银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 公司开票结算银行
     * @param bank 公司开票结算银行
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * 公司开票结算银行帐号
     * @return ACCOUNT_BANK 公司开票结算银行帐号
     */
    public String getAccountBank() {
        return accountBank;
    }

    /**
     * 公司开票结算银行帐号
     * @param accountBank 公司开票结算银行帐号
     */
    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    /**
     * 换单工作时间段
     * @return CHANGE_BILL_TIME 换单工作时间段
     */
    public String getChangeBillTime() {
        return changeBillTime;
    }

    /**
     * 换单工作时间段
     * @param changeBillTime 换单工作时间段
     */
    public void setChangeBillTime(String changeBillTime) {
        this.changeBillTime = changeBillTime == null ? null : changeBillTime.trim();
    }

    /**
     * 装载工作时间段
     * @return LOAD_CART_TIME 装载工作时间段
     */
    public String getLoadCartTime() {
        return loadCartTime;
    }

    /**
     * 装载工作时间段
     * @param loadCartTime 装载工作时间段
     */
    public void setLoadCartTime(String loadCartTime) {
        this.loadCartTime = loadCartTime == null ? null : loadCartTime.trim();
    }

    /**
     * 企业法人营业执照地址
     * @return FAREN_CERTIFICATE 企业法人营业执照地址
     */
    public String getFarenCertificate() {
        return farenCertificate;
    }

    /**
     * 企业法人营业执照地址
     * @param farenCertificate 企业法人营业执照地址
     */
    public void setFarenCertificate(String farenCertificate) {
        this.farenCertificate = farenCertificate == null ? null : farenCertificate.trim();
    }

    /**
     * 组织机构代码证地址
     * @return ZUZHI_CERTIFICATE 组织机构代码证地址
     */
    public String getZuzhiCertificate() {
        return zuzhiCertificate;
    }

    /**
     * 组织机构代码证地址
     * @param zuzhiCertificate 组织机构代码证地址
     */
    public void setZuzhiCertificate(String zuzhiCertificate) {
        this.zuzhiCertificate = zuzhiCertificate == null ? null : zuzhiCertificate.trim();
    }

    /**
     * 税务登记证地址
     * @return SHUIWU_CERTIFICATE 税务登记证地址
     */
    public String getShuiwuCertificate() {
        return shuiwuCertificate;
    }

    /**
     * 税务登记证地址
     * @param shuiwuCertificate 税务登记证地址
     */
    public void setShuiwuCertificate(String shuiwuCertificate) {
        this.shuiwuCertificate = shuiwuCertificate == null ? null : shuiwuCertificate.trim();
    }

    /**
     * 统一认证的t_s_company表的comp_id
     * @return COMPANY_ID 统一认证的t_s_company表的comp_id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 统一认证的t_s_company表的comp_id
     * @param companyId 统一认证的t_s_company表的comp_id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 资料来源
     * @return FROM_SITE 资料来源
     */
    public String getFromSite() {
        return fromSite;
    }

    /**
     * 资料来源
     * @param fromSite 资料来源
     */
    public void setFromSite(String fromSite) {
        this.fromSite = fromSite == null ? null : fromSite.trim();
    }

    /**
     * 资料来源更新时间
     * @return SITE_UPDATE_DATE 资料来源更新时间
     */
    public Date getSiteUpdateDate() {
        return siteUpdateDate;
    }

    /**
     * 资料来源更新时间
     * @param siteUpdateDate 资料来源更新时间
     */
    public void setSiteUpdateDate(Date siteUpdateDate) {
        this.siteUpdateDate = siteUpdateDate;
    }

    /**
     * 是否显示在云仓黄页上  1显示 0 不显示
     * @return IS_SHOW 是否显示在云仓黄页上  1显示 0 不显示
     */
    public String getIsShow() {
        return isShow;
    }

    /**
     * 是否显示在云仓黄页上  1显示 0 不显示
     * @param isShow 是否显示在云仓黄页上  1显示 0 不显示
     */
    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
    }

    /**
     * 存放公司LOGO文件名
     * @return LOGO_PATH 存放公司LOGO文件名
     */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * 存放公司LOGO文件名
     * @param logoPath 存放公司LOGO文件名
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    /**
     * T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号
     * @return CHANGE_LOG_GUID T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号
     */
    public String getChangeLogGuid() {
        return changeLogGuid;
    }

    /**
     * T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号
     * @param changeLogGuid T_WL_COMPANY_CHANGE_LOG公司变更表中的批次号
     */
    public void setChangeLogGuid(String changeLogGuid) {
        this.changeLogGuid = changeLogGuid == null ? null : changeLogGuid.trim();
    }

    /**
     * 业务人员
     * @return SALE_USER_ID 业务人员
     */
    public String getSaleUserId() {
        return saleUserId;
    }

    /**
     * 业务人员
     * @param saleUserId 业务人员
     */
    public void setSaleUserId(String saleUserId) {
        this.saleUserId = saleUserId == null ? null : saleUserId.trim();
    }

    /**
     * 运营人员
     * @return OPERATE_USER_ID 运营人员
     */
    public String getOperateUserId() {
        return operateUserId;
    }

    /**
     * 运营人员
     * @param operateUserId 运营人员
     */
    public void setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId == null ? null : operateUserId.trim();
    }

    /**
     * 是否可以操作业务 N 无权限操作  Y 有权限操作
     * @return IS_OPERATE_BUSINESS 是否可以操作业务 N 无权限操作  Y 有权限操作
     */
    public String getIsOperateBusiness() {
        return isOperateBusiness;
    }

    /**
     * 是否可以操作业务 N 无权限操作  Y 有权限操作
     * @param isOperateBusiness 是否可以操作业务 N 无权限操作  Y 有权限操作
     */
    public void setIsOperateBusiness(String isOperateBusiness) {
        this.isOperateBusiness = isOperateBusiness == null ? null : isOperateBusiness.trim();
    }

    /**
     * 是否拥有仓库身份:N否，Y是
     * @return STORE_SIGN 是否拥有仓库身份:N否，Y是
     */
    public String getStoreSign() {
        return storeSign;
    }

    /**
     * 是否拥有仓库身份:N否，Y是
     * @param storeSign 是否拥有仓库身份:N否，Y是
     */
    public void setStoreSign(String storeSign) {
        this.storeSign = storeSign == null ? null : storeSign.trim();
    }

    /**
     * 是否拥有货主身份:N否，Y是
     * @return OWNER_SIGN 是否拥有货主身份:N否，Y是
     */
    public String getOwnerSign() {
        return ownerSign;
    }

    /**
     * 是否拥有货主身份:N否，Y是
     * @param ownerSign 是否拥有货主身份:N否，Y是
     */
    public void setOwnerSign(String ownerSign) {
        this.ownerSign = ownerSign == null ? null : ownerSign.trim();
    }

    /**
     * 是否拥有平台身份:N否，Y是
     * @return PLATFORM_SIGN 是否拥有平台身份:N否，Y是
     */
    public String getPlatformSign() {
        return platformSign;
    }

    /**
     * 是否拥有平台身份:N否，Y是
     * @param platformSign 是否拥有平台身份:N否，Y是
     */
    public void setPlatformSign(String platformSign) {
        this.platformSign = platformSign == null ? null : platformSign.trim();
    }

    /**
     * 公司别名，如果有多个，以英文半角逗号分隔
     * @return NICK_STORE_NAME 公司别名，如果有多个，以英文半角逗号分隔
     */
    public String getNickStoreName() {
        return nickStoreName;
    }

    /**
     * 公司别名，如果有多个，以英文半角逗号分隔
     * @param nickStoreName 公司别名，如果有多个，以英文半角逗号分隔
     */
    public void setNickStoreName(String nickStoreName) {
        this.nickStoreName = nickStoreName == null ? null : nickStoreName.trim();
    }

    /**
     * 仓库授权委托书传真件 如果为1 则表示有 空则表示无
     * @return YC_AUTHORIZATION_FAX 仓库授权委托书传真件 如果为1 则表示有 空则表示无
     */
    public String getYcAuthorizationFax() {
        return ycAuthorizationFax;
    }

    /**
     * 仓库授权委托书传真件 如果为1 则表示有 空则表示无
     * @param ycAuthorizationFax 仓库授权委托书传真件 如果为1 则表示有 空则表示无
     */
    public void setYcAuthorizationFax(String ycAuthorizationFax) {
        this.ycAuthorizationFax = ycAuthorizationFax == null ? null : ycAuthorizationFax.trim();
    }

    /**
     * 仓库授权委托书原件  如果为1 则表示有 空则表示无
     * @return YC_AUTHORIZATION_TRUE 仓库授权委托书原件  如果为1 则表示有 空则表示无
     */
    public String getYcAuthorizationTrue() {
        return ycAuthorizationTrue;
    }

    /**
     * 仓库授权委托书原件  如果为1 则表示有 空则表示无
     * @param ycAuthorizationTrue 仓库授权委托书原件  如果为1 则表示有 空则表示无
     */
    public void setYcAuthorizationTrue(String ycAuthorizationTrue) {
        this.ycAuthorizationTrue = ycAuthorizationTrue == null ? null : ycAuthorizationTrue.trim();
    }

    /**
     * 统计入库量标记，1不统计，2统计
     * @return PUTIN_AMOUNT 统计入库量标记，1不统计，2统计
     */
    public String getPutinAmount() {
        return putinAmount;
    }

    /**
     * 统计入库量标记，1不统计，2统计
     * @param putinAmount 统计入库量标记，1不统计，2统计
     */
    public void setPutinAmount(String putinAmount) {
        this.putinAmount = putinAmount == null ? null : putinAmount.trim();
    }

    /**
     * 统计加工量标记，1不统计，2统计
     * @return PROCESS_AMOUNT 统计加工量标记，1不统计，2统计
     */
    public String getProcessAmount() {
        return processAmount;
    }

    /**
     * 统计加工量标记，1不统计，2统计
     * @param processAmount 统计加工量标记，1不统计，2统计
     */
    public void setProcessAmount(String processAmount) {
        this.processAmount = processAmount == null ? null : processAmount.trim();
    }

    /**
     * 换单室联系人
     * @return EXCHANGE_PERSON 换单室联系人
     */
    public String getExchangePerson() {
        return exchangePerson;
    }

    /**
     * 换单室联系人
     * @param exchangePerson 换单室联系人
     */
    public void setExchangePerson(String exchangePerson) {
        this.exchangePerson = exchangePerson == null ? null : exchangePerson.trim();
    }

    /**
     * 换单室联系人电话
     * @return EXCHANGE_PHONE 换单室联系人电话
     */
    public String getExchangePhone() {
        return exchangePhone;
    }

    /**
     * 换单室联系人电话
     * @param exchangePhone 换单室联系人电话
     */
    public void setExchangePhone(String exchangePhone) {
        this.exchangePhone = exchangePhone == null ? null : exchangePhone.trim();
    }

    /**
     * 仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无
     * @return APPLICATION_FAX 仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无
     */
    public String getApplicationFax() {
        return applicationFax;
    }

    /**
     * 仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无
     * @param applicationFax 仓库是否已经上传无纸化申请书传真 如果为1 则表示有 空则表示无
     */
    public void setApplicationFax(String applicationFax) {
        this.applicationFax = applicationFax == null ? null : applicationFax.trim();
    }

    /**
     * 仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无
     * @return APPLICATION_TRUE 仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无
     */
    public String getApplicationTrue() {
        return applicationTrue;
    }

    /**
     * 仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无
     * @param applicationTrue 仓库是否已经上传无纸化申请书原件 如果为1 则表示有 空则表示无
     */
    public void setApplicationTrue(String applicationTrue) {
        this.applicationTrue = applicationTrue == null ? null : applicationTrue.trim();
    }

    /**
     * 是否在图片上添加战略合作库标记 如果为1则添加
     * @return COOPERATION_FLAG 是否在图片上添加战略合作库标记 如果为1则添加
     */
    public String getCooperationFlag() {
        return cooperationFlag;
    }

    /**
     * 是否在图片上添加战略合作库标记 如果为1则添加
     * @param cooperationFlag 是否在图片上添加战略合作库标记 如果为1则添加
     */
    public void setCooperationFlag(String cooperationFlag) {
        this.cooperationFlag = cooperationFlag == null ? null : cooperationFlag.trim();
    }

    /**
     * 仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     * @return STORE_VIRTUAL_SHELVES_FLAG 仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    public String getStoreVirtualShelvesFlag() {
        return storeVirtualShelvesFlag;
    }

    /**
     * 仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     * @param storeVirtualShelvesFlag 仓库(YC-170小酷)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    public void setStoreVirtualShelvesFlag(String storeVirtualShelvesFlag) {
        this.storeVirtualShelvesFlag = storeVirtualShelvesFlag == null ? null : storeVirtualShelvesFlag.trim();
    }

    /**
     * 货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     * @return OWNER_VIRTUAL_SHELVES_FLAG 货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    public String getOwnerVirtualShelvesFlag() {
        return ownerVirtualShelvesFlag;
    }

    /**
     * 货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     * @param ownerVirtualShelvesFlag 货主(YC-170小卖)是否拥有虚拟货架权限（'1'为有，'0'为没有，默认为'0'没有）
     */
    public void setOwnerVirtualShelvesFlag(String ownerVirtualShelvesFlag) {
        this.ownerVirtualShelvesFlag = ownerVirtualShelvesFlag == null ? null : ownerVirtualShelvesFlag.trim();
    }

    /**
     * 是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0
     * @return IF_BIND_CAP 是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0
     */
    public String getIfBindCap() {
        return ifBindCap;
    }

    /**
     * 是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0
     * @param ifBindCap 是否和欧冶金融进行绑定  1 已经绑定  0 未绑定 默认为0
     */
    public void setIfBindCap(String ifBindCap) {
        this.ifBindCap = ifBindCap == null ? null : ifBindCap.trim();
    }

    /**
     * 服务须知是否显示
     * @return NOTES 服务须知是否显示
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 服务须知是否显示
     * @param notes 服务须知是否显示
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 仓单须知显示（1.显示，0不显示）
     * @return RECEIPT_NODES 仓单须知显示（1.显示，0不显示）
     */
    public String getReceiptNodes() {
        return receiptNodes;
    }

    /**
     * 仓单须知显示（1.显示，0不显示）
     * @param receiptNodes 仓单须知显示（1.显示，0不显示）
     */
    public void setReceiptNodes(String receiptNodes) {
        this.receiptNodes = receiptNodes == null ? null : receiptNodes.trim();
    }

    /**
     * 货主云仓授权委托书传真件(空:没有，1:存在)
     * @return TRADE_AUTHORIZATION_FAX 货主云仓授权委托书传真件(空:没有，1:存在)
     */
    public String getTradeAuthorizationFax() {
        return tradeAuthorizationFax;
    }

    /**
     * 货主云仓授权委托书传真件(空:没有，1:存在)
     * @param tradeAuthorizationFax 货主云仓授权委托书传真件(空:没有，1:存在)
     */
    public void setTradeAuthorizationFax(String tradeAuthorizationFax) {
        this.tradeAuthorizationFax = tradeAuthorizationFax == null ? null : tradeAuthorizationFax.trim();
    }

    /**
     * 货主云仓授权委托书原件(空:没有，1:存在)
     * @return TRADE_AUTHORIZATION_TRUE 货主云仓授权委托书原件(空:没有，1:存在)
     */
    public String getTradeAuthorizationTrue() {
        return tradeAuthorizationTrue;
    }

    /**
     * 货主云仓授权委托书原件(空:没有，1:存在)
     * @param tradeAuthorizationTrue 货主云仓授权委托书原件(空:没有，1:存在)
     */
    public void setTradeAuthorizationTrue(String tradeAuthorizationTrue) {
        this.tradeAuthorizationTrue = tradeAuthorizationTrue == null ? null : tradeAuthorizationTrue.trim();
    }

    /**
     * 货主云仓无纸化传真件(空:没有，1:存在)
     * @return TRADE_APPLICATION_FAX 货主云仓无纸化传真件(空:没有，1:存在)
     */
    public String getTradeApplicationFax() {
        return tradeApplicationFax;
    }

    /**
     * 货主云仓无纸化传真件(空:没有，1:存在)
     * @param tradeApplicationFax 货主云仓无纸化传真件(空:没有，1:存在)
     */
    public void setTradeApplicationFax(String tradeApplicationFax) {
        this.tradeApplicationFax = tradeApplicationFax == null ? null : tradeApplicationFax.trim();
    }

    /**
     * 货主云仓无纸化原件(空:没有，1:存在)
     * @return TRADE_APPLICATION_TRUE 货主云仓无纸化原件(空:没有，1:存在)
     */
    public String getTradeApplicationTrue() {
        return tradeApplicationTrue;
    }

    /**
     * 货主云仓无纸化原件(空:没有，1:存在)
     * @param tradeApplicationTrue 货主云仓无纸化原件(空:没有，1:存在)
     */
    public void setTradeApplicationTrue(String tradeApplicationTrue) {
        this.tradeApplicationTrue = tradeApplicationTrue == null ? null : tradeApplicationTrue.trim();
    }

    /**
     * 税号
     * @return TAX_NUM 税号
     */
    public String getTaxNum() {
        return taxNum;
    }

    /**
     * 税号
     * @param taxNum 税号
     */
    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum == null ? null : taxNum.trim();
    }

    /**
     * 金融CAP客户id
     * @return CAP_OWNER_ID 金融CAP客户id
     */
    public String getCapOwnerId() {
        return capOwnerId;
    }

    /**
     * 金融CAP客户id
     * @param capOwnerId 金融CAP客户id
     */
    public void setCapOwnerId(String capOwnerId) {
        this.capOwnerId = capOwnerId == null ? null : capOwnerId.trim();
    }

    /**
     * 经营法人全称
     * @return LEGAL_FULL_NAME 经营法人全称
     */
    public String getLegalFullName() {
        return legalFullName;
    }

    /**
     * 经营法人全称
     * @param legalFullName 经营法人全称
     */
    public void setLegalFullName(String legalFullName) {
        this.legalFullName = legalFullName == null ? null : legalFullName.trim();
    }

    /**
     * 营业执照名称
     * @return BUS_LICENCE_NAME 营业执照名称
     */
    public String getBusLicenceName() {
        return busLicenceName;
    }

    /**
     * 营业执照名称
     * @param busLicenceName 营业执照名称
     */
    public void setBusLicenceName(String busLicenceName) {
        this.busLicenceName = busLicenceName == null ? null : busLicenceName.trim();
    }

    /**
     * T代码
     * @return TCODE T代码
     */
    public String getTcode() {
        return tcode;
    }

    /**
     * T代码
     * @param tcode T代码
     */
    public void setTcode(String tcode) {
        this.tcode = tcode == null ? null : tcode.trim();
    }

    /**
     * 代理仓储标记 0否 1是
     * @return AGENT_STORE_FLAG 代理仓储标记 0否 1是
     */
    public String getAgentStoreFlag() {
        return agentStoreFlag;
    }

    /**
     * 代理仓储标记 0否 1是
     * @param agentStoreFlag 代理仓储标记 0否 1是
     */
    public void setAgentStoreFlag(String agentStoreFlag) {
        this.agentStoreFlag = agentStoreFlag == null ? null : agentStoreFlag.trim();
    }

    /**
     * 4级地址(街道)
     * @return STREET 4级地址(街道)
     */
    public String getStreet() {
        return street;
    }

    /**
     * 4级地址(街道)
     * @param street 4级地址(街道)
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * 5级地址(门牌号)
     * @return HOUSE_NUMBER 5级地址(门牌号)
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * 5级地址(门牌号)
     * @param houseNumber 5级地址(门牌号)
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    /**
     * 是否拥有加工厂身份:N否，Y是
     * @return MACHING_SIGN 是否拥有加工厂身份:N否，Y是
     */
    public String getMachingSign() {
        return machingSign;
    }

    /**
     * 是否拥有加工厂身份:N否，Y是
     * @param machingSign 是否拥有加工厂身份:N否，Y是
     */
    public void setMachingSign(String machingSign) {
        this.machingSign = machingSign == null ? null : machingSign.trim();
    }

    /**
     * 是否拥有码头身份:N否，Y是
     * @return WHARF_SIGN 是否拥有码头身份:N否，Y是
     */
    public String getWharfSign() {
        return wharfSign;
    }

    /**
     * 是否拥有码头身份:N否，Y是
     * @param wharfSign 是否拥有码头身份:N否，Y是
     */
    public void setWharfSign(String wharfSign) {
        this.wharfSign = wharfSign == null ? null : wharfSign.trim();
    }

    /**
     * 是否拥有铁路身份:N否，Y是
     * @return RAILWAY_SIGN 是否拥有铁路身份:N否，Y是
     */
    public String getRailwaySign() {
        return railwaySign;
    }

    /**
     * 是否拥有铁路身份:N否，Y是
     * @param railwaySign 是否拥有铁路身份:N否，Y是
     */
    public void setRailwaySign(String railwaySign) {
        this.railwaySign = railwaySign == null ? null : railwaySign.trim();
    }

    /**
     * 是否拥有收货点身份:N否，Y是
     * @return RECEIVINGPOINT_SIGN 是否拥有收货点身份:N否，Y是
     */
    public String getReceivingpointSign() {
        return receivingpointSign;
    }

    /**
     * 是否拥有收货点身份:N否，Y是
     * @param receivingpointSign 是否拥有收货点身份:N否，Y是
     */
    public void setReceivingpointSign(String receivingpointSign) {
        this.receivingpointSign = receivingpointSign == null ? null : receivingpointSign.trim();
    }

    /**
     * 台讯标志 0否，1是
     * @return TAIXUN_FLAG 台讯标志 0否，1是
     */
    public String getTaixunFlag() {
        return taixunFlag;
    }

    /**
     * 台讯标志 0否，1是
     * @param taixunFlag 台讯标志 0否，1是
     */
    public void setTaixunFlag(String taixunFlag) {
        this.taixunFlag = taixunFlag == null ? null : taixunFlag.trim();
    }
}