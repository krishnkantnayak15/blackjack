CREATE TABLE `users` (
  `user_id`     INT          NOT NULL      AUTO_INCREMENT,
  `user_name`   VARCHAR(45)  NOT NULL,
  `version`     INT          NULL          DEFAULT 0,
  `balance`     DECIMAL(7,2) NULL          DEFAULT 0,
  `created`     TIMESTAMP    NOT NULL      DEFAULT NOW(),
  `modified`    TIMESTAMP    NOT NULL      DEFAULT NOW(),
  PRIMARY KEY (`user_id`));
