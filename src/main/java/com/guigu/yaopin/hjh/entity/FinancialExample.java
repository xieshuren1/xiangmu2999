package com.guigu.yaopin.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class FinancialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancialExample() {
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

        public Criteria andFinancialidIsNull() {
            addCriterion("financialid is null");
            return (Criteria) this;
        }

        public Criteria andFinancialidIsNotNull() {
            addCriterion("financialid is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialidEqualTo(Integer value) {
            addCriterion("financialid =", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidNotEqualTo(Integer value) {
            addCriterion("financialid <>", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidGreaterThan(Integer value) {
            addCriterion("financialid >", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("financialid >=", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidLessThan(Integer value) {
            addCriterion("financialid <", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidLessThanOrEqualTo(Integer value) {
            addCriterion("financialid <=", value, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidIn(List<Integer> values) {
            addCriterion("financialid in", values, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidNotIn(List<Integer> values) {
            addCriterion("financialid not in", values, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidBetween(Integer value1, Integer value2) {
            addCriterion("financialid between", value1, value2, "financialid");
            return (Criteria) this;
        }

        public Criteria andFinancialidNotBetween(Integer value1, Integer value2) {
            addCriterion("financialid not between", value1, value2, "financialid");
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andFinancialdateIsNull() {
            addCriterion("financialdate is null");
            return (Criteria) this;
        }

        public Criteria andFinancialdateIsNotNull() {
            addCriterion("financialdate is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialdateEqualTo(String value) {
            addCriterion("financialdate =", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateNotEqualTo(String value) {
            addCriterion("financialdate <>", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateGreaterThan(String value) {
            addCriterion("financialdate >", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateGreaterThanOrEqualTo(String value) {
            addCriterion("financialdate >=", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateLessThan(String value) {
            addCriterion("financialdate <", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateLessThanOrEqualTo(String value) {
            addCriterion("financialdate <=", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateLike(String value) {
            addCriterion("financialdate like", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateNotLike(String value) {
            addCriterion("financialdate not like", value, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateIn(List<String> values) {
            addCriterion("financialdate in", values, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateNotIn(List<String> values) {
            addCriterion("financialdate not in", values, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateBetween(String value1, String value2) {
            addCriterion("financialdate between", value1, value2, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialdateNotBetween(String value1, String value2) {
            addCriterion("financialdate not between", value1, value2, "financialdate");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyIsNull() {
            addCriterion("financialmoney is null");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyIsNotNull() {
            addCriterion("financialmoney is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyEqualTo(String value) {
            addCriterion("financialmoney =", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyNotEqualTo(String value) {
            addCriterion("financialmoney <>", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyGreaterThan(String value) {
            addCriterion("financialmoney >", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("financialmoney >=", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyLessThan(String value) {
            addCriterion("financialmoney <", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyLessThanOrEqualTo(String value) {
            addCriterion("financialmoney <=", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyLike(String value) {
            addCriterion("financialmoney like", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyNotLike(String value) {
            addCriterion("financialmoney not like", value, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyIn(List<String> values) {
            addCriterion("financialmoney in", values, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyNotIn(List<String> values) {
            addCriterion("financialmoney not in", values, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyBetween(String value1, String value2) {
            addCriterion("financialmoney between", value1, value2, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andFinancialmoneyNotBetween(String value1, String value2) {
            addCriterion("financialmoney not between", value1, value2, "financialmoney");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
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