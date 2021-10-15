package ru.lis154.sqsAwsTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.lis154.sqsAwsTest.model.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {
}
