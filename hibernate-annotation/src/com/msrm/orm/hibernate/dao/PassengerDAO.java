package com.msrm.orm.hibernate.dao;

import java.util.List;

import com.msrm.orm.hibernate.dos.PassengerDO;

public interface PassengerDAO {

	public void insert(PassengerDO passengerDO);

	public void update(PassengerDO passengerDO);

	public void delete(int id);

	public PassengerDO fetchBy(int id);

	public List<PassengerDO> fetch();

}
