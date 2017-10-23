package com.dm.app.datatopic.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="m_YZ_YZC_JBXX")
public class YzcJbxx implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 private String   id;  //
	@Field("ID")
	 private String   object;  //标识符
	@Field("GL_ID")
	 private String   glId;  //关联ID
	@Field("QX_MC")
	 private String   qxMc;  //区县名称
	@Field("XZ_MC")
	 private String   xzMc;  //所在乡镇
	@Field("XZC_MC")
	 private String   xzcMc;  //所在行政村
	@Field("YZC_MC")
	 private String   yzcMc;  //养殖场名称
	@Field("JD_DZ")
	 private String   jdDz;  //基地地址
	@Field("FZR_XM")
	 private String  fzrXm ;  //负责人姓名
	@Field("LX_DH")
	 private String  lxDh ;  //联系电话
	@Field("ZD_MJ")
	 private Double   zdMj;  //占地面积(亩)
	@Field("JS_ND")
	 private String   jsNd;  //建设年度
	@Field("YZC_LB")
	 private String   yzcLb;  //养殖场类别
	@Field("DX_JJ")
	 private String  dxJj ;  //对象简介
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getGlId() {
		return glId;
	}
	public void setGlId(String glId) {
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
	public String getYzcMc() {
		return yzcMc;
	}
	public void setYzcMc(String yzcMc) {
		this.yzcMc = yzcMc;
	}
	public String getJdDz() {
		return jdDz;
	}
	public void setJdDz(String jdDz) {
		this.jdDz = jdDz;
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
	public Double getZdMj() {
		return zdMj;
	}
	public void setZdMj(Double zdMj) {
		this.zdMj = zdMj;
	}
	public String getJsNd() {
		return jsNd;
	}
	public void setJs_Nd(String jsNd) {
		this.jsNd = jsNd;
	}
	public String getYzcLb() {
		return yzcLb;
	}
	public void setYzcLb(String yzcLb) {
		this.yzcLb = yzcLb;
	}
	public String getDxJj() {
		return dxJj;
	}
	public void setDxJj(String dxJj) {
		this.dxJj = dxJj;
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
		YzcJbxx other = (YzcJbxx) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
