package service;

public interface ContactService {
	public void addContact();		// 추가
	public void removeContact();	// 삭제
	public void modifyContact();	// 수정
	public void findContactsByName();
	public void findAllContacts();
}
