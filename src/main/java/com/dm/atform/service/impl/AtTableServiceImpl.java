package com.dm.atform.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.atform.model.AtTable;
import com.dm.atform.service.AtTableService;
import com.dm.atform.sqldao.AtTableMapper;
import com.dm.atform.util.CODEUtil;
import com.dm.cms.model.TreeNode;
import com.dm.platform.util.UUIDUtils;
import com.dm.platform.util.UserAccountUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AtTableServiceImpl implements AtTableService{
	@Autowired
	private AtTableMapper tableMapper;
	@Override
	public PageInfo<AtTable> findByArg(Map map) {
		PageHelper.startPage(map);
		List<AtTable> list = this.tableMapper.selectByArgMap(map);
		PageInfo page = new PageInfo(list);
		return page;
	}
	@Override
	public PageInfo<AtTable> findByArg(Map map,String tableId) {
		if(tableId!=null){
			List<String> ids = new ArrayList<String>();
			ids.add(tableId);
			AtTable a = this.tableMapper.selectByPrimaryKey(tableId);
			map.put("pids", getChild(a,ids));
		}
		PageHelper.startPage(map);
		List<AtTable> list = this.tableMapper.selectByArgMap(map);
		PageInfo page = new PageInfo(list);
		return page;
	}
	//获取子分类
	private List<String> getChild(AtTable parent,List<String> ids) {
		if(parent.getType()!=null && parent.getType().equals("1")){//1分类 2 数据表
		List<AtTable> list = this.tableMapper.selectByPid(parent.getId());
		ids.add(parent.getId());
		for(AtTable a:list){
			getChild(a,ids);
		}
		}
		return ids;
	}
	@Override
	public List<AtTable> findAllByArg(Map map) {
		List<AtTable> list = this.tableMapper.selectByArgMap(map);
		return list;
	}
	@Override
	public AtTable findOne(String id) {
		return this.tableMapper.selectByPrimaryKey(id);
	}
	@Override
	public void save(AtTable record) {
			record.setSeq(1);
			Integer seq = this.tableMapper.selectMaxSeq();
			if(seq!=null) record.setSeq(seq+1);
			record.setId(UUIDUtils.getUUID8());
			record.setCreateDate(new Date());
			record.setCreateUser(UserAccountUtil.getInstance().getCurrentUser());
			//设置编码start
			String code = "00";
			String pId = record.getpId();
			List<AtTable> list = tableMapper.selectByPid(pId);
			if(list.size()>1){//有同级编码
				String maxcode = null;
				for(AtTable t:list){
					if(!t.getId().equals(pId)){
						if(maxcode==null){
							maxcode = t.getCode();
						}
						String tmp = t.getCode();
						maxcode.toCharArray();
					}
				}
				code = CODEUtil.nextCode(null, maxcode);
			}else{//没有同级
				AtTable parent = this.tableMapper.selectByPrimaryKey(pId);
				if(parent!=null){//有父级  根据父级生产
					code = CODEUtil.nextCode(parent.getCode(), null);
				}else{
					code="01";
				}
			}
			record.setCode(code);
			//设置编码end
			this.tableMapper.insert(record);
	}
	@Override
	public void update(AtTable record) {
			this.tableMapper.updateByPrimaryKeySelective(record);
		
	}
	@Override
	public void nologUpdate(AtTable record) {
			this.tableMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public void upCount(AtTable record) {
			this.tableMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public void delete(String id) {
		AtTable record = new AtTable();
		record.setId(id);
		record.setStatus("9");
		this.tableMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<TreeNode> getTree(Map map) {
		return this.tableMapper.selectTreeNode(map);
	}
	@Override
	public Long countByArg(Map map) {
		return this.tableMapper.countByArg(map);
	}
	@Override
	public List<AtTable> findByPid(String pid) {
		List<AtTable> list = this.tableMapper.selectByPid(pid);
		return list;
	}
	@Override
	public void sort(String id, String pid, String targetId, String moveType) {
		AtTable t1 = this.tableMapper.selectByPrimaryKey(id);
		AtTable t2 = this.tableMapper.selectByPrimaryKey(targetId);
		if(t1==null || t2==null) return ;
		int seq = t1.getSeq();
		t1.setSeq(t2.getSeq());
		t2.setSeq(seq);
		this.tableMapper.updateByPrimaryKeySelective(t1);
		this.tableMapper.updateByPrimaryKeySelective(t2);
		
	}
	
}
