/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 *//*

package org.openmrs.module.groovy.web.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openmrs.api.context.Context;
import org.openmrs.module.groovy.api.db.GroovyDAO;
import org.openmrs.module.groovy.api.service.GroovyService;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/moduleApplicationContext.xml")
public class GroovyFormControllerTest extends BaseModuleContextSensitiveTest {
    private AnnotationMethodHandlerAdapter  handlerAdapter;
    private DefaultAnnotationHandlerMapping handlerMapping;
    
    @Autowired
    GroovyService moduleService;
    @Autowired
    GroovyDAO dao;
    public void testController() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/module/groovy/groovy.form");
        // request init here
        MockHttpServletResponse response = new MockHttpServletResponse();
        Object handler = handlerMapping.getHandler(request).getHandler();
        ModelAndView modelAndView = handlerAdapter.handle(request, response, handler);
        modelAndView.getViewName();
        // modelAndView and/or response asserts here
    }
	public void shouldNotNull() throws Exception {
		GroovyService service = Context.getService(GroovyService.class);
		assertNotNull(service);
	 }
	
	@Test public void test(){
		
	}
}
*/
