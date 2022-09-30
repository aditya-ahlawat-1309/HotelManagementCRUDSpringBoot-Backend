package HotelManagementApplication.HotelManagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long id;

    @Column
    String hotelName;

    @Column
    String number;

    @Column
    String type;

    @Column
    String basePrice;

    @Column
    String available;

}