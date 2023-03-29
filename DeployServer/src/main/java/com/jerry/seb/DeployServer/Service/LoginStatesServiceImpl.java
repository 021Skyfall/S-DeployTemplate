package com.jerry.seb.DeployServer.Service;

import com.jerry.seb.DeployServer.Domain.LoginStates;
import com.jerry.seb.DeployServer.Repository.LoginStatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginStatesServiceImpl implements LoginStatesService {

  private final LoginStatesRepository loginStatesRepository;

  @Autowired
  public LoginStatesServiceImpl(LoginStatesRepository loginStatesRepository) {
    this.loginStatesRepository = loginStatesRepository;
  }

  @Override
  public void InitializeStates(boolean isLogin, boolean isConnectedToDatabase) {
    loginStatesRepository.InitializeLoginStates(isLogin, isConnectedToDatabase);
  }

  @Override
  public LoginStates GetStates() {
    return loginStatesRepository.GetLoginStates();
  }
}
