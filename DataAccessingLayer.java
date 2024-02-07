package in.ineuron.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import in.ineuron.DTO.row;
import in.ineuron.Utils.DBUtil;


public class DataAccessingLayer {

	public DataAccessingLayer() 
	{
	}
	public	List<row> searchDatabase(String keyword)
	{
		List<row> l=new ArrayList<row>();
		 try (Connection con = DBUtil.getConnection();
	             /*PreparedStatement stmt = con.prepareStatement("SELECT title, url FROM websites WHERE description LIKE ? LIMIT 30")*/
				 PreparedStatement stmt=con.prepareStatement("SELECT title, url FROM websites WHERE description LIKE ? LIMIT 30")) 
		 {
	            //stmt.setString(1,"keyword");
	            stmt.setString(1, keyword + "%");
	            ResultSet rs = stmt.executeQuery();
	            while (rs.next()) {
	            	row r=new row();
	                r.setTitle(rs.getString("title"));
	                r.setUrl(rs.getString("url"));
	                l.add(r);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return l;
	}
	public String saveUserAndKeyword(String keyword,String user,Integer UserId)
	{
		 try (Connection con = DBUtil.getConnection();
	             PreparedStatement stmt = con.prepareStatement("insert into search_history(`userid`,`keyword`,`name`) values(?,?,?)"))
				 
		 {
	            stmt.setInt(1,UserId);
	            stmt.setString(2, keyword);
	            stmt.setString(3,user);
	            int id= stmt.executeUpdate();
	           if(id==1)
	        	   return "successfully";
	        } catch (Exception e) {
	  
	            e.printStackTrace();
	            return "not saved successfully";
	        }
		return "failed";
	}
}
