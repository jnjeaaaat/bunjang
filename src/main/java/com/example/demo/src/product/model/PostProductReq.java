package com.example.demo.src.product.model;

import com.example.demo.src.productImg.model.PostProductImgReq;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostProductReq {

    private List<String> productImgs;
    private String title;
    private int firstCategoryId;
    private int lastCategoryId;
    private List<String> tags;
    private int price;
    private String contents;
    private int amount;
    private Boolean isUsed;
    private Boolean changeable;
    private Boolean pay;
    private Boolean shippingFee;

}
