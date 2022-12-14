package com.solvathon.lti.AntonCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solvathon.lti.AntonCrud.bean.Claims;
import com.solvathon.lti.AntonCrud.bean.PolicyPayments;
import com.solvathon.lti.AntonCrud.bean.PolicySubTypes;
import com.solvathon.lti.AntonCrud.bean.UserDetails;
import com.solvathon.lti.AntonCrud.bean.UserLogin;
import com.solvathon.lti.AntonCrud.bean.UserPolicies;
import com.solvathon.lti.AntonCrud.services.ClaimsServiceImpl;
import com.solvathon.lti.AntonCrud.services.PolicyPaymentsServiceImpl;
import com.solvathon.lti.AntonCrud.services.PolicySubTypesServiceImpl;
import com.solvathon.lti.AntonCrud.services.PreferencesServiceImpl;
import com.solvathon.lti.AntonCrud.services.UserDetailsServiceImpl;
import com.solvathon.lti.AntonCrud.services.UserLoginServiceImpl;
import com.solvathon.lti.AntonCrud.services.UserPoliciesServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Anton")
public class UserController {
	@Autowired
    private PolicySubTypesServiceImpl policySubTypesService;
	@Autowired
	private UserPoliciesServiceImpl userPoliciesService;
	@Autowired
	private ClaimsServiceImpl claimsService;
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	private PolicyPaymentsServiceImpl policyPaymentsService;
	@Autowired
	private PreferencesServiceImpl preferencesService;
	@Autowired
	private UserLoginServiceImpl userLoginService;
	
	//----------------http://localhost:8081/Anton
	
//	---------------PolicySubTypes-------------------------------------------
	
	@GetMapping("/fetchAllPolicies")
	public List<PolicySubTypes> getAllPolicies() {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("In fetch all policies");
		return  policySubTypesService.getAllPolicies();
	}
	
	@GetMapping("/policyTypeCode/{code}")
	public List<PolicySubTypes> findBypolicyTypeCode(@PathVariable("code") int policyTypeCode) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("PolicyTypeCode "+policyTypeCode);
		return policySubTypesService.findBypolicyTypeCode(policyTypeCode);
	}
	
	@GetMapping("/policyId/{Id}")
	public PolicySubTypes findBypolicyTypeId(@PathVariable("Id") int policyTypeId) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("PolicyId "+policyTypeId);
		return policySubTypesService.findBypolicyTypeId(policyTypeId);
	}
	
	@GetMapping("/policyTypeName/{name}")
	public List<PolicySubTypes> findBypolicyTypeName(@PathVariable("name") String policyTypeName) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("PolicyTypeName "+policyTypeName);
		return policySubTypesService.findBypolicyTypeName(policyTypeName);
	}
	
	/*
	 * @GetMapping("/policyId/{id}") public PolicySubTypes
	 * getUserWithDepartment(@PathVariable("id") int policyId) { //
	 * log.info("Inside getUserWithDepartment of UserController");
	 * System.out.println("PolicyId"+policyId); return
	 * policySubTypesService.getPolicySubType(policyId); }
	 */
	
//-----------------UserPolicies-------------------------------------
	
	@GetMapping("/policiesByUserid/{userid}")
	public List<UserPolicies> findUserPolicyByUserId(@PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserID "+userid);
		return userPoliciesService.findPolicyByUserId(userid);
	}
	
	@PostMapping("/buyUserPolicy/{userid}/{policytypeid}")
	public UserPolicies buyUserPolicy(@RequestBody UserPolicies userPolicy, @PathVariable("userid") int userid, @PathVariable("policytypeid") int policytypeid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("Userpolicy "+userPolicy);
		return userPoliciesService.buyUserPolicy(userPolicy,userid,policytypeid);
	}
	
//---------------UserClaims----------------------------------
	
	@GetMapping("/claimsByUserid/{userid}")
	public List<Claims> findClaimsByUserId(@PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserId "+userid);
		return claimsService.findClaimsByUserId(userid);
	}	

//---------------------UserDetails----------------------------------
	
	@GetMapping("/userDetsById/{userid}")
	public UserDetails findUserDetailsById(@PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserId "+userid);
		return userDetailsService.findUserDetailsById(userid);
	}
	
	@PostMapping("/saveUser")
	public UserDetails saveUser(@RequestBody UserDetails userDetails) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserDetails "+userDetails);
		return userDetailsService.saveUser(userDetails);
	}	
	
	@PostMapping("/updateUser")
	public UserDetails updateUser(@RequestBody UserDetails userDetails) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserDetails "+userDetails);
		return userDetailsService.saveUser(userDetails);
	}

//--------------------PolicyPayments---------------------------
	
	@GetMapping("/userPaymentsById/{userid}")
	public List<PolicyPayments> findUserPaymentsById(@PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserId "+userid);
		return policyPaymentsService.getPaymentsByUserId(userid);
	}
	
//--------------------Preferences------------------------------------	
	@GetMapping("/preferencesByUserId/{userid}")
	public String findPreferencesByUserId(@PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("UserId "+userid);
		return preferencesService.findPreferencesByUserId(userid);
	}
	
//-------------------UserLogin----------------------------------------
	@PostMapping("/saveUserLoginCreds/{userid}")
	public UserLogin saveLoginCreds(@RequestBody UserLogin user, @PathVariable("userid") int userid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("LoginCreds "+user);
		return userLoginService.saveUser(user,userid);
	}
	
	@GetMapping("/getPwdByEmail/{emailid}")
	public UserLogin findLoginCreds(@PathVariable("emailid") String emailid) {
		// log.info("Inside getUserWithDepartment of UserController");
		System.out.println("emailId "+emailid);
		return userLoginService.fetchLoginUser(emailid);
	}

}
