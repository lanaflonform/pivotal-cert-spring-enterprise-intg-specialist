package net.lkrnac.book.eiws.chapter05.text;

import net.lkrnac.book.eiws.chapter05.text.JavaConfigJmsSyncApplication;
import net.lkrnac.book.eiws.chapter05.text.test.CommonJmsSimpleMessageTest;

import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = JavaConfigJmsSyncApplication.class)
public class JavaConfigJmsSyncApplicationTests extends
    CommonJmsSimpleMessageTest {
}
