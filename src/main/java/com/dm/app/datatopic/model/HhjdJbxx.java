package com.dm.app.datatopic.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @description 花卉基地【基本信息】
 * @author huoge
 */
@Document(collection="m_LY_HHJD_JBXX")
public class HhjdJbxx  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String id; 
	@Field("ID")
	private Double objectId; //标识符
	@Field("GL_ID")
	private Double glId; //关联ID
	 @Field("QX_MC")
	 private String qxMc; //区县名称
	 @Field("XZ_MC")
	 private String xzMc; //乡镇名称
	 @Field("XZC_MC")
	 private String xzcMc; //行政村名称
	 @Field("HHJD_MC")
	 private String hhjdMc; //花卉基地名称
	 @Field("XX_DZ")
	 private String xxDz; //详细地址
	 @Field("JZ_SJ")
	 private Date jzSj; //建站时间
	 @Field("FZR_XM")
	 private String fzrXm; //负责人姓名
	 @Field("LX_DH")
	 private String lxDh; //联系电话
	 @Field("ZD_MJ")
	 private Double zdMj; //占地面积
	 @Field("XQHL_NSCNL")
	 private Double xqhlHscnl; //鲜切花类年生产能力(万枝)
	 @Field("GXMML_NSCNL")
	 private Double gxmmlNscnl; //观赏苗木类年生产能力(万株)
	 @Field("N_YYE")
	 private Double nYye; //年营业额(万元)
	 @Field("N_DDNHS")
	 private Integer nDdnhs; //带动农户数量(户)
	 @Field("SF_BZHJD")
	 private String sfBzhjd; //是否标准化基地
	 @Field("JS_ND")
	 private String jsNd; //建设年度
	 @Field("DX_JJ")
	 private String dxJj; //对象简介
	 @Field("XZC_CODE")
	 private String xzcCode; //
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getObjectId() {
		return objectId;
	}
	public void setObjectId(Double objectId) {
		this.objectId = objectId;
	}
	public Double getGlId() {
		return glId;
	}
	public void setGlId(Double glId) {
		this.glId = glId;
	}
	public String getQxMc() {
		return qxMc;
	}
	public void setQxMc(String qxMc) {
		this.qxMc = qxMc;
	}
	public String getXzMc() {
		return xzMc;
	}
	public void setXzMc(String xzMc) {
		this.xzMc = xzMc;
	}
	public String getXzcMc() {
		return xzcMc;
	}
	public void setXzcMc(String xzcMc) {
		this.xzcMc = xzcMc;
	}
	public String getHhjdMc() {
		return hhjdMc;
	}
	public void setHhjdMc(String hhjdMc) {
		this.hhjdMc = hhjdMc;
	}
	public String getXxDz() {
		return xxDz;
	}
	public void setXxDz(String xxDz) {
		this.xxDz = xxDz;
	}
	public String getFzrXm() {
		return fzrXm;
	}
	public void setFzrXm(String fzrXm) {
		this.fzrXm = fzrXm;
	}
	public String getLxDh() {
		return lxDh;
	}
	public void setLxDh(String lxDh) {
		this.lxDh = lxDh;
	}
	
	public Date getJzSj() {
		return jzSj;
	}
	public void setJzSj(Date jzSj) {
		this.jzSj = jzSj;
	}
	public Double getZdMj() {
		return zdMj;
	}
	public void setZdMj(Double zdMj) {
		this.zdMj = zdMj;
	}
	public Double getXqhlHscnl() {
		return xqhlHscnl;
	}
	public void setXqhlHscnl(Double xqhlHscnl) {
		this.xqhlHscnl = xqhlHscnl;
	}
	public Double getGxmmlNscnl() {
		return gxmmlNscnl;
	}
	public void setGxmmlNscnl(Double gxmmlNscnl) {
		this.gxmmlNscnl = gxmmlNscnl;
	}
	public Double getnYye() {
		return nYye;
	}
	public void setnYye(Double nYye) {
		this.nYye = nYye;
	}
	public Integer getnDdnhs() {
		return nDdnhs;
	}
	public void setnDdnhs(Integer nDdnhs) {
		this.nDdnhs = nDdnhs;
	}
	public String getSfBzhjd() {
		return sfBzhjd;
	}
	public void setSfBzhjd(String sfBzhjd) {
		this.sfBzhjd = sfBzhjd;
	}
	public String getJsNd() {
		return jsNd;
	}
	public void setJsNd(String jsNd) {
		this.jsNd = jsNd;
	}
	public String getDxJj() {
		return dxJj;
	}
	public void setDxJj(String dxJj) {
		this.dxJj = dxJj;
	}
	
	public String getXzcCode() {
		return xzcCode;
	}
	public void setXzcCode(String xzcCode) {
		this.xzcCode = xzcCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HhjdJbxx other = (HhjdJbxx) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
