package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cg.entities.Tenant;
import com.cg.repositories.TenantRepository;


@Service
public class TenantService {

	@Autowired
	private TenantRepository tenantRepository;
	
	
	public Tenant getProperty(Long TenantId)
	{
		return tenantRepository.findById(TenantId).get();
	}
	
	public Tenant addTenant(Tenant tenant)
	{
		return tenantRepository.save(tenant);
	}
	
	public List<Tenant> getAllTenant()
	{
		return tenantRepository.findAll();
	}
	
	public ResponseEntity<Object> deleteTenant(Long TenantId)
	{
		tenantRepository.deleteById(TenantId);
		return new ResponseEntity("Record deleted successfully", HttpStatus.OK);
	}
	
	public Tenant getTenantById(Long TenantId)
	{
		return tenantRepository.findById(TenantId).get();
	}
	

}
