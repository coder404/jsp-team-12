package com.iiitb.eforum.action;

import java.sql.Connection;
import org.apache.log4j.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
   private String password;
   private String name;
   private static final Logger logger = Logger.getLogger(LoginAction.class);

   public String execute() {
      String ret = ERROR;
      Connection conn = null;

      try {
    	  if(logger.isDebugEnabled())
    	  {
    			logger.debug("Testing .......");
    		}
    	//  logger.debug("Testing .......");
    	  String URL = "jdbc:mysql://localhost:3306/mysql";
         Class.forName("com.mysql.jdbc.Driver");
         logger.debug("Testing .......");
         conn = DriverManager.getConnection(URL, "root", "test");
         logger.debug("Testing .......");
         String sql = "USE struts_tutorial";
      
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         sql = "SELECT name FROM login WHERE";
         sql+=" user = ? AND password = ?";
         ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         logger.debug("Prepared stmt " + ps);
          rs = ps.executeQuery();

         while (rs.next()) {
            name = rs.getString(1);
            ret = SUCCESS;
         }
      } catch (Exception e) {
    	  logger.debug(e);
      //  ret = ERROR;
      } finally {
         if (conn != null) {
            try {
               conn.close();
            } catch (Exception e) {
            }
         }
      }
      return ret;
   }

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}