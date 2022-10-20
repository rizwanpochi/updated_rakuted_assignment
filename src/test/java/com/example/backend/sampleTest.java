//package com.example.backend;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.example.backend.controller.BackendController;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.hamcrest.Matchers;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//
//@AutoConfigureMockMvc
//@WebMvcTest(BackendController.class)
//public class BackendApplicationTests{
////	
////	@MockBean
////	private BackendController backendController;
//
//	@Autowired
//	private WebApplicationContext webApplicationContext;
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	
//	
//	
//	@Autowired
//	@InjectMocks
//	private BackendController backendController;
//	
////	@Before 
////	public void setUp() throws Exception {
////		mockMvc = MockMvcBuilders.standaloneSetup(backendController)
////				.build();
////	} 
////
//	@Test
//	public void backTest() throws Exception {
//		mockMvc
//		.perform(MockMvcRequestBuilders
//				.post("/json1")
//				.contentType(MediaType.APPLICATION_JSON)	
//				.content("{\n"
//						+ "  \"models\": [\n"
//						+ "    {\n"
//						+ "      \"edges\": [\n"
//						+ "        {\n"
//						+ "          \"id\": \"2067c9f4-4269-4499-ad16-5742d75bc9fd\",\n"
//						+ "          \"name\": \"correct_pin\",\n"
//						+ "          \"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//						+ "          \"targetVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\"\n"
//						+ "        },\n"
//						+ "        {\n"
//						+ "          \"id\": \"326c016c-126a-4821-a92f-3154bce1d13f\",\n"
//						+ "          \"name\": \"log_out\",\n"
//						+ "          \"sourceVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//						+ "          \"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//						+ "        },\n"
//						+ "        {\n"
//						+ "          \"id\": \"07e4dc16-71a9-4cac-bece-c933369d563a\",\n"
//						+ "          \"name\": \"incorrect_pin\",\n"
//						+ "          \"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//						+ "          \"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//						+ "        }\n"
//						+ "      ],\n"
//						+ "      \"generator\": \"random(edge_coverage(100))\",\n"
//						+ "      \"id\": \"8abcf457-8df9-40fd-a9f9-49bb7b5b35a3\",\n"
//						+ "      \"name\": \"Untitled-4\",\n"
//						+ "      \"startElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//						+ "      \"vertices\": [\n"
//						+ "        {\n"
//						+ "          \"id\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//						+ "          \"name\": \"login_page\",\n"
//						+ "          \"properties\": {\n"
//						+ "            \"x\": 200,\n"
//						+ "            \"y\": 251\n"
//						+ "          }\n"
//						+ "        },\n"
//						+ "        {\n"
//						+ "          \"id\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//						+ "          \"name\": \"home_page\",\n"
//						+ "          \"properties\": {\n"
//						+ "            \"x\": 593,\n"
//						+ "            \"y\": 257\n"
//						+ "          }\n"
//						+ "        }\n"
//						+ "      ]\n"
//						+ "    }\n"
//						+ "  ],\n"
//						+ "  \"selectedModelIndex\": 0,\n"
//						+ "  \"selectedElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//						+ "}"))
//		.andExpect(MockMvcResultMatchers.status().isOk())				
//	    .andExpect(MockMvcResultMatchers.jsonPath("$.path1",Matchers.is("login_page")))
//	    .andExpect(MockMvcResultMatchers.jsonPath("$.path2",Matchers.is("home_page")));
//	}
//
//		
//@Test
//public void backTest3() throws Exception {
//	mockMvc
//	.perform(MockMvcRequestBuilders
//			.post("/all")
//			.contentType(MediaType.APPLICATION_JSON)	
//			.content("{\n"
//					+ "	\"files\": [{\n"
//					+ "			\"models\": [{\n"
//					+ "				\"edges\": [{\n"
//					+ "						\"id\": \"2067c9f4-4269-4499-ad16-5742d75bc9fd\",\n"
//					+ "						\"name\": \"correct_pin\",\n"
//					+ "						\"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"targetVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"326c016c-126a-4821-a92f-3154bce1d13f\",\n"
//					+ "						\"name\": \"log_out\",\n"
//					+ "						\"sourceVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//					+ "						\"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"07e4dc16-71a9-4cac-bece-c933369d563a\",\n"
//					+ "						\"name\": \"incorrect_pin\",\n"
//					+ "						\"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "					}\n"
//					+ "				],\n"
//					+ "				\"generator\": \"random(edge_coverage(100))\",\n"
//					+ "				\"id\": \"8abcf457-8df9-40fd-a9f9-49bb7b5b35a3\",\n"
//					+ "				\"name\": \"Untitled-4\",\n"
//					+ "				\"startElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "				\"vertices\": [{\n"
//					+ "						\"id\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"name\": \"login_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 200,\n"
//					+ "							\"y\": 251\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//					+ "						\"name\": \"home_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 593,\n"
//					+ "							\"y\": 257\n"
//					+ "						}\n"
//					+ "					}\n"
//					+ "				]\n"
//					+ "			}],\n"
//					+ "			\"selectedModelIndex\": 0,\n"
//					+ "			\"selectedElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "		},\n"
//					+ "		{\n"
//					+ "			\"models\": [{\n"
//					+ "				\"edges\": [{\n"
//					+ "						\"id\": \"2016bb60-9f82-4510-818b-f045cd632ad9\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"71bec230-8d89-40ed-9eda-29642f7b3653\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"497248ce-0358-46cb-9aae-94129bad7114\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"59b42a35-1525-4d2f-ad3a-da06c0f97464\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"f2c96d1e-8d32-4329-8d6e-f771a12081a1\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"71bec230-8d89-40ed-9eda-29642f7b3653\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"31b9ea08-f35e-4304-887e-071472941ecd\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"4d7105ef-e545-48ce-b670-efbf5f175b81\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					}\n"
//					+ "				],\n"
//					+ "				\"generator\": \"random(edge_coverage(100))\",\n"
//					+ "				\"id\": \"784dff34-8431-4325-9d56-3e6c226134dd\",\n"
//					+ "				\"name\": \"StateDiagram2\",\n"
//					+ "				\"startElementId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "				\"vertices\": [{\n"
//					+ "						\"id\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"name\": \"home_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 203,\n"
//					+ "							\"y\": 258\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\",\n"
//					+ "						\"name\": \"jobs\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 538,\n"
//					+ "							\"y\": 254\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\",\n"
//					+ "						\"name\": \"posts\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 486,\n"
//					+ "							\"y\": 471\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"71bec230-8d89-40ed-9eda-29642f7b3653\",\n"
//					+ "						\"name\": \"search\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 211,\n"
//					+ "							\"y\": 503\n"
//					+ "						}\n"
//					+ "					}\n"
//					+ "				]\n"
//					+ "			}],\n"
//					+ "			\"selectedModelIndex\": 0,\n"
//					+ "			\"selectedElementId\": \"2016bb60-9f82-4510-818b-f045cd632ad9\"\n"
//					+ "		}\n"
//					+ "	]\n"
//					+ "}"))
//	.andExpect(MockMvcResultMatchers.jsonPath("$.path1",Matchers.is("login_page")))
//    .andExpect(MockMvcResultMatchers.jsonPath("$.path2",Matchers.is("home_page")))
//    .andExpect(MockMvcResultMatchers.jsonPath("$.path3",Matchers.is("jobs")))
//    .andExpect(MockMvcResultMatchers.jsonPath("$.path4",Matchers.is("posts")))
//	.andExpect(MockMvcResultMatchers.jsonPath("$.path5",Matchers.is("search")));
//    
//    
//
//}
//
//@Test
//public void backTest2() throws Exception {
//	mockMvc
//	.perform(MockMvcRequestBuilders
//			.post("/common")
//			.contentType(MediaType.APPLICATION_JSON)	
//			.content("{\n"
//					+ "	\"files\": [{\n"
//					+ "			\"models\": [{\n"
//					+ "				\"edges\": [{\n"
//					+ "						\"id\": \"2067c9f4-4269-4499-ad16-5742d75bc9fd\",\n"
//					+ "						\"name\": \"correct_pin\",\n"
//					+ "						\"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"targetVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"326c016c-126a-4821-a92f-3154bce1d13f\",\n"
//					+ "						\"name\": \"log_out\",\n"
//					+ "						\"sourceVertexId\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//					+ "						\"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"07e4dc16-71a9-4cac-bece-c933369d563a\",\n"
//					+ "						\"name\": \"incorrect_pin\",\n"
//					+ "						\"sourceVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"targetVertexId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "					}\n"
//					+ "				],\n"
//					+ "				\"generator\": \"random(edge_coverage(100))\",\n"
//					+ "				\"id\": \"8abcf457-8df9-40fd-a9f9-49bb7b5b35a3\",\n"
//					+ "				\"name\": \"Untitled-4\",\n"
//					+ "				\"startElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "				\"vertices\": [{\n"
//					+ "						\"id\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\",\n"
//					+ "						\"name\": \"login_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 200,\n"
//					+ "							\"y\": 251\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"1b31727f-db04-4bc4-99bd-685ec4e876ae\",\n"
//					+ "						\"name\": \"home_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 593,\n"
//					+ "							\"y\": 257\n"
//					+ "						}\n"
//					+ "					}\n"
//					+ "				]\n"
//					+ "			}],\n"
//					+ "			\"selectedModelIndex\": 0,\n"
//					+ "			\"selectedElementId\": \"f655d4c2-4203-4590-9ab7-c4fef5554955\"\n"
//					+ "		},\n"
//					+ "		{\n"
//					+ "			\"models\": [{\n"
//					+ "				\"edges\": [{\n"
//					+ "						\"id\": \"2016bb60-9f82-4510-818b-f045cd632ad9\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"71bec230-8d89-40ed-9eda-29642f7b3653\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"497248ce-0358-46cb-9aae-94129bad7114\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"59b42a35-1525-4d2f-ad3a-da06c0f97464\",\n"
//					+ "						\"name\": \"navigate\",\n"
//					+ "						\"sourceVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"targetVertexId\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"f2c96d1e-8d32-4329-8d6e-f771a12081a1\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"71bec230-8d89-40ed-9eda-29642f7b3653\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"31b9ea08-f35e-4304-887e-071472941ecd\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"4d7105ef-e545-48ce-b670-efbf5f175b81\",\n"
//					+ "						\"name\": \"back\",\n"
//					+ "						\"sourceVertexId\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\",\n"
//					+ "						\"targetVertexId\": \"a8645254-8d88-438a-962c-21250967e58d\"\n"
//					+ "					}\n"
//					+ "				],\n"
//					+ "				\"generator\": \"random(edge_coverage(100))\",\n"
//					+ "				\"id\": \"784dff34-8431-4325-9d56-3e6c226134dd\",\n"
//					+ "				\"name\": \"StateDiagram2\",\n"
//					+ "				\"startElementId\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "				\"vertices\": [{\n"
//					+ "						\"id\": \"a8645254-8d88-438a-962c-21250967e58d\",\n"
//					+ "						\"name\": \"home_page\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 203,\n"
//					+ "							\"y\": 258\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"872991f5-bcb2-4cdb-aa5a-75a46d2baef0\",\n"
//					+ "						\"name\": \"jobs\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 538,\n"
//					+ "							\"y\": 254\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"c12ce166-77fb-4552-9324-9dfd13225ce7\",\n"
//					+ "						\"name\": \"posts\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 486,\n"
//					+ "							\"y\": 471\n"
//					+ "						}\n"
//					+ "					},\n"
//					+ "					{\n"
//					+ "						\"id\": \"71bec230-8d89-40ed-9eda-29642f7b3653\",\n"
//					+ "						\"name\": \"search\",\n"
//					+ "						\"properties\": {\n"
//					+ "							\"x\": 211,\n"
//					+ "							\"y\": 503\n"
//					+ "						}\n"
//					+ "					}\n"
//					+ "				]\n"
//					+ "			}],\n"
//					+ "			\"selectedModelIndex\": 0,\n"
//					+ "			\"selectedElementId\": \"2016bb60-9f82-4510-818b-f045cd632ad9\"\n"
//					+ "		}\n"
//					+ "	]\n"
//					+ "}"))
//	.andExpect(MockMvcResultMatchers.jsonPath("$.common_path[0]",Matchers.is("home_page")));
//}
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//	//	when(backendController.api1(null)).thenReturn()
//	
//
//
////
////	
////	@Before 
////	public void setUp() throws Exception {
////		mockMvc = MockMvcBuilders.standaloneSetup(backendController)
////				.build();
////	
////		@Test
////		public void testBack() throws Exception {
////			api1 record = api1.builder()
////					.path1(home_page);
////			
////		Mockito.when(obj1.save(record)).thenReturn(record);
////		
////		String content = objectWriter.writeValueAsString(record);
////		
////		
////		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/json1")
////				.contentType(MediaType.APPLICATION_JSON)
////				.accept(MediaType.APPLICATION_JSON);
////				
////				mockMvc.perform(mockRequest))
////				.andExpect(status().isOk())
////				.andExpect(jsonPath("$", notNullValue()));
////
////}
////	}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////@RunWith(SpringJUnit4ClassRunner.class)
////public class BackendApplicationTests{
////	
////	private MockMvc mockMvc;
////	
////	@InjectMocks
////	private BackendController backendController;
////	
////	@Before 
////	public void setUp() throws Exception {
////		mockMvc = MockMvcBuilders.standaloneSetup(backendController)
////				.build();
////	
////		@Test
////		public void testBack() throws Exception {
////			api1 record = api1.builder()
////					.path1(home_page);
////			
////		Mockito.when(obj1.save(record)).thenReturn(record);
////		
////		String content = ObjectWriter.writeValueAsString(record);
////		
////		
////		MockHttpServletRequestBuilder mockRequest = MockHttpRequestBuilders.post("/json1")
////				.contentType(MediaType.APPLICATION_JSON)
////				.accept(MediaType.APPLICATION_JSON);
////				
////				mockMvc.perform(mockRequest))
////				.andExpect(status().isok())
////				.andExpect(jsonPath("$", notNullValue()));
//
// 
//
//
////import ch.qos.logback.core.net.ObjectWriter;
////
////@RunWith(SpringJUnit4ClassRunner.class)
////public class BackendApplicationTests{
////	
////	private MockMvc mockMvc;
////	
////	@InjectMocks
////	private BackendController backendController;
////	
////	@Before 
////	public void setUp() throws Exception {
////		mockMvc = MockMvcBuilders.standaloneSetup(backendController)
////				.build();
////		
////	}
////		
////	
////	@Test
////	public void testBack() throws Exception {
////		api1 record = api1.builder()
////				.path1(home_page);
////		
////	Mockito.when(obj1.save(record)).thenReturn(record);
////	
////	String content = ObjectWriter.writeValueAsString(record);
////	
////	
////	MockHttpServletRequestBuilder mockRequest = MockHttpRequestBuilders.post("/json1")
////			.contentType(MediaType.APPLICATION_JSON)
////			.accept(MediaType.APPLICATION_JSON);
////			
////			mockMvc.perform(mockRequest))
////			.andExpect(status().isok())
////			.andExpect(jsonPath("$", notNullValue()));
////					
////}
////}
// 
//
////import com.example.backend.controller.BackendController;
////
////@WebMvcTest(value = BackendController.class)
////class BackendApplicationTests {
////	
////	@MockBean
////	private BackendzTest backendTest;
////	
////	@Autowired
////	private MockMvc mockMvc;
////	
////	@Test
////	public void testBackEnd() {
////		when(rootModel.models.get(0).vertices()).thenReturn("hello");
////		
////	}
////	
////}
//	
//	
////	private static MockMvc mockMvc;
//	//
////		@BeforeAll
////		static void init() {
////			mockMvc = MockMvcBuilders.standaloneSetup(BackendController.class).build();
//	//
////		}
////			@Test
////			void backTest() throws Exception{
////			mockMvc.perform(post("/json1")).andDo(print()).andExpect(status().isOk());
//	//	
//	//}
//	//}
//
//
