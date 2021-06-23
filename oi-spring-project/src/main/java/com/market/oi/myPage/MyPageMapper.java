package com.market.oi.myPage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.market.oi.member.MemberVO;
import com.market.oi.util.MypagePager;

@Mapper
public interface MyPageMapper {

	public List<ProductVO> getList(MemberVO memberVO);
	
	public List<ProductVO> getSellList(MemberVO memberVO);
	
	public ProductVO getInfoList(MemberVO memberVO);
	
	public int setHitUpdate(ProductVO productVO) throws Exception;
	
	public ProductVO getSelect(ProductVO productVO) throws Exception;
	
	public int setUpdate(ProductVO productVO) throws Exception;
	
	public int soldoutUpdate(ProductVO productVO) throws Exception;
	
	public int sellUpdate(ProductVO productVO) throws Exception;
	
	public int setDelete(ProductVO productVO) throws Exception;
	
	public List<ProductVO> getBuyList(MemberVO memberVO) throws Exception;
	
	public List<MywishVO> getMywish(MemberVO memberVO) throws Exception;
	
	public int setWishInsert(ProductVO productVO) throws Exception;
	
	public int setWishDelete(MywishVO mywishVO) throws Exception;
	
	public int likeUpdate(ProductVO productVO) throws Exception;
	
	public int likeDelete(MywishVO mywishVO) throws Exception;
	
	public Long getTotalCount() throws Exception;
	
	public List<ReviewVO> getReviewList(MemberVO memberVO) throws Exception;
	
	public ReviewVO getReviewSelect(ReviewVO reviewVO) throws Exception;
	
	public List<ReviewVO> getSeller(ReviewVO reviewVO) throws Exception;
	
	public List<ReviewVO> getBuyer(ReviewVO reviewVO) throws Exception;
	
	public int setReview(ReviewVO reviewVO) throws Exception;
}