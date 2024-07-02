package com.web_api_spring.repository;

import com.web_api_spring.handler.BusinessException;
import com.web_api_spring.handler.RequiredFieldException;
import com.web_api_spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getLogin() == null)
            throw new RequiredFieldException("login");
        if (user.getPassword() == null)
            throw new RequiredFieldException("password");

        if (user.getId() == null)
            System.out.println("SAVE - Recebendo o usuario na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório ");
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println("DELETE/id - Recebendo o id: %d para excluir um usuário\", id");
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Tarcisio", "123321"));
        users.add(new User("Exemplo", "123321"));
        return users;
    }

    public User findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar o usuário%n", id);
        return new User("Tarcisio", "123321");
    }

    public User findByUsername(String username) {
        System.out.printf("FIND/username -  Recebendo o usernamae: %s para localizar um usuário%n", username);
        return new User("Tarcisio", "123321");
    }

}
