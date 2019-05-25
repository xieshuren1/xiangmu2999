package com.guigu.yaopin.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class DurgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DurgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDurgidIsNull() {
            addCriterion("durgid is null");
            return (Criteria) this;
        }

        public Criteria andDurgidIsNotNull() {
            addCriterion("durgid is not null");
            return (Criteria) this;
        }

        public Criteria andDurgidEqualTo(Integer value) {
            addCriterion("durgid =", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidNotEqualTo(Integer value) {
            addCriterion("durgid <>", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidGreaterThan(Integer value) {
            addCriterion("durgid >", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("durgid >=", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidLessThan(Integer value) {
            addCriterion("durgid <", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidLessThanOrEqualTo(Integer value) {
            addCriterion("durgid <=", value, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidIn(List<Integer> values) {
            addCriterion("durgid in", values, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidNotIn(List<Integer> values) {
            addCriterion("durgid not in", values, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidBetween(Integer value1, Integer value2) {
            addCriterion("durgid between", value1, value2, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgidNotBetween(Integer value1, Integer value2) {
            addCriterion("durgid not between", value1, value2, "durgid");
            return (Criteria) this;
        }

        public Criteria andDurgnameIsNull() {
            addCriterion("durgname is null");
            return (Criteria) this;
        }

        public Criteria andDurgnameIsNotNull() {
            addCriterion("durgname is not null");
            return (Criteria) this;
        }

        public Criteria andDurgnameEqualTo(String value) {
            addCriterion("durgname =", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotEqualTo(String value) {
            addCriterion("durgname <>", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThan(String value) {
            addCriterion("durgname >", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThanOrEqualTo(String value) {
            addCriterion("durgname >=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThan(String value) {
            addCriterion("durgname <", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThanOrEqualTo(String value) {
            addCriterion("durgname <=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLike(String value) {
            addCriterion("durgname like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotLike(String value) {
            addCriterion("durgname not like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameIn(List<String> values) {
            addCriterion("durgname in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotIn(List<String> values) {
            addCriterion("durgname not in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameBetween(String value1, String value2) {
            addCriterion("durgname between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotBetween(String value1, String value2) {
            addCriterion("durgname not between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeIsNull() {
            addCriterion("durgbarcode is null");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeIsNotNull() {
            addCriterion("durgbarcode is not null");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeEqualTo(String value) {
            addCriterion("durgbarcode =", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeNotEqualTo(String value) {
            addCriterion("durgbarcode <>", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeGreaterThan(String value) {
            addCriterion("durgbarcode >", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("durgbarcode >=", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeLessThan(String value) {
            addCriterion("durgbarcode <", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeLessThanOrEqualTo(String value) {
            addCriterion("durgbarcode <=", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeLike(String value) {
            addCriterion("durgbarcode like", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeNotLike(String value) {
            addCriterion("durgbarcode not like", value, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeIn(List<String> values) {
            addCriterion("durgbarcode in", values, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeNotIn(List<String> values) {
            addCriterion("durgbarcode not in", values, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeBetween(String value1, String value2) {
            addCriterion("durgbarcode between", value1, value2, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andDurgbarcodeNotBetween(String value1, String value2) {
            addCriterion("durgbarcode not between", value1, value2, "durgbarcode");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andDurgunitIsNull() {
            addCriterion("durgunit is null");
            return (Criteria) this;
        }

        public Criteria andDurgunitIsNotNull() {
            addCriterion("durgunit is not null");
            return (Criteria) this;
        }

        public Criteria andDurgunitEqualTo(String value) {
            addCriterion("durgunit =", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitNotEqualTo(String value) {
            addCriterion("durgunit <>", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitGreaterThan(String value) {
            addCriterion("durgunit >", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitGreaterThanOrEqualTo(String value) {
            addCriterion("durgunit >=", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitLessThan(String value) {
            addCriterion("durgunit <", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitLessThanOrEqualTo(String value) {
            addCriterion("durgunit <=", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitLike(String value) {
            addCriterion("durgunit like", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitNotLike(String value) {
            addCriterion("durgunit not like", value, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitIn(List<String> values) {
            addCriterion("durgunit in", values, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitNotIn(List<String> values) {
            addCriterion("durgunit not in", values, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitBetween(String value1, String value2) {
            addCriterion("durgunit between", value1, value2, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgunitNotBetween(String value1, String value2) {
            addCriterion("durgunit not between", value1, value2, "durgunit");
            return (Criteria) this;
        }

        public Criteria andDurgbidIsNull() {
            addCriterion("durgbid is null");
            return (Criteria) this;
        }

        public Criteria andDurgbidIsNotNull() {
            addCriterion("durgbid is not null");
            return (Criteria) this;
        }

        public Criteria andDurgbidEqualTo(String value) {
            addCriterion("durgbid =", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidNotEqualTo(String value) {
            addCriterion("durgbid <>", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidGreaterThan(String value) {
            addCriterion("durgbid >", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidGreaterThanOrEqualTo(String value) {
            addCriterion("durgbid >=", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidLessThan(String value) {
            addCriterion("durgbid <", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidLessThanOrEqualTo(String value) {
            addCriterion("durgbid <=", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidLike(String value) {
            addCriterion("durgbid like", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidNotLike(String value) {
            addCriterion("durgbid not like", value, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidIn(List<String> values) {
            addCriterion("durgbid in", values, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidNotIn(List<String> values) {
            addCriterion("durgbid not in", values, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidBetween(String value1, String value2) {
            addCriterion("durgbid between", value1, value2, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgbidNotBetween(String value1, String value2) {
            addCriterion("durgbid not between", value1, value2, "durgbid");
            return (Criteria) this;
        }

        public Criteria andDurgpriceIsNull() {
            addCriterion("durgprice is null");
            return (Criteria) this;
        }

        public Criteria andDurgpriceIsNotNull() {
            addCriterion("durgprice is not null");
            return (Criteria) this;
        }

        public Criteria andDurgpriceEqualTo(String value) {
            addCriterion("durgprice =", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceNotEqualTo(String value) {
            addCriterion("durgprice <>", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceGreaterThan(String value) {
            addCriterion("durgprice >", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceGreaterThanOrEqualTo(String value) {
            addCriterion("durgprice >=", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceLessThan(String value) {
            addCriterion("durgprice <", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceLessThanOrEqualTo(String value) {
            addCriterion("durgprice <=", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceLike(String value) {
            addCriterion("durgprice like", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceNotLike(String value) {
            addCriterion("durgprice not like", value, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceIn(List<String> values) {
            addCriterion("durgprice in", values, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceNotIn(List<String> values) {
            addCriterion("durgprice not in", values, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceBetween(String value1, String value2) {
            addCriterion("durgprice between", value1, value2, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgpriceNotBetween(String value1, String value2) {
            addCriterion("durgprice not between", value1, value2, "durgprice");
            return (Criteria) this;
        }

        public Criteria andDurgtypeIsNull() {
            addCriterion("durgtype is null");
            return (Criteria) this;
        }

        public Criteria andDurgtypeIsNotNull() {
            addCriterion("durgtype is not null");
            return (Criteria) this;
        }

        public Criteria andDurgtypeEqualTo(Integer value) {
            addCriterion("durgtype =", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeNotEqualTo(Integer value) {
            addCriterion("durgtype <>", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeGreaterThan(Integer value) {
            addCriterion("durgtype >", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("durgtype >=", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeLessThan(Integer value) {
            addCriterion("durgtype <", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeLessThanOrEqualTo(Integer value) {
            addCriterion("durgtype <=", value, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeIn(List<Integer> values) {
            addCriterion("durgtype in", values, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeNotIn(List<Integer> values) {
            addCriterion("durgtype not in", values, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeBetween(Integer value1, Integer value2) {
            addCriterion("durgtype between", value1, value2, "durgtype");
            return (Criteria) this;
        }

        public Criteria andDurgtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("durgtype not between", value1, value2, "durgtype");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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