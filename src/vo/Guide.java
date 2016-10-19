package vo;

public class Guide {
	private String member_id;
	private String guide_photo;
	private String language;
	private String guide_profile;
	private String available_terms;
	private String prove;
	
	public Guide() {}

	public Guide(String member_id, String guide_photo, String language, String guide_profile, String available_terms,
			String prove) {
		this.member_id = member_id;
		this.guide_photo = guide_photo;
		this.language = language;
		this.guide_profile = guide_profile;
		this.available_terms = available_terms;
		this.prove = prove;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getGuide_photo() {
		return guide_photo;
	}

	public void setGuide_photo(String guide_photo) {
		this.guide_photo = guide_photo;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGuide_profile() {
		return guide_profile;
	}

	public void setGuide_profile(String guide_profile) {
		this.guide_profile = guide_profile;
	}

	public String getAvailable_terms() {
		return available_terms;
	}

	public void setAvailable_terms(String available_terms) {
		this.available_terms = available_terms;
	}

	public String getProve() {
		return prove;
	}

	public void setProve(String prove) {
		this.prove = prove;
	}

	@Override
	public String toString() {
		return "Guide [member_id=" + member_id + ", guide_photo=" + guide_photo + ", language=" + language
				+ ", guide_profile=" + guide_profile + ", available_terms=" + available_terms + ", prove=" + prove
				+ "]";
	}
	
}
