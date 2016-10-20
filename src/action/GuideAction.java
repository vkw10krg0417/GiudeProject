package action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.GuideDAO;
import vo.Guide;
import vo.Portfolio;

public class GuideAction extends ActionSupport implements SessionAware{
	private Guide guide;
	private Map<String, Object> session;
	private String member_id;
	private String guide_photo;
	private String language;
	private String guide_profile;
	private String available_terms;
	private String prove;
	private List<Portfolio> portfolioList;
	
	
	//==================================================
	
	public String showGuideProfile() throws Exception{
		GuideDAO dao =  new GuideDAO();
		guide = dao.showGuideProfile(member_id);
		portfolioList = dao.showGuidePortfolio(member_id);
		System.out.println("과연 성공일 것인가");
		System.out.println("이런이런");
		return SUCCESS;
	} 
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
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

}
