package com.muthu.databinding.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Post {

    String imageURL;


    @BindingAdapter("imageURL")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url)
                .apply(RequestOptions.circleCropTransform()).into(imageView);
    }


    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
