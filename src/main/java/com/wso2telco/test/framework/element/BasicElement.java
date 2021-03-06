package com.wso2telco.test.framework.element;

import org.openqa.selenium.WebElement;

import com.wso2telco.test.framework.core.FObject;
import com.wso2telco.test.framework.util.UIType;

public class BasicElement extends FObject{
	protected UIType uiType;
	protected String uiValue;
	protected String description="";
	protected WebElement element;
	
	
	public BasicElement(UIType uiType, String value) {
		super();
		this.uiType = uiType;
		this.uiValue = value;
	}
	public BasicElement(UIType uiType, String value,String description) {
		super();
		this.uiType = uiType;
		this.uiValue = value;
		this.description = description;
	}
	public BasicElement(WebElement element) {
		super();
		this.element = element;
	}
	public String getDescription() {
		return description;
	}
	public UIType getUiType() {
		return uiType;
	}
	
	public String getUiValue() {
		return uiValue;
	}

}
