package com.guigu.yaopin.dyj.pojo;

import java.util.ArrayList;
import java.util.List;

public class JueseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JueseExample() {
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

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJuesenameIsNull() {
            addCriterion("juesename is null");
            return (Criteria) this;
        }

        public Criteria andJuesenameIsNotNull() {
            addCriterion("juesename is not null");
            return (Criteria) this;
        }

        public Criteria andJuesenameEqualTo(String value) {
            addCriterion("juesename =", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameNotEqualTo(String value) {
            addCriterion("juesename <>", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameGreaterThan(String value) {
            addCriterion("juesename >", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameGreaterThanOrEqualTo(String value) {
            addCriterion("juesename >=", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameLessThan(String value) {
            addCriterion("juesename <", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameLessThanOrEqualTo(String value) {
            addCriterion("juesename <=", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameLike(String value) {
            addCriterion("juesename like", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameNotLike(String value) {
            addCriterion("juesename not like", value, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameIn(List<String> values) {
            addCriterion("juesename in", values, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameNotIn(List<String> values) {
            addCriterion("juesename not in", values, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameBetween(String value1, String value2) {
            addCriterion("juesename between", value1, value2, "juesename");
            return (Criteria) this;
        }

        public Criteria andJuesenameNotBetween(String value1, String value2) {
            addCriterion("juesename not between", value1, value2, "juesename");
            return (Criteria) this;
        }

        public Criteria andQuanxianIsNull() {
            addCriterion("quanxian is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianIsNotNull() {
            addCriterion("quanxian is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianEqualTo(String value) {
            addCriterion("quanxian =", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotEqualTo(String value) {
            addCriterion("quanxian <>", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianGreaterThan(String value) {
            addCriterion("quanxian >", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianGreaterThanOrEqualTo(String value) {
            addCriterion("quanxian >=", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianLessThan(String value) {
            addCriterion("quanxian <", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianLessThanOrEqualTo(String value) {
            addCriterion("quanxian <=", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianLike(String value) {
            addCriterion("quanxian like", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotLike(String value) {
            addCriterion("quanxian not like", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianIn(List<String> values) {
            addCriterion("quanxian in", values, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotIn(List<String> values) {
            addCriterion("quanxian not in", values, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianBetween(String value1, String value2) {
            addCriterion("quanxian between", value1, value2, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotBetween(String value1, String value2) {
            addCriterion("quanxian not between", value1, value2, "quanxian");
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