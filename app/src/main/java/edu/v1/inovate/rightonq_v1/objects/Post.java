package edu.v1.inovate.rightonq_v1.objects;

/**
 * Created by psion on 2/5/2018.
 */

public class Post {


    private String jobListing;
    private String jobDescription;
    private String user;
    private boolean isAccepted;
    private float price;

    public Post(String jobListing, String jobDescription, String user, float price, boolean status) {
        this.jobListing = jobListing;
        this.jobDescription = jobDescription;
        this.user = user;
        this.price = price;
        this.isAccepted = status;
    }

    public String getStatus() {
        if(isAccepted){
            return "ACCEPTED";
        }else{
            return "OPEN";
        }
    }

    public void setStatus(boolean status) {
        this.isAccepted = status;
    }
    public String getJobListing() {
        return jobListing;
    }

    public void setJobListing(String jobListing) {
        this.jobListing = jobListing;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



}
