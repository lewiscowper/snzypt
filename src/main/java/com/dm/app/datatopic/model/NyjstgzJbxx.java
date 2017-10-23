package com.dm.app.datatopic.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
/**
 * @description 农业技术推广站【基本信息】
 * @author huoge
 */
@Document(collection="m_KJ_NYJSTGZ_JBXX")
public class NyjstgzJbxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String  id;  //
	@Field("ID")
	private Double  objectId;  //标识符
	@Field("GL_ID")
	private Double  glId;  //关联ID
	@Field("QX_MC")
	private String  qxMc;  //区县名称
	@Field("XZ_MC")
	private String  xzMc;  //乡镇名称
	@Field("XZC_MC")
	private String  xzcMc;  //行政村名称
	@Field("TGZ_MC")
	private String  tgzMc;  //推广站名称
	@Field("XX_DZ")
	private String  xxDz;  //详细地址
	@Field("JZ_SJ")
	private String  jzSj;  //建站时间
	@Field("FZR_XM")
	private String  fzrXm;  //负责人姓名
	@Field("LX_DH")
	private String  lxDh;  //联系电话
	@Field("ZB_RS")
	private Integer  zbRs;  //在编人数(人)
	@Field("FW_JSLX")
	private String  fwJslx;  //服务技术类型
	@Field("TG_JSMC")
	private String  tgJsmc;  //推广技术名称
	@Field("DX_JJ")
	private String  dxJj;  //对象简介
	@Field("TJ_ND")
	private String  tjNd;  //统计年度


	

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


	public String getTgzMc() {
		return tgzMc;
	}


	public void setTgzMc(String tgzMc) {
		this.tgzMc = tgzMc;
	}


	public String getXxDz() {
		return xxDz;
	}


	public void setXxDz(String xxDz) {
		this.xxDz = xxDz;
	}


	public String getJzSj() {
		return jzSj;
	}


	public void setJzSj(String jzSj) {
		this.jzSj = jzSj;
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


	public Integer getZbRs() {
		return zbRs;
	}


	public void setZbRs(Integer zbRs) {
		this.zbRs = zbRs;
	}


	public String getFwJslx() {
		return fwJslx;
	}


	public void setFwJslx(String fwJslx) {
		this.fwJslx = fwJslx;
	}


	public String getTgJsmc() {
		return tgJsmc;
	}


	public void setTgJsmc(String tgJsmc) {
		this.tgJsmc = tgJsmc;
	}


	public String getDxJj() {
		return dxJj;
	}


	public void setDxJj(String dxJj) {
		this.dxJj = dxJj;
	}


	public String getTjNd() {
		return tjNd;
	}


	public void setTjNd(String tjNd) {
		this.tjNd = tjNd;
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
		NyjstgzJbxx other = (NyjstgzJbxx) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
