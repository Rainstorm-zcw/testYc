package com.example.testyc.persistence.entity;

import com.example.testyc.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWlStoreInfoExample {
    /**
     * T_WL_STORE_INFO
     */
    protected String orderByClause;

    /**
     * T_WL_STORE_INFO
     */
    protected boolean distinct;

    /**
     * T_WL_STORE_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     * T_WL_STORE_INFO
     */
    protected Page page;

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public TWlStoreInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     *
     * @mbggenerated 2019-12-05
     */
    public Page getPage() {
        return page;
    }

    /**
     * T_WL_STORE_INFO 2019-12-05
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("GUID like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("GUID not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("STORE_NAME =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("STORE_NAME <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("STORE_NAME >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NAME >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("STORE_NAME <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_NAME <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("STORE_NAME like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("STORE_NAME not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("STORE_NAME in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("STORE_NAME not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("STORE_NAME between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("STORE_NAME not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("STORE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("STORE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("STORE_CODE =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("STORE_CODE <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("STORE_CODE >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CODE >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("STORE_CODE <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("STORE_CODE <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("STORE_CODE like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("STORE_CODE not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("STORE_CODE in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("STORE_CODE not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("STORE_CODE between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("STORE_CODE not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIsNull() {
            addCriterion("INFO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIsNotNull() {
            addCriterion("INFO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInfoStatusEqualTo(String value) {
            addCriterion("INFO_STATUS =", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotEqualTo(String value) {
            addCriterion("INFO_STATUS <>", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusGreaterThan(String value) {
            addCriterion("INFO_STATUS >", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_STATUS >=", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLessThan(String value) {
            addCriterion("INFO_STATUS <", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLessThanOrEqualTo(String value) {
            addCriterion("INFO_STATUS <=", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLike(String value) {
            addCriterion("INFO_STATUS like", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotLike(String value) {
            addCriterion("INFO_STATUS not like", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIn(List<String> values) {
            addCriterion("INFO_STATUS in", values, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotIn(List<String> values) {
            addCriterion("INFO_STATUS not in", values, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusBetween(String value1, String value2) {
            addCriterion("INFO_STATUS between", value1, value2, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotBetween(String value1, String value2) {
            addCriterion("INFO_STATUS not between", value1, value2, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdIsNull() {
            addCriterion("WMS_DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdIsNotNull() {
            addCriterion("WMS_DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdEqualTo(String value) {
            addCriterion("WMS_DEPT_ID =", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdNotEqualTo(String value) {
            addCriterion("WMS_DEPT_ID <>", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdGreaterThan(String value) {
            addCriterion("WMS_DEPT_ID >", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("WMS_DEPT_ID >=", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdLessThan(String value) {
            addCriterion("WMS_DEPT_ID <", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdLessThanOrEqualTo(String value) {
            addCriterion("WMS_DEPT_ID <=", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdLike(String value) {
            addCriterion("WMS_DEPT_ID like", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdNotLike(String value) {
            addCriterion("WMS_DEPT_ID not like", value, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdIn(List<String> values) {
            addCriterion("WMS_DEPT_ID in", values, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdNotIn(List<String> values) {
            addCriterion("WMS_DEPT_ID not in", values, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdBetween(String value1, String value2) {
            addCriterion("WMS_DEPT_ID between", value1, value2, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andWmsDeptIdNotBetween(String value1, String value2) {
            addCriterion("WMS_DEPT_ID not between", value1, value2, "wmsDeptId");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameIsNull() {
            addCriterion("STORE_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameIsNotNull() {
            addCriterion("STORE_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameEqualTo(String value) {
            addCriterion("STORE_SHORT_NAME =", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameNotEqualTo(String value) {
            addCriterion("STORE_SHORT_NAME <>", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameGreaterThan(String value) {
            addCriterion("STORE_SHORT_NAME >", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_SHORT_NAME >=", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameLessThan(String value) {
            addCriterion("STORE_SHORT_NAME <", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_SHORT_NAME <=", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameLike(String value) {
            addCriterion("STORE_SHORT_NAME like", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameNotLike(String value) {
            addCriterion("STORE_SHORT_NAME not like", value, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameIn(List<String> values) {
            addCriterion("STORE_SHORT_NAME in", values, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameNotIn(List<String> values) {
            addCriterion("STORE_SHORT_NAME not in", values, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameBetween(String value1, String value2) {
            addCriterion("STORE_SHORT_NAME between", value1, value2, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreShortNameNotBetween(String value1, String value2) {
            addCriterion("STORE_SHORT_NAME not between", value1, value2, "storeShortName");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonIsNull() {
            addCriterion("STORE_CONTACT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonIsNotNull() {
            addCriterion("STORE_CONTACT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonEqualTo(String value) {
            addCriterion("STORE_CONTACT_PERSON =", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonNotEqualTo(String value) {
            addCriterion("STORE_CONTACT_PERSON <>", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonGreaterThan(String value) {
            addCriterion("STORE_CONTACT_PERSON >", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CONTACT_PERSON >=", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonLessThan(String value) {
            addCriterion("STORE_CONTACT_PERSON <", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonLessThanOrEqualTo(String value) {
            addCriterion("STORE_CONTACT_PERSON <=", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonLike(String value) {
            addCriterion("STORE_CONTACT_PERSON like", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonNotLike(String value) {
            addCriterion("STORE_CONTACT_PERSON not like", value, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonIn(List<String> values) {
            addCriterion("STORE_CONTACT_PERSON in", values, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonNotIn(List<String> values) {
            addCriterion("STORE_CONTACT_PERSON not in", values, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonBetween(String value1, String value2) {
            addCriterion("STORE_CONTACT_PERSON between", value1, value2, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPersonNotBetween(String value1, String value2) {
            addCriterion("STORE_CONTACT_PERSON not between", value1, value2, "storeContactPerson");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneIsNull() {
            addCriterion("STORE_CONTACT_PNONE is null");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneIsNotNull() {
            addCriterion("STORE_CONTACT_PNONE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneEqualTo(String value) {
            addCriterion("STORE_CONTACT_PNONE =", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneNotEqualTo(String value) {
            addCriterion("STORE_CONTACT_PNONE <>", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneGreaterThan(String value) {
            addCriterion("STORE_CONTACT_PNONE >", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CONTACT_PNONE >=", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneLessThan(String value) {
            addCriterion("STORE_CONTACT_PNONE <", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneLessThanOrEqualTo(String value) {
            addCriterion("STORE_CONTACT_PNONE <=", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneLike(String value) {
            addCriterion("STORE_CONTACT_PNONE like", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneNotLike(String value) {
            addCriterion("STORE_CONTACT_PNONE not like", value, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneIn(List<String> values) {
            addCriterion("STORE_CONTACT_PNONE in", values, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneNotIn(List<String> values) {
            addCriterion("STORE_CONTACT_PNONE not in", values, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneBetween(String value1, String value2) {
            addCriterion("STORE_CONTACT_PNONE between", value1, value2, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andStoreContactPnoneNotBetween(String value1, String value2) {
            addCriterion("STORE_CONTACT_PNONE not between", value1, value2, "storeContactPnone");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNull() {
            addCriterion("ADDRESS_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNotNull() {
            addCriterion("ADDRESS_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceEqualTo(String value) {
            addCriterion("ADDRESS_PROVINCE =", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotEqualTo(String value) {
            addCriterion("ADDRESS_PROVINCE <>", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThan(String value) {
            addCriterion("ADDRESS_PROVINCE >", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_PROVINCE >=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThan(String value) {
            addCriterion("ADDRESS_PROVINCE <", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_PROVINCE <=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLike(String value) {
            addCriterion("ADDRESS_PROVINCE like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotLike(String value) {
            addCriterion("ADDRESS_PROVINCE not like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIn(List<String> values) {
            addCriterion("ADDRESS_PROVINCE in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotIn(List<String> values) {
            addCriterion("ADDRESS_PROVINCE not in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceBetween(String value1, String value2) {
            addCriterion("ADDRESS_PROVINCE between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_PROVINCE not between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("ADDRESS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("ADDRESS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("ADDRESS_CITY =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("ADDRESS_CITY <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("ADDRESS_CITY >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("ADDRESS_CITY <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("ADDRESS_CITY like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("ADDRESS_CITY not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("ADDRESS_CITY in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("ADDRESS_CITY not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIsNull() {
            addCriterion("ADDRESS_AREA is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIsNotNull() {
            addCriterion("ADDRESS_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaEqualTo(String value) {
            addCriterion("ADDRESS_AREA =", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotEqualTo(String value) {
            addCriterion("ADDRESS_AREA <>", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaGreaterThan(String value) {
            addCriterion("ADDRESS_AREA >", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_AREA >=", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLessThan(String value) {
            addCriterion("ADDRESS_AREA <", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_AREA <=", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaLike(String value) {
            addCriterion("ADDRESS_AREA like", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotLike(String value) {
            addCriterion("ADDRESS_AREA not like", value, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIn(List<String> values) {
            addCriterion("ADDRESS_AREA in", values, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotIn(List<String> values) {
            addCriterion("ADDRESS_AREA not in", values, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaBetween(String value1, String value2) {
            addCriterion("ADDRESS_AREA between", value1, value2, "addressArea");
            return (Criteria) this;
        }

        public Criteria andAddressAreaNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_AREA not between", value1, value2, "addressArea");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("STORE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("STORE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("STORE_ADDRESS =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("STORE_ADDRESS <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("STORE_ADDRESS >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ADDRESS >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("STORE_ADDRESS <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("STORE_ADDRESS <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("STORE_ADDRESS like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("STORE_ADDRESS not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("STORE_ADDRESS in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("STORE_ADDRESS not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("STORE_ADDRESS between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("STORE_ADDRESS not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeIsNull() {
            addCriterion("STORE_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeIsNotNull() {
            addCriterion("STORE_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeEqualTo(String value) {
            addCriterion("STORE_POSTAL_CODE =", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeNotEqualTo(String value) {
            addCriterion("STORE_POSTAL_CODE <>", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeGreaterThan(String value) {
            addCriterion("STORE_POSTAL_CODE >", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_POSTAL_CODE >=", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeLessThan(String value) {
            addCriterion("STORE_POSTAL_CODE <", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeLessThanOrEqualTo(String value) {
            addCriterion("STORE_POSTAL_CODE <=", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeLike(String value) {
            addCriterion("STORE_POSTAL_CODE like", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeNotLike(String value) {
            addCriterion("STORE_POSTAL_CODE not like", value, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeIn(List<String> values) {
            addCriterion("STORE_POSTAL_CODE in", values, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeNotIn(List<String> values) {
            addCriterion("STORE_POSTAL_CODE not in", values, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeBetween(String value1, String value2) {
            addCriterion("STORE_POSTAL_CODE between", value1, value2, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andStorePostalCodeNotBetween(String value1, String value2) {
            addCriterion("STORE_POSTAL_CODE not between", value1, value2, "storePostalCode");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNull() {
            addCriterion("COMPANY_PROFILE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNotNull() {
            addCriterion("COMPANY_PROFILE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileEqualTo(String value) {
            addCriterion("COMPANY_PROFILE =", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotEqualTo(String value) {
            addCriterion("COMPANY_PROFILE <>", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThan(String value) {
            addCriterion("COMPANY_PROFILE >", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PROFILE >=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThan(String value) {
            addCriterion("COMPANY_PROFILE <", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PROFILE <=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLike(String value) {
            addCriterion("COMPANY_PROFILE like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotLike(String value) {
            addCriterion("COMPANY_PROFILE not like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIn(List<String> values) {
            addCriterion("COMPANY_PROFILE in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotIn(List<String> values) {
            addCriterion("COMPANY_PROFILE not in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileBetween(String value1, String value2) {
            addCriterion("COMPANY_PROFILE between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PROFILE not between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescIsNull() {
            addCriterion("STORE_FEATURE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescIsNotNull() {
            addCriterion("STORE_FEATURE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescEqualTo(String value) {
            addCriterion("STORE_FEATURE_DESC =", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescNotEqualTo(String value) {
            addCriterion("STORE_FEATURE_DESC <>", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescGreaterThan(String value) {
            addCriterion("STORE_FEATURE_DESC >", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_FEATURE_DESC >=", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescLessThan(String value) {
            addCriterion("STORE_FEATURE_DESC <", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescLessThanOrEqualTo(String value) {
            addCriterion("STORE_FEATURE_DESC <=", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescLike(String value) {
            addCriterion("STORE_FEATURE_DESC like", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescNotLike(String value) {
            addCriterion("STORE_FEATURE_DESC not like", value, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescIn(List<String> values) {
            addCriterion("STORE_FEATURE_DESC in", values, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescNotIn(List<String> values) {
            addCriterion("STORE_FEATURE_DESC not in", values, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescBetween(String value1, String value2) {
            addCriterion("STORE_FEATURE_DESC between", value1, value2, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreFeatureDescNotBetween(String value1, String value2) {
            addCriterion("STORE_FEATURE_DESC not between", value1, value2, "storeFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonIsNull() {
            addCriterion("STORE_ARTIFICIAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonIsNotNull() {
            addCriterion("STORE_ARTIFICIAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonEqualTo(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON =", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonNotEqualTo(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON <>", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonGreaterThan(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON >", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON >=", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonLessThan(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON <", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonLessThanOrEqualTo(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON <=", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonLike(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON like", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonNotLike(String value) {
            addCriterion("STORE_ARTIFICIAL_PERSON not like", value, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonIn(List<String> values) {
            addCriterion("STORE_ARTIFICIAL_PERSON in", values, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonNotIn(List<String> values) {
            addCriterion("STORE_ARTIFICIAL_PERSON not in", values, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonBetween(String value1, String value2) {
            addCriterion("STORE_ARTIFICIAL_PERSON between", value1, value2, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andStoreArtificialPersonNotBetween(String value1, String value2) {
            addCriterion("STORE_ARTIFICIAL_PERSON not between", value1, value2, "storeArtificialPerson");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("REGISTERED_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("REGISTERED_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("REGISTERED_CAPITAL >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("REGISTERED_CAPITAL <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("REGISTERED_CAPITAL like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("REGISTERED_CAPITAL not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("REGISTERED_CAPITAL in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("REGISTERED_CAPITAL not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("REGISTERED_CAPITAL between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_CAPITAL not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andWorkScopeIsNull() {
            addCriterion("WORK_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkScopeIsNotNull() {
            addCriterion("WORK_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkScopeEqualTo(String value) {
            addCriterion("WORK_SCOPE =", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeNotEqualTo(String value) {
            addCriterion("WORK_SCOPE <>", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeGreaterThan(String value) {
            addCriterion("WORK_SCOPE >", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SCOPE >=", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeLessThan(String value) {
            addCriterion("WORK_SCOPE <", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeLessThanOrEqualTo(String value) {
            addCriterion("WORK_SCOPE <=", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeLike(String value) {
            addCriterion("WORK_SCOPE like", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeNotLike(String value) {
            addCriterion("WORK_SCOPE not like", value, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeIn(List<String> values) {
            addCriterion("WORK_SCOPE in", values, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeNotIn(List<String> values) {
            addCriterion("WORK_SCOPE not in", values, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeBetween(String value1, String value2) {
            addCriterion("WORK_SCOPE between", value1, value2, "workScope");
            return (Criteria) this;
        }

        public Criteria andWorkScopeNotBetween(String value1, String value2) {
            addCriterion("WORK_SCOPE not between", value1, value2, "workScope");
            return (Criteria) this;
        }

        public Criteria andMainDeviceIsNull() {
            addCriterion("MAIN_DEVICE is null");
            return (Criteria) this;
        }

        public Criteria andMainDeviceIsNotNull() {
            addCriterion("MAIN_DEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andMainDeviceEqualTo(String value) {
            addCriterion("MAIN_DEVICE =", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceNotEqualTo(String value) {
            addCriterion("MAIN_DEVICE <>", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceGreaterThan(String value) {
            addCriterion("MAIN_DEVICE >", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_DEVICE >=", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceLessThan(String value) {
            addCriterion("MAIN_DEVICE <", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceLessThanOrEqualTo(String value) {
            addCriterion("MAIN_DEVICE <=", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceLike(String value) {
            addCriterion("MAIN_DEVICE like", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceNotLike(String value) {
            addCriterion("MAIN_DEVICE not like", value, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceIn(List<String> values) {
            addCriterion("MAIN_DEVICE in", values, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceNotIn(List<String> values) {
            addCriterion("MAIN_DEVICE not in", values, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceBetween(String value1, String value2) {
            addCriterion("MAIN_DEVICE between", value1, value2, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andMainDeviceNotBetween(String value1, String value2) {
            addCriterion("MAIN_DEVICE not between", value1, value2, "mainDevice");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescIsNull() {
            addCriterion("STORE_PRICE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescIsNotNull() {
            addCriterion("STORE_PRICE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescEqualTo(String value) {
            addCriterion("STORE_PRICE_DESC =", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescNotEqualTo(String value) {
            addCriterion("STORE_PRICE_DESC <>", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescGreaterThan(String value) {
            addCriterion("STORE_PRICE_DESC >", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_PRICE_DESC >=", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescLessThan(String value) {
            addCriterion("STORE_PRICE_DESC <", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescLessThanOrEqualTo(String value) {
            addCriterion("STORE_PRICE_DESC <=", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescLike(String value) {
            addCriterion("STORE_PRICE_DESC like", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescNotLike(String value) {
            addCriterion("STORE_PRICE_DESC not like", value, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescIn(List<String> values) {
            addCriterion("STORE_PRICE_DESC in", values, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescNotIn(List<String> values) {
            addCriterion("STORE_PRICE_DESC not in", values, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescBetween(String value1, String value2) {
            addCriterion("STORE_PRICE_DESC between", value1, value2, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceDescNotBetween(String value1, String value2) {
            addCriterion("STORE_PRICE_DESC not between", value1, value2, "storePriceDesc");
            return (Criteria) this;
        }

        public Criteria andStorePriceIsNull() {
            addCriterion("STORE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andStorePriceIsNotNull() {
            addCriterion("STORE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andStorePriceEqualTo(Double value) {
            addCriterion("STORE_PRICE =", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceNotEqualTo(Double value) {
            addCriterion("STORE_PRICE <>", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceGreaterThan(Double value) {
            addCriterion("STORE_PRICE >", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_PRICE >=", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceLessThan(Double value) {
            addCriterion("STORE_PRICE <", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceLessThanOrEqualTo(Double value) {
            addCriterion("STORE_PRICE <=", value, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceIn(List<Double> values) {
            addCriterion("STORE_PRICE in", values, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceNotIn(List<Double> values) {
            addCriterion("STORE_PRICE not in", values, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceBetween(Double value1, Double value2) {
            addCriterion("STORE_PRICE between", value1, value2, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStorePriceNotBetween(Double value1, Double value2) {
            addCriterion("STORE_PRICE not between", value1, value2, "storePrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceIsNull() {
            addCriterion("STORE_SHORT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceIsNotNull() {
            addCriterion("STORE_SHORT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceEqualTo(Double value) {
            addCriterion("STORE_SHORT_PRICE =", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceNotEqualTo(Double value) {
            addCriterion("STORE_SHORT_PRICE <>", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceGreaterThan(Double value) {
            addCriterion("STORE_SHORT_PRICE >", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_SHORT_PRICE >=", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceLessThan(Double value) {
            addCriterion("STORE_SHORT_PRICE <", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceLessThanOrEqualTo(Double value) {
            addCriterion("STORE_SHORT_PRICE <=", value, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceIn(List<Double> values) {
            addCriterion("STORE_SHORT_PRICE in", values, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceNotIn(List<Double> values) {
            addCriterion("STORE_SHORT_PRICE not in", values, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceBetween(Double value1, Double value2) {
            addCriterion("STORE_SHORT_PRICE between", value1, value2, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreShortPriceNotBetween(Double value1, Double value2) {
            addCriterion("STORE_SHORT_PRICE not between", value1, value2, "storeShortPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceIsNull() {
            addCriterion("STORE_LIFTING_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceIsNotNull() {
            addCriterion("STORE_LIFTING_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceEqualTo(Double value) {
            addCriterion("STORE_LIFTING_PRICE =", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceNotEqualTo(Double value) {
            addCriterion("STORE_LIFTING_PRICE <>", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceGreaterThan(Double value) {
            addCriterion("STORE_LIFTING_PRICE >", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_LIFTING_PRICE >=", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceLessThan(Double value) {
            addCriterion("STORE_LIFTING_PRICE <", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceLessThanOrEqualTo(Double value) {
            addCriterion("STORE_LIFTING_PRICE <=", value, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceIn(List<Double> values) {
            addCriterion("STORE_LIFTING_PRICE in", values, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceNotIn(List<Double> values) {
            addCriterion("STORE_LIFTING_PRICE not in", values, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceBetween(Double value1, Double value2) {
            addCriterion("STORE_LIFTING_PRICE between", value1, value2, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreLiftingPriceNotBetween(Double value1, Double value2) {
            addCriterion("STORE_LIFTING_PRICE not between", value1, value2, "storeLiftingPrice");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaIsNull() {
            addCriterion("STORE_INNER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaIsNotNull() {
            addCriterion("STORE_INNER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaEqualTo(Double value) {
            addCriterion("STORE_INNER_AREA =", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaNotEqualTo(Double value) {
            addCriterion("STORE_INNER_AREA <>", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaGreaterThan(Double value) {
            addCriterion("STORE_INNER_AREA >", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_INNER_AREA >=", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaLessThan(Double value) {
            addCriterion("STORE_INNER_AREA <", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaLessThanOrEqualTo(Double value) {
            addCriterion("STORE_INNER_AREA <=", value, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaIn(List<Double> values) {
            addCriterion("STORE_INNER_AREA in", values, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaNotIn(List<Double> values) {
            addCriterion("STORE_INNER_AREA not in", values, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaBetween(Double value1, Double value2) {
            addCriterion("STORE_INNER_AREA between", value1, value2, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreInnerAreaNotBetween(Double value1, Double value2) {
            addCriterion("STORE_INNER_AREA not between", value1, value2, "storeInnerArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaIsNull() {
            addCriterion("STORE_OUTER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaIsNotNull() {
            addCriterion("STORE_OUTER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaEqualTo(Double value) {
            addCriterion("STORE_OUTER_AREA =", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaNotEqualTo(Double value) {
            addCriterion("STORE_OUTER_AREA <>", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaGreaterThan(Double value) {
            addCriterion("STORE_OUTER_AREA >", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_OUTER_AREA >=", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaLessThan(Double value) {
            addCriterion("STORE_OUTER_AREA <", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaLessThanOrEqualTo(Double value) {
            addCriterion("STORE_OUTER_AREA <=", value, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaIn(List<Double> values) {
            addCriterion("STORE_OUTER_AREA in", values, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaNotIn(List<Double> values) {
            addCriterion("STORE_OUTER_AREA not in", values, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaBetween(Double value1, Double value2) {
            addCriterion("STORE_OUTER_AREA between", value1, value2, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreOuterAreaNotBetween(Double value1, Double value2) {
            addCriterion("STORE_OUTER_AREA not between", value1, value2, "storeOuterArea");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityIsNull() {
            addCriterion("STORE_CAPABILITY is null");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityIsNotNull() {
            addCriterion("STORE_CAPABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityEqualTo(Double value) {
            addCriterion("STORE_CAPABILITY =", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityNotEqualTo(Double value) {
            addCriterion("STORE_CAPABILITY <>", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityGreaterThan(Double value) {
            addCriterion("STORE_CAPABILITY >", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityGreaterThanOrEqualTo(Double value) {
            addCriterion("STORE_CAPABILITY >=", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityLessThan(Double value) {
            addCriterion("STORE_CAPABILITY <", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityLessThanOrEqualTo(Double value) {
            addCriterion("STORE_CAPABILITY <=", value, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityIn(List<Double> values) {
            addCriterion("STORE_CAPABILITY in", values, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityNotIn(List<Double> values) {
            addCriterion("STORE_CAPABILITY not in", values, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityBetween(Double value1, Double value2) {
            addCriterion("STORE_CAPABILITY between", value1, value2, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityNotBetween(Double value1, Double value2) {
            addCriterion("STORE_CAPABILITY not between", value1, value2, "storeCapability");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescIsNull() {
            addCriterion("STORE_CAPABILITY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescIsNotNull() {
            addCriterion("STORE_CAPABILITY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescEqualTo(String value) {
            addCriterion("STORE_CAPABILITY_DESC =", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescNotEqualTo(String value) {
            addCriterion("STORE_CAPABILITY_DESC <>", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescGreaterThan(String value) {
            addCriterion("STORE_CAPABILITY_DESC >", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CAPABILITY_DESC >=", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescLessThan(String value) {
            addCriterion("STORE_CAPABILITY_DESC <", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescLessThanOrEqualTo(String value) {
            addCriterion("STORE_CAPABILITY_DESC <=", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescLike(String value) {
            addCriterion("STORE_CAPABILITY_DESC like", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescNotLike(String value) {
            addCriterion("STORE_CAPABILITY_DESC not like", value, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescIn(List<String> values) {
            addCriterion("STORE_CAPABILITY_DESC in", values, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescNotIn(List<String> values) {
            addCriterion("STORE_CAPABILITY_DESC not in", values, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescBetween(String value1, String value2) {
            addCriterion("STORE_CAPABILITY_DESC between", value1, value2, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andStoreCapabilityDescNotBetween(String value1, String value2) {
            addCriterion("STORE_CAPABILITY_DESC not between", value1, value2, "storeCapabilityDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescIsNull() {
            addCriterion("EQUIPMENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescIsNotNull() {
            addCriterion("EQUIPMENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescEqualTo(String value) {
            addCriterion("EQUIPMENT_DESC =", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescNotEqualTo(String value) {
            addCriterion("EQUIPMENT_DESC <>", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescGreaterThan(String value) {
            addCriterion("EQUIPMENT_DESC >", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_DESC >=", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescLessThan(String value) {
            addCriterion("EQUIPMENT_DESC <", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_DESC <=", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescLike(String value) {
            addCriterion("EQUIPMENT_DESC like", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescNotLike(String value) {
            addCriterion("EQUIPMENT_DESC not like", value, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescIn(List<String> values) {
            addCriterion("EQUIPMENT_DESC in", values, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescNotIn(List<String> values) {
            addCriterion("EQUIPMENT_DESC not in", values, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_DESC between", value1, value2, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_DESC not between", value1, value2, "equipmentDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescIsNull() {
            addCriterion("QUALIFICATION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andQualificationDescIsNotNull() {
            addCriterion("QUALIFICATION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationDescEqualTo(String value) {
            addCriterion("QUALIFICATION_DESC =", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescNotEqualTo(String value) {
            addCriterion("QUALIFICATION_DESC <>", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescGreaterThan(String value) {
            addCriterion("QUALIFICATION_DESC >", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION_DESC >=", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescLessThan(String value) {
            addCriterion("QUALIFICATION_DESC <", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION_DESC <=", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescLike(String value) {
            addCriterion("QUALIFICATION_DESC like", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescNotLike(String value) {
            addCriterion("QUALIFICATION_DESC not like", value, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescIn(List<String> values) {
            addCriterion("QUALIFICATION_DESC in", values, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescNotIn(List<String> values) {
            addCriterion("QUALIFICATION_DESC not in", values, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescBetween(String value1, String value2) {
            addCriterion("QUALIFICATION_DESC between", value1, value2, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andQualificationDescNotBetween(String value1, String value2) {
            addCriterion("QUALIFICATION_DESC not between", value1, value2, "qualificationDesc");
            return (Criteria) this;
        }

        public Criteria andProcFlagIsNull() {
            addCriterion("PROC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProcFlagIsNotNull() {
            addCriterion("PROC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProcFlagEqualTo(String value) {
            addCriterion("PROC_FLAG =", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagNotEqualTo(String value) {
            addCriterion("PROC_FLAG <>", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagGreaterThan(String value) {
            addCriterion("PROC_FLAG >", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_FLAG >=", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagLessThan(String value) {
            addCriterion("PROC_FLAG <", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagLessThanOrEqualTo(String value) {
            addCriterion("PROC_FLAG <=", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagLike(String value) {
            addCriterion("PROC_FLAG like", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagNotLike(String value) {
            addCriterion("PROC_FLAG not like", value, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagIn(List<String> values) {
            addCriterion("PROC_FLAG in", values, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagNotIn(List<String> values) {
            addCriterion("PROC_FLAG not in", values, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagBetween(String value1, String value2) {
            addCriterion("PROC_FLAG between", value1, value2, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcFlagNotBetween(String value1, String value2) {
            addCriterion("PROC_FLAG not between", value1, value2, "procFlag");
            return (Criteria) this;
        }

        public Criteria andProcBizDescIsNull() {
            addCriterion("PROC_BIZ_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProcBizDescIsNotNull() {
            addCriterion("PROC_BIZ_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProcBizDescEqualTo(String value) {
            addCriterion("PROC_BIZ_DESC =", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescNotEqualTo(String value) {
            addCriterion("PROC_BIZ_DESC <>", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescGreaterThan(String value) {
            addCriterion("PROC_BIZ_DESC >", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_BIZ_DESC >=", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescLessThan(String value) {
            addCriterion("PROC_BIZ_DESC <", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescLessThanOrEqualTo(String value) {
            addCriterion("PROC_BIZ_DESC <=", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescLike(String value) {
            addCriterion("PROC_BIZ_DESC like", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescNotLike(String value) {
            addCriterion("PROC_BIZ_DESC not like", value, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescIn(List<String> values) {
            addCriterion("PROC_BIZ_DESC in", values, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescNotIn(List<String> values) {
            addCriterion("PROC_BIZ_DESC not in", values, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescBetween(String value1, String value2) {
            addCriterion("PROC_BIZ_DESC between", value1, value2, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andProcBizDescNotBetween(String value1, String value2) {
            addCriterion("PROC_BIZ_DESC not between", value1, value2, "procBizDesc");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagIsNull() {
            addCriterion("BAOSAAS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagIsNotNull() {
            addCriterion("BAOSAAS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagEqualTo(String value) {
            addCriterion("BAOSAAS_FLAG =", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagNotEqualTo(String value) {
            addCriterion("BAOSAAS_FLAG <>", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagGreaterThan(String value) {
            addCriterion("BAOSAAS_FLAG >", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BAOSAAS_FLAG >=", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagLessThan(String value) {
            addCriterion("BAOSAAS_FLAG <", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagLessThanOrEqualTo(String value) {
            addCriterion("BAOSAAS_FLAG <=", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagLike(String value) {
            addCriterion("BAOSAAS_FLAG like", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagNotLike(String value) {
            addCriterion("BAOSAAS_FLAG not like", value, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagIn(List<String> values) {
            addCriterion("BAOSAAS_FLAG in", values, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagNotIn(List<String> values) {
            addCriterion("BAOSAAS_FLAG not in", values, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagBetween(String value1, String value2) {
            addCriterion("BAOSAAS_FLAG between", value1, value2, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andBaosaasFlagNotBetween(String value1, String value2) {
            addCriterion("BAOSAAS_FLAG not between", value1, value2, "baosaasFlag");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescIsNull() {
            addCriterion("OTHER_SYS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescIsNotNull() {
            addCriterion("OTHER_SYS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescEqualTo(String value) {
            addCriterion("OTHER_SYS_DESC =", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescNotEqualTo(String value) {
            addCriterion("OTHER_SYS_DESC <>", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescGreaterThan(String value) {
            addCriterion("OTHER_SYS_DESC >", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_SYS_DESC >=", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescLessThan(String value) {
            addCriterion("OTHER_SYS_DESC <", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescLessThanOrEqualTo(String value) {
            addCriterion("OTHER_SYS_DESC <=", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescLike(String value) {
            addCriterion("OTHER_SYS_DESC like", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescNotLike(String value) {
            addCriterion("OTHER_SYS_DESC not like", value, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescIn(List<String> values) {
            addCriterion("OTHER_SYS_DESC in", values, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescNotIn(List<String> values) {
            addCriterion("OTHER_SYS_DESC not in", values, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescBetween(String value1, String value2) {
            addCriterion("OTHER_SYS_DESC between", value1, value2, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOtherSysDescNotBetween(String value1, String value2) {
            addCriterion("OTHER_SYS_DESC not between", value1, value2, "otherSysDesc");
            return (Criteria) this;
        }

        public Criteria andOyAllianceIsNull() {
            addCriterion("OY_ALLIANCE is null");
            return (Criteria) this;
        }

        public Criteria andOyAllianceIsNotNull() {
            addCriterion("OY_ALLIANCE is not null");
            return (Criteria) this;
        }

        public Criteria andOyAllianceEqualTo(String value) {
            addCriterion("OY_ALLIANCE =", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceNotEqualTo(String value) {
            addCriterion("OY_ALLIANCE <>", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceGreaterThan(String value) {
            addCriterion("OY_ALLIANCE >", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceGreaterThanOrEqualTo(String value) {
            addCriterion("OY_ALLIANCE >=", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceLessThan(String value) {
            addCriterion("OY_ALLIANCE <", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceLessThanOrEqualTo(String value) {
            addCriterion("OY_ALLIANCE <=", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceLike(String value) {
            addCriterion("OY_ALLIANCE like", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceNotLike(String value) {
            addCriterion("OY_ALLIANCE not like", value, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceIn(List<String> values) {
            addCriterion("OY_ALLIANCE in", values, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceNotIn(List<String> values) {
            addCriterion("OY_ALLIANCE not in", values, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceBetween(String value1, String value2) {
            addCriterion("OY_ALLIANCE between", value1, value2, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andOyAllianceNotBetween(String value1, String value2) {
            addCriterion("OY_ALLIANCE not between", value1, value2, "oyAlliance");
            return (Criteria) this;
        }

        public Criteria andCoverTypeIsNull() {
            addCriterion("COVER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoverTypeIsNotNull() {
            addCriterion("COVER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoverTypeEqualTo(String value) {
            addCriterion("COVER_TYPE =", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeNotEqualTo(String value) {
            addCriterion("COVER_TYPE <>", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeGreaterThan(String value) {
            addCriterion("COVER_TYPE >", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_TYPE >=", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeLessThan(String value) {
            addCriterion("COVER_TYPE <", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeLessThanOrEqualTo(String value) {
            addCriterion("COVER_TYPE <=", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeLike(String value) {
            addCriterion("COVER_TYPE like", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeNotLike(String value) {
            addCriterion("COVER_TYPE not like", value, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeIn(List<String> values) {
            addCriterion("COVER_TYPE in", values, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeNotIn(List<String> values) {
            addCriterion("COVER_TYPE not in", values, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeBetween(String value1, String value2) {
            addCriterion("COVER_TYPE between", value1, value2, "coverType");
            return (Criteria) this;
        }

        public Criteria andCoverTypeNotBetween(String value1, String value2) {
            addCriterion("COVER_TYPE not between", value1, value2, "coverType");
            return (Criteria) this;
        }

        public Criteria andPlaneMapIsNull() {
            addCriterion("PLANE_MAP is null");
            return (Criteria) this;
        }

        public Criteria andPlaneMapIsNotNull() {
            addCriterion("PLANE_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneMapEqualTo(String value) {
            addCriterion("PLANE_MAP =", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapNotEqualTo(String value) {
            addCriterion("PLANE_MAP <>", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapGreaterThan(String value) {
            addCriterion("PLANE_MAP >", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapGreaterThanOrEqualTo(String value) {
            addCriterion("PLANE_MAP >=", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapLessThan(String value) {
            addCriterion("PLANE_MAP <", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapLessThanOrEqualTo(String value) {
            addCriterion("PLANE_MAP <=", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapLike(String value) {
            addCriterion("PLANE_MAP like", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapNotLike(String value) {
            addCriterion("PLANE_MAP not like", value, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapIn(List<String> values) {
            addCriterion("PLANE_MAP in", values, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapNotIn(List<String> values) {
            addCriterion("PLANE_MAP not in", values, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapBetween(String value1, String value2) {
            addCriterion("PLANE_MAP between", value1, value2, "planeMap");
            return (Criteria) this;
        }

        public Criteria andPlaneMapNotBetween(String value1, String value2) {
            addCriterion("PLANE_MAP not between", value1, value2, "planeMap");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("LNG is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("LNG is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Double value) {
            addCriterion("LNG =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Double value) {
            addCriterion("LNG <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Double value) {
            addCriterion("LNG >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Double value) {
            addCriterion("LNG >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Double value) {
            addCriterion("LNG <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Double value) {
            addCriterion("LNG <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Double> values) {
            addCriterion("LNG in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Double> values) {
            addCriterion("LNG not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Double value1, Double value2) {
            addCriterion("LNG between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Double value1, Double value2) {
            addCriterion("LNG not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNull() {
            addCriterion("INFO_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNotNull() {
            addCriterion("INFO_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceEqualTo(String value) {
            addCriterion("INFO_SOURCE =", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotEqualTo(String value) {
            addCriterion("INFO_SOURCE <>", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThan(String value) {
            addCriterion("INFO_SOURCE >", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE >=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThan(String value) {
            addCriterion("INFO_SOURCE <", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE <=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLike(String value) {
            addCriterion("INFO_SOURCE like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotLike(String value) {
            addCriterion("INFO_SOURCE not like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIn(List<String> values) {
            addCriterion("INFO_SOURCE in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotIn(List<String> values) {
            addCriterion("INFO_SOURCE not in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE not between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andAliveFlagIsNull() {
            addCriterion("ALIVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAliveFlagIsNotNull() {
            addCriterion("ALIVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAliveFlagEqualTo(String value) {
            addCriterion("ALIVE_FLAG =", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotEqualTo(String value) {
            addCriterion("ALIVE_FLAG <>", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagGreaterThan(String value) {
            addCriterion("ALIVE_FLAG >", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ALIVE_FLAG >=", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLessThan(String value) {
            addCriterion("ALIVE_FLAG <", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLessThanOrEqualTo(String value) {
            addCriterion("ALIVE_FLAG <=", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLike(String value) {
            addCriterion("ALIVE_FLAG like", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotLike(String value) {
            addCriterion("ALIVE_FLAG not like", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagIn(List<String> values) {
            addCriterion("ALIVE_FLAG in", values, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotIn(List<String> values) {
            addCriterion("ALIVE_FLAG not in", values, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagBetween(String value1, String value2) {
            addCriterion("ALIVE_FLAG between", value1, value2, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotBetween(String value1, String value2) {
            addCriterion("ALIVE_FLAG not between", value1, value2, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNull() {
            addCriterion("CREATE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("CREATE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("CREATE_PERSON =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("CREATE_PERSON <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("CREATE_PERSON >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("CREATE_PERSON <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("CREATE_PERSON like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("CREATE_PERSON not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("CREATE_PERSON in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("CREATE_PERSON not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON not between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andModiDateIsNull() {
            addCriterion("MODI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModiDateIsNotNull() {
            addCriterion("MODI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModiDateEqualTo(Date value) {
            addCriterion("MODI_DATE =", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotEqualTo(Date value) {
            addCriterion("MODI_DATE <>", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateGreaterThan(Date value) {
            addCriterion("MODI_DATE >", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODI_DATE >=", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateLessThan(Date value) {
            addCriterion("MODI_DATE <", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateLessThanOrEqualTo(Date value) {
            addCriterion("MODI_DATE <=", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateIn(List<Date> values) {
            addCriterion("MODI_DATE in", values, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotIn(List<Date> values) {
            addCriterion("MODI_DATE not in", values, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateBetween(Date value1, Date value2) {
            addCriterion("MODI_DATE between", value1, value2, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotBetween(Date value1, Date value2) {
            addCriterion("MODI_DATE not between", value1, value2, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiPersonIsNull() {
            addCriterion("MODI_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andModiPersonIsNotNull() {
            addCriterion("MODI_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andModiPersonEqualTo(String value) {
            addCriterion("MODI_PERSON =", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonNotEqualTo(String value) {
            addCriterion("MODI_PERSON <>", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonGreaterThan(String value) {
            addCriterion("MODI_PERSON >", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonGreaterThanOrEqualTo(String value) {
            addCriterion("MODI_PERSON >=", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonLessThan(String value) {
            addCriterion("MODI_PERSON <", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonLessThanOrEqualTo(String value) {
            addCriterion("MODI_PERSON <=", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonLike(String value) {
            addCriterion("MODI_PERSON like", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonNotLike(String value) {
            addCriterion("MODI_PERSON not like", value, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonIn(List<String> values) {
            addCriterion("MODI_PERSON in", values, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonNotIn(List<String> values) {
            addCriterion("MODI_PERSON not in", values, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonBetween(String value1, String value2) {
            addCriterion("MODI_PERSON between", value1, value2, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andModiPersonNotBetween(String value1, String value2) {
            addCriterion("MODI_PERSON not between", value1, value2, "modiPerson");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeIsNull() {
            addCriterion("ATTENTION_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeIsNotNull() {
            addCriterion("ATTENTION_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeEqualTo(Long value) {
            addCriterion("ATTENTION_DEGREE =", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeNotEqualTo(Long value) {
            addCriterion("ATTENTION_DEGREE <>", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeGreaterThan(Long value) {
            addCriterion("ATTENTION_DEGREE >", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTENTION_DEGREE >=", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeLessThan(Long value) {
            addCriterion("ATTENTION_DEGREE <", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeLessThanOrEqualTo(Long value) {
            addCriterion("ATTENTION_DEGREE <=", value, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeIn(List<Long> values) {
            addCriterion("ATTENTION_DEGREE in", values, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeNotIn(List<Long> values) {
            addCriterion("ATTENTION_DEGREE not in", values, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeBetween(Long value1, Long value2) {
            addCriterion("ATTENTION_DEGREE between", value1, value2, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andAttentionDegreeNotBetween(Long value1, Long value2) {
            addCriterion("ATTENTION_DEGREE not between", value1, value2, "attentionDegree");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelIsNull() {
            addCriterion("COMPANY_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelIsNotNull() {
            addCriterion("COMPANY_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelEqualTo(String value) {
            addCriterion("COMPANY_LABEL =", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelNotEqualTo(String value) {
            addCriterion("COMPANY_LABEL <>", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelGreaterThan(String value) {
            addCriterion("COMPANY_LABEL >", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_LABEL >=", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelLessThan(String value) {
            addCriterion("COMPANY_LABEL <", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_LABEL <=", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelLike(String value) {
            addCriterion("COMPANY_LABEL like", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelNotLike(String value) {
            addCriterion("COMPANY_LABEL not like", value, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelIn(List<String> values) {
            addCriterion("COMPANY_LABEL in", values, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelNotIn(List<String> values) {
            addCriterion("COMPANY_LABEL not in", values, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelBetween(String value1, String value2) {
            addCriterion("COMPANY_LABEL between", value1, value2, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelNotBetween(String value1, String value2) {
            addCriterion("COMPANY_LABEL not between", value1, value2, "companyLabel");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("IMGPATH =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("IMGPATH <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("IMGPATH >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("IMGPATH >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("IMGPATH <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("IMGPATH <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("IMGPATH like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("IMGPATH not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("IMGPATH in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("IMGPATH not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("IMGPATH between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("IMGPATH not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("MAIN_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("MAIN_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("MAIN_BUSINESS =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("MAIN_BUSINESS <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("MAIN_BUSINESS >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_BUSINESS >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("MAIN_BUSINESS <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("MAIN_BUSINESS <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("MAIN_BUSINESS like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("MAIN_BUSINESS not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("MAIN_BUSINESS in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("MAIN_BUSINESS not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("MAIN_BUSINESS between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("MAIN_BUSINESS not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNull() {
            addCriterion("HEAD_IMG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNotNull() {
            addCriterion("HEAD_IMG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH =", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH <>", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThan(String value) {
            addCriterion("HEAD_IMG_PATH >", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH >=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThan(String value) {
            addCriterion("HEAD_IMG_PATH <", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH <=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLike(String value) {
            addCriterion("HEAD_IMG_PATH like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotLike(String value) {
            addCriterion("HEAD_IMG_PATH not like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIn(List<String> values) {
            addCriterion("HEAD_IMG_PATH in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotIn(List<String> values) {
            addCriterion("HEAD_IMG_PATH not in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathBetween(String value1, String value2) {
            addCriterion("HEAD_IMG_PATH between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotBetween(String value1, String value2) {
            addCriterion("HEAD_IMG_PATH not between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andProcScopeIsNull() {
            addCriterion("PROC_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andProcScopeIsNotNull() {
            addCriterion("PROC_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andProcScopeEqualTo(String value) {
            addCriterion("PROC_SCOPE =", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeNotEqualTo(String value) {
            addCriterion("PROC_SCOPE <>", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeGreaterThan(String value) {
            addCriterion("PROC_SCOPE >", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_SCOPE >=", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeLessThan(String value) {
            addCriterion("PROC_SCOPE <", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeLessThanOrEqualTo(String value) {
            addCriterion("PROC_SCOPE <=", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeLike(String value) {
            addCriterion("PROC_SCOPE like", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeNotLike(String value) {
            addCriterion("PROC_SCOPE not like", value, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeIn(List<String> values) {
            addCriterion("PROC_SCOPE in", values, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeNotIn(List<String> values) {
            addCriterion("PROC_SCOPE not in", values, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeBetween(String value1, String value2) {
            addCriterion("PROC_SCOPE between", value1, value2, "procScope");
            return (Criteria) this;
        }

        public Criteria andProcScopeNotBetween(String value1, String value2) {
            addCriterion("PROC_SCOPE not between", value1, value2, "procScope");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesIsNull() {
            addCriterion("HIGHWAY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesIsNotNull() {
            addCriterion("HIGHWAY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesEqualTo(Double value) {
            addCriterion("HIGHWAY_TIMES =", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesNotEqualTo(Double value) {
            addCriterion("HIGHWAY_TIMES <>", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesGreaterThan(Double value) {
            addCriterion("HIGHWAY_TIMES >", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesGreaterThanOrEqualTo(Double value) {
            addCriterion("HIGHWAY_TIMES >=", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesLessThan(Double value) {
            addCriterion("HIGHWAY_TIMES <", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesLessThanOrEqualTo(Double value) {
            addCriterion("HIGHWAY_TIMES <=", value, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesIn(List<Double> values) {
            addCriterion("HIGHWAY_TIMES in", values, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesNotIn(List<Double> values) {
            addCriterion("HIGHWAY_TIMES not in", values, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesBetween(Double value1, Double value2) {
            addCriterion("HIGHWAY_TIMES between", value1, value2, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andHighwayTimesNotBetween(Double value1, Double value2) {
            addCriterion("HIGHWAY_TIMES not between", value1, value2, "highwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesIsNull() {
            addCriterion("RAILWAY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesIsNotNull() {
            addCriterion("RAILWAY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesEqualTo(Double value) {
            addCriterion("RAILWAY_TIMES =", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesNotEqualTo(Double value) {
            addCriterion("RAILWAY_TIMES <>", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesGreaterThan(Double value) {
            addCriterion("RAILWAY_TIMES >", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesGreaterThanOrEqualTo(Double value) {
            addCriterion("RAILWAY_TIMES >=", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesLessThan(Double value) {
            addCriterion("RAILWAY_TIMES <", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesLessThanOrEqualTo(Double value) {
            addCriterion("RAILWAY_TIMES <=", value, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesIn(List<Double> values) {
            addCriterion("RAILWAY_TIMES in", values, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesNotIn(List<Double> values) {
            addCriterion("RAILWAY_TIMES not in", values, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesBetween(Double value1, Double value2) {
            addCriterion("RAILWAY_TIMES between", value1, value2, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andRailwayTimesNotBetween(Double value1, Double value2) {
            addCriterion("RAILWAY_TIMES not between", value1, value2, "railwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesIsNull() {
            addCriterion("WATERWAY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesIsNotNull() {
            addCriterion("WATERWAY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesEqualTo(Double value) {
            addCriterion("WATERWAY_TIMES =", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesNotEqualTo(Double value) {
            addCriterion("WATERWAY_TIMES <>", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesGreaterThan(Double value) {
            addCriterion("WATERWAY_TIMES >", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesGreaterThanOrEqualTo(Double value) {
            addCriterion("WATERWAY_TIMES >=", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesLessThan(Double value) {
            addCriterion("WATERWAY_TIMES <", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesLessThanOrEqualTo(Double value) {
            addCriterion("WATERWAY_TIMES <=", value, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesIn(List<Double> values) {
            addCriterion("WATERWAY_TIMES in", values, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesNotIn(List<Double> values) {
            addCriterion("WATERWAY_TIMES not in", values, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesBetween(Double value1, Double value2) {
            addCriterion("WATERWAY_TIMES between", value1, value2, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andWaterwayTimesNotBetween(Double value1, Double value2) {
            addCriterion("WATERWAY_TIMES not between", value1, value2, "waterwayTimes");
            return (Criteria) this;
        }

        public Criteria andEateryIsNull() {
            addCriterion("EATERY is null");
            return (Criteria) this;
        }

        public Criteria andEateryIsNotNull() {
            addCriterion("EATERY is not null");
            return (Criteria) this;
        }

        public Criteria andEateryEqualTo(Integer value) {
            addCriterion("EATERY =", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryNotEqualTo(Integer value) {
            addCriterion("EATERY <>", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryGreaterThan(Integer value) {
            addCriterion("EATERY >", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryGreaterThanOrEqualTo(Integer value) {
            addCriterion("EATERY >=", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryLessThan(Integer value) {
            addCriterion("EATERY <", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryLessThanOrEqualTo(Integer value) {
            addCriterion("EATERY <=", value, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryIn(List<Integer> values) {
            addCriterion("EATERY in", values, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryNotIn(List<Integer> values) {
            addCriterion("EATERY not in", values, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryBetween(Integer value1, Integer value2) {
            addCriterion("EATERY between", value1, value2, "eatery");
            return (Criteria) this;
        }

        public Criteria andEateryNotBetween(Integer value1, Integer value2) {
            addCriterion("EATERY not between", value1, value2, "eatery");
            return (Criteria) this;
        }

        public Criteria andSnackIsNull() {
            addCriterion("SNACK is null");
            return (Criteria) this;
        }

        public Criteria andSnackIsNotNull() {
            addCriterion("SNACK is not null");
            return (Criteria) this;
        }

        public Criteria andSnackEqualTo(Integer value) {
            addCriterion("SNACK =", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackNotEqualTo(Integer value) {
            addCriterion("SNACK <>", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackGreaterThan(Integer value) {
            addCriterion("SNACK >", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackGreaterThanOrEqualTo(Integer value) {
            addCriterion("SNACK >=", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackLessThan(Integer value) {
            addCriterion("SNACK <", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackLessThanOrEqualTo(Integer value) {
            addCriterion("SNACK <=", value, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackIn(List<Integer> values) {
            addCriterion("SNACK in", values, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackNotIn(List<Integer> values) {
            addCriterion("SNACK not in", values, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackBetween(Integer value1, Integer value2) {
            addCriterion("SNACK between", value1, value2, "snack");
            return (Criteria) this;
        }

        public Criteria andSnackNotBetween(Integer value1, Integer value2) {
            addCriterion("SNACK not between", value1, value2, "snack");
            return (Criteria) this;
        }

        public Criteria andGasStationIsNull() {
            addCriterion("GAS_STATION is null");
            return (Criteria) this;
        }

        public Criteria andGasStationIsNotNull() {
            addCriterion("GAS_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andGasStationEqualTo(Integer value) {
            addCriterion("GAS_STATION =", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationNotEqualTo(Integer value) {
            addCriterion("GAS_STATION <>", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationGreaterThan(Integer value) {
            addCriterion("GAS_STATION >", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationGreaterThanOrEqualTo(Integer value) {
            addCriterion("GAS_STATION >=", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationLessThan(Integer value) {
            addCriterion("GAS_STATION <", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationLessThanOrEqualTo(Integer value) {
            addCriterion("GAS_STATION <=", value, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationIn(List<Integer> values) {
            addCriterion("GAS_STATION in", values, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationNotIn(List<Integer> values) {
            addCriterion("GAS_STATION not in", values, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationBetween(Integer value1, Integer value2) {
            addCriterion("GAS_STATION between", value1, value2, "gasStation");
            return (Criteria) this;
        }

        public Criteria andGasStationNotBetween(Integer value1, Integer value2) {
            addCriterion("GAS_STATION not between", value1, value2, "gasStation");
            return (Criteria) this;
        }

        public Criteria andRepairIsNull() {
            addCriterion("REPAIR is null");
            return (Criteria) this;
        }

        public Criteria andRepairIsNotNull() {
            addCriterion("REPAIR is not null");
            return (Criteria) this;
        }

        public Criteria andRepairEqualTo(Integer value) {
            addCriterion("REPAIR =", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotEqualTo(Integer value) {
            addCriterion("REPAIR <>", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThan(Integer value) {
            addCriterion("REPAIR >", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAIR >=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThan(Integer value) {
            addCriterion("REPAIR <", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThanOrEqualTo(Integer value) {
            addCriterion("REPAIR <=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairIn(List<Integer> values) {
            addCriterion("REPAIR in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotIn(List<Integer> values) {
            addCriterion("REPAIR not in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairBetween(Integer value1, Integer value2) {
            addCriterion("REPAIR between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAIR not between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andHotelIsNull() {
            addCriterion("HOTEL is null");
            return (Criteria) this;
        }

        public Criteria andHotelIsNotNull() {
            addCriterion("HOTEL is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEqualTo(Integer value) {
            addCriterion("HOTEL =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(Integer value) {
            addCriterion("HOTEL <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(Integer value) {
            addCriterion("HOTEL >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOTEL >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(Integer value) {
            addCriterion("HOTEL <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(Integer value) {
            addCriterion("HOTEL <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<Integer> values) {
            addCriterion("HOTEL in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<Integer> values) {
            addCriterion("HOTEL not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(Integer value1, Integer value2) {
            addCriterion("HOTEL between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(Integer value1, Integer value2) {
            addCriterion("HOTEL not between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelIsNull() {
            addCriterion("EXPRESS_HOTEL is null");
            return (Criteria) this;
        }

        public Criteria andExpressHotelIsNotNull() {
            addCriterion("EXPRESS_HOTEL is not null");
            return (Criteria) this;
        }

        public Criteria andExpressHotelEqualTo(Integer value) {
            addCriterion("EXPRESS_HOTEL =", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelNotEqualTo(Integer value) {
            addCriterion("EXPRESS_HOTEL <>", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelGreaterThan(Integer value) {
            addCriterion("EXPRESS_HOTEL >", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPRESS_HOTEL >=", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelLessThan(Integer value) {
            addCriterion("EXPRESS_HOTEL <", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelLessThanOrEqualTo(Integer value) {
            addCriterion("EXPRESS_HOTEL <=", value, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelIn(List<Integer> values) {
            addCriterion("EXPRESS_HOTEL in", values, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelNotIn(List<Integer> values) {
            addCriterion("EXPRESS_HOTEL not in", values, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelBetween(Integer value1, Integer value2) {
            addCriterion("EXPRESS_HOTEL between", value1, value2, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andExpressHotelNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPRESS_HOTEL not between", value1, value2, "expressHotel");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeIsNull() {
            addCriterion("COMMANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeIsNotNull() {
            addCriterion("COMMANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeEqualTo(String value) {
            addCriterion("COMMANY_TYPE =", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeNotEqualTo(String value) {
            addCriterion("COMMANY_TYPE <>", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeGreaterThan(String value) {
            addCriterion("COMMANY_TYPE >", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMANY_TYPE >=", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeLessThan(String value) {
            addCriterion("COMMANY_TYPE <", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeLessThanOrEqualTo(String value) {
            addCriterion("COMMANY_TYPE <=", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeLike(String value) {
            addCriterion("COMMANY_TYPE like", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeNotLike(String value) {
            addCriterion("COMMANY_TYPE not like", value, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeIn(List<String> values) {
            addCriterion("COMMANY_TYPE in", values, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeNotIn(List<String> values) {
            addCriterion("COMMANY_TYPE not in", values, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeBetween(String value1, String value2) {
            addCriterion("COMMANY_TYPE between", value1, value2, "commanyType");
            return (Criteria) this;
        }

        public Criteria andCommanyTypeNotBetween(String value1, String value2) {
            addCriterion("COMMANY_TYPE not between", value1, value2, "commanyType");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdIsNull() {
            addCriterion("WMS_OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdIsNotNull() {
            addCriterion("WMS_OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdEqualTo(String value) {
            addCriterion("WMS_OWNER_ID =", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdNotEqualTo(String value) {
            addCriterion("WMS_OWNER_ID <>", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdGreaterThan(String value) {
            addCriterion("WMS_OWNER_ID >", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("WMS_OWNER_ID >=", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdLessThan(String value) {
            addCriterion("WMS_OWNER_ID <", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("WMS_OWNER_ID <=", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdLike(String value) {
            addCriterion("WMS_OWNER_ID like", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdNotLike(String value) {
            addCriterion("WMS_OWNER_ID not like", value, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdIn(List<String> values) {
            addCriterion("WMS_OWNER_ID in", values, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdNotIn(List<String> values) {
            addCriterion("WMS_OWNER_ID not in", values, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdBetween(String value1, String value2) {
            addCriterion("WMS_OWNER_ID between", value1, value2, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andWmsOwnerIdNotBetween(String value1, String value2) {
            addCriterion("WMS_OWNER_ID not between", value1, value2, "wmsOwnerId");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailIsNull() {
            addCriterion("COMMANY_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailIsNotNull() {
            addCriterion("COMMANY_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailEqualTo(String value) {
            addCriterion("COMMANY_EMAIL =", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailNotEqualTo(String value) {
            addCriterion("COMMANY_EMAIL <>", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailGreaterThan(String value) {
            addCriterion("COMMANY_EMAIL >", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("COMMANY_EMAIL >=", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailLessThan(String value) {
            addCriterion("COMMANY_EMAIL <", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailLessThanOrEqualTo(String value) {
            addCriterion("COMMANY_EMAIL <=", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailLike(String value) {
            addCriterion("COMMANY_EMAIL like", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailNotLike(String value) {
            addCriterion("COMMANY_EMAIL not like", value, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailIn(List<String> values) {
            addCriterion("COMMANY_EMAIL in", values, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailNotIn(List<String> values) {
            addCriterion("COMMANY_EMAIL not in", values, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailBetween(String value1, String value2) {
            addCriterion("COMMANY_EMAIL between", value1, value2, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andCommanyEmailNotBetween(String value1, String value2) {
            addCriterion("COMMANY_EMAIL not between", value1, value2, "commanyEmail");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNull() {
            addCriterion("ACCOUNT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNotNull() {
            addCriterion("ACCOUNT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankEqualTo(String value) {
            addCriterion("ACCOUNT_BANK =", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <>", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThan(String value) {
            addCriterion("ACCOUNT_BANK >", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK >=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThan(String value) {
            addCriterion("ACCOUNT_BANK <", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLike(String value) {
            addCriterion("ACCOUNT_BANK like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotLike(String value) {
            addCriterion("ACCOUNT_BANK not like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIn(List<String> values) {
            addCriterion("ACCOUNT_BANK in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotIn(List<String> values) {
            addCriterion("ACCOUNT_BANK not in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK not between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeIsNull() {
            addCriterion("CHANGE_BILL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeIsNotNull() {
            addCriterion("CHANGE_BILL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeEqualTo(String value) {
            addCriterion("CHANGE_BILL_TIME =", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeNotEqualTo(String value) {
            addCriterion("CHANGE_BILL_TIME <>", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeGreaterThan(String value) {
            addCriterion("CHANGE_BILL_TIME >", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_BILL_TIME >=", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeLessThan(String value) {
            addCriterion("CHANGE_BILL_TIME <", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_BILL_TIME <=", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeLike(String value) {
            addCriterion("CHANGE_BILL_TIME like", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeNotLike(String value) {
            addCriterion("CHANGE_BILL_TIME not like", value, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeIn(List<String> values) {
            addCriterion("CHANGE_BILL_TIME in", values, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeNotIn(List<String> values) {
            addCriterion("CHANGE_BILL_TIME not in", values, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeBetween(String value1, String value2) {
            addCriterion("CHANGE_BILL_TIME between", value1, value2, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andChangeBillTimeNotBetween(String value1, String value2) {
            addCriterion("CHANGE_BILL_TIME not between", value1, value2, "changeBillTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeIsNull() {
            addCriterion("LOAD_CART_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeIsNotNull() {
            addCriterion("LOAD_CART_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeEqualTo(String value) {
            addCriterion("LOAD_CART_TIME =", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeNotEqualTo(String value) {
            addCriterion("LOAD_CART_TIME <>", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeGreaterThan(String value) {
            addCriterion("LOAD_CART_TIME >", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOAD_CART_TIME >=", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeLessThan(String value) {
            addCriterion("LOAD_CART_TIME <", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeLessThanOrEqualTo(String value) {
            addCriterion("LOAD_CART_TIME <=", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeLike(String value) {
            addCriterion("LOAD_CART_TIME like", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeNotLike(String value) {
            addCriterion("LOAD_CART_TIME not like", value, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeIn(List<String> values) {
            addCriterion("LOAD_CART_TIME in", values, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeNotIn(List<String> values) {
            addCriterion("LOAD_CART_TIME not in", values, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeBetween(String value1, String value2) {
            addCriterion("LOAD_CART_TIME between", value1, value2, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andLoadCartTimeNotBetween(String value1, String value2) {
            addCriterion("LOAD_CART_TIME not between", value1, value2, "loadCartTime");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateIsNull() {
            addCriterion("FAREN_CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateIsNotNull() {
            addCriterion("FAREN_CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateEqualTo(String value) {
            addCriterion("FAREN_CERTIFICATE =", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateNotEqualTo(String value) {
            addCriterion("FAREN_CERTIFICATE <>", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateGreaterThan(String value) {
            addCriterion("FAREN_CERTIFICATE >", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("FAREN_CERTIFICATE >=", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateLessThan(String value) {
            addCriterion("FAREN_CERTIFICATE <", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateLessThanOrEqualTo(String value) {
            addCriterion("FAREN_CERTIFICATE <=", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateLike(String value) {
            addCriterion("FAREN_CERTIFICATE like", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateNotLike(String value) {
            addCriterion("FAREN_CERTIFICATE not like", value, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateIn(List<String> values) {
            addCriterion("FAREN_CERTIFICATE in", values, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateNotIn(List<String> values) {
            addCriterion("FAREN_CERTIFICATE not in", values, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateBetween(String value1, String value2) {
            addCriterion("FAREN_CERTIFICATE between", value1, value2, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andFarenCertificateNotBetween(String value1, String value2) {
            addCriterion("FAREN_CERTIFICATE not between", value1, value2, "farenCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateIsNull() {
            addCriterion("ZUZHI_CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateIsNotNull() {
            addCriterion("ZUZHI_CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateEqualTo(String value) {
            addCriterion("ZUZHI_CERTIFICATE =", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateNotEqualTo(String value) {
            addCriterion("ZUZHI_CERTIFICATE <>", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateGreaterThan(String value) {
            addCriterion("ZUZHI_CERTIFICATE >", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZHI_CERTIFICATE >=", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateLessThan(String value) {
            addCriterion("ZUZHI_CERTIFICATE <", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateLessThanOrEqualTo(String value) {
            addCriterion("ZUZHI_CERTIFICATE <=", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateLike(String value) {
            addCriterion("ZUZHI_CERTIFICATE like", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateNotLike(String value) {
            addCriterion("ZUZHI_CERTIFICATE not like", value, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateIn(List<String> values) {
            addCriterion("ZUZHI_CERTIFICATE in", values, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateNotIn(List<String> values) {
            addCriterion("ZUZHI_CERTIFICATE not in", values, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateBetween(String value1, String value2) {
            addCriterion("ZUZHI_CERTIFICATE between", value1, value2, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andZuzhiCertificateNotBetween(String value1, String value2) {
            addCriterion("ZUZHI_CERTIFICATE not between", value1, value2, "zuzhiCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateIsNull() {
            addCriterion("SHUIWU_CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateIsNotNull() {
            addCriterion("SHUIWU_CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateEqualTo(String value) {
            addCriterion("SHUIWU_CERTIFICATE =", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateNotEqualTo(String value) {
            addCriterion("SHUIWU_CERTIFICATE <>", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateGreaterThan(String value) {
            addCriterion("SHUIWU_CERTIFICATE >", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("SHUIWU_CERTIFICATE >=", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateLessThan(String value) {
            addCriterion("SHUIWU_CERTIFICATE <", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateLessThanOrEqualTo(String value) {
            addCriterion("SHUIWU_CERTIFICATE <=", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateLike(String value) {
            addCriterion("SHUIWU_CERTIFICATE like", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateNotLike(String value) {
            addCriterion("SHUIWU_CERTIFICATE not like", value, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateIn(List<String> values) {
            addCriterion("SHUIWU_CERTIFICATE in", values, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateNotIn(List<String> values) {
            addCriterion("SHUIWU_CERTIFICATE not in", values, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateBetween(String value1, String value2) {
            addCriterion("SHUIWU_CERTIFICATE between", value1, value2, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andShuiwuCertificateNotBetween(String value1, String value2) {
            addCriterion("SHUIWU_CERTIFICATE not between", value1, value2, "shuiwuCertificate");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andFromSiteIsNull() {
            addCriterion("FROM_SITE is null");
            return (Criteria) this;
        }

        public Criteria andFromSiteIsNotNull() {
            addCriterion("FROM_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andFromSiteEqualTo(String value) {
            addCriterion("FROM_SITE =", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteNotEqualTo(String value) {
            addCriterion("FROM_SITE <>", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteGreaterThan(String value) {
            addCriterion("FROM_SITE >", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_SITE >=", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteLessThan(String value) {
            addCriterion("FROM_SITE <", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteLessThanOrEqualTo(String value) {
            addCriterion("FROM_SITE <=", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteLike(String value) {
            addCriterion("FROM_SITE like", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteNotLike(String value) {
            addCriterion("FROM_SITE not like", value, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteIn(List<String> values) {
            addCriterion("FROM_SITE in", values, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteNotIn(List<String> values) {
            addCriterion("FROM_SITE not in", values, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteBetween(String value1, String value2) {
            addCriterion("FROM_SITE between", value1, value2, "fromSite");
            return (Criteria) this;
        }

        public Criteria andFromSiteNotBetween(String value1, String value2) {
            addCriterion("FROM_SITE not between", value1, value2, "fromSite");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateIsNull() {
            addCriterion("SITE_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateIsNotNull() {
            addCriterion("SITE_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateEqualTo(Date value) {
            addCriterion("SITE_UPDATE_DATE =", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateNotEqualTo(Date value) {
            addCriterion("SITE_UPDATE_DATE <>", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateGreaterThan(Date value) {
            addCriterion("SITE_UPDATE_DATE >", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SITE_UPDATE_DATE >=", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateLessThan(Date value) {
            addCriterion("SITE_UPDATE_DATE <", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("SITE_UPDATE_DATE <=", value, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateIn(List<Date> values) {
            addCriterion("SITE_UPDATE_DATE in", values, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateNotIn(List<Date> values) {
            addCriterion("SITE_UPDATE_DATE not in", values, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateBetween(Date value1, Date value2) {
            addCriterion("SITE_UPDATE_DATE between", value1, value2, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSiteUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("SITE_UPDATE_DATE not between", value1, value2, "siteUpdateDate");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("IS_SHOW =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("IS_SHOW <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("IS_SHOW >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("IS_SHOW <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("IS_SHOW like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("IS_SHOW not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("IS_SHOW in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("IS_SHOW not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("IS_SHOW between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNull() {
            addCriterion("LOGO_PATH is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("LOGO_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("LOGO_PATH =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("LOGO_PATH <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("LOGO_PATH >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_PATH >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("LOGO_PATH <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("LOGO_PATH <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("LOGO_PATH like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("LOGO_PATH not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("LOGO_PATH in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("LOGO_PATH not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("LOGO_PATH between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("LOGO_PATH not between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidIsNull() {
            addCriterion("CHANGE_LOG_GUID is null");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidIsNotNull() {
            addCriterion("CHANGE_LOG_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidEqualTo(String value) {
            addCriterion("CHANGE_LOG_GUID =", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidNotEqualTo(String value) {
            addCriterion("CHANGE_LOG_GUID <>", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidGreaterThan(String value) {
            addCriterion("CHANGE_LOG_GUID >", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_LOG_GUID >=", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidLessThan(String value) {
            addCriterion("CHANGE_LOG_GUID <", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_LOG_GUID <=", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidLike(String value) {
            addCriterion("CHANGE_LOG_GUID like", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidNotLike(String value) {
            addCriterion("CHANGE_LOG_GUID not like", value, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidIn(List<String> values) {
            addCriterion("CHANGE_LOG_GUID in", values, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidNotIn(List<String> values) {
            addCriterion("CHANGE_LOG_GUID not in", values, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidBetween(String value1, String value2) {
            addCriterion("CHANGE_LOG_GUID between", value1, value2, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andChangeLogGuidNotBetween(String value1, String value2) {
            addCriterion("CHANGE_LOG_GUID not between", value1, value2, "changeLogGuid");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIsNull() {
            addCriterion("SALE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIsNotNull() {
            addCriterion("SALE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdEqualTo(String value) {
            addCriterion("SALE_USER_ID =", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotEqualTo(String value) {
            addCriterion("SALE_USER_ID <>", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdGreaterThan(String value) {
            addCriterion("SALE_USER_ID >", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_USER_ID >=", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdLessThan(String value) {
            addCriterion("SALE_USER_ID <", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdLessThanOrEqualTo(String value) {
            addCriterion("SALE_USER_ID <=", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdLike(String value) {
            addCriterion("SALE_USER_ID like", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotLike(String value) {
            addCriterion("SALE_USER_ID not like", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIn(List<String> values) {
            addCriterion("SALE_USER_ID in", values, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotIn(List<String> values) {
            addCriterion("SALE_USER_ID not in", values, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdBetween(String value1, String value2) {
            addCriterion("SALE_USER_ID between", value1, value2, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotBetween(String value1, String value2) {
            addCriterion("SALE_USER_ID not between", value1, value2, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNull() {
            addCriterion("OPERATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNotNull() {
            addCriterion("OPERATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdEqualTo(String value) {
            addCriterion("OPERATE_USER_ID =", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotEqualTo(String value) {
            addCriterion("OPERATE_USER_ID <>", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThan(String value) {
            addCriterion("OPERATE_USER_ID >", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_USER_ID >=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThan(String value) {
            addCriterion("OPERATE_USER_ID <", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_USER_ID <=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLike(String value) {
            addCriterion("OPERATE_USER_ID like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotLike(String value) {
            addCriterion("OPERATE_USER_ID not like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIn(List<String> values) {
            addCriterion("OPERATE_USER_ID in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotIn(List<String> values) {
            addCriterion("OPERATE_USER_ID not in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdBetween(String value1, String value2) {
            addCriterion("OPERATE_USER_ID between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotBetween(String value1, String value2) {
            addCriterion("OPERATE_USER_ID not between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessIsNull() {
            addCriterion("IS_OPERATE_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessIsNotNull() {
            addCriterion("IS_OPERATE_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessEqualTo(String value) {
            addCriterion("IS_OPERATE_BUSINESS =", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessNotEqualTo(String value) {
            addCriterion("IS_OPERATE_BUSINESS <>", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessGreaterThan(String value) {
            addCriterion("IS_OPERATE_BUSINESS >", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPERATE_BUSINESS >=", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessLessThan(String value) {
            addCriterion("IS_OPERATE_BUSINESS <", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessLessThanOrEqualTo(String value) {
            addCriterion("IS_OPERATE_BUSINESS <=", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessLike(String value) {
            addCriterion("IS_OPERATE_BUSINESS like", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessNotLike(String value) {
            addCriterion("IS_OPERATE_BUSINESS not like", value, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessIn(List<String> values) {
            addCriterion("IS_OPERATE_BUSINESS in", values, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessNotIn(List<String> values) {
            addCriterion("IS_OPERATE_BUSINESS not in", values, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessBetween(String value1, String value2) {
            addCriterion("IS_OPERATE_BUSINESS between", value1, value2, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andIsOperateBusinessNotBetween(String value1, String value2) {
            addCriterion("IS_OPERATE_BUSINESS not between", value1, value2, "isOperateBusiness");
            return (Criteria) this;
        }

        public Criteria andStoreSignIsNull() {
            addCriterion("STORE_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andStoreSignIsNotNull() {
            addCriterion("STORE_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSignEqualTo(String value) {
            addCriterion("STORE_SIGN =", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignNotEqualTo(String value) {
            addCriterion("STORE_SIGN <>", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignGreaterThan(String value) {
            addCriterion("STORE_SIGN >", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_SIGN >=", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignLessThan(String value) {
            addCriterion("STORE_SIGN <", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignLessThanOrEqualTo(String value) {
            addCriterion("STORE_SIGN <=", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignLike(String value) {
            addCriterion("STORE_SIGN like", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignNotLike(String value) {
            addCriterion("STORE_SIGN not like", value, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignIn(List<String> values) {
            addCriterion("STORE_SIGN in", values, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignNotIn(List<String> values) {
            addCriterion("STORE_SIGN not in", values, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignBetween(String value1, String value2) {
            addCriterion("STORE_SIGN between", value1, value2, "storeSign");
            return (Criteria) this;
        }

        public Criteria andStoreSignNotBetween(String value1, String value2) {
            addCriterion("STORE_SIGN not between", value1, value2, "storeSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignIsNull() {
            addCriterion("OWNER_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andOwnerSignIsNotNull() {
            addCriterion("OWNER_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerSignEqualTo(String value) {
            addCriterion("OWNER_SIGN =", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignNotEqualTo(String value) {
            addCriterion("OWNER_SIGN <>", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignGreaterThan(String value) {
            addCriterion("OWNER_SIGN >", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_SIGN >=", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignLessThan(String value) {
            addCriterion("OWNER_SIGN <", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignLessThanOrEqualTo(String value) {
            addCriterion("OWNER_SIGN <=", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignLike(String value) {
            addCriterion("OWNER_SIGN like", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignNotLike(String value) {
            addCriterion("OWNER_SIGN not like", value, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignIn(List<String> values) {
            addCriterion("OWNER_SIGN in", values, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignNotIn(List<String> values) {
            addCriterion("OWNER_SIGN not in", values, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignBetween(String value1, String value2) {
            addCriterion("OWNER_SIGN between", value1, value2, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andOwnerSignNotBetween(String value1, String value2) {
            addCriterion("OWNER_SIGN not between", value1, value2, "ownerSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignIsNull() {
            addCriterion("PLATFORM_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andPlatformSignIsNotNull() {
            addCriterion("PLATFORM_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformSignEqualTo(String value) {
            addCriterion("PLATFORM_SIGN =", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignNotEqualTo(String value) {
            addCriterion("PLATFORM_SIGN <>", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignGreaterThan(String value) {
            addCriterion("PLATFORM_SIGN >", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_SIGN >=", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignLessThan(String value) {
            addCriterion("PLATFORM_SIGN <", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_SIGN <=", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignLike(String value) {
            addCriterion("PLATFORM_SIGN like", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignNotLike(String value) {
            addCriterion("PLATFORM_SIGN not like", value, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignIn(List<String> values) {
            addCriterion("PLATFORM_SIGN in", values, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignNotIn(List<String> values) {
            addCriterion("PLATFORM_SIGN not in", values, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignBetween(String value1, String value2) {
            addCriterion("PLATFORM_SIGN between", value1, value2, "platformSign");
            return (Criteria) this;
        }

        public Criteria andPlatformSignNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_SIGN not between", value1, value2, "platformSign");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameIsNull() {
            addCriterion("NICK_STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameIsNotNull() {
            addCriterion("NICK_STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameEqualTo(String value) {
            addCriterion("NICK_STORE_NAME =", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameNotEqualTo(String value) {
            addCriterion("NICK_STORE_NAME <>", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameGreaterThan(String value) {
            addCriterion("NICK_STORE_NAME >", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_STORE_NAME >=", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameLessThan(String value) {
            addCriterion("NICK_STORE_NAME <", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_STORE_NAME <=", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameLike(String value) {
            addCriterion("NICK_STORE_NAME like", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameNotLike(String value) {
            addCriterion("NICK_STORE_NAME not like", value, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameIn(List<String> values) {
            addCriterion("NICK_STORE_NAME in", values, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameNotIn(List<String> values) {
            addCriterion("NICK_STORE_NAME not in", values, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameBetween(String value1, String value2) {
            addCriterion("NICK_STORE_NAME between", value1, value2, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andNickStoreNameNotBetween(String value1, String value2) {
            addCriterion("NICK_STORE_NAME not between", value1, value2, "nickStoreName");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxIsNull() {
            addCriterion("YC_AUTHORIZATION_FAX is null");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxIsNotNull() {
            addCriterion("YC_AUTHORIZATION_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_FAX =", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxNotEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_FAX <>", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxGreaterThan(String value) {
            addCriterion("YC_AUTHORIZATION_FAX >", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxGreaterThanOrEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_FAX >=", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxLessThan(String value) {
            addCriterion("YC_AUTHORIZATION_FAX <", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxLessThanOrEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_FAX <=", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxLike(String value) {
            addCriterion("YC_AUTHORIZATION_FAX like", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxNotLike(String value) {
            addCriterion("YC_AUTHORIZATION_FAX not like", value, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxIn(List<String> values) {
            addCriterion("YC_AUTHORIZATION_FAX in", values, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxNotIn(List<String> values) {
            addCriterion("YC_AUTHORIZATION_FAX not in", values, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxBetween(String value1, String value2) {
            addCriterion("YC_AUTHORIZATION_FAX between", value1, value2, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationFaxNotBetween(String value1, String value2) {
            addCriterion("YC_AUTHORIZATION_FAX not between", value1, value2, "ycAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueIsNull() {
            addCriterion("YC_AUTHORIZATION_TRUE is null");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueIsNotNull() {
            addCriterion("YC_AUTHORIZATION_TRUE is not null");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE =", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueNotEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE <>", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueGreaterThan(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE >", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueGreaterThanOrEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE >=", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueLessThan(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE <", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueLessThanOrEqualTo(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE <=", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueLike(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE like", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueNotLike(String value) {
            addCriterion("YC_AUTHORIZATION_TRUE not like", value, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueIn(List<String> values) {
            addCriterion("YC_AUTHORIZATION_TRUE in", values, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueNotIn(List<String> values) {
            addCriterion("YC_AUTHORIZATION_TRUE not in", values, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueBetween(String value1, String value2) {
            addCriterion("YC_AUTHORIZATION_TRUE between", value1, value2, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andYcAuthorizationTrueNotBetween(String value1, String value2) {
            addCriterion("YC_AUTHORIZATION_TRUE not between", value1, value2, "ycAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andPutinAmountIsNull() {
            addCriterion("PUTIN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPutinAmountIsNotNull() {
            addCriterion("PUTIN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPutinAmountEqualTo(String value) {
            addCriterion("PUTIN_AMOUNT =", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountNotEqualTo(String value) {
            addCriterion("PUTIN_AMOUNT <>", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountGreaterThan(String value) {
            addCriterion("PUTIN_AMOUNT >", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountGreaterThanOrEqualTo(String value) {
            addCriterion("PUTIN_AMOUNT >=", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountLessThan(String value) {
            addCriterion("PUTIN_AMOUNT <", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountLessThanOrEqualTo(String value) {
            addCriterion("PUTIN_AMOUNT <=", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountLike(String value) {
            addCriterion("PUTIN_AMOUNT like", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountNotLike(String value) {
            addCriterion("PUTIN_AMOUNT not like", value, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountIn(List<String> values) {
            addCriterion("PUTIN_AMOUNT in", values, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountNotIn(List<String> values) {
            addCriterion("PUTIN_AMOUNT not in", values, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountBetween(String value1, String value2) {
            addCriterion("PUTIN_AMOUNT between", value1, value2, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andPutinAmountNotBetween(String value1, String value2) {
            addCriterion("PUTIN_AMOUNT not between", value1, value2, "putinAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountIsNull() {
            addCriterion("PROCESS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProcessAmountIsNotNull() {
            addCriterion("PROCESS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProcessAmountEqualTo(String value) {
            addCriterion("PROCESS_AMOUNT =", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountNotEqualTo(String value) {
            addCriterion("PROCESS_AMOUNT <>", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountGreaterThan(String value) {
            addCriterion("PROCESS_AMOUNT >", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_AMOUNT >=", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountLessThan(String value) {
            addCriterion("PROCESS_AMOUNT <", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_AMOUNT <=", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountLike(String value) {
            addCriterion("PROCESS_AMOUNT like", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountNotLike(String value) {
            addCriterion("PROCESS_AMOUNT not like", value, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountIn(List<String> values) {
            addCriterion("PROCESS_AMOUNT in", values, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountNotIn(List<String> values) {
            addCriterion("PROCESS_AMOUNT not in", values, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountBetween(String value1, String value2) {
            addCriterion("PROCESS_AMOUNT between", value1, value2, "processAmount");
            return (Criteria) this;
        }

        public Criteria andProcessAmountNotBetween(String value1, String value2) {
            addCriterion("PROCESS_AMOUNT not between", value1, value2, "processAmount");
            return (Criteria) this;
        }

        public Criteria andExchangePersonIsNull() {
            addCriterion("EXCHANGE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andExchangePersonIsNotNull() {
            addCriterion("EXCHANGE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePersonEqualTo(String value) {
            addCriterion("EXCHANGE_PERSON =", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonNotEqualTo(String value) {
            addCriterion("EXCHANGE_PERSON <>", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonGreaterThan(String value) {
            addCriterion("EXCHANGE_PERSON >", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_PERSON >=", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonLessThan(String value) {
            addCriterion("EXCHANGE_PERSON <", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_PERSON <=", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonLike(String value) {
            addCriterion("EXCHANGE_PERSON like", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonNotLike(String value) {
            addCriterion("EXCHANGE_PERSON not like", value, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonIn(List<String> values) {
            addCriterion("EXCHANGE_PERSON in", values, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonNotIn(List<String> values) {
            addCriterion("EXCHANGE_PERSON not in", values, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonBetween(String value1, String value2) {
            addCriterion("EXCHANGE_PERSON between", value1, value2, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePersonNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_PERSON not between", value1, value2, "exchangePerson");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneIsNull() {
            addCriterion("EXCHANGE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneIsNotNull() {
            addCriterion("EXCHANGE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneEqualTo(String value) {
            addCriterion("EXCHANGE_PHONE =", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneNotEqualTo(String value) {
            addCriterion("EXCHANGE_PHONE <>", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneGreaterThan(String value) {
            addCriterion("EXCHANGE_PHONE >", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_PHONE >=", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneLessThan(String value) {
            addCriterion("EXCHANGE_PHONE <", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_PHONE <=", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneLike(String value) {
            addCriterion("EXCHANGE_PHONE like", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneNotLike(String value) {
            addCriterion("EXCHANGE_PHONE not like", value, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneIn(List<String> values) {
            addCriterion("EXCHANGE_PHONE in", values, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneNotIn(List<String> values) {
            addCriterion("EXCHANGE_PHONE not in", values, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneBetween(String value1, String value2) {
            addCriterion("EXCHANGE_PHONE between", value1, value2, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andExchangePhoneNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_PHONE not between", value1, value2, "exchangePhone");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxIsNull() {
            addCriterion("APPLICATION_FAX is null");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxIsNotNull() {
            addCriterion("APPLICATION_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxEqualTo(String value) {
            addCriterion("APPLICATION_FAX =", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxNotEqualTo(String value) {
            addCriterion("APPLICATION_FAX <>", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxGreaterThan(String value) {
            addCriterion("APPLICATION_FAX >", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_FAX >=", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxLessThan(String value) {
            addCriterion("APPLICATION_FAX <", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_FAX <=", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxLike(String value) {
            addCriterion("APPLICATION_FAX like", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxNotLike(String value) {
            addCriterion("APPLICATION_FAX not like", value, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxIn(List<String> values) {
            addCriterion("APPLICATION_FAX in", values, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxNotIn(List<String> values) {
            addCriterion("APPLICATION_FAX not in", values, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxBetween(String value1, String value2) {
            addCriterion("APPLICATION_FAX between", value1, value2, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationFaxNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_FAX not between", value1, value2, "applicationFax");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueIsNull() {
            addCriterion("APPLICATION_TRUE is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueIsNotNull() {
            addCriterion("APPLICATION_TRUE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueEqualTo(String value) {
            addCriterion("APPLICATION_TRUE =", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueNotEqualTo(String value) {
            addCriterion("APPLICATION_TRUE <>", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueGreaterThan(String value) {
            addCriterion("APPLICATION_TRUE >", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_TRUE >=", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueLessThan(String value) {
            addCriterion("APPLICATION_TRUE <", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_TRUE <=", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueLike(String value) {
            addCriterion("APPLICATION_TRUE like", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueNotLike(String value) {
            addCriterion("APPLICATION_TRUE not like", value, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueIn(List<String> values) {
            addCriterion("APPLICATION_TRUE in", values, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueNotIn(List<String> values) {
            addCriterion("APPLICATION_TRUE not in", values, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueBetween(String value1, String value2) {
            addCriterion("APPLICATION_TRUE between", value1, value2, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andApplicationTrueNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_TRUE not between", value1, value2, "applicationTrue");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagIsNull() {
            addCriterion("COOPERATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagIsNotNull() {
            addCriterion("COOPERATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagEqualTo(String value) {
            addCriterion("COOPERATION_FLAG =", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagNotEqualTo(String value) {
            addCriterion("COOPERATION_FLAG <>", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagGreaterThan(String value) {
            addCriterion("COOPERATION_FLAG >", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COOPERATION_FLAG >=", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagLessThan(String value) {
            addCriterion("COOPERATION_FLAG <", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagLessThanOrEqualTo(String value) {
            addCriterion("COOPERATION_FLAG <=", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagLike(String value) {
            addCriterion("COOPERATION_FLAG like", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagNotLike(String value) {
            addCriterion("COOPERATION_FLAG not like", value, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagIn(List<String> values) {
            addCriterion("COOPERATION_FLAG in", values, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagNotIn(List<String> values) {
            addCriterion("COOPERATION_FLAG not in", values, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagBetween(String value1, String value2) {
            addCriterion("COOPERATION_FLAG between", value1, value2, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andCooperationFlagNotBetween(String value1, String value2) {
            addCriterion("COOPERATION_FLAG not between", value1, value2, "cooperationFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagIsNull() {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagIsNotNull() {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagEqualTo(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG =", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagNotEqualTo(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG <>", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagGreaterThan(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG >", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG >=", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagLessThan(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG <", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagLessThanOrEqualTo(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG <=", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagLike(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG like", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagNotLike(String value) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG not like", value, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagIn(List<String> values) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG in", values, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagNotIn(List<String> values) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG not in", values, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagBetween(String value1, String value2) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG between", value1, value2, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andStoreVirtualShelvesFlagNotBetween(String value1, String value2) {
            addCriterion("STORE_VIRTUAL_SHELVES_FLAG not between", value1, value2, "storeVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagIsNull() {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagIsNotNull() {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagEqualTo(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG =", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagNotEqualTo(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG <>", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagGreaterThan(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG >", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG >=", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagLessThan(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG <", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagLessThanOrEqualTo(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG <=", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagLike(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG like", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagNotLike(String value) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG not like", value, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagIn(List<String> values) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG in", values, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagNotIn(List<String> values) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG not in", values, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagBetween(String value1, String value2) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG between", value1, value2, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerVirtualShelvesFlagNotBetween(String value1, String value2) {
            addCriterion("OWNER_VIRTUAL_SHELVES_FLAG not between", value1, value2, "ownerVirtualShelvesFlag");
            return (Criteria) this;
        }

        public Criteria andIfBindCapIsNull() {
            addCriterion("IF_BIND_CAP is null");
            return (Criteria) this;
        }

        public Criteria andIfBindCapIsNotNull() {
            addCriterion("IF_BIND_CAP is not null");
            return (Criteria) this;
        }

        public Criteria andIfBindCapEqualTo(String value) {
            addCriterion("IF_BIND_CAP =", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapNotEqualTo(String value) {
            addCriterion("IF_BIND_CAP <>", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapGreaterThan(String value) {
            addCriterion("IF_BIND_CAP >", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapGreaterThanOrEqualTo(String value) {
            addCriterion("IF_BIND_CAP >=", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapLessThan(String value) {
            addCriterion("IF_BIND_CAP <", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapLessThanOrEqualTo(String value) {
            addCriterion("IF_BIND_CAP <=", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapLike(String value) {
            addCriterion("IF_BIND_CAP like", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapNotLike(String value) {
            addCriterion("IF_BIND_CAP not like", value, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapIn(List<String> values) {
            addCriterion("IF_BIND_CAP in", values, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapNotIn(List<String> values) {
            addCriterion("IF_BIND_CAP not in", values, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapBetween(String value1, String value2) {
            addCriterion("IF_BIND_CAP between", value1, value2, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andIfBindCapNotBetween(String value1, String value2) {
            addCriterion("IF_BIND_CAP not between", value1, value2, "ifBindCap");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesIsNull() {
            addCriterion("RECEIPT_NODES is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesIsNotNull() {
            addCriterion("RECEIPT_NODES is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesEqualTo(String value) {
            addCriterion("RECEIPT_NODES =", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesNotEqualTo(String value) {
            addCriterion("RECEIPT_NODES <>", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesGreaterThan(String value) {
            addCriterion("RECEIPT_NODES >", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_NODES >=", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesLessThan(String value) {
            addCriterion("RECEIPT_NODES <", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_NODES <=", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesLike(String value) {
            addCriterion("RECEIPT_NODES like", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesNotLike(String value) {
            addCriterion("RECEIPT_NODES not like", value, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesIn(List<String> values) {
            addCriterion("RECEIPT_NODES in", values, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesNotIn(List<String> values) {
            addCriterion("RECEIPT_NODES not in", values, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesBetween(String value1, String value2) {
            addCriterion("RECEIPT_NODES between", value1, value2, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNodesNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_NODES not between", value1, value2, "receiptNodes");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxIsNull() {
            addCriterion("TRADE_AUTHORIZATION_FAX is null");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxIsNotNull() {
            addCriterion("TRADE_AUTHORIZATION_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX =", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxNotEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX <>", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxGreaterThan(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX >", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX >=", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxLessThan(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX <", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxLessThanOrEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX <=", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxLike(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX like", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxNotLike(String value) {
            addCriterion("TRADE_AUTHORIZATION_FAX not like", value, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxIn(List<String> values) {
            addCriterion("TRADE_AUTHORIZATION_FAX in", values, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxNotIn(List<String> values) {
            addCriterion("TRADE_AUTHORIZATION_FAX not in", values, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxBetween(String value1, String value2) {
            addCriterion("TRADE_AUTHORIZATION_FAX between", value1, value2, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationFaxNotBetween(String value1, String value2) {
            addCriterion("TRADE_AUTHORIZATION_FAX not between", value1, value2, "tradeAuthorizationFax");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueIsNull() {
            addCriterion("TRADE_AUTHORIZATION_TRUE is null");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueIsNotNull() {
            addCriterion("TRADE_AUTHORIZATION_TRUE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE =", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueNotEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE <>", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueGreaterThan(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE >", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE >=", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueLessThan(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE <", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueLessThanOrEqualTo(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE <=", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueLike(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE like", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueNotLike(String value) {
            addCriterion("TRADE_AUTHORIZATION_TRUE not like", value, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueIn(List<String> values) {
            addCriterion("TRADE_AUTHORIZATION_TRUE in", values, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueNotIn(List<String> values) {
            addCriterion("TRADE_AUTHORIZATION_TRUE not in", values, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueBetween(String value1, String value2) {
            addCriterion("TRADE_AUTHORIZATION_TRUE between", value1, value2, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeAuthorizationTrueNotBetween(String value1, String value2) {
            addCriterion("TRADE_AUTHORIZATION_TRUE not between", value1, value2, "tradeAuthorizationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxIsNull() {
            addCriterion("TRADE_APPLICATION_FAX is null");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxIsNotNull() {
            addCriterion("TRADE_APPLICATION_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_FAX =", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxNotEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_FAX <>", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxGreaterThan(String value) {
            addCriterion("TRADE_APPLICATION_FAX >", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_FAX >=", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxLessThan(String value) {
            addCriterion("TRADE_APPLICATION_FAX <", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxLessThanOrEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_FAX <=", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxLike(String value) {
            addCriterion("TRADE_APPLICATION_FAX like", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxNotLike(String value) {
            addCriterion("TRADE_APPLICATION_FAX not like", value, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxIn(List<String> values) {
            addCriterion("TRADE_APPLICATION_FAX in", values, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxNotIn(List<String> values) {
            addCriterion("TRADE_APPLICATION_FAX not in", values, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxBetween(String value1, String value2) {
            addCriterion("TRADE_APPLICATION_FAX between", value1, value2, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationFaxNotBetween(String value1, String value2) {
            addCriterion("TRADE_APPLICATION_FAX not between", value1, value2, "tradeApplicationFax");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueIsNull() {
            addCriterion("TRADE_APPLICATION_TRUE is null");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueIsNotNull() {
            addCriterion("TRADE_APPLICATION_TRUE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_TRUE =", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueNotEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_TRUE <>", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueGreaterThan(String value) {
            addCriterion("TRADE_APPLICATION_TRUE >", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_TRUE >=", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueLessThan(String value) {
            addCriterion("TRADE_APPLICATION_TRUE <", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueLessThanOrEqualTo(String value) {
            addCriterion("TRADE_APPLICATION_TRUE <=", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueLike(String value) {
            addCriterion("TRADE_APPLICATION_TRUE like", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueNotLike(String value) {
            addCriterion("TRADE_APPLICATION_TRUE not like", value, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueIn(List<String> values) {
            addCriterion("TRADE_APPLICATION_TRUE in", values, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueNotIn(List<String> values) {
            addCriterion("TRADE_APPLICATION_TRUE not in", values, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueBetween(String value1, String value2) {
            addCriterion("TRADE_APPLICATION_TRUE between", value1, value2, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTradeApplicationTrueNotBetween(String value1, String value2) {
            addCriterion("TRADE_APPLICATION_TRUE not between", value1, value2, "tradeApplicationTrue");
            return (Criteria) this;
        }

        public Criteria andTaxNumIsNull() {
            addCriterion("TAX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTaxNumIsNotNull() {
            addCriterion("TAX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNumEqualTo(String value) {
            addCriterion("TAX_NUM =", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotEqualTo(String value) {
            addCriterion("TAX_NUM <>", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumGreaterThan(String value) {
            addCriterion("TAX_NUM >", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_NUM >=", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLessThan(String value) {
            addCriterion("TAX_NUM <", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLessThanOrEqualTo(String value) {
            addCriterion("TAX_NUM <=", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLike(String value) {
            addCriterion("TAX_NUM like", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotLike(String value) {
            addCriterion("TAX_NUM not like", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumIn(List<String> values) {
            addCriterion("TAX_NUM in", values, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotIn(List<String> values) {
            addCriterion("TAX_NUM not in", values, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumBetween(String value1, String value2) {
            addCriterion("TAX_NUM between", value1, value2, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotBetween(String value1, String value2) {
            addCriterion("TAX_NUM not between", value1, value2, "taxNum");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdIsNull() {
            addCriterion("CAP_OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdIsNotNull() {
            addCriterion("CAP_OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdEqualTo(String value) {
            addCriterion("CAP_OWNER_ID =", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdNotEqualTo(String value) {
            addCriterion("CAP_OWNER_ID <>", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdGreaterThan(String value) {
            addCriterion("CAP_OWNER_ID >", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CAP_OWNER_ID >=", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdLessThan(String value) {
            addCriterion("CAP_OWNER_ID <", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("CAP_OWNER_ID <=", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdLike(String value) {
            addCriterion("CAP_OWNER_ID like", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdNotLike(String value) {
            addCriterion("CAP_OWNER_ID not like", value, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdIn(List<String> values) {
            addCriterion("CAP_OWNER_ID in", values, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdNotIn(List<String> values) {
            addCriterion("CAP_OWNER_ID not in", values, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdBetween(String value1, String value2) {
            addCriterion("CAP_OWNER_ID between", value1, value2, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andCapOwnerIdNotBetween(String value1, String value2) {
            addCriterion("CAP_OWNER_ID not between", value1, value2, "capOwnerId");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameIsNull() {
            addCriterion("LEGAL_FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameIsNotNull() {
            addCriterion("LEGAL_FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameEqualTo(String value) {
            addCriterion("LEGAL_FULL_NAME =", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameNotEqualTo(String value) {
            addCriterion("LEGAL_FULL_NAME <>", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameGreaterThan(String value) {
            addCriterion("LEGAL_FULL_NAME >", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_FULL_NAME >=", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameLessThan(String value) {
            addCriterion("LEGAL_FULL_NAME <", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_FULL_NAME <=", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameLike(String value) {
            addCriterion("LEGAL_FULL_NAME like", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameNotLike(String value) {
            addCriterion("LEGAL_FULL_NAME not like", value, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameIn(List<String> values) {
            addCriterion("LEGAL_FULL_NAME in", values, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameNotIn(List<String> values) {
            addCriterion("LEGAL_FULL_NAME not in", values, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameBetween(String value1, String value2) {
            addCriterion("LEGAL_FULL_NAME between", value1, value2, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andLegalFullNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_FULL_NAME not between", value1, value2, "legalFullName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameIsNull() {
            addCriterion("BUS_LICENCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameIsNotNull() {
            addCriterion("BUS_LICENCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameEqualTo(String value) {
            addCriterion("BUS_LICENCE_NAME =", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameNotEqualTo(String value) {
            addCriterion("BUS_LICENCE_NAME <>", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameGreaterThan(String value) {
            addCriterion("BUS_LICENCE_NAME >", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_LICENCE_NAME >=", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameLessThan(String value) {
            addCriterion("BUS_LICENCE_NAME <", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameLessThanOrEqualTo(String value) {
            addCriterion("BUS_LICENCE_NAME <=", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameLike(String value) {
            addCriterion("BUS_LICENCE_NAME like", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameNotLike(String value) {
            addCriterion("BUS_LICENCE_NAME not like", value, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameIn(List<String> values) {
            addCriterion("BUS_LICENCE_NAME in", values, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameNotIn(List<String> values) {
            addCriterion("BUS_LICENCE_NAME not in", values, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameBetween(String value1, String value2) {
            addCriterion("BUS_LICENCE_NAME between", value1, value2, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andBusLicenceNameNotBetween(String value1, String value2) {
            addCriterion("BUS_LICENCE_NAME not between", value1, value2, "busLicenceName");
            return (Criteria) this;
        }

        public Criteria andTcodeIsNull() {
            addCriterion("TCODE is null");
            return (Criteria) this;
        }

        public Criteria andTcodeIsNotNull() {
            addCriterion("TCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTcodeEqualTo(String value) {
            addCriterion("TCODE =", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeNotEqualTo(String value) {
            addCriterion("TCODE <>", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeGreaterThan(String value) {
            addCriterion("TCODE >", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TCODE >=", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeLessThan(String value) {
            addCriterion("TCODE <", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeLessThanOrEqualTo(String value) {
            addCriterion("TCODE <=", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeLike(String value) {
            addCriterion("TCODE like", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeNotLike(String value) {
            addCriterion("TCODE not like", value, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeIn(List<String> values) {
            addCriterion("TCODE in", values, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeNotIn(List<String> values) {
            addCriterion("TCODE not in", values, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeBetween(String value1, String value2) {
            addCriterion("TCODE between", value1, value2, "tcode");
            return (Criteria) this;
        }

        public Criteria andTcodeNotBetween(String value1, String value2) {
            addCriterion("TCODE not between", value1, value2, "tcode");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagIsNull() {
            addCriterion("AGENT_STORE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagIsNotNull() {
            addCriterion("AGENT_STORE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagEqualTo(String value) {
            addCriterion("AGENT_STORE_FLAG =", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagNotEqualTo(String value) {
            addCriterion("AGENT_STORE_FLAG <>", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagGreaterThan(String value) {
            addCriterion("AGENT_STORE_FLAG >", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_STORE_FLAG >=", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagLessThan(String value) {
            addCriterion("AGENT_STORE_FLAG <", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagLessThanOrEqualTo(String value) {
            addCriterion("AGENT_STORE_FLAG <=", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagLike(String value) {
            addCriterion("AGENT_STORE_FLAG like", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagNotLike(String value) {
            addCriterion("AGENT_STORE_FLAG not like", value, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagIn(List<String> values) {
            addCriterion("AGENT_STORE_FLAG in", values, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagNotIn(List<String> values) {
            addCriterion("AGENT_STORE_FLAG not in", values, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagBetween(String value1, String value2) {
            addCriterion("AGENT_STORE_FLAG between", value1, value2, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andAgentStoreFlagNotBetween(String value1, String value2) {
            addCriterion("AGENT_STORE_FLAG not between", value1, value2, "agentStoreFlag");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNull() {
            addCriterion("HOUSE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNotNull() {
            addCriterion("HOUSE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberEqualTo(String value) {
            addCriterion("HOUSE_NUMBER =", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotEqualTo(String value) {
            addCriterion("HOUSE_NUMBER <>", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThan(String value) {
            addCriterion("HOUSE_NUMBER >", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_NUMBER >=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThan(String value) {
            addCriterion("HOUSE_NUMBER <", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_NUMBER <=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLike(String value) {
            addCriterion("HOUSE_NUMBER like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotLike(String value) {
            addCriterion("HOUSE_NUMBER not like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIn(List<String> values) {
            addCriterion("HOUSE_NUMBER in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotIn(List<String> values) {
            addCriterion("HOUSE_NUMBER not in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberBetween(String value1, String value2) {
            addCriterion("HOUSE_NUMBER between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotBetween(String value1, String value2) {
            addCriterion("HOUSE_NUMBER not between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andMachingSignIsNull() {
            addCriterion("MACHING_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andMachingSignIsNotNull() {
            addCriterion("MACHING_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andMachingSignEqualTo(String value) {
            addCriterion("MACHING_SIGN =", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignNotEqualTo(String value) {
            addCriterion("MACHING_SIGN <>", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignGreaterThan(String value) {
            addCriterion("MACHING_SIGN >", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignGreaterThanOrEqualTo(String value) {
            addCriterion("MACHING_SIGN >=", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignLessThan(String value) {
            addCriterion("MACHING_SIGN <", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignLessThanOrEqualTo(String value) {
            addCriterion("MACHING_SIGN <=", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignLike(String value) {
            addCriterion("MACHING_SIGN like", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignNotLike(String value) {
            addCriterion("MACHING_SIGN not like", value, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignIn(List<String> values) {
            addCriterion("MACHING_SIGN in", values, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignNotIn(List<String> values) {
            addCriterion("MACHING_SIGN not in", values, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignBetween(String value1, String value2) {
            addCriterion("MACHING_SIGN between", value1, value2, "machingSign");
            return (Criteria) this;
        }

        public Criteria andMachingSignNotBetween(String value1, String value2) {
            addCriterion("MACHING_SIGN not between", value1, value2, "machingSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignIsNull() {
            addCriterion("WHARF_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andWharfSignIsNotNull() {
            addCriterion("WHARF_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andWharfSignEqualTo(String value) {
            addCriterion("WHARF_SIGN =", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignNotEqualTo(String value) {
            addCriterion("WHARF_SIGN <>", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignGreaterThan(String value) {
            addCriterion("WHARF_SIGN >", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignGreaterThanOrEqualTo(String value) {
            addCriterion("WHARF_SIGN >=", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignLessThan(String value) {
            addCriterion("WHARF_SIGN <", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignLessThanOrEqualTo(String value) {
            addCriterion("WHARF_SIGN <=", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignLike(String value) {
            addCriterion("WHARF_SIGN like", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignNotLike(String value) {
            addCriterion("WHARF_SIGN not like", value, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignIn(List<String> values) {
            addCriterion("WHARF_SIGN in", values, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignNotIn(List<String> values) {
            addCriterion("WHARF_SIGN not in", values, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignBetween(String value1, String value2) {
            addCriterion("WHARF_SIGN between", value1, value2, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andWharfSignNotBetween(String value1, String value2) {
            addCriterion("WHARF_SIGN not between", value1, value2, "wharfSign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignIsNull() {
            addCriterion("RAILWAY_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andRailwaySignIsNotNull() {
            addCriterion("RAILWAY_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andRailwaySignEqualTo(String value) {
            addCriterion("RAILWAY_SIGN =", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignNotEqualTo(String value) {
            addCriterion("RAILWAY_SIGN <>", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignGreaterThan(String value) {
            addCriterion("RAILWAY_SIGN >", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignGreaterThanOrEqualTo(String value) {
            addCriterion("RAILWAY_SIGN >=", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignLessThan(String value) {
            addCriterion("RAILWAY_SIGN <", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignLessThanOrEqualTo(String value) {
            addCriterion("RAILWAY_SIGN <=", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignLike(String value) {
            addCriterion("RAILWAY_SIGN like", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignNotLike(String value) {
            addCriterion("RAILWAY_SIGN not like", value, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignIn(List<String> values) {
            addCriterion("RAILWAY_SIGN in", values, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignNotIn(List<String> values) {
            addCriterion("RAILWAY_SIGN not in", values, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignBetween(String value1, String value2) {
            addCriterion("RAILWAY_SIGN between", value1, value2, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andRailwaySignNotBetween(String value1, String value2) {
            addCriterion("RAILWAY_SIGN not between", value1, value2, "railwaySign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignIsNull() {
            addCriterion("RECEIVINGPOINT_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignIsNotNull() {
            addCriterion("RECEIVINGPOINT_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignEqualTo(String value) {
            addCriterion("RECEIVINGPOINT_SIGN =", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignNotEqualTo(String value) {
            addCriterion("RECEIVINGPOINT_SIGN <>", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignGreaterThan(String value) {
            addCriterion("RECEIVINGPOINT_SIGN >", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVINGPOINT_SIGN >=", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignLessThan(String value) {
            addCriterion("RECEIVINGPOINT_SIGN <", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignLessThanOrEqualTo(String value) {
            addCriterion("RECEIVINGPOINT_SIGN <=", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignLike(String value) {
            addCriterion("RECEIVINGPOINT_SIGN like", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignNotLike(String value) {
            addCriterion("RECEIVINGPOINT_SIGN not like", value, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignIn(List<String> values) {
            addCriterion("RECEIVINGPOINT_SIGN in", values, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignNotIn(List<String> values) {
            addCriterion("RECEIVINGPOINT_SIGN not in", values, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignBetween(String value1, String value2) {
            addCriterion("RECEIVINGPOINT_SIGN between", value1, value2, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andReceivingpointSignNotBetween(String value1, String value2) {
            addCriterion("RECEIVINGPOINT_SIGN not between", value1, value2, "receivingpointSign");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagIsNull() {
            addCriterion("TAIXUN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagIsNotNull() {
            addCriterion("TAIXUN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagEqualTo(String value) {
            addCriterion("TAIXUN_FLAG =", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagNotEqualTo(String value) {
            addCriterion("TAIXUN_FLAG <>", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagGreaterThan(String value) {
            addCriterion("TAIXUN_FLAG >", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TAIXUN_FLAG >=", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagLessThan(String value) {
            addCriterion("TAIXUN_FLAG <", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagLessThanOrEqualTo(String value) {
            addCriterion("TAIXUN_FLAG <=", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagLike(String value) {
            addCriterion("TAIXUN_FLAG like", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagNotLike(String value) {
            addCriterion("TAIXUN_FLAG not like", value, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagIn(List<String> values) {
            addCriterion("TAIXUN_FLAG in", values, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagNotIn(List<String> values) {
            addCriterion("TAIXUN_FLAG not in", values, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagBetween(String value1, String value2) {
            addCriterion("TAIXUN_FLAG between", value1, value2, "taixunFlag");
            return (Criteria) this;
        }

        public Criteria andTaixunFlagNotBetween(String value1, String value2) {
            addCriterion("TAIXUN_FLAG not between", value1, value2, "taixunFlag");
            return (Criteria) this;
        }
    }

    /**
     * T_WL_STORE_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_WL_STORE_INFO 2019-12-05
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}