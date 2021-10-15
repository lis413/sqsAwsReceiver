package ru.lis154.sqsAwsTest.model;

import com.google.gson.annotations.SerializedName;

public enum Status {
    @SerializedName("NEW")
    NEW,
    @SerializedName("COMPLETED")
    COMPLETED
}
