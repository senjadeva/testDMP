package com.test.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.test.entity.TestDMPLoginRequest;
import com.test.entity.TestDMPLoginResponse;
import com.test.entity.TestDMPResponse;

public interface TestDMPService {
	
	List<TestDMPResponse> getRecruitment() throws IOException;
	
	TestDMPLoginResponse login(TestDMPLoginRequest req);

	TestDMPResponse getOneRecruitment(String id) throws IOException;
	
	String getReportRecruitment() throws IOException;
	
	String resultToCsvFormat(String header, List<Map<String, Object>> data);

}
