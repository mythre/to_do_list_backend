package io.swagger.api.impl;

import io.swagger.api.Utils.QueryHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;

public class ListDAO {
    private  PostgresSql postgresSql ;

    public ListDAO(PostgresSql postgresSql) throws SQLException
    {
        this.postgresSql = postgresSql;
    }
    public static  final String Query_getTasks_By_UserId = "SELECT taskId,taskItem FROM TodoList.tasks WHERE userId = ?";
    public static final String Query_update_completed_by_taskId = "UPDATE TodoList.tasks SET completed = ? WHERE taskId = ?";
    public static final String Query_update_taskItem_by_taskId = "UPDATE TodoList.tasks SET taskItem = ? WHERE taskId = ?";
    public static final String  Query_delete_by_taskId = "DELETE FROM TodoList.tasks WHERE taskId IN (%s)";
    
    private final Connection conn = postgresSql.getConnection();
    public ResultSet getTasksByUserId(int userId) throws SQLException
    {
        PreparedStatement stmt=conn.prepareStatement(Query_getTasks_By_UserId);
        stmt.setInt(1,userId);
        ResultSet tasks_by_userid = stmt.executeQuery();
        return tasks_by_userid;
    }
    public int updateTaskCompletionByTaskId(boolean completed,int taskId) throws SQLException
    {
        PreparedStatement stmt=conn.prepareStatement(Query_update_completed_by_taskId);
        stmt.setBoolean(1,completed);
        stmt.setInt(2,taskId);
        int completedUpdateSucces = stmt.executeUpdate();
        return completedUpdateSucces;
    }

    public int updateTaskItemByTaskId(String taskItem,int taskId) throws SQLException
    {
        PreparedStatement stmt=conn.prepareStatement(Query_update_taskItem_by_taskId);
        stmt.setString(1,taskItem);
        stmt.setInt(2,taskId);
        int taskItemUpdateSuccess = stmt.executeUpdate();
        return taskItemUpdateSuccess;
    }

    public int deleteTasksByTaskId(List<Integer> taskIds) throws SQLException {
        String finalQuery = String.format(Query_update_taskItem_by_taskId,QueryHelper.getInPlaceHolders(taskIds.size()));
        PreparedStatement stmt=conn.prepareStatement(finalQuery);
        stmt =  QueryHelper.populateListInQuery(stmt,taskIds);
        int tasksDeletionSuccess = stmt.executeUpdate();
        return tasksDeletionSuccess;
    }

}