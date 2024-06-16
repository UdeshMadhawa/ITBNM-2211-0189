-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 07:08 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopping_mall_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--

CREATE TABLE `countries` (
  `code` int(11) NOT NULL,
  `name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `countries`
--

INSERT INTO `countries` (`code`, `name`) VALUES
(1, 'Srilanka'),
(2, 'India');

-- --------------------------------------------------------

--
-- Table structure for table `merchants`
--

CREATE TABLE `merchants` (
  `id` int(11) NOT NULL,
  `merchant_name` varchar(45) NOT NULL,
  `country_code` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `merchants`
--

INSERT INTO `merchants` (`id`, `merchant_name`, `country_code`, `user_name`, `password`) VALUES
(1, 'Dileepa', 1, 'dil', '123'),
(2, 'kholi', 2, 'kholiya', '123'),
(3, 'sachini sewwandi', 1, 'sachi', '789'),
(4, 'akila', 1, 'aki', '345'),
(5, 'srimantha', 1, 'akila', '7788'),
(6, 'nimali', 1, 'nimali', '1657'),
(7, 'suppa', 1, 'suppa', '123'),
(8, 'suppah', 1, 'suppah', '123'),
(9, 'sauron caper', 2, 'caper', '123'),
(10, 'udesh sooriyapperuma', 1, 'soori', '12345'),
(11, 'priyantha kumara', 1, 'kumara', '6789'),
(12, 'sewwandi sooriyapperuma', 2, 'sew', '1100'),
(13, 'lahiru ruklantha', 1, 'lahiru', '119'),
(14, 'mithun Alahakoon', 1, 'mithun', '456789');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_items`
--

CREATE TABLE `order_items` (
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_items`
--

INSERT INTO `order_items` (`order_id`, `product_id`, `quantity`) VALUES
(1, 1, 1),
(2, 5, 5),
(3, 6, 5),
(4, 4, 1),
(5, 5, 20),
(6, 5, 10),
(7, 6, 4),
(8, 5, 10),
(9, 5, 10),
(10, 7, 2),
(11, 1, 4),
(12, 8, 10),
(13, 3, 5),
(14, 3, 2),
(15, 4, 1),
(26, 8, 1),
(27, 4, 11),
(28, 7, 1),
(29, 4, 1),
(30, 3, 2),
(31, 6, 15),
(32, 8, 3),
(33, 3, 4),
(34, 7, 23),
(35, 5, 22),
(36, 7, 50),
(37, 6, 60),
(38, 7, 11),
(39, 7, 1),
(40, 9, 1),
(41, 9, 1),
(42, 3, 3),
(43, 6, 1),
(44, 4, 2),
(45, 9, 1),
(46, 6, 5),
(47, 8, 2);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `price` double NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `status`) VALUES
(1, 'mug', 200, 'printed '),
(3, 'scrunchies', 350, 'Include 5 item\nBrandnew\n'),
(4, 'charger', 1500, 'brandnew'),
(5, 'pen', 25, '2nd hand'),
(6, 'Book', 400, 'most sutable for adults'),
(7, 'Body Wash', 800, 'quality product./ 100% result'),
(8, 'mug', 300, 'printed'),
(9, 'key bord', 2000, 'brandnew'),
(12, 'bottle', 500, '1L, you can by various colour'),
(13, 'pen tourch', 200, 'best flasher');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `country_code` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `full_name`, `email`, `gender`, `dob`, `country_code`, `user_name`, `password`) VALUES
(1, 'Udesh', 'Madawa', 1, '2000-05-21', 1, 'udesh', '123'),
(2, 'Sachini Sewwandi', 'sachini@gmail.com', 0, '1995-10-17', 1, 'sachi', '123'),
(3, 'Gihan Kosala ', 'gihan@gmail.com', 1, '1995-12-09', 1, 'giha', '123'),
(4, 'fathima Razak', 'fathima@gmail.com', 0, '2003-09-09', 2, 'fathi', '123'),
(5, 'Nishantha Balasooriya', 'nishantha@gmail.com', 1, '1995-02-15', 1, 'nisa', '123'),
(6, 'Hasindu', 'susgggh@gmail.com', 1, '2024/11/24', 1, 'Hasi', '1234'),
(7, 'lahiru sadaruwan', 'lahiru@gmail.com', 1, '2000/3/31', 2, 'laiya', '3456'),
(8, 'lahiru', 'lahir@gmail.com', 1, '2000/5/21', 1, 'laiya', '12345'),
(9, 'akila srimantha', 'akila@gmail.com', 1, '2000/3/02', 1, 'srima', '6677'),
(10, 'madhawa sooriyapperuma', 'udes23@gmail.com', 1, '200/05/21', 2, 'soori', '1234567'),
(11, 'priyantha sooriyapperuma', 'priyantha@gmail.com', 1, '2000/10/15', 1, 'priya', '4567'),
(12, 'bandara sooriyapperuma', 'bandara@gmail.com', 1, '2000/05/21', 2, 'bandara', '1657'),
(13, 'ruklantha ekanayake', 'ruklantha@gmail.com', 1, '1995/03/07', 2, 'ruka', '1234567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `countries`
--
ALTER TABLE `countries`
  ADD UNIQUE KEY `code` (`code`);

--
-- Indexes for table `merchants`
--
ALTER TABLE `merchants`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `test2` (`user_id`);

--
-- Indexes for table `order_items`
--
ALTER TABLE `order_items`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `test` (`product_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `merchants`
--
ALTER TABLE `merchants`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `order_items`
--
ALTER TABLE `order_items`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `test2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `order_items`
--
ALTER TABLE `order_items`
  ADD CONSTRAINT `test` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
