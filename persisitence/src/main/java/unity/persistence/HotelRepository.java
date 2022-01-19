package unity.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unity.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
