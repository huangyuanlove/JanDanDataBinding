package com.huangyuanlove.jandan.httpservice;

import com.huangyuanlove.jandan.bean.GirlPicsVO;
import com.huangyuanlove.jandan.bean.RequestResultBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by huangyuan on 2017/8/15.
 */

public interface GirlPicsInterface {
//    http://i.jandan.net/?oxwlxojflwblxbsapi=jandan.get_ooxx_comments&page=1
    @GET("?oxwlxojflwblxbsapi=jandan.get_ooxx_comments")
    Call<RequestResultBean<GirlPicsVO>> getGirlPics(@Query("page") int pageNumber);
}
