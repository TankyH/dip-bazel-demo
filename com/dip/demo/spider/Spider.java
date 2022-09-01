package com.dip.demo.spider;

public class Spider {

    private String url;
    private float price;
    private float amount;

    public static Spider newInstance(String url, float price, float amount) {
        Spider spider = new Spider();
        spider.setPrice(price);
        spider.setAmount(amount);
        spider.setUrl(url);
        return spider;
    }
    public SpiderResponse crawl() {
        return null;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
