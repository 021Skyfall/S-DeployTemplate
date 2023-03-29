package com.jerry.seb.DeployServer.Repository;

import com.jerry.seb.DeployServer.Domain.LoginStates;

public interface LoginStatesRepository {
  public void InitializeLoginStates(boolean isLogin, boolean isConnectedToDatabase);
  public LoginStates GetLoginStates();
}
