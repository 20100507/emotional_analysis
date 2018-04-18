package org.bianqi.web.wangyi.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserGenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGenderExample() {
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

        public Criteria andGenderIdIsNull() {
            addCriterion("gender_id is null");
            return (Criteria) this;
        }

        public Criteria andGenderIdIsNotNull() {
            addCriterion("gender_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenderIdEqualTo(Integer value) {
            addCriterion("gender_id =", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotEqualTo(Integer value) {
            addCriterion("gender_id <>", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThan(Integer value) {
            addCriterion("gender_id >", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender_id >=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThan(Integer value) {
            addCriterion("gender_id <", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("gender_id <=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdIn(List<Integer> values) {
            addCriterion("gender_id in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotIn(List<Integer> values) {
            addCriterion("gender_id not in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdBetween(Integer value1, Integer value2) {
            addCriterion("gender_id between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gender_id not between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderCountIsNull() {
            addCriterion("gender_count is null");
            return (Criteria) this;
        }

        public Criteria andGenderCountIsNotNull() {
            addCriterion("gender_count is not null");
            return (Criteria) this;
        }

        public Criteria andGenderCountEqualTo(Integer value) {
            addCriterion("gender_count =", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountNotEqualTo(Integer value) {
            addCriterion("gender_count <>", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountGreaterThan(Integer value) {
            addCriterion("gender_count >", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender_count >=", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountLessThan(Integer value) {
            addCriterion("gender_count <", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountLessThanOrEqualTo(Integer value) {
            addCriterion("gender_count <=", value, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountIn(List<Integer> values) {
            addCriterion("gender_count in", values, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountNotIn(List<Integer> values) {
            addCriterion("gender_count not in", values, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountBetween(Integer value1, Integer value2) {
            addCriterion("gender_count between", value1, value2, "genderCount");
            return (Criteria) this;
        }

        public Criteria andGenderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("gender_count not between", value1, value2, "genderCount");
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