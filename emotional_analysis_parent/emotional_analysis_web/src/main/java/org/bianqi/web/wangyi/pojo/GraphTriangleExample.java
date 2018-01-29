package org.bianqi.web.wangyi.pojo;

import java.util.ArrayList;
import java.util.List;

public class GraphTriangleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraphTriangleExample() {
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

        public Criteria andTriangleIdIsNull() {
            addCriterion("triangle_id is null");
            return (Criteria) this;
        }

        public Criteria andTriangleIdIsNotNull() {
            addCriterion("triangle_id is not null");
            return (Criteria) this;
        }

        public Criteria andTriangleIdEqualTo(Integer value) {
            addCriterion("triangle_id =", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdNotEqualTo(Integer value) {
            addCriterion("triangle_id <>", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdGreaterThan(Integer value) {
            addCriterion("triangle_id >", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("triangle_id >=", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdLessThan(Integer value) {
            addCriterion("triangle_id <", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdLessThanOrEqualTo(Integer value) {
            addCriterion("triangle_id <=", value, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdIn(List<Integer> values) {
            addCriterion("triangle_id in", values, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdNotIn(List<Integer> values) {
            addCriterion("triangle_id not in", values, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdBetween(Integer value1, Integer value2) {
            addCriterion("triangle_id between", value1, value2, "triangleId");
            return (Criteria) this;
        }

        public Criteria andTriangleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("triangle_id not between", value1, value2, "triangleId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTriangleTopIsNull() {
            addCriterion("triangle_top is null");
            return (Criteria) this;
        }

        public Criteria andTriangleTopIsNotNull() {
            addCriterion("triangle_top is not null");
            return (Criteria) this;
        }

        public Criteria andTriangleTopEqualTo(Float value) {
            addCriterion("triangle_top =", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopNotEqualTo(Float value) {
            addCriterion("triangle_top <>", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopGreaterThan(Float value) {
            addCriterion("triangle_top >", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopGreaterThanOrEqualTo(Float value) {
            addCriterion("triangle_top >=", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopLessThan(Float value) {
            addCriterion("triangle_top <", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopLessThanOrEqualTo(Float value) {
            addCriterion("triangle_top <=", value, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopIn(List<Float> values) {
            addCriterion("triangle_top in", values, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopNotIn(List<Float> values) {
            addCriterion("triangle_top not in", values, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopBetween(Float value1, Float value2) {
            addCriterion("triangle_top between", value1, value2, "triangleTop");
            return (Criteria) this;
        }

        public Criteria andTriangleTopNotBetween(Float value1, Float value2) {
            addCriterion("triangle_top not between", value1, value2, "triangleTop");
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