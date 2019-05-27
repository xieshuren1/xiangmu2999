package com.guigu.yaopin.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumerExample() {
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

        public Criteria andConsumeridIsNull() {
            addCriterion("consumerid is null");
            return (Criteria) this;
        }

        public Criteria andConsumeridIsNotNull() {
            addCriterion("consumerid is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeridEqualTo(Integer value) {
            addCriterion("consumerid =", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridNotEqualTo(Integer value) {
            addCriterion("consumerid <>", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridGreaterThan(Integer value) {
            addCriterion("consumerid >", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumerid >=", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridLessThan(Integer value) {
            addCriterion("consumerid <", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridLessThanOrEqualTo(Integer value) {
            addCriterion("consumerid <=", value, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridIn(List<Integer> values) {
            addCriterion("consumerid in", values, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridNotIn(List<Integer> values) {
            addCriterion("consumerid not in", values, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridBetween(Integer value1, Integer value2) {
            addCriterion("consumerid between", value1, value2, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumeridNotBetween(Integer value1, Integer value2) {
            addCriterion("consumerid not between", value1, value2, "consumerid");
            return (Criteria) this;
        }

        public Criteria andConsumernameIsNull() {
            addCriterion("consumername is null");
            return (Criteria) this;
        }

        public Criteria andConsumernameIsNotNull() {
            addCriterion("consumername is not null");
            return (Criteria) this;
        }

        public Criteria andConsumernameEqualTo(String value) {
            addCriterion("consumername =", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotEqualTo(String value) {
            addCriterion("consumername <>", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameGreaterThan(String value) {
            addCriterion("consumername >", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameGreaterThanOrEqualTo(String value) {
            addCriterion("consumername >=", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLessThan(String value) {
            addCriterion("consumername <", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLessThanOrEqualTo(String value) {
            addCriterion("consumername <=", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLike(String value) {
            addCriterion("consumername like", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotLike(String value) {
            addCriterion("consumername not like", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameIn(List<String> values) {
            addCriterion("consumername in", values, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotIn(List<String> values) {
            addCriterion("consumername not in", values, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameBetween(String value1, String value2) {
            addCriterion("consumername between", value1, value2, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotBetween(String value1, String value2) {
            addCriterion("consumername not between", value1, value2, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsIsNull() {
            addCriterion("consumercontacts is null");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsIsNotNull() {
            addCriterion("consumercontacts is not null");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsEqualTo(String value) {
            addCriterion("consumercontacts =", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsNotEqualTo(String value) {
            addCriterion("consumercontacts <>", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsGreaterThan(String value) {
            addCriterion("consumercontacts >", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsGreaterThanOrEqualTo(String value) {
            addCriterion("consumercontacts >=", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsLessThan(String value) {
            addCriterion("consumercontacts <", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsLessThanOrEqualTo(String value) {
            addCriterion("consumercontacts <=", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsLike(String value) {
            addCriterion("consumercontacts like", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsNotLike(String value) {
            addCriterion("consumercontacts not like", value, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsIn(List<String> values) {
            addCriterion("consumercontacts in", values, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsNotIn(List<String> values) {
            addCriterion("consumercontacts not in", values, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsBetween(String value1, String value2) {
            addCriterion("consumercontacts between", value1, value2, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumercontactsNotBetween(String value1, String value2) {
            addCriterion("consumercontacts not between", value1, value2, "consumercontacts");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneIsNull() {
            addCriterion("consumerphone is null");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneIsNotNull() {
            addCriterion("consumerphone is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneEqualTo(String value) {
            addCriterion("consumerphone =", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneNotEqualTo(String value) {
            addCriterion("consumerphone <>", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneGreaterThan(String value) {
            addCriterion("consumerphone >", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("consumerphone >=", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneLessThan(String value) {
            addCriterion("consumerphone <", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneLessThanOrEqualTo(String value) {
            addCriterion("consumerphone <=", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneLike(String value) {
            addCriterion("consumerphone like", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneNotLike(String value) {
            addCriterion("consumerphone not like", value, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneIn(List<String> values) {
            addCriterion("consumerphone in", values, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneNotIn(List<String> values) {
            addCriterion("consumerphone not in", values, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneBetween(String value1, String value2) {
            addCriterion("consumerphone between", value1, value2, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andConsumerphoneNotBetween(String value1, String value2) {
            addCriterion("consumerphone not between", value1, value2, "consumerphone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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