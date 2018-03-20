/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.serviceN;

import com.news.linglian.entity.News;
import com.news.linglian.service.INewsService;
import java.util.List;

/**
 *
 * @author lol
 */
public interface INewsServiceN extends INewsService {

    public List<News>getNewssOfNewsIds(String[] newsIds);
    public List<News> queryOfUserIdNewssLimit(String userId, int start, int size);
}
