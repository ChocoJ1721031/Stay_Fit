package kh.project.stayfit.security.model.dto;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

public class UserDetailsDto implements UserDetails{

	private static final long serialVersionUID = 1L;
	private String ID;
	private String PASSWORD;
	private boolean ENABLED;
	private ArrayList<GrantedAuthority> authority;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authority;
	}
	
	public void setAuthority(ArrayList<String> authList) {
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		for(int i=0;i<authList.size();i++) {
			auth.add(new SimpleGrantedAuthority(authList.get(i)));
		}
		this.authority=auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return PASSWORD;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return ID;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return ENABLED;
	}
}