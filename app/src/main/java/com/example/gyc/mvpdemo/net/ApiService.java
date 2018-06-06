package com.example.gyc.mvpdemo.net;

import com.example.gyc.mvpdemo.bean.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by gaoyucong on 2018-06-05.
 */

public interface ApiService {
    @GET("wp/v2/posts")
    Observable<List<Post>> getPosts();
}
