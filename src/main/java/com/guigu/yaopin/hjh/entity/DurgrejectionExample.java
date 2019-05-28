package com.guigu.yaopin.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class DurgrejectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DurgrejectionExample() {
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

        public Criteria andDjidIsNull() {
            addCriterion("djid is null");
            return (Criteria) this;
        }

        public Criteria andDjidIsNotNull() {
            addCriterion("djid is not null");
            return (Criteria) this;
        }

        public Criteria andDjidEqualTo(Integer value) {
            addCriterion("djid =", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotEqualTo(Integer value) {
            addCriterion("djid <>", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThan(Integer value) {
            addCriterion("djid >", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("djid >=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThan(Integer value) {
            addCriterion("djid <", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThanOrEqualTo(Integer value) {
            addCriterion("djid <=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidIn(List<Integer> values) {
            addCriterion("djid in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotIn(List<Integer> values) {
            addCriterion("djid not in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidBetween(Integer value1, Integer value2) {
            addCriterion("djid between", value1, value2, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotBetween(Integer value1, Integer value2) {
            addCriterion("djid not between", value1, value2, "djid");
            return (Criteria) this;
        }

        public Criteria andDsidIsNull() {
            addCriterion("dsid is null");
            return (Criteria) this;
        }

        public Criteria andDsidIsNotNull() {
            addCriterion("dsid is not null");
            return (Criteria) this;
        }

        public Criteria andDsidEqualTo(Integer value) {
            addCriterion("dsid =", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotEqualTo(Integer value) {
            addCriterion("dsid <>", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThan(Integer value) {
            addCriterion("dsid >", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsid >=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThan(Integer value) {
            addCriterion("dsid <", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThanOrEqualTo(Integer value) {
            addCriterion("dsid <=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidIn(List<Integer> values) {
            addCriterion("dsid in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotIn(List<Integer> values) {
            addCriterion("dsid not in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidBetween(Integer value1, Integer value2) {
            addCriterion("dsid between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotBetween(Integer value1, Integer value2) {
            addCriterion("dsid not between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andDfidIsNull() {
            addCriterion("dfid is null");
            return (Criteria) this;
        }

        public Criteria andDfidIsNotNull() {
            addCriterion("dfid is not null");
            return (Criteria) this;
        }

        public Criteria andDfidEqualTo(Integer value) {
            addCriterion("dfid =", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotEqualTo(Integer value) {
            addCriterion("dfid <>", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidGreaterThan(Integer value) {
            addCriterion("dfid >", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dfid >=", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidLessThan(Integer value) {
            addCriterion("dfid <", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidLessThanOrEqualTo(Integer value) {
            addCriterion("dfid <=", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidIn(List<Integer> values) {
            addCriterion("dfid in", values, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotIn(List<Integer> values) {
            addCriterion("dfid not in", values, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidBetween(Integer value1, Integer value2) {
            addCriterion("dfid between", value1, value2, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotBetween(Integer value1, Integer value2) {
            addCriterion("dfid not between", value1, value2, "dfid");
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