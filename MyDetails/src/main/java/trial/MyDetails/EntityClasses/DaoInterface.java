package trial.MyDetails.EntityClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface DaoInterface extends JpaRepository<MyDetails, Integer> 
	{
}
