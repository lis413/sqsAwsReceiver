package ru.lis154.sqsAwsTest.receiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;
import ru.lis154.sqsAwsTest.model.Notification;
import ru.lis154.sqsAwsTest.repository.NotificationRepository;

@Service
@Slf4j
public class MessageReceiver {
    @Autowired
    NotificationRepository notificationRepository;

    @SqsListener(value = "javaStockTest1")
    public void receive(String message){
        log.info("Message received{}", message);
        Notification notification = null;
        try {
            JSONObject jsonObject = new JSONObject(message);
            System.out.println(jsonObject);
            Gson gson = new GsonBuilder().create();
            notification = gson.fromJson(String.valueOf(jsonObject), Notification.class);

        } catch (JSONException e) {
            System.out.println("Json not valid");
        }
        notificationRepository.save(notification);

    }

}
