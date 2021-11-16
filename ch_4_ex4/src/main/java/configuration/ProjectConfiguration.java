package configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
public class ProjectConfiguration {
    @Bean
    DBCommentRepository dbCommentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    EmailCommentNotificationProxy emailCommentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    CommentService commentService() {
        return new CommentService(dbCommentRepository(), emailCommentNotificationProxy());
    }

}
