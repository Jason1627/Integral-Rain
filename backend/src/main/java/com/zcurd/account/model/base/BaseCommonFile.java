package com.zcurd.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommonFile<M extends BaseCommonFile<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}

	public java.lang.String getPath() {
		return get("path");
	}

	public M setSysUserId(java.lang.Integer sysUserId) {
		set("sys_user_id", sysUserId);
		return (M)this;
	}

	public java.lang.Integer getSysUserId() {
		return get("sys_user_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
