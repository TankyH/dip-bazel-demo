package com.dip.demo.main;

import com.dip.demo.notification.Notify;
import com.dip.demo.spider.Spider;
import com.dip.demo.spider.SpiderResponse;

public class SpiderRunner {
    public static void main(String[] args) {
        String url = "https://taobao.com/good/1";
        Double amount = 1.0;
        Double price = 1.0;
        Spider spider = Spider.newInstance(url, price, amount);
        SpiderResponse rsp = spider.crawl();
        if (rsp != null) {
            Notify.send(rsp.GetMessage());
        }
    }
}
