package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Guide;
import vo.Portfolio;

public class GuideDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	private SqlSession sqlsession;
	
	public GuideDAO() {}
	
	public Guide showGuideProfile(String member_id) {
		Guide guide = null;
		try{
			sqlsession = factory.openSession();
			guide = sqlsession.selectOne("guide.showGuideProfile", member_id);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return guide;
	}
	
	public List<Portfolio> showGuidePortfolio(String member_id) {
		List<Portfolio> portfolioList = null;
		try{
			sqlsession = factory.openSession();
			portfolioList = sqlsession.selectList("guide.showGuidePortfolio", member_id);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return portfolioList;
	}
	
	public void updateGuideProfile(Guide guide) {
		try{
			sqlsession = factory.openSession();
			int result = sqlsession.update("guide.updateGuideProfile", guide);
			if(result > 0) {
				sqlsession.commit();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
	}
	
}
