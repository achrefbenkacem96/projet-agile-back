package com.esprit.spring.ftthback.services;
import com.esprit.spring.ftthback.models.User;
import com.esprit.spring.ftthback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;
@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    UserRepository userRepository;
    @Autowired
    public JavaMailSender emailSender;
    @Override
    public List<User> RetreiveAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User Adduser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void DeleteUser(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User findByName(String username) {
        return null;
    }


    @Override
    public User updateUser(User user, Long id) throws MessagingException {
        user.setId(id);
       User userToUpdate= userRepository.findById(id).get();

        System.out.println(user.getActive());
        System.out.println(userToUpdate.getActive());

        if(user.getActive()==true){
           sendEmail(user.getEmail());
           System.out.println("ok");

       }

        return userRepository.save(user);
    }

    @Override
    public User getById(String id) {
        return userRepository.findUserByUsername(id);

    }

    public void sendEmail(String email) throws MessagingException {


            MimeMessage message = emailSender.createMimeMessage();
            boolean multipart = true;
            MimeMessageHelper helper = new MimeMessageHelper(message, multipart, "utf-8");

            String htmlMsg =
                    " <h3>bonjour<h3>"+
                            "<h2>votre compte est maintenant activé vous pouvez maintenant se connecter via ce lien : " +
                    "<h3>cordianelemt<h3>" ;

            message.setContent(htmlMsg, "text/html");
            helper.setTo(email);
            helper.setSubject("SPS");
            this.emailSender.send(message);
        }
    }

