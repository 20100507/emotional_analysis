package org.bianqi.web.wangyi.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentIntervalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentIntervalExample() {
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

        public Criteria andIntervalIdIsNull() {
            addCriterion("interval_id is null");
            return (Criteria) this;
        }

        public Criteria andIntervalIdIsNotNull() {
            addCriterion("interval_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalIdEqualTo(Integer value) {
            addCriterion("interval_id =", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdNotEqualTo(Integer value) {
            addCriterion("interval_id <>", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdGreaterThan(Integer value) {
            addCriterion("interval_id >", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval_id >=", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdLessThan(Integer value) {
            addCriterion("interval_id <", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdLessThanOrEqualTo(Integer value) {
            addCriterion("interval_id <=", value, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdIn(List<Integer> values) {
            addCriterion("interval_id in", values, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdNotIn(List<Integer> values) {
            addCriterion("interval_id not in", values, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdBetween(Integer value1, Integer value2) {
            addCriterion("interval_id between", value1, value2, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("interval_id not between", value1, value2, "intervalId");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeIsNull() {
            addCriterion("intervalTime is null");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeIsNotNull() {
            addCriterion("intervalTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeEqualTo(Integer value) {
            addCriterion("intervalTime =", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeNotEqualTo(Integer value) {
            addCriterion("intervalTime <>", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeGreaterThan(Integer value) {
            addCriterion("intervalTime >", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intervalTime >=", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeLessThan(Integer value) {
            addCriterion("intervalTime <", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("intervalTime <=", value, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeIn(List<Integer> values) {
            addCriterion("intervalTime in", values, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeNotIn(List<Integer> values) {
            addCriterion("intervalTime not in", values, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeBetween(Integer value1, Integer value2) {
            addCriterion("intervalTime between", value1, value2, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("intervalTime not between", value1, value2, "intervaltime");
            return (Criteria) this;
        }

        public Criteria andIntervalcountIsNull() {
            addCriterion("intervalCount is null");
            return (Criteria) this;
        }

        public Criteria andIntervalcountIsNotNull() {
            addCriterion("intervalCount is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalcountEqualTo(Integer value) {
            addCriterion("intervalCount =", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountNotEqualTo(Integer value) {
            addCriterion("intervalCount <>", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountGreaterThan(Integer value) {
            addCriterion("intervalCount >", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("intervalCount >=", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountLessThan(Integer value) {
            addCriterion("intervalCount <", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountLessThanOrEqualTo(Integer value) {
            addCriterion("intervalCount <=", value, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountIn(List<Integer> values) {
            addCriterion("intervalCount in", values, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountNotIn(List<Integer> values) {
            addCriterion("intervalCount not in", values, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountBetween(Integer value1, Integer value2) {
            addCriterion("intervalCount between", value1, value2, "intervalcount");
            return (Criteria) this;
        }

        public Criteria andIntervalcountNotBetween(Integer value1, Integer value2) {
            addCriterion("intervalCount not between", value1, value2, "intervalcount");
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