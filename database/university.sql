-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 28, 2020 at 12:24 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `admission`
--

DROP TABLE IF EXISTS `admission`;
CREATE TABLE IF NOT EXISTS `admission` (
  `rollno` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(25) NOT NULL,
  `lname` varchar(25) NOT NULL,
  `fatherName` varchar(25) NOT NULL,
  `course` varchar(25) NOT NULL,
  `fees` int NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=MyISAM AUTO_INCREMENT=1400010 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admission`
--

INSERT INTO `admission` (`rollno`, `fname`, `lname`, `fatherName`, `course`, `fees`) VALUES
(1400001, 'amarvir', 'singh', 'abc', 'B.Tech(C.S.E)', 65000),
(1400002, 'ranjeet', 'singh', 'xyz', 'BCA', 55000),
(1400009, 'sakshi', 'mheta', 'rajesh', 'B.Tech(C.S.E)', 65000),
(1400003, 'Himani', 'Dhawan', 'Manoj', 'MCA', 90000);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
CREATE TABLE IF NOT EXISTS `courses` (
  `courseID` int NOT NULL AUTO_INCREMENT,
  `course` varchar(25) NOT NULL,
  `charges` int NOT NULL,
  `noOfSeats` int NOT NULL,
  PRIMARY KEY (`courseID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courseID`, `course`, `charges`, `noOfSeats`) VALUES
(1, 'B.Tech(C.S.E)', 65000, 120),
(7, 'bca', 40000, 100);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varbinary(25) NOT NULL,
  `password` varbinary(25) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
(0x61646d696e, 0x313233);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
