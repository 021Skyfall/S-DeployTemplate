package com.jerry.seb.DeployServer.Repository;

import com.jerry.seb.DeployServer.Data.LoginData;
import com.jerry.seb.DeployServer.Domain.LoginStates;
import org.springframework.stereotype.Repository;

@Repository
public class LoginStatesRepositoryImpl implements LoginStatesRepository {
  public LoginStatesRepositoryImpl() {
  }

  @Override
  public void InitializeLoginStates(boolean isLogin, boolean isConnectedToDatabase) {
    LoginData.getInstance().LoginList.SetLoginStates(isLogin, isConnectedToDatabase);
  }

  public LoginStates GetLoginStates() {
    return LoginData.getInstance().LoginList;
  }
}
