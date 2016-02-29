package com.models;

import java.util.ArrayList;
import java.util.List;

public class TGoodstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodstypeExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsType1IsNull() {
            addCriterion("goods_type1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsType1IsNotNull() {
            addCriterion("goods_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsType1EqualTo(String value) {
            addCriterion("goods_type1 =", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1NotEqualTo(String value) {
            addCriterion("goods_type1 <>", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1GreaterThan(String value) {
            addCriterion("goods_type1 >", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1GreaterThanOrEqualTo(String value) {
            addCriterion("goods_type1 >=", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1LessThan(String value) {
            addCriterion("goods_type1 <", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1LessThanOrEqualTo(String value) {
            addCriterion("goods_type1 <=", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1Like(String value) {
            addCriterion("goods_type1 like", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1NotLike(String value) {
            addCriterion("goods_type1 not like", value, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1In(List<String> values) {
            addCriterion("goods_type1 in", values, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1NotIn(List<String> values) {
            addCriterion("goods_type1 not in", values, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1Between(String value1, String value2) {
            addCriterion("goods_type1 between", value1, value2, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType1NotBetween(String value1, String value2) {
            addCriterion("goods_type1 not between", value1, value2, "goodsType1");
            return (Criteria) this;
        }

        public Criteria andGoodsType2IsNull() {
            addCriterion("goods_type2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsType2IsNotNull() {
            addCriterion("goods_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsType2EqualTo(String value) {
            addCriterion("goods_type2 =", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2NotEqualTo(String value) {
            addCriterion("goods_type2 <>", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2GreaterThan(String value) {
            addCriterion("goods_type2 >", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2GreaterThanOrEqualTo(String value) {
            addCriterion("goods_type2 >=", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2LessThan(String value) {
            addCriterion("goods_type2 <", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2LessThanOrEqualTo(String value) {
            addCriterion("goods_type2 <=", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2Like(String value) {
            addCriterion("goods_type2 like", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2NotLike(String value) {
            addCriterion("goods_type2 not like", value, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2In(List<String> values) {
            addCriterion("goods_type2 in", values, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2NotIn(List<String> values) {
            addCriterion("goods_type2 not in", values, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2Between(String value1, String value2) {
            addCriterion("goods_type2 between", value1, value2, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType2NotBetween(String value1, String value2) {
            addCriterion("goods_type2 not between", value1, value2, "goodsType2");
            return (Criteria) this;
        }

        public Criteria andGoodsType3IsNull() {
            addCriterion("goods_type3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsType3IsNotNull() {
            addCriterion("goods_type3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsType3EqualTo(String value) {
            addCriterion("goods_type3 =", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3NotEqualTo(String value) {
            addCriterion("goods_type3 <>", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3GreaterThan(String value) {
            addCriterion("goods_type3 >", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3GreaterThanOrEqualTo(String value) {
            addCriterion("goods_type3 >=", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3LessThan(String value) {
            addCriterion("goods_type3 <", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3LessThanOrEqualTo(String value) {
            addCriterion("goods_type3 <=", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3Like(String value) {
            addCriterion("goods_type3 like", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3NotLike(String value) {
            addCriterion("goods_type3 not like", value, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3In(List<String> values) {
            addCriterion("goods_type3 in", values, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3NotIn(List<String> values) {
            addCriterion("goods_type3 not in", values, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3Between(String value1, String value2) {
            addCriterion("goods_type3 between", value1, value2, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType3NotBetween(String value1, String value2) {
            addCriterion("goods_type3 not between", value1, value2, "goodsType3");
            return (Criteria) this;
        }

        public Criteria andGoodsType4IsNull() {
            addCriterion("goods_type4 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsType4IsNotNull() {
            addCriterion("goods_type4 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsType4EqualTo(String value) {
            addCriterion("goods_type4 =", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4NotEqualTo(String value) {
            addCriterion("goods_type4 <>", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4GreaterThan(String value) {
            addCriterion("goods_type4 >", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4GreaterThanOrEqualTo(String value) {
            addCriterion("goods_type4 >=", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4LessThan(String value) {
            addCriterion("goods_type4 <", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4LessThanOrEqualTo(String value) {
            addCriterion("goods_type4 <=", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4Like(String value) {
            addCriterion("goods_type4 like", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4NotLike(String value) {
            addCriterion("goods_type4 not like", value, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4In(List<String> values) {
            addCriterion("goods_type4 in", values, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4NotIn(List<String> values) {
            addCriterion("goods_type4 not in", values, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4Between(String value1, String value2) {
            addCriterion("goods_type4 between", value1, value2, "goodsType4");
            return (Criteria) this;
        }

        public Criteria andGoodsType4NotBetween(String value1, String value2) {
            addCriterion("goods_type4 not between", value1, value2, "goodsType4");
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