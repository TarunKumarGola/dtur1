package com.example.sachin.dtures;

public class abcd {
    private String subjectDisp;
    private int imgRes;

    public abcd(String subject, int imageResource)
    {
        imgRes=imageResource;
        subjectDisp=subject;
    }

    public int getImgRes()  {return imgRes;}
    public String getKann() {
        return subjectDisp;
    }
}
