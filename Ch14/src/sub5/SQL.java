package sub5;

public class SQL {

	public static final String INSERT_USER = "Insert into `User2` values (?,?,?,?)";
	public static final String SELECT_USERS = "Select * from `User2`";
	public static final String SELECT_USER = "Select * from `User2` where `uid`=?";
	public static final String UPDATE_USER = "Update `User2` set "
																+ "`name`=?,"
																+ "`birth`=?,"
																+ "`addr`=? "
																+ "Where `uid`=?";
	public static final String DELETE_USER = "Delete from `User2` "
											+ "Where `uid`=?";
}
