-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2017 at 08:47 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prison`
--

-- --------------------------------------------------------

--
-- Table structure for table `duty_officer`
--

CREATE TABLE `duty_officer` (
  `officer_id` int(10) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `rank` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `salary` int(10) NOT NULL,
  `religion` varchar(255) NOT NULL,
  `joining_date` date NOT NULL,
  `working_shift` varchar(255) NOT NULL,
  `contact_no` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `duty_officer`
--

INSERT INTO `duty_officer` (`officer_id`, `last_name`, `first_name`, `rank`, `gender`, `blood_group`, `salary`, `religion`, `joining_date`, `working_shift`, `contact_no`) VALUES
(2, 'asd', 'asdas', 'asdas', 'Male', 'A Positive', 23123, 'Islam', '2017-04-07', 'adasdas', '342342325');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` int(10) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `age` int(10) NOT NULL,
  `religion` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `department_name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `joining_date` date NOT NULL,
  `salary` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employee_id`, `last_name`, `first_name`, `gender`, `age`, `religion`, `blood_group`, `department_name`, `phone`, `joining_date`, `salary`) VALUES
(2, 'golder', 'promit', 'Male', 31, 'Islam', 'A Positive', 'it', 'ew32434', '2017-04-18', 23434);

-- --------------------------------------------------------

--
-- Table structure for table `prison`
--

CREATE TABLE `prison` (
  `name` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `room_capacity` int(10) NOT NULL,
  `prisoner_capacity` int(10) NOT NULL,
  `no. of dutyOfficers` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prison`
--

INSERT INTO `prison` (`name`, `location`, `room_capacity`, `prisoner_capacity`, `no. of dutyOfficers`) VALUES
('Uttor dokkhin karagar', 'basundhara,dhaka', 500, 25000, 400);

-- --------------------------------------------------------

--
-- Table structure for table `prisoner`
--

CREATE TABLE `prisoner` (
  `prisoner_id` int(10) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `age` int(10) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `criminal_type` varchar(255) NOT NULL,
  `crime_type` varchar(255) NOT NULL,
  `arrival_date` date NOT NULL,
  `allocated_cell` varchar(255) NOT NULL,
  `case_no` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prisoner`
--

INSERT INTO `prisoner` (`prisoner_id`, `last_name`, `first_name`, `gender`, `age`, `blood_group`, `address`, `criminal_type`, `crime_type`, `arrival_date`, `allocated_cell`, `case_no`) VALUES
(3, 'das', 'Aurnob', 'male', 30, 'O-', 'gulshan,dhaka', 'new', 'rape', '2017-03-22', 'c-3', ''),
(7, 'golder', 'sabuj', 'Male', 23, 'A Positive', 'khulna', 'New', 'Murder', '2017-04-01', 'a4', '420'),
(8, 'paul', 'niloy', 'Male', 21, 'A Positive', 'puran dhaka', 'Old', 'Murder', '2017-04-01', 'A5', '23'),
(9, 'hossain', 'Razib', 'Male', 23, 'A Positive', 'dhaka', 'New', 'Murder', '2017-04-01', 'a10', '20');

-- --------------------------------------------------------

--
-- Table structure for table `prison_doctor`
--

CREATE TABLE `prison_doctor` (
  `doctor_id` int(50) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `speciality` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `salary` int(50) NOT NULL,
  `religion` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `joining_date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prison_hospital`
--

CREATE TABLE `prison_hospital` (
  `hospital_id` int(50) NOT NULL,
  `seat_capacity` int(50) NOT NULL,
  `doctor_capacity` int(50) NOT NULL,
  `paitent_admitted` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prison_hospital_paitent`
--

CREATE TABLE `prison_hospital_paitent` (
  `paitent_id` int(50) NOT NULL,
  `prisoner_id` int(50) NOT NULL,
  `medical_id` int(50) NOT NULL,
  `admit_date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_type` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_type`, `username`, `password`) VALUES
('admin', 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `visitors`
--

CREATE TABLE `visitors` (
  `visitor_id` int(50) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `arrival_date` date NOT NULL,
  `arrival_time` varchar(255) NOT NULL,
  `visited_to` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `visitors`
--

INSERT INTO `visitors` (`visitor_id`, `last_name`, `first_name`, `mobile`, `address`, `arrival_date`, `arrival_time`, `visited_to`) VALUES
(1, 'golder', 'sabuj', '234234', 'khulna', '2017-04-01', '23.42.34', 23),
(2, 'hossain', 'sabuj', '234234', 'khulna', '2017-04-01', '23.42.34', 23);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `duty_officer`
--
ALTER TABLE `duty_officer`
  ADD PRIMARY KEY (`officer_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `prison`
--
ALTER TABLE `prison`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `prisoner`
--
ALTER TABLE `prisoner`
  ADD PRIMARY KEY (`prisoner_id`);

--
-- Indexes for table `prison_doctor`
--
ALTER TABLE `prison_doctor`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `prison_hospital`
--
ALTER TABLE `prison_hospital`
  ADD PRIMARY KEY (`hospital_id`);

--
-- Indexes for table `prison_hospital_paitent`
--
ALTER TABLE `prison_hospital_paitent`
  ADD PRIMARY KEY (`paitent_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_type`);

--
-- Indexes for table `visitors`
--
ALTER TABLE `visitors`
  ADD PRIMARY KEY (`visitor_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `duty_officer`
--
ALTER TABLE `duty_officer`
  MODIFY `officer_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employee_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `prisoner`
--
ALTER TABLE `prisoner`
  MODIFY `prisoner_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `prison_doctor`
--
ALTER TABLE `prison_doctor`
  MODIFY `doctor_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `visitors`
--
ALTER TABLE `visitors`
  MODIFY `visitor_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
