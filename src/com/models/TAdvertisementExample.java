package com.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAdvertisementExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAdvContentIsNull() {
            addCriterion("adv_content is null");
            return (Criteria) this;
        }

        public Criteria andAdvContentIsNotNull() {
            addCriterion("adv_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdvContentEqualTo(String value) {
            addCriterion("adv_content =", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentNotEqualTo(String value) {
            addCriterion("adv_content <>", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentGreaterThan(String value) {
            addCriterion("adv_content >", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentGreaterThanOrEqualTo(String value) {
            addCriterion("adv_content >=", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentLessThan(String value) {
            addCriterion("adv_content <", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentLessThanOrEqualTo(String value) {
            addCriterion("adv_content <=", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentLike(String value) {
            addCriterion("adv_content like", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentNotLike(String value) {
            addCriterion("adv_content not like", value, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentIn(List<String> values) {
            addCriterion("adv_content in", values, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentNotIn(List<String> values) {
            addCriterion("adv_content not in", values, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentBetween(String value1, String value2) {
            addCriterion("adv_content between", value1, value2, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvContentNotBetween(String value1, String value2) {
            addCriterion("adv_content not between", value1, value2, "advContent");
            return (Criteria) this;
        }

        public Criteria andAdvCostIsNull() {
            addCriterion("adv_cost is null");
            return (Criteria) this;
        }

        public Criteria andAdvCostIsNotNull() {
            addCriterion("adv_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAdvCostEqualTo(Double value) {
            addCriterion("adv_cost =", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostNotEqualTo(Double value) {
            addCriterion("adv_cost <>", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostGreaterThan(Double value) {
            addCriterion("adv_cost >", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostGreaterThanOrEqualTo(Double value) {
            addCriterion("adv_cost >=", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostLessThan(Double value) {
            addCriterion("adv_cost <", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostLessThanOrEqualTo(Double value) {
            addCriterion("adv_cost <=", value, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostIn(List<Double> values) {
            addCriterion("adv_cost in", values, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostNotIn(List<Double> values) {
            addCriterion("adv_cost not in", values, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostBetween(Double value1, Double value2) {
            addCriterion("adv_cost between", value1, value2, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvCostNotBetween(Double value1, Double value2) {
            addCriterion("adv_cost not between", value1, value2, "advCost");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateIsNull() {
            addCriterion("adv_bidding_state is null");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateIsNotNull() {
            addCriterion("adv_bidding_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateEqualTo(String value) {
            addCriterion("adv_bidding_state =", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateNotEqualTo(String value) {
            addCriterion("adv_bidding_state <>", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateGreaterThan(String value) {
            addCriterion("adv_bidding_state >", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateGreaterThanOrEqualTo(String value) {
            addCriterion("adv_bidding_state >=", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateLessThan(String value) {
            addCriterion("adv_bidding_state <", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateLessThanOrEqualTo(String value) {
            addCriterion("adv_bidding_state <=", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateLike(String value) {
            addCriterion("adv_bidding_state like", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateNotLike(String value) {
            addCriterion("adv_bidding_state not like", value, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateIn(List<String> values) {
            addCriterion("adv_bidding_state in", values, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateNotIn(List<String> values) {
            addCriterion("adv_bidding_state not in", values, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateBetween(String value1, String value2) {
            addCriterion("adv_bidding_state between", value1, value2, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvBiddingStateNotBetween(String value1, String value2) {
            addCriterion("adv_bidding_state not between", value1, value2, "advBiddingState");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeIsNull() {
            addCriterion("adv_active_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeIsNotNull() {
            addCriterion("adv_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("adv_active_time =", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("adv_active_time <>", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("adv_active_time >", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adv_active_time >=", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("adv_active_time <", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adv_active_time <=", value, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("adv_active_time in", values, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("adv_active_time not in", values, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adv_active_time between", value1, value2, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvActiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adv_active_time not between", value1, value2, "advActiveTime");
            return (Criteria) this;
        }

        public Criteria andAdvStateIsNull() {
            addCriterion("adv_state is null");
            return (Criteria) this;
        }

        public Criteria andAdvStateIsNotNull() {
            addCriterion("adv_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdvStateEqualTo(String value) {
            addCriterion("adv_state =", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotEqualTo(String value) {
            addCriterion("adv_state <>", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateGreaterThan(String value) {
            addCriterion("adv_state >", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateGreaterThanOrEqualTo(String value) {
            addCriterion("adv_state >=", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateLessThan(String value) {
            addCriterion("adv_state <", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateLessThanOrEqualTo(String value) {
            addCriterion("adv_state <=", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateLike(String value) {
            addCriterion("adv_state like", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotLike(String value) {
            addCriterion("adv_state not like", value, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateIn(List<String> values) {
            addCriterion("adv_state in", values, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotIn(List<String> values) {
            addCriterion("adv_state not in", values, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateBetween(String value1, String value2) {
            addCriterion("adv_state between", value1, value2, "advState");
            return (Criteria) this;
        }

        public Criteria andAdvStateNotBetween(String value1, String value2) {
            addCriterion("adv_state not between", value1, value2, "advState");
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