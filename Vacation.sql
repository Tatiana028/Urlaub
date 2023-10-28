drop database Vacation;
create database if not exists Vacation;
show databases;
use Vacation;
create table if not exists Flight(
flightID int not null primary key auto_increment,
price varchar(100) not null,
destinationAirport int not null,
departureAirport int not null,
arrivalTime time not null,
departureTime time not null,
foreign key (destinationAirportID) references Airport(airportID) on delete cascade,
foreign key (departureAirportID) references Airport(airportID) on delete cascade,
foreign key (flighID) references Airline (airlineID) on delete cascade,
foreign key (flightID) references Booking (bookingID) on delete cascade);

create table if not exists Airplane(
airplaneID int not null primary key auto_increment,
flightID int not null,
airlineID int not null,
amountOfPlaces int not null,
foreign key (flightID) references Flight(flightID) on delete cascade,
foreign key (airlineID) references Airline (airlineID) on delete cascade);

create table if not exists Airline(
airlineID int not null primary key auto_increment,
airlineName varchar (100) not null,
foreign key (airlineID) references Airplane (airplaneID) on delete cascade,
foreign key (airlineID) references Flight (flightID) on delete cascade);

create table if not exists Airport(
airportID int not null primary key auto_increment,
airportName varchar (100) not null,
airportLocation varchar (100) not null);

create table if not exists Booking(
bookingID int not null primary key auto_increment,
flightID int not null,
userID int not null,
bookingDate time not null,
place int not null,
foreign key (flighID) references Flight (flightID) on delete cascade,
foreign key (userID) references Customer (customerID) on delete cascade);

create table if not exists Customer(
customerID int not null primary key auto_increment,
customerName varchar(100) not null,
customerSurname varchar(100) not null,
foreign key (customerID) references Booking (bookingID) on delete cascade);




