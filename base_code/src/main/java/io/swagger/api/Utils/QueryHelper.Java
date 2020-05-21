package io.swagger.api.Utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class QueryHelper {
    public static PreparedStatement populateListInQuery(PreparedStatement statement, List<Integer> items) throws SQLException, SQLException {
        int index = 1;
        for (int item : items) {
            statement.setInt(index++, item);
        }
        return statement;
    }

    public static String getInPlaceHolders(int length) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < length; ) {
            builder.append('?');
            if (++index < length) {
                builder.append(',');
            }

        }
        return builder.toString();
    }
}