package br.core.correios.repository;

import br.core.correios.model.Address;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SetupRepository {

    @Value("${correios.base.url}")
    private String url;

    public List<Address> getFromOrigin() throws Exception {
        List<Address> resultList = new ArrayList<>();
        String resultStr = "";

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response = httpClient.execute(new HttpGet(this.url)))
        {
            HttpEntity entity = response.getEntity();
            resultStr = EntityUtils.toString(entity);
        }

        String[] resultStrSplited = resultStr.split("\n");


        for(String currentLine : resultStrSplited){
            String[] currentLineSplited = currentLine.split(",");
        }

        return resultList;
    }

    //56:00 this...

}
