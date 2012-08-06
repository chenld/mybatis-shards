package org.makersoft.shards.select;

import org.apache.ibatis.session.RowBounds;

/**
 * 
 */
public interface SelectFactory {

	String getStatement();
	
	Object getParameter();
	
	String getMapKey();
	
	RowBounds getRowBounds();
}
