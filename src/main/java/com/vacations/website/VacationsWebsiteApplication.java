package com.vacations.website;

import com.vacations.website.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TODO write comments
//TODO controller layer fertig machen
@SpringBootApplication
public class VacationsWebsiteApplication implements CommandLineRunner {

	@Autowired
	AirlineRepository airlineRepository;

	@Autowired
	AirplaneRepository airplaneRepository;

	@Autowired
	AirportRepository airportRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(VacationsWebsiteApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hallo");
		Airline lufthansa = new Airline(null, "Lufthansa");
		Airline thaiAirways = new Airline(null, "Thai Airways");
		Airline emirates = new Airline(null, "Emirates");

		List<Airline> airlines = new ArrayList<>();
		airlines.add(lufthansa);
		airlines.add(thaiAirways);
		airlines.add(emirates);

		airlineRepository.saveAll(airlines);

	/*	List<Airline> airlinesWithE = airlineRepository.findByAirlineNameStartsWith("E");
		for (Airline a : airlinesWithE) {
			System.out.println(a.getAirlineName());
		}

	 */

		Airplane boeing_7372 = new Airplane(1, lufthansa, 242);
		Airplane airbus_2421 = new Airplane(2, thaiAirways, 300);
		Airplane falcon_72 = new Airplane(3, emirates, 150);

		List<Airplane> airplanes = new ArrayList<>();
		airplanes.add(boeing_7372);
		airplanes.add(airbus_2421);
		airplanes.add(falcon_72);

		airplaneRepository.saveAll(airplanes);


		Airport frankfrut = new Airport("Frankfrut Airport", "Frankfrut", null, null);
		Airport istanbul = new Airport("Istanbul Airport", "Istanbul", null, null);
		Airport mumbai = new Airport("Mumbai Airport", "Mumbai", null, null);

		List<Airport> airports = new ArrayList<>();
		airports.add(frankfrut);
		airports.add(istanbul);
		airports.add(mumbai);

		airportRepository.saveAll(airports);

		Flight flight_1 = new Flight(50, boeing_7372, frankfrut, istanbul, LocalDateTime.of(2023, 11, 5, 12, 0),
				LocalDateTime.of(2023, 11, 6, 2, 0));


		List<Flight> flights = new ArrayList<>();
		flights.add(flight_1);

		flightRepository.saveAll(flights);

		User user_1 = new User("Hanna", "Müller");
		User user_2 = new User("John", "Hermann");
		User user_3 = new User("Mike", "Sokolov");

		List<User> user = new ArrayList<>();
		user.add(user_1);
		user.add(user_2);
		user.add(user_3);

		userRepository.saveAll(user);

		Booking booking_1 = new Booking(flight_1, user_1, 25, 25);
		Booking booking_2 = new Booking(flight_1, user_2, 15, 17);
		Booking booking_3 = new Booking(flight_1, user_3, 8, 32);

		List<Booking> booking = new ArrayList<>();
		booking.add(booking_1);
		booking.add(booking_2);
		booking.add(booking_3);

		bookingRepository.saveAll(booking);

	}

	}


