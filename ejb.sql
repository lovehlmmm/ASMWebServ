-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2018 at 12:03 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ejb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountbank`
--

CREATE TABLE `accountbank` (
  `AccID` varchar(45) NOT NULL,
  `CustomerName` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Balance` float DEFAULT NULL,
  `Token` varchar(545) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `accountbank`
--

INSERT INTO `accountbank` (`AccID`, `CustomerName`, `Password`, `Balance`, `Token`) VALUES
('A001', 'Nguyen Anh', '1234202', 8226000, 'A0011535024132547'),
('A002', 'Nguyen Ngoc', '1234202', 5798000, 'A0021535024179856');

-- --------------------------------------------------------

--
-- Table structure for table `transactiondetails`
--

CREATE TABLE `transactiondetails` (
  `TransID` varchar(145) NOT NULL,
  `AccID` varchar(45) DEFAULT NULL,
  `AccIDReceive` varchar(45) DEFAULT NULL,
  `TransName` varchar(45) DEFAULT NULL,
  `TransMoney` float DEFAULT NULL,
  `TransPostage` float DEFAULT NULL,
  `DateOfTrans` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `transactiondetails`
--

INSERT INTO `transactiondetails` (`TransID`, `AccID`, `AccIDReceive`, `TransName`, `TransMoney`, `TransPostage`, `DateOfTrans`) VALUES
('074665', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('740448', 'A001', 'A002', 'Chuyen Tien', 203999, 3999.98, '2018-08-23'),
('756728', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('771203', 'A001', 'A002', 'Chuyen Tien', 102001, 2000.02, '2018-08-23'),
('797623', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('850250', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('856910', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('866361', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('876295', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('885935', 'A001', 'A002', 'Chuyen Tien', 102000, 2000, '2018-08-23'),
('982696', 'A001', 'A002', 'Chuyen Tien', 102001, 2000.02, '2018-08-23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accountbank`
--
ALTER TABLE `accountbank`
  ADD PRIMARY KEY (`AccID`);

--
-- Indexes for table `transactiondetails`
--
ALTER TABLE `transactiondetails`
  ADD PRIMARY KEY (`TransID`),
  ADD KEY `FK_idx` (`AccID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
