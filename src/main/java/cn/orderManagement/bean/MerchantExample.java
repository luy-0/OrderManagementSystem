package cn.orderManagement.bean;

import java.util.ArrayList;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
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

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordIsNull() {
            addCriterion("merchant_password is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordIsNotNull() {
            addCriterion("merchant_password is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordEqualTo(String value) {
            addCriterion("merchant_password =", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotEqualTo(String value) {
            addCriterion("merchant_password <>", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordGreaterThan(String value) {
            addCriterion("merchant_password >", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_password >=", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLessThan(String value) {
            addCriterion("merchant_password <", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLessThanOrEqualTo(String value) {
            addCriterion("merchant_password <=", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLike(String value) {
            addCriterion("merchant_password like", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotLike(String value) {
            addCriterion("merchant_password not like", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordIn(List<String> values) {
            addCriterion("merchant_password in", values, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotIn(List<String> values) {
            addCriterion("merchant_password not in", values, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordBetween(String value1, String value2) {
            addCriterion("merchant_password between", value1, value2, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotBetween(String value1, String value2) {
            addCriterion("merchant_password not between", value1, value2, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIsNull() {
            addCriterion("merchant_address is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIsNotNull() {
            addCriterion("merchant_address is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressEqualTo(String value) {
            addCriterion("merchant_address =", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotEqualTo(String value) {
            addCriterion("merchant_address <>", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressGreaterThan(String value) {
            addCriterion("merchant_address >", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_address >=", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLessThan(String value) {
            addCriterion("merchant_address <", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLessThanOrEqualTo(String value) {
            addCriterion("merchant_address <=", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLike(String value) {
            addCriterion("merchant_address like", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotLike(String value) {
            addCriterion("merchant_address not like", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIn(List<String> values) {
            addCriterion("merchant_address in", values, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotIn(List<String> values) {
            addCriterion("merchant_address not in", values, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressBetween(String value1, String value2) {
            addCriterion("merchant_address between", value1, value2, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotBetween(String value1, String value2) {
            addCriterion("merchant_address not between", value1, value2, "merchantAddress");
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