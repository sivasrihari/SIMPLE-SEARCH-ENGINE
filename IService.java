package in.ineuron.service;

import java.util.List;

import in.ineuron.DTO.row;

public interface IService
{
	public List<row> searchDatabase(String keyword);
	public String saveUserAndKeyword(String keyword, String user,Integer userid);
}
