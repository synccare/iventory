package com.synclones.iventory.model;

import java.util.Date;

/**
 * 
 * Copyright &copy; Xcendant (Pvt) Ltd <http://www.xcendant.com>, - All Rights
 * Reserved. Unauthorized copying of this file, via any medium is strictly
 * prohibited. Proprietary and confidential.
 * 
 * Description of Auditable: Common Auditable Interface for recording audit fields
 * 
 * Modifications:
 * 
 * @version Revision: 1.0
 * 
 */
public interface Auditable {	

	Date getCreatedOn();

	void setCreatedOn(Date createdDate);
	
	String getCreatedBy();

	void setCreatedBy(String createdBy);
	
	String getCreatedAt();
	
	void setCreatedAt(String createdAt);

	Date getModifiedOn();

	void setModifiedOn(Date modifiedDate);

	String getModifiedBy();

	void setModifiedBy(String modifiedBy);
	
	String getModifiedAt();
	
	void setModifiedAt(String modifiedAt);
	
	Integer getVersion();
	
	void setVersion(Integer version);

}
