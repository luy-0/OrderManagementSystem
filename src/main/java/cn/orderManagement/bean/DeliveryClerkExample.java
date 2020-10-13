package cn.orderManagement.bean;

import java.util.ArrayList;
import java.util.List;

public class DeliveryClerkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryClerkExample() {
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

        public Criteria andClerkIdIsNull() {
            addCriterion("clerk_id is null");
            return (Criteria) this;
        }

        public Criteria andClerkIdIsNotNull() {
            addCriterion("clerk_id is not null");
            return (Criteria) this;
        }

        public Criteria andClerkIdEqualTo(Integer value) {
            addCriterion("clerk_id =", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdNotEqualTo(Integer value) {
            addCriterion("clerk_id <>", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdGreaterThan(Integer value) {
            addCriterion("clerk_id >", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clerk_id >=", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdLessThan(Integer value) {
            addCriterion("clerk_id <", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdLessThanOrEqualTo(Integer value) {
            addCriterion("clerk_id <=", value, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdIn(List<Integer> values) {
            addCriterion("clerk_id in", values, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdNotIn(List<Integer> values) {
            addCriterion("clerk_id not in", values, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdBetween(Integer value1, Integer value2) {
            addCriterion("clerk_id between", value1, value2, "clerkId");
            return (Criteria) this;
        }

        public Criteria andClerkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clerk_id not between", value1, value2, "clerkId");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIsNull() {
            addCriterion("work_number is null");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIsNotNull() {
            addCriterion("work_number is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNumberEqualTo(String value) {
            addCriterion("work_number =", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotEqualTo(String value) {
            addCriterion("work_number <>", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberGreaterThan(String value) {
            addCriterion("work_number >", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberGreaterThanOrEqualTo(String value) {
            addCriterion("work_number >=", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLessThan(String value) {
            addCriterion("work_number <", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLessThanOrEqualTo(String value) {
            addCriterion("work_number <=", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLike(String value) {
            addCriterion("work_number like", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotLike(String value) {
            addCriterion("work_number not like", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIn(List<String> values) {
            addCriterion("work_number in", values, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotIn(List<String> values) {
            addCriterion("work_number not in", values, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberBetween(String value1, String value2) {
            addCriterion("work_number between", value1, value2, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotBetween(String value1, String value2) {
            addCriterion("work_number not between", value1, value2, "workNumber");
            return (Criteria) this;
        }

        public Criteria andClearkNameIsNull() {
            addCriterion("cleark_name is null");
            return (Criteria) this;
        }

        public Criteria andClearkNameIsNotNull() {
            addCriterion("cleark_name is not null");
            return (Criteria) this;
        }

        public Criteria andClearkNameEqualTo(String value) {
            addCriterion("cleark_name =", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameNotEqualTo(String value) {
            addCriterion("cleark_name <>", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameGreaterThan(String value) {
            addCriterion("cleark_name >", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameGreaterThanOrEqualTo(String value) {
            addCriterion("cleark_name >=", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameLessThan(String value) {
            addCriterion("cleark_name <", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameLessThanOrEqualTo(String value) {
            addCriterion("cleark_name <=", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameLike(String value) {
            addCriterion("cleark_name like", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameNotLike(String value) {
            addCriterion("cleark_name not like", value, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameIn(List<String> values) {
            addCriterion("cleark_name in", values, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameNotIn(List<String> values) {
            addCriterion("cleark_name not in", values, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameBetween(String value1, String value2) {
            addCriterion("cleark_name between", value1, value2, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkNameNotBetween(String value1, String value2) {
            addCriterion("cleark_name not between", value1, value2, "clearkName");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordIsNull() {
            addCriterion("cleark_password is null");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordIsNotNull() {
            addCriterion("cleark_password is not null");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordEqualTo(String value) {
            addCriterion("cleark_password =", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordNotEqualTo(String value) {
            addCriterion("cleark_password <>", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordGreaterThan(String value) {
            addCriterion("cleark_password >", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cleark_password >=", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordLessThan(String value) {
            addCriterion("cleark_password <", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordLessThanOrEqualTo(String value) {
            addCriterion("cleark_password <=", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordLike(String value) {
            addCriterion("cleark_password like", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordNotLike(String value) {
            addCriterion("cleark_password not like", value, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordIn(List<String> values) {
            addCriterion("cleark_password in", values, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordNotIn(List<String> values) {
            addCriterion("cleark_password not in", values, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordBetween(String value1, String value2) {
            addCriterion("cleark_password between", value1, value2, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andClearkPasswordNotBetween(String value1, String value2) {
            addCriterion("cleark_password not between", value1, value2, "clearkPassword");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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