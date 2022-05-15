package api.security;




@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private IAccountService accountService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		doc.entities.User appUser=accountService.loadUserByEmail(username);
		if(appUser==null) throw new UsernameNotFoundException("Invalid User");
		
		Collection<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
		
		appUser.getRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		System.err.println(appUser.getPassword());
		return new User(appUser.getEmail(),appUser.getPassword(),authorities);
	}

}
