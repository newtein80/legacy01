package com.lifesoft.legacy01.model.dao;

import java.util.List;

import com.lifesoft.legacy01.model.dto.MemoDTO;

// dao의 인터페이스
public interface MemoDAO {

	List<MemoDTO> getMemoList();

	void memoInsert(MemoDTO dto);

	MemoDTO getMemoDetail(int idx);

	void memoUpdate(MemoDTO dto);

	void memoDelete(int idx);

}
