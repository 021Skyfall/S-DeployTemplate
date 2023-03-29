package com.jerry.seb.DeployServer.Service;

import com.jerry.seb.DeployServer.Domain.LoginStates;

public interface LoginStatesService {
  public void InitializeStates(boolean isLogin, boolean isConnectedToDatabase);
  public LoginStates GetStates();
}