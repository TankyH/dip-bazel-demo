package com.dip.demo.spider;

public class Spider {

    private String url;
    private Double price;
    private Double amount;

    public static Spider newInstance(String url, Double price, Double amount) {
        Spider spider = new Spider();
        spider.setPrice(price);
        spider.setAmount(amount);
        spider.setUrl(url);
        return spider;
    }

    public SpiderResponse crawl() {
        // fake crawl logic
        SpiderResponse rsp = new SpiderResponse();
        String message = String.format("crawl from url: %s, amount: %s, price: %s", this.getUrl(), this.getAmount(), this.getPrice());
        rsp.setMessage(message);
        return rsp;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
