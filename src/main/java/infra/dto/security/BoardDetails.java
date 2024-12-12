//package infra.dto.security;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import infra.dto.UserDto;
//import infra.entity.constant.UserRoleType;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.ToString;
//
//@ToString
//@Getter
//@AllArgsConstructor
//public class BoardDetails implements UserDetails{
//	private String uid;
//	private String password;
//	private String email;
//	private UserRoleType userRoleType;
//	
//	public static BoardDetails of(String uid, String username, String password, String email, UserRoleType userRoleType) {
//		return new BoardDetails(
//				uid,
//				
//				password,
//				email,
//				userRoleType
//				);
//	}
//	
//	public static BoardDetails from(UserDto userDto) {
//		return new BoardDetails(
//				userDto.getUid(),
//				
//				userDto.getPassword(),
//				userDto.getEmail(),
//				userDto.getUserRoleType()
//				);
//	}
//	
//	public UserDto toDto() {
//    	return UserDto.of(uid,
//    					  password, 
//    					  email, 
//    					  userRoleType);
//    }
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		Collection<GrantedAuthority> collection = new ArrayList<>();
//		collection.add(()-> userRoleType.getRoleType());
//		return collection;
//	}
//	
//	@Override
//		public String getPassword() {
//			return password;
//		}
//
//	@Override
//	public String getUsername() {
//		return null;
//	}
//	
//	
//}
