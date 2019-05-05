package com.cn.entiy;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ACTIVITY_REGISTER_INFO")
@GenericGenerator(name = "system-uuid", strategy = "uuid")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RegisterInfo implements Serializable {

    /**
     * 主键  活动报名id
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "REGISTER_ID", length = 32)
    private String registerId;

    /**
     * 活动id
     */
    @Column(name = "REGISTER_ACTIVITY_ID", length = 32)
    private String registerActivityId;

    /**
     * 用户id
     */
    @Column(name = "REGISTER_USER_ID", length = 32)
    private String registerUserId;

    /**
     * 学校id
     */
    @Column(name = "SCHOOL_ID", length = 32)
    private String schoolId;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID", length = 32)
    private String classId;

    /**
     * 报名来源 1为web,2为微信
     */
    @Column(name = "REGISTER_SOURCE", length = 10)
    private String registerSource;
    /**
     * 报名电话
     */
    @Column(name = "REGISTER_USERPHONE", length = 50)
    private String registerUserPhone;
    /**
     * 报名姓名
     */
    @Column(name = "REGISTER_USERNAME", length = 100)
    private String registerUserName;

    /**
     * 报名用户E-mail
     */
    @Column(name = "USER_EMAIL", length = 100)
    private String userEmail;

    /**
     * 报名时间
     */
    @Column(name = "REGISTER_TIME")
    private Date registerTime;

    /**
     * 报名此活动对应的级别  1 普通内容（初级）  2 高级内容
     */
    @Column(name = "CONTENT_LEVEL", length = 2)
    private String contentLevel;

    /**
     * 成功模板
     */
    @Column(name = "ACTIVITY_TEMPLATE", length = 4000)
    private String activityTemplate;

    /**
     * 报名活动的 编码
     * 生成规则：适用年级编号（1位 活动表里有）+ 初高级编号（1 位 界面上会传）+ 期数编号（4位 活动表里有）+ 老师编号 （8位 用户表里32位id改装成8位短id）
     * 如：321892Gfjqh8nX
     * 解释：适合三年级 高级活动 第1892期 xx老师报名参加
     */
    @Column(name = "REGISTER_NUM", length = 50)
    private String registerNum;

    /**
     * 码表关联 纵向扩展
     * 1 是否为学生意愿              0否 1是
     * 2 是否在班级长期开展类似活动   0否 1是
     * 3 是否参加过类似活动          0否 1是
     */
    @Column(name = "DICTIONARY_KEY", length = 100)
    private String dictionaryKey;

    /**
     * 活动参与状态 1 已参加，2 进行中，3未参加，4已过期
     */
    @Column(name = "REGISTER_PROGRESS_STATUS", length = 10)
    private String registerProgressStatus;

    /**
     * 审核状态 1 驳回 2 通过 3 待审核
     */
    @Column(name = "REGISTER_APPROVE_STATUS", length = 10)
    private String registerApproveStatus;

    /**
     * 审核人
     */
    @Column(name = "REGISTER_APPROVE_NAME", length = 100)
    private String registerApproveName;



    /**
     * 备注
     */
    @Column(name = "REGISTER_REMARK", length = 1000)
    private String registerRemark;

    /**
     * 创建时间
     */
    @Column(name = "REGISTER_CREATETIME")
    private Date registerCreateTime;

    /**
     * 修改时间
     */
    @Column(name = "REGISTER_UPDATETIME")
    private Date registerUpdateTime;

    /**
     * 创建人
     */
    @Column(name = "REGISTER_CREATENAME", length = 100)
    private String registerCreateName;

    /**
     * 修改人
     */
    @Column(name = "REGISTER_UPDATENAME", length = 100)
    private String registerUpdateName;

    @Column(name = "STATUS",length = 10)
    private String status;

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getRegisterActivityId() {
        return registerActivityId;
    }

    public void setRegisterActivityId(String registerActivityId) {
        this.registerActivityId = registerActivityId;
    }

    public String getRegisterUserId() {
        return registerUserId;
    }

    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterApproveStatus() {
        return registerApproveStatus;
    }

    public void setRegisterApproveStatus(String registerApproveStatus) {
        this.registerApproveStatus = registerApproveStatus;
    }

    public String getRegisterApproveName() {
        return registerApproveName;
    }

    public void setRegisterApproveName(String registerApproveName) {
        this.registerApproveName = registerApproveName;
    }

    public String getRegisterRemark() {
        return registerRemark;
    }

    public void setRegisterRemark(String registerRemark) {
        this.registerRemark = registerRemark;
    }

    public Date getRegisterCreateTime() {
        return registerCreateTime;
    }

    public void setRegisterCreateTime(Date registerCreateTime) {
        this.registerCreateTime = registerCreateTime;
    }

    public Date getRegisterUpdateTime() {
        return registerUpdateTime;
    }

    public void setRegisterUpdateTime(Date registerUpdateTime) {
        this.registerUpdateTime = registerUpdateTime;
    }

    public String getRegisterCreateName() {
        return registerCreateName;
    }

    public void setRegisterCreateName(String registerCreateName) {
        this.registerCreateName = registerCreateName;
    }

    public String getRegisterUpdateName() {
        return registerUpdateName;
    }

    public void setRegisterUpdateName(String registerUpdateName) {
        this.registerUpdateName = registerUpdateName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegisterProgressStatus() {
        return registerProgressStatus;
    }

    public void setRegisterProgressStatus(String registerProgressStatus) {
        this.registerProgressStatus = registerProgressStatus;
    }

    public String getRegisterUserPhone() {
        return registerUserPhone;
    }

    public void setRegisterUserPhone(String registerUserPhone) {
        this.registerUserPhone = registerUserPhone;
    }

    public String getRegisterUserName() {
        return registerUserName;
    }

    public void setRegisterUserName(String registerUserName) {
        this.registerUserName = registerUserName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getContentLevel() {
        return contentLevel;
    }

    public void setContentLevel(String contentLevel) {
        this.contentLevel = contentLevel;
    }

    public String getDictionaryKey() {
        return dictionaryKey;
    }

    public void setDictionaryKey(String dictionaryKey) {
        this.dictionaryKey = dictionaryKey;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }

    public String getActivityTemplate() {
        return activityTemplate;
    }

    public void setActivityTemplate(String activityTemplate) {
        this.activityTemplate = activityTemplate;
    }
}
