package org.ko.sigma.data.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("t_request_log")
public class RequestLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    @TableId
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.ip_addr
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private String ipAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.request_time
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Date requestTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.request_link
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private String requestLink;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.available_status
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Short availableStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.create_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.create_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.update_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_request_log.update_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_request_log
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.id
     *
     * @return the value of t_request_log.id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.id
     *
     * @param id the value for t_request_log.id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.user_id
     *
     * @return the value of t_request_log.user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.user_id
     *
     * @param userId the value for t_request_log.user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.ip_addr
     *
     * @return the value of t_request_log.ip_addr
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.ip_addr
     *
     * @param ipAddr the value for t_request_log.ip_addr
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.request_time
     *
     * @return the value of t_request_log.request_time
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.request_time
     *
     * @param requestTime the value for t_request_log.request_time
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.request_link
     *
     * @return the value of t_request_log.request_link
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public String getRequestLink() {
        return requestLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.request_link
     *
     * @param requestLink the value for t_request_log.request_link
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setRequestLink(String requestLink) {
        this.requestLink = requestLink == null ? null : requestLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.available_status
     *
     * @return the value of t_request_log.available_status
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Short getAvailableStatus() {
        return availableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.available_status
     *
     * @param availableStatus the value for t_request_log.available_status
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setAvailableStatus(Short availableStatus) {
        this.availableStatus = availableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.create_user_id
     *
     * @return the value of t_request_log.create_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.create_user_id
     *
     * @param createUserId the value for t_request_log.create_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.create_date
     *
     * @return the value of t_request_log.create_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.create_date
     *
     * @param createDate the value for t_request_log.create_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.update_user_id
     *
     * @return the value of t_request_log.update_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.update_user_id
     *
     * @param updateUserId the value for t_request_log.update_user_id
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_request_log.update_date
     *
     * @return the value of t_request_log.update_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_request_log.update_date
     *
     * @param updateDate the value for t_request_log.update_date
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_request_log
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", ipAddr=").append(ipAddr);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", requestLink=").append(requestLink);
        sb.append(", availableStatus=").append(availableStatus);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_request_log
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RequestLog other = (RequestLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIpAddr() == null ? other.getIpAddr() == null : this.getIpAddr().equals(other.getIpAddr()))
            && (this.getRequestTime() == null ? other.getRequestTime() == null : this.getRequestTime().equals(other.getRequestTime()))
            && (this.getRequestLink() == null ? other.getRequestLink() == null : this.getRequestLink().equals(other.getRequestLink()))
            && (this.getAvailableStatus() == null ? other.getAvailableStatus() == null : this.getAvailableStatus().equals(other.getAvailableStatus()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_request_log
     *
     * @mbg.generated Sat May 25 16:40:04 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIpAddr() == null) ? 0 : getIpAddr().hashCode());
        result = prime * result + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        result = prime * result + ((getRequestLink() == null) ? 0 : getRequestLink().hashCode());
        result = prime * result + ((getAvailableStatus() == null) ? 0 : getAvailableStatus().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}