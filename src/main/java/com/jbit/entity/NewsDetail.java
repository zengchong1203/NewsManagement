package com.jbit.entity;

import java.util.Date;

public class NewsDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_detail.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_detail.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_detail.author
     *
     * @mbg.generated
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_detail.createDate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_detail.id
     *
     * @return the value of news_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_detail.id
     *
     * @param id the value for news_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_detail.title
     *
     * @return the value of news_detail.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_detail.title
     *
     * @param title the value for news_detail.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_detail.summary
     *
     * @return the value of news_detail.summary
     *
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_detail.summary
     *
     * @param summary the value for news_detail.summary
     *
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_detail.author
     *
     * @return the value of news_detail.author
     *
     * @mbg.generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_detail.author
     *
     * @param author the value for news_detail.author
     *
     * @mbg.generated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_detail.createDate
     *
     * @return the value of news_detail.createDate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_detail.createDate
     *
     * @param createdate the value for news_detail.createDate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}