package com.bezkoder.springjwt.payload.response;

import java.util.List;


public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String nom;
	private String prenom;
	private String poste;
	private String email;
	
	private List<String> roles;

	public JwtResponse(String accessToken, Long id, String nom, String prenom ,String poste , String email ,   List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.nom = nom;
	    this.prenom=prenom ; 
	    this.poste=poste ; 

		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<String> getRoles() {
		return roles;
	}
}
