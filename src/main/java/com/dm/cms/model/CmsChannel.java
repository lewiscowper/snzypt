package com.dm.cms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.dm.platform.util.ConfigUtil;

public class CmsChannel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.id
     *
     * @mbggenerated
     */
	
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.pid
     *
     * @mbggenerated
     */
    private Integer pid;
    private String forbidden;//禁用：1  启用：0
    private Integer pageSize;//每页条数
    
    protected String url; //静态化地址
    
    protected String mUrl;
    
    private String channelIcon;//频道图标
    
    private String desc;//描述
    
    public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	

	public String getChannelIcon() {
		return channelIcon;
	}

	public void setChannelIcon(String channelIcon) {
		this.channelIcon = channelIcon;
	}

	public String getForbidden() {
		return forbidden;
	}

	public void setForbidden(String forbidden) {
		this.forbidden = forbidden== null ? null : forbidden.trim();
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.display_name
     *
     * @mbggenerated
     */
    private String displayName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.en_name
     *
     * @mbggenerated
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.site_id
     *
     * @mbggenerated
     */
    private Integer siteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.template_id
     *
     * @mbggenerated
     */
    private Integer templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.is_html
     *
     * @mbggenerated
     */
    private Boolean isHtml;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.seq
     *
     * @mbggenerated
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_channel.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_channel
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.id
     *
     * @return the value of cms_channel.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.id
     *
     * @param id the value for cms_channel.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.pid
     *
     * @return the value of cms_channel.pid
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.pid
     *
     * @param pid the value for cms_channel.pid
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.display_name
     *
     * @return the value of cms_channel.display_name
     * @mbggenerated
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.display_name
     *
     * @param displayName the value for cms_channel.display_name
     * @mbggenerated
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.en_name
     *
     * @return the value of cms_channel.en_name
     * @mbggenerated
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.en_name
     *
     * @param enName the value for cms_channel.en_name
     * @mbggenerated
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.site_id
     *
     * @return the value of cms_channel.site_id
     * @mbggenerated
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.site_id
     *
     * @param siteId the value for cms_channel.site_id
     * @mbggenerated
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.template_id
     *
     * @return the value of cms_channel.template_id
     * @mbggenerated
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.template_id
     *
     * @param templateId the value for cms_channel.template_id
     * @mbggenerated
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.is_html
     *
     * @return the value of cms_channel.is_html
     * @mbggenerated
     */
    public Boolean getIsHtml() {
        return isHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.is_html
     *
     * @param isHtml the value for cms_channel.is_html
     * @mbggenerated
     */
    public void setIsHtml(Boolean isHtml) {
        this.isHtml = isHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.seq
     *
     * @return the value of cms_channel.seq
     * @mbggenerated
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.seq
     *
     * @param seq the value for cms_channel.seq
     * @mbggenerated
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.create_time
     *
     * @return the value of cms_channel.create_time
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.create_time
     *
     * @param createTime the value for cms_channel.create_time
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.create_user
     *
     * @return the value of cms_channel.create_user
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.create_user
     *
     * @param createUser the value for cms_channel.create_user
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_channel.update_time
     *
     * @return the value of cms_channel.update_time
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_channel.update_time
     *
     * @param updateTime the value for cms_channel.update_time
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    private String siteDomain;

    public String getSiteDomain() {
        return siteDomain;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

	public String getUrl() {
		if(channelType !=null &&channelType.equals("2")){//链接
			return url;
		}
		if(isHtml!=null && isHtml)
		{
			return url;
		}
		else
		{
			String projectName = ConfigUtil.getConfigContent("cms","projectName");
			return "/"+projectName+"/portal/channel/"+enName+"/"+id+"_"+1+".htm";
		}
	}
	public String getmUrl() {
    	String htmlPCFolder = ConfigUtil.getConfigContent("cms", "htmlDir");
    	String htmlMobileFolder = ConfigUtil.getConfigContent("cms", "htmlMobileDir");
    	if(channelType !=null &&channelType.equals("2")){//链接
    		return url.replace(htmlPCFolder, htmlPCFolder+htmlMobileFolder);
		}
		if(isHtml!=null && isHtml)
		{
			return url.replace(htmlPCFolder, htmlPCFolder+htmlMobileFolder);
		}
		else
		{
			String projectName = ConfigUtil.getConfigContent("cms","projectName");
			return "/"+projectName+"/portal/channel/"+enName+"/"+id+"_"+1+".htm";
		}
    }

	public void setUrl(String url) {
		this.url = url;
	}
	private String channelType;

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType == null ? null : channelType.trim();
	}
	private String contentText;

	private List<CmsChannel> childChannels;

	public String getContentText() {//单页模板内容
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText == null ? "" : contentText;
	}

	public void setChildChannels(List<CmsChannel> c) {
		this.childChannels = c;
	}

	public List<CmsChannel> getChildChannels() {
		return childChannels;
		
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
