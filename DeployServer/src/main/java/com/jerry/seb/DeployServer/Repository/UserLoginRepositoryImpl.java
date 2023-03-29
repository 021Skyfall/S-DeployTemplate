package com.jerry.seb.DeployServer.Repository;

import com.jerry.seb.DeployServer.Data.UserData;
import com.jerry.seb.DeployServer.Domain.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserLoginRepositoryImpl implements UserLoginRepository {
  public UserLoginRepositoryImpl() {
  }

  @Override
  public Boolean FindByUserInfo(String id, String password) {
    Optional<UserDTO> userData = UserData.getInstance().UserList.stream().filter(data -> data.getId().equals(id))
        .filter(data -> data.getPassword().equals(password)).findFirst();
    return userData.isPresent();
  }
}