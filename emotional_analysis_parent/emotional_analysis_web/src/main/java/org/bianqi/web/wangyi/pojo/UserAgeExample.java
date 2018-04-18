package org.bianqi.web.wangyi.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserAgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAgeExample() {
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

        public Criteria andAgeIdIsNull() {
            addCriterion("age_id is null");
            return (Criteria) this;
        }

        public Criteria andAgeIdIsNotNull() {
            addCriterion("age_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgeIdEqualTo(Integer value) {
            addCriterion("age_id =", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotEqualTo(Integer value) {
            addCriterion("age_id <>", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThan(Integer value) {
            addCriterion("age_id >", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_id >=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThan(Integer value) {
            addCriterion("age_id <", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("age_id <=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdIn(List<Integer> values) {
            addCriterion("age_id in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotIn(List<Integer> values) {
            addCriterion("age_id not in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdBetween(Integer value1, Integer value2) {
            addCriterion("age_id between", value1, value2, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("age_id not between", value1, value2, "ageId");
            return (Criteria) this;
        }

        public Criteria andYearRangeIsNull() {
            addCriterion("year_range is null");
            return (Criteria) this;
        }

        public Criteria andYearRangeIsNotNull() {
            addCriterion("year_range is not null");
            return (Criteria) this;
        }

        public Criteria andYearRangeEqualTo(Integer value) {
            addCriterion("year_range =", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeNotEqualTo(Integer value) {
            addCriterion("year_range <>", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeGreaterThan(Integer value) {
            addCriterion("year_range >", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_range >=", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeLessThan(Integer value) {
            addCriterion("year_range <", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeLessThanOrEqualTo(Integer value) {
            addCriterion("year_range <=", value, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeIn(List<Integer> values) {
            addCriterion("year_range in", values, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeNotIn(List<Integer> values) {
            addCriterion("year_range not in", values, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeBetween(Integer value1, Integer value2) {
            addCriterion("year_range between", value1, value2, "yearRange");
            return (Criteria) this;
        }

        public Criteria andYearRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("year_range not between", value1, value2, "yearRange");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
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