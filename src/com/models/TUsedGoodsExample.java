package com.models;

import java.util.ArrayList;
import java.util.List;

public class TUsedGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUsedGoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameIsNull() {
            addCriterion("used_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameIsNotNull() {
            addCriterion("used_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameEqualTo(String value) {
            addCriterion("used_goods_name =", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameNotEqualTo(String value) {
            addCriterion("used_goods_name <>", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameGreaterThan(String value) {
            addCriterion("used_goods_name >", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("used_goods_name >=", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameLessThan(String value) {
            addCriterion("used_goods_name <", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("used_goods_name <=", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameLike(String value) {
            addCriterion("used_goods_name like", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameNotLike(String value) {
            addCriterion("used_goods_name not like", value, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameIn(List<String> values) {
            addCriterion("used_goods_name in", values, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameNotIn(List<String> values) {
            addCriterion("used_goods_name not in", values, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameBetween(String value1, String value2) {
            addCriterion("used_goods_name between", value1, value2, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsNameNotBetween(String value1, String value2) {
            addCriterion("used_goods_name not between", value1, value2, "usedGoodsName");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructIsNull() {
            addCriterion("used_goods_instruct is null");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructIsNotNull() {
            addCriterion("used_goods_instruct is not null");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructEqualTo(String value) {
            addCriterion("used_goods_instruct =", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructNotEqualTo(String value) {
            addCriterion("used_goods_instruct <>", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructGreaterThan(String value) {
            addCriterion("used_goods_instruct >", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructGreaterThanOrEqualTo(String value) {
            addCriterion("used_goods_instruct >=", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructLessThan(String value) {
            addCriterion("used_goods_instruct <", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructLessThanOrEqualTo(String value) {
            addCriterion("used_goods_instruct <=", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructLike(String value) {
            addCriterion("used_goods_instruct like", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructNotLike(String value) {
            addCriterion("used_goods_instruct not like", value, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructIn(List<String> values) {
            addCriterion("used_goods_instruct in", values, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructNotIn(List<String> values) {
            addCriterion("used_goods_instruct not in", values, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructBetween(String value1, String value2) {
            addCriterion("used_goods_instruct between", value1, value2, "usedGoodsInstruct");
            return (Criteria) this;
        }

        public Criteria andUsedGoodsInstructNotBetween(String value1, String value2) {
            addCriterion("used_goods_instruct not between", value1, value2, "usedGoodsInstruct");
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

        public Criteria andCheckStateIsNull() {
            addCriterion("check_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("check_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(String value) {
            addCriterion("check_state =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(String value) {
            addCriterion("check_state <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(String value) {
            addCriterion("check_state >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(String value) {
            addCriterion("check_state >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(String value) {
            addCriterion("check_state <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(String value) {
            addCriterion("check_state <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLike(String value) {
            addCriterion("check_state like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotLike(String value) {
            addCriterion("check_state not like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<String> values) {
            addCriterion("check_state in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<String> values) {
            addCriterion("check_state not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(String value1, String value2) {
            addCriterion("check_state between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(String value1, String value2) {
            addCriterion("check_state not between", value1, value2, "checkState");
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