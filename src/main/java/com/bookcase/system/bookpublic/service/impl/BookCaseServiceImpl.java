package com.bookcase.system.bookpublic.service.impl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookcoremgmt.dto.bookcase.BookCaseReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookcase.BookCaseReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;
import com.bookcase.system.bookpublic.service.BookCaseService;

@Service
@Slf4j
public class BookCaseServiceImpl implements BookCaseService {

	
	@Override
	public GeneralPagingResult<List<BookCaseRspBody>> findBookCases(
			String page, String size) {
		return null;
	}

	@Override
	public GeneralContentResult<BookCaseRspBody> findBookCaseById(
			String bookcaseId) {
		return null;
	}

	@Override
	public GeneralContentResult<String> createBookCase(
			BookCaseReqBody bookCaseReqBody) {
		return null;
	}

	@Override
	public GeneralResult updateBookCase(String bookcaseId,
			BookCaseReqBody bookCaseReqBody) {
		return null;
	}

	@Override
	public GeneralResult deleteBookCases(BookCaseReqParam bookCaseReqParam) {
		return null;
	}

}
