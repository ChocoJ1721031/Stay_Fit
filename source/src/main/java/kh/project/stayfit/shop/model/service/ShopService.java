package kh.project.stayfit.shop.model.service;

import java.util.List;
import java.util.Map;

import kh.project.stayfit.mypage.model.vo.MypageCart;
import kh.project.stayfit.shop.model.vo.Category;
import kh.project.stayfit.shop.model.vo.Nutrition;
import kh.project.stayfit.shop.model.vo.ShopCart;
import kh.project.stayfit.shop.model.vo.ShopProduct;

public interface ShopService {
	
//	//쇼핑몰 페이지
//	//카테고리, 페이징
	public List<Category> selectCategory() throws Exception;
	public List<ShopProduct> selectProductList(Map<String, Object> searchMap, int page, int limits) throws Exception;
	public int selectProductTotalCnt(Map<String, Object> searchMap) throws Exception;
	//할인상품
	public List<ShopProduct> selectSaleList() throws Exception;
	

	//찜목록 등록
	public int insertWish(ShopCart vo) throws Exception;
	
	//장바구니 등록
	public int insertCart(ShopCart vo) throws Exception;
	
//	//추천 상품
//	public List<Product> selectCustomProduct(int, ???) throws Exception;
	
//	//상품 조건별 출력(검색), 페이징
//	public List<Product> selectProduct(String, String, int, int, int, int) throws Exception;
//	public int selectTotalCnt(String, String, int, int) throws Exception;

//	//찜 목록에 추가
//	public int addWish(int, int, int) throws Exception;

//	//장바구니에 추가
//	public int addBasket(int, int, int) throws Exception;
	
	public int insertNutrition(List<Nutrition> nvoList) throws Exception;
	
	public int insertProduct(List<ShopProduct> spvoList) throws Exception;


}
