

public class JWTFilter extends UsernamePasswordAuthenticationFilter {

	//@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private IAccountService accountService;
	
	
	
	public JWTFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}
	
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {

		try {
			api.entities.User user = null;
			user = new ObjectMapper().readValue(request.getInputStream(), api.entities.User.class);
			return authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Probleme in request content");
		}

	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		User user = (User) authResult.getPrincipal();
		List<String> roles = new ArrayList<String>();
		user.getAuthorities().forEach(au -> {
			roles.add(au.getAuthority());
		});
		
		
	
		
		
		
		String jwt = JWT.create().withIssuer(request.getRequestURI()).withSubject(user.getUsername())
				.withArrayClaim("roles", roles.toArray(new String[roles.size()]))
				//.withArrayClaim("infos", (String[])infos.toArray())
				// .withExpiresAt(new Date(System.currentTimeMillis()+Ses))
				.sign(Algorithm.HMAC256("secret1"));
		response.addHeader("Authorization", jwt);
	}

}
