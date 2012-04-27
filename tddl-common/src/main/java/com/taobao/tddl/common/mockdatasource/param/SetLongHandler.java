/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetLongHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setLong((Integer) args[0], (Long) args[1]);
	}
}