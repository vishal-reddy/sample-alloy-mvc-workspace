package com.liferay.testalloymvcportlet.portlet;

import com.liferay.alloy.mvc.AlloyPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.css-class-wrapper=test-alloy-mvc-portlet",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.friendly-url-mapper-class=com.liferay.alloy.mvc.AlloyFriendlyURLMapper",
		"com.liferay.portlet.friendly-url-mapping=test_alloy_mvc",
		"com.liferay.portlet.friendly-url-routes=com/liferay/alloy/mvc/alloy-friendly-url-routes.xml?controller=assets",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Test Alloy MVC",
		"javax.portlet.init-param.template-path=/test_alloy_mvc",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestAlloyMVCPortlet extends AlloyPortlet {
}