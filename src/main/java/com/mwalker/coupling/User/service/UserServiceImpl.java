package com.mwalker.coupling.User.service;

import com.mwalker.coupling.User.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean canOrder(long userId) {
        /*
         This represents a lot of code
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...

         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         ...
         */
        return userId % 3 == 0;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }
}
