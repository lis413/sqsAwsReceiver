package ru.lis154.sqsAwsTest.model;

import com.google.gson.annotations.SerializedName;

public enum Type {
    @SerializedName("INFO")
    INFO,
    @SerializedName("ERROR")
    ERROR
}
