package me.lyz.retrofitdemo.service;

import java.util.List;

import me.lyz.retrofitdemo.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author LYZ 2018.10.29
 */
public interface GitHubService {

    @GET("users/{user}/repos")
    Call<List<GitHubRepo>> getGitHubRepos(@Path("user") String user);
}
