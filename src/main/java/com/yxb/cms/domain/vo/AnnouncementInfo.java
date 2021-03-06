
package com.yxb.cms.domain.vo;

import com.yxb.cms.architect.utils.DateUtil;
import com.yxb.cms.domain.dto.PageDto;

import java.io.Serializable;
import java.util.Date;
/**
 * 站内公告信息表
 */
public class  AnnouncementInfo extends PageDto implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_id
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private Integer announcementId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_type
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private Integer announcementType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_title
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private String announcementTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_content
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private String announcementContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_author
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private String announcementAuthor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_announcement_info.announcement_time
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    private Date announcementTime;



    private String beginTime;

    private String endTime;



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_id
     *
     * @return the value of cc_announcement_info.announcement_id
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public Integer getAnnouncementId() {
        return announcementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_id
     *
     * @param announcementId the value for cc_announcement_info.announcement_id
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_type
     *
     * @return the value of cc_announcement_info.announcement_type
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public Integer getAnnouncementType() {
        return announcementType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_type
     *
     * @param announcementType the value for cc_announcement_info.announcement_type
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementType(Integer announcementType) {
        this.announcementType = announcementType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_title
     *
     * @return the value of cc_announcement_info.announcement_title
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_title
     *
     * @param announcementTitle the value for cc_announcement_info.announcement_title
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle == null ? null : announcementTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_content
     *
     * @return the value of cc_announcement_info.announcement_content
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public String getAnnouncementContent() {
        return announcementContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_content
     *
     * @param announcementContent the value for cc_announcement_info.announcement_content
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementContent(String announcementContent) {
        this.announcementContent = announcementContent == null ? null : announcementContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_author
     *
     * @return the value of cc_announcement_info.announcement_author
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public String getAnnouncementAuthor() {
        return announcementAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_author
     *
     * @param announcementAuthor the value for cc_announcement_info.announcement_author
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementAuthor(String announcementAuthor) {
        this.announcementAuthor = announcementAuthor == null ? null : announcementAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_announcement_info.announcement_time
     *
     * @return the value of cc_announcement_info.announcement_time
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public Date getAnnouncementTime() {
        return announcementTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_announcement_info.announcement_time
     *
     * @param announcementTime the value for cc_announcement_info.announcement_time
     *
     * @mbggenerated Fri Sep 01 00:04:17 CST 2017
     */
    public void setAnnouncementTime(Date announcementTime) {
        this.announcementTime = announcementTime;
    }


    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * 公告日期格式化
     * @return
     */
    public String getAnnouncementTime_Lable(){
        if(this.getAnnouncementTime() != null){
            return DateUtil.Date2Stirng2Second(announcementTime);
        }
        return "";
    }

    /**
     * 公告类型格式化
     * @return
     */
    public String getAnnouncementType_Lable(){
        if(this.getAnnouncementType() != null && this.getAnnouncementType().intValue() == 1){
            return "系统公告";
        }else if(this.getAnnouncementType() != null && this.getAnnouncementType().intValue() == 2){
            return "活动公告";
        }else{
            return "";
        }

    }
}