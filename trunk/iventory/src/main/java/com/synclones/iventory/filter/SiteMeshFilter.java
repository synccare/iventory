package com.synclones.iventory.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.DivExtractingTagRuleBundle;

public class SiteMeshFilter extends ConfigurableSiteMeshFilter{

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder){
		builder.addDecoratorPath("/*", "/decorators/default.jsp");
		
		/**Map Admin pages default*/
		builder.addDecoratorPath("/admin/**", "/decorators/adminDefault.jsp");
		
		/**Map exclude paths*/
		builder.addExcludedPath("/login/**").addExcludedPath("/login")
		.addExcludedPath("/registration").addExcludedPath("/popup/**").addExcludedPath("/ajax/**");
		
		builder.addTagRuleBundle(new DivExtractingTagRuleBundle());
	}
}
