package com.pineone.icbms.so.util.data;

import com.withwiz.beach.network.http.message.IHttpResponseMessage;

/**
 * ClientService interface.<BR/>
 * Created by pahnj on 2016-01-08.
 */
public interface IClientService {

    IHttpResponseMessage requestPostService(String uri, String data);
    IHttpResponseMessage requestGetService(String uri);
}
