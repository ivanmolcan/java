package sk.ivanmolcan.udemy.entityrelationship.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import sk.ivanmolcan.udemy.entityrelationship.entities.UserAccount;

public interface UserAccountRepository  extends PagingAndSortingRepository<UserAccount, Long> {
}
