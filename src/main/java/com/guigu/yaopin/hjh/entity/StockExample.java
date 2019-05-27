package com.guigu.yaopin.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockidIsNull() {
            addCriterion("stockid is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("stockid is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(Integer value) {
            addCriterion("stockid =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(Integer value) {
            addCriterion("stockid <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(Integer value) {
            addCriterion("stockid >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockid >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(Integer value) {
            addCriterion("stockid <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(Integer value) {
            addCriterion("stockid <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<Integer> values) {
            addCriterion("stockid in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<Integer> values) {
            addCriterion("stockid not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(Integer value1, Integer value2) {
            addCriterion("stockid between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(Integer value1, Integer value2) {
            addCriterion("stockid not between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNull() {
            addCriterion("stocknum is null");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNotNull() {
            addCriterion("stocknum is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumEqualTo(Integer value) {
            addCriterion("stocknum =", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotEqualTo(Integer value) {
            addCriterion("stocknum <>", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThan(Integer value) {
            addCriterion("stocknum >", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocknum >=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThan(Integer value) {
            addCriterion("stocknum <", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThanOrEqualTo(Integer value) {
            addCriterion("stocknum <=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumIn(List<Integer> values) {
            addCriterion("stocknum in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotIn(List<Integer> values) {
            addCriterion("stocknum not in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumBetween(Integer value1, Integer value2) {
            addCriterion("stocknum between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotBetween(Integer value1, Integer value2) {
            addCriterion("stocknum not between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNull() {
            addCriterion("minstock is null");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNotNull() {
            addCriterion("minstock is not null");
            return (Criteria) this;
        }

        public Criteria andMinstockEqualTo(Integer value) {
            addCriterion("minstock =", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotEqualTo(Integer value) {
            addCriterion("minstock <>", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThan(Integer value) {
            addCriterion("minstock >", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("minstock >=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThan(Integer value) {
            addCriterion("minstock <", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThanOrEqualTo(Integer value) {
            addCriterion("minstock <=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockIn(List<Integer> values) {
            addCriterion("minstock in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotIn(List<Integer> values) {
            addCriterion("minstock not in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockBetween(Integer value1, Integer value2) {
            addCriterion("minstock between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotBetween(Integer value1, Integer value2) {
            addCriterion("minstock not between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
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