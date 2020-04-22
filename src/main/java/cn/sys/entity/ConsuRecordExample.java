package cn.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsuRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsuRecordExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-04-21
     */
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

        public Criteria andConsu_nameIsNull() {
            addCriterion("consu_name is null");
            return (Criteria) this;
        }

        public Criteria andConsu_nameIsNotNull() {
            addCriterion("consu_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_nameEqualTo(String value) {
            addCriterion("consu_name =", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameNotEqualTo(String value) {
            addCriterion("consu_name <>", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameGreaterThan(String value) {
            addCriterion("consu_name >", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameGreaterThanOrEqualTo(String value) {
            addCriterion("consu_name >=", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameLessThan(String value) {
            addCriterion("consu_name <", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameLessThanOrEqualTo(String value) {
            addCriterion("consu_name <=", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameLike(String value) {
            addCriterion("consu_name like", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameNotLike(String value) {
            addCriterion("consu_name not like", value, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameIn(List<String> values) {
            addCriterion("consu_name in", values, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameNotIn(List<String> values) {
            addCriterion("consu_name not in", values, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameBetween(String value1, String value2) {
            addCriterion("consu_name between", value1, value2, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_nameNotBetween(String value1, String value2) {
            addCriterion("consu_name not between", value1, value2, "consu_name");
            return (Criteria) this;
        }

        public Criteria andConsu_desIsNull() {
            addCriterion("consu_des is null");
            return (Criteria) this;
        }

        public Criteria andConsu_desIsNotNull() {
            addCriterion("consu_des is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_desEqualTo(String value) {
            addCriterion("consu_des =", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desNotEqualTo(String value) {
            addCriterion("consu_des <>", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desGreaterThan(String value) {
            addCriterion("consu_des >", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desGreaterThanOrEqualTo(String value) {
            addCriterion("consu_des >=", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desLessThan(String value) {
            addCriterion("consu_des <", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desLessThanOrEqualTo(String value) {
            addCriterion("consu_des <=", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desLike(String value) {
            addCriterion("consu_des like", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desNotLike(String value) {
            addCriterion("consu_des not like", value, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desIn(List<String> values) {
            addCriterion("consu_des in", values, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desNotIn(List<String> values) {
            addCriterion("consu_des not in", values, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desBetween(String value1, String value2) {
            addCriterion("consu_des between", value1, value2, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_desNotBetween(String value1, String value2) {
            addCriterion("consu_des not between", value1, value2, "consu_des");
            return (Criteria) this;
        }

        public Criteria andConsu_adsIsNull() {
            addCriterion("consu_ads is null");
            return (Criteria) this;
        }

        public Criteria andConsu_adsIsNotNull() {
            addCriterion("consu_ads is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_adsEqualTo(String value) {
            addCriterion("consu_ads =", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsNotEqualTo(String value) {
            addCriterion("consu_ads <>", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsGreaterThan(String value) {
            addCriterion("consu_ads >", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsGreaterThanOrEqualTo(String value) {
            addCriterion("consu_ads >=", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsLessThan(String value) {
            addCriterion("consu_ads <", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsLessThanOrEqualTo(String value) {
            addCriterion("consu_ads <=", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsLike(String value) {
            addCriterion("consu_ads like", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsNotLike(String value) {
            addCriterion("consu_ads not like", value, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsIn(List<String> values) {
            addCriterion("consu_ads in", values, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsNotIn(List<String> values) {
            addCriterion("consu_ads not in", values, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsBetween(String value1, String value2) {
            addCriterion("consu_ads between", value1, value2, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_adsNotBetween(String value1, String value2) {
            addCriterion("consu_ads not between", value1, value2, "consu_ads");
            return (Criteria) this;
        }

        public Criteria andConsu_timeIsNull() {
            addCriterion("consu_time is null");
            return (Criteria) this;
        }

        public Criteria andConsu_timeIsNotNull() {
            addCriterion("consu_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_timeEqualTo(Date value) {
            addCriterion("consu_time =", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeNotEqualTo(Date value) {
            addCriterion("consu_time <>", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeGreaterThan(Date value) {
            addCriterion("consu_time >", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("consu_time >=", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeLessThan(Date value) {
            addCriterion("consu_time <", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeLessThanOrEqualTo(Date value) {
            addCriterion("consu_time <=", value, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeIn(List<Date> values) {
            addCriterion("consu_time in", values, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeNotIn(List<Date> values) {
            addCriterion("consu_time not in", values, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeBetween(Date value1, Date value2) {
            addCriterion("consu_time between", value1, value2, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_timeNotBetween(Date value1, Date value2) {
            addCriterion("consu_time not between", value1, value2, "consu_time");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyIsNull() {
            addCriterion("consu_money is null");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyIsNotNull() {
            addCriterion("consu_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyEqualTo(BigDecimal value) {
            addCriterion("consu_money =", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyNotEqualTo(BigDecimal value) {
            addCriterion("consu_money <>", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyGreaterThan(BigDecimal value) {
            addCriterion("consu_money >", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consu_money >=", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyLessThan(BigDecimal value) {
            addCriterion("consu_money <", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consu_money <=", value, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyIn(List<BigDecimal> values) {
            addCriterion("consu_money in", values, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyNotIn(List<BigDecimal> values) {
            addCriterion("consu_money not in", values, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consu_money between", value1, value2, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consu_money not between", value1, value2, "consu_money");
            return (Criteria) this;
        }

        public Criteria andConsu_cateIsNull() {
            addCriterion("consu_cate is null");
            return (Criteria) this;
        }

        public Criteria andConsu_cateIsNotNull() {
            addCriterion("consu_cate is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_cateEqualTo(Integer value) {
            addCriterion("consu_cate =", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateNotEqualTo(Integer value) {
            addCriterion("consu_cate <>", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateGreaterThan(Integer value) {
            addCriterion("consu_cate >", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateGreaterThanOrEqualTo(Integer value) {
            addCriterion("consu_cate >=", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateLessThan(Integer value) {
            addCriterion("consu_cate <", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateLessThanOrEqualTo(Integer value) {
            addCriterion("consu_cate <=", value, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateIn(List<Integer> values) {
            addCriterion("consu_cate in", values, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateNotIn(List<Integer> values) {
            addCriterion("consu_cate not in", values, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateBetween(Integer value1, Integer value2) {
            addCriterion("consu_cate between", value1, value2, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_cateNotBetween(Integer value1, Integer value2) {
            addCriterion("consu_cate not between", value1, value2, "consu_cate");
            return (Criteria) this;
        }

        public Criteria andConsu_wayIsNull() {
            addCriterion("consu_way is null");
            return (Criteria) this;
        }

        public Criteria andConsu_wayIsNotNull() {
            addCriterion("consu_way is not null");
            return (Criteria) this;
        }

        public Criteria andConsu_wayEqualTo(Integer value) {
            addCriterion("consu_way =", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayNotEqualTo(Integer value) {
            addCriterion("consu_way <>", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayGreaterThan(Integer value) {
            addCriterion("consu_way >", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayGreaterThanOrEqualTo(Integer value) {
            addCriterion("consu_way >=", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayLessThan(Integer value) {
            addCriterion("consu_way <", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayLessThanOrEqualTo(Integer value) {
            addCriterion("consu_way <=", value, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayIn(List<Integer> values) {
            addCriterion("consu_way in", values, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayNotIn(List<Integer> values) {
            addCriterion("consu_way not in", values, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayBetween(Integer value1, Integer value2) {
            addCriterion("consu_way between", value1, value2, "consu_way");
            return (Criteria) this;
        }

        public Criteria andConsu_wayNotBetween(Integer value1, Integer value2) {
            addCriterion("consu_way not between", value1, value2, "consu_way");
            return (Criteria) this;
        }

        public Criteria andComsu_repIsNull() {
            addCriterion("comsu_rep is null");
            return (Criteria) this;
        }

        public Criteria andComsu_repIsNotNull() {
            addCriterion("comsu_rep is not null");
            return (Criteria) this;
        }

        public Criteria andComsu_repEqualTo(String value) {
            addCriterion("comsu_rep =", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repNotEqualTo(String value) {
            addCriterion("comsu_rep <>", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repGreaterThan(String value) {
            addCriterion("comsu_rep >", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repGreaterThanOrEqualTo(String value) {
            addCriterion("comsu_rep >=", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repLessThan(String value) {
            addCriterion("comsu_rep <", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repLessThanOrEqualTo(String value) {
            addCriterion("comsu_rep <=", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repLike(String value) {
            addCriterion("comsu_rep like", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repNotLike(String value) {
            addCriterion("comsu_rep not like", value, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repIn(List<String> values) {
            addCriterion("comsu_rep in", values, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repNotIn(List<String> values) {
            addCriterion("comsu_rep not in", values, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repBetween(String value1, String value2) {
            addCriterion("comsu_rep between", value1, value2, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andComsu_repNotBetween(String value1, String value2) {
            addCriterion("comsu_rep not between", value1, value2, "comsu_rep");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(String value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("bak1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("bak1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("bak2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("bak2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("bak2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("bak2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("bak2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("bak2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("bak2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("bak2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("bak2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("bak2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("bak2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("bak2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("bak2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("bak2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak3IsNull() {
            addCriterion("bak3 is null");
            return (Criteria) this;
        }

        public Criteria andBak3IsNotNull() {
            addCriterion("bak3 is not null");
            return (Criteria) this;
        }

        public Criteria andBak3EqualTo(String value) {
            addCriterion("bak3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(String value) {
            addCriterion("bak3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(String value) {
            addCriterion("bak3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(String value) {
            addCriterion("bak3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(String value) {
            addCriterion("bak3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(String value) {
            addCriterion("bak3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Like(String value) {
            addCriterion("bak3 like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotLike(String value) {
            addCriterion("bak3 not like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<String> values) {
            addCriterion("bak3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<String> values) {
            addCriterion("bak3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(String value1, String value2) {
            addCriterion("bak3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(String value1, String value2) {
            addCriterion("bak3 not between", value1, value2, "bak3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-04-21
     */
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