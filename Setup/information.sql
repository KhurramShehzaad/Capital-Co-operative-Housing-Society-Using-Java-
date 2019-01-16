-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2018 at 04:32 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datarecord`
--

-- --------------------------------------------------------

--
-- Table structure for table `information`
--

CREATE TABLE `information` (
  `Sr_No` int(11) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Reciet_No` varchar(50) NOT NULL,
  `MemberShip_No` varchar(50) NOT NULL,
  `Plot_No` varchar(500) NOT NULL,
  `Date_Of_Transfer` varchar(50) DEFAULT NULL,
  `Name_Of_Transfer` varchar(50) DEFAULT NULL,
  `S_o_D_o_W_o` varchar(50) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `Path_Files1` varchar(500) DEFAULT NULL,
  `rname` varchar(222) DEFAULT NULL,
  `Allotment_Details` varchar(255) DEFAULT NULL,
  `Transfer_Details` varchar(255) DEFAULT NULL,
  `Path_Files2` varchar(500) NOT NULL,
  `Path_Files3` varchar(500) NOT NULL,
  `Path_Files4` varchar(500) NOT NULL,
  `Path_Files5` varchar(500) NOT NULL,
  `Path_Files6` varchar(500) NOT NULL,
  `Path_Files7` varchar(500) NOT NULL,
  `Path_Files8` varchar(500) NOT NULL,
  `Path_Files9` varchar(500) NOT NULL,
  `Path_Files10` varchar(500) NOT NULL,
  `Path_Files11` varchar(500) NOT NULL,
  `Path_Files12` varchar(500) NOT NULL,
  `Path_Files13` varchar(500) NOT NULL,
  `Path_Files14` varchar(500) NOT NULL,
  `Path_Files15` varchar(500) NOT NULL,
  `Path_Files16` varchar(500) NOT NULL,
  `Path_Files17` varchar(500) NOT NULL,
  `Path_Files18` varchar(500) NOT NULL,
  `Path_Files19` varchar(500) NOT NULL,
  `Path_Files20` varchar(500) NOT NULL,
  `Path_Files21` varchar(500) NOT NULL,
  `Path_Files22` varchar(500) NOT NULL,
  `Path_Files23` varchar(500) NOT NULL,
  `Path_Files24` varchar(500) NOT NULL,
  `Path_Files25` varchar(500) NOT NULL,
  `Path_Files26` varchar(500) NOT NULL,
  `Path_Files27` varchar(500) NOT NULL,
  `Path_Files28` varchar(500) NOT NULL,
  `Path_Files29` varchar(500) NOT NULL,
  `Path_Files30` varchar(500) NOT NULL,
  `Path_Files31` varchar(500) NOT NULL,
  `Path_Files32` varchar(500) NOT NULL,
  `Path_Files33` varchar(500) NOT NULL,
  `Path_Files34` varchar(500) NOT NULL,
  `Path_Files35` varchar(500) NOT NULL,
  `Path_Files36` varchar(500) NOT NULL,
  `Path_Files37` varchar(500) NOT NULL,
  `Path_Files38` varchar(500) NOT NULL,
  `Path_Files39` varchar(500) NOT NULL,
  `Path_Files40` varchar(500) NOT NULL,
  `Path_Files41` varchar(500) NOT NULL,
  `Path_Files42` varchar(500) NOT NULL,
  `Path_Files43` varchar(500) NOT NULL,
  `Path_Files44` varchar(500) NOT NULL,
  `Path_Files45` varchar(500) NOT NULL,
  `Path_Files46` varchar(500) NOT NULL,
  `Path_Files47` varchar(500) NOT NULL,
  `Path_Files48` varchar(500) NOT NULL,
  `Path_Files49` varchar(500) NOT NULL,
  `Path_Files50` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `information`
--

INSERT INTO `information` (`Sr_No`, `Name`, `Reciet_No`, `MemberShip_No`, `Plot_No`, `Date_Of_Transfer`, `Name_Of_Transfer`, `S_o_D_o_W_o`, `Address`, `Path_Files1`, `rname`, `Allotment_Details`, `Transfer_Details`, `Path_Files2`, `Path_Files3`, `Path_Files4`, `Path_Files5`, `Path_Files6`, `Path_Files7`, `Path_Files8`, `Path_Files9`, `Path_Files10`, `Path_Files11`, `Path_Files12`, `Path_Files13`, `Path_Files14`, `Path_Files15`, `Path_Files16`, `Path_Files17`, `Path_Files18`, `Path_Files19`, `Path_Files20`, `Path_Files21`, `Path_Files22`, `Path_Files23`, `Path_Files24`, `Path_Files25`, `Path_Files26`, `Path_Files27`, `Path_Files28`, `Path_Files29`, `Path_Files30`, `Path_Files31`, `Path_Files32`, `Path_Files33`, `Path_Files34`, `Path_Files35`, `Path_Files36`, `Path_Files37`, `Path_Files38`, `Path_Files39`, `Path_Files40`, `Path_Files41`, `Path_Files42`, `Path_Files43`, `Path_Files44`, `Path_Files45`, `Path_Files46`, `Path_Files47`, `Path_Files48`, `Path_Files49`, `Path_Files50`) VALUES
(22, 'dfssdf', '', '', '', 'Mar 8, 2018', 'fgh', 'S/o', 'gh', 'C:\\Users\\Warsolutions\\Documents\\dell.png', 'hgfgh', 'ghfgh', 'gh', 'C:\\Users\\Warsolutions\\Documents\\dell.png', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(23, 'khu', '', '', '', 'Mar 8, 2018', 'fghf', 'S/o', 'gfhg', '', 'hfghfgh', 'fghfgh', 'fghfgjh', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(24, 'hhhd', '', '', '', 'Mar 14, 2018', 'fjghjgj', 'S/o', 'jjhh', '', 'jgghj', 'jgjh', 'jhgh', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(25, 'fghfh', '', '', '', 'Mar 8, 2018', 'dfghgfdh', 'S/o', 'dhdgh', '', 'dhdhg', 'dfghd', 'fdhgd', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(26, 'bnm', '', '', '', 'Mar 7, 2018', 'bnmhb,mbn', 'S/o', 'bnmbhm', '', 'nbvnbv', 'mbnm', 'ghjbm', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(27, 'fg', '', '', '', 'Mar 1, 2018', 'hfghfg', 'S/o', 'hgfg', '', 'gghfgh', 'hgf', 'bvbv', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(28, 'khurram', '', '', '', 'Mar 8, 2018', 'mbn', 'S/o', 'nbmbn', '', 'mbnmb', 'mnbnm', 'ghmkn', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(29, 'shahzaib', '', '', '', 'Mar 14, 2018', 'fdfd', 'S/o', 'dfd', '', 'fdfdf', 'cxddf', 'vgfd', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(30, 'ali', '', '', '', 'Mar 2, 2018', 'asadw', 'S/o', 'asdqw', '', 'dqwd', 'asdq', 'asdd', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(31, 'sahil', '', '', '', 'Mar 15, 2018', 'kjhbhghbj', 'W/o', 'kjiouuji', 'C:\\Users\\Warsolutions\\Documents\\Screenshot (1).png', 'kjjjk', 'jhhgjh', 'hjhghj', 'C:\\Users\\Warsolutions\\Documents\\Screenshot (3).png', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(32, 'fdgdfg', '', '', '', 'Mar 13, 2018', 'fgxf', 'S/o', 'fgxfg', '', 'fgxfg', 'fgxfg', 'fgx', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(41, 'dfffd', '', '', '', 'Mar 8, 2018', 'fdsds', 'S/o', 'dsf', '', 'fd', 'fds', 'dfs', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(45, 'dsf', '', '', '', 'Mar 8, 2018', 'fsd', 'S/o', 'fsd', '', 'fsd', 'fds', 'fsd', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(52, 'dsff', '', '', '', 'Mar 7, 2018', 'ggf', 'S/o', 'fgdfg', '', 'ggg', 'gfgdf', 'fggd', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(53, 'ggg', '', '', '', 'Mar 15, 2018', 'gfg', 'S/o', 'dffg', '', 'gfg', 'gg', 'dfg', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(54, '', '', '', '', 'Mar 3, 2018', 'gffg', 'S/o', 'ggfgf', '', 'fgdfg', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(55, '', '', '', '', 'Mar 8, 2018', 'dfgdfg', 'S/o', 'gdfg', '', '', '', 'fgdg', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(56, 'dfsfds', '', '', '', '', '', 'S/o', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(57, 'jhgcdj', '56', '65', '45', 'Mar 9, 2018', 'ggfg', 'S/o', 'dsf', '', 'gg', 'dfgdfg', 'fsdf', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(58, 'khurram', '78', '87', '90u-', 'Mar 16, 2018', 'hhg', 'S/o', 'hfhg', '', 'gdsf', 'cvcvbc', 'fghfgh', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(59, 'Akber', '7890', '980', '6789', 'Mar 15, 2018', 'ghjhgjg', 'S/o', 'jhgjjhg', 'C:\\Users\\Warsolutions\\Documents\\Screenshot (2).png', 'jgghjgj', 'jghjgh', 'hjjgj', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `information`
--
ALTER TABLE `information`
  ADD UNIQUE KEY `Sr` (`Sr_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `information`
--
ALTER TABLE `information`
  MODIFY `Sr_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
