package org.exoplatform.platform.common.software.register.service;

import org.exoplatform.platform.common.software.register.model.SoftwareRegistration;

/**
 * Created by The eXo Platform SEA
 * Author : eXoPlatform
 * toannh@exoplatform.com
 * On 9/30/15
 * Software register to Tribe service
 */
public interface SoftwareRegistrationService {

  public final static String SOFTWARE_REGISTRATION_NODE = "softwareRegistrationNode";
  public final static String SOFTWARE_REGISTRATION_SKIPPED = "softwareRegistrationSkipped";
  public final static String SOFTWARE_REGISTRATION_HOST = "http://191.168.1.131:8080";
  public final static String SOFTWARE_REGISTRATION_RETURN_URL = "http://localhost:8080/registrationPLF/software-register-auth";

  /**
   * Check has your software registered to Tribe
   * @return boolean value
   */
  public boolean isSoftwareRegistered();

  /**
   * Check is registered and create if not exist
   */
  public void checkSoftwareRegistration();

  /**
   * get Skipped number
   * max is 2
   * @return
   */
  public int getSkippedNumber();

  public void updateSkippedNumber();

  /**
   * Get access token from community side
   * @param code
   * @return
   */
  public SoftwareRegistration getAccessToken(String code, String returnURL);

  public boolean sendPlfInformation(String accessToken);
}
