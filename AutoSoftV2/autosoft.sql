-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2014 a las 13:47:10
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `autosoft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_cliente`
--

CREATE TABLE IF NOT EXISTS `tbl_cliente` (
  `id_Cliente` varchar(15) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `fecha_Nacimiento` varchar(10) NOT NULL,
  `genero` int(1) NOT NULL,
  `telefono` varchar(7) DEFAULT NULL,
  `celular` varchar(10) DEFAULT NULL,
  `pais` varchar(20) DEFAULT NULL,
  `departamento` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `ocupacion` varchar(20) DEFAULT NULL,
  `empresa` varchar(20) DEFAULT NULL,
  `correo` varchar(30) NOT NULL,
  PRIMARY KEY (`id_Cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`id_Cliente`, `nombre`, `apellido`, `fecha_Nacimiento`, `genero`, `telefono`, `celular`, `pais`, `departamento`, `ciudad`, `direccion`, `ocupacion`, `empresa`, `correo`) VALUES
('4444', 'Javier', 'Ibarra Ramos', '1980-03-01', 1, '4209890', '3006895434', 'EspaÃ±a', 'Zaragoza', 'Aragon', 'Cll 44 c # 89 b 20', 'Artista Musical', 'Rap Solo Records', 'ibarrakase@hotmail.com'),
('5555', 'Lorena', 'Ramos', '1987-12-23', 2, '4308765', '-', 'Colombia', 'Antioquia', 'Medellin', 'Cll 70 c # 90 b 60', 'Secretaria', 'Postobon', 'lramos@yahoo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_detalle_ser`
--

CREATE TABLE IF NOT EXISTS `tbl_detalle_ser` (
  `id_Detalle` varchar(2) NOT NULL,
  `id_Servicio` varchar(6) NOT NULL,
  `id_Vehiculo` varchar(6) NOT NULL,
  `id_Cliente` varchar(15) NOT NULL,
  `id_Empleado` varchar(15) NOT NULL,
  `tipo_Servicio` int(1) NOT NULL,
  `fecha_Inicio` varchar(10) DEFAULT NULL,
  `fecha_Fin` varchar(10) DEFAULT NULL,
  `articulos` varchar(400) DEFAULT NULL,
  `datos_Vehiculo` varchar(600) DEFAULT NULL,
  `datos_Servicio` varchar(600) DEFAULT NULL,
  `costo_Art` varchar(15) DEFAULT NULL,
  `costo_Servicio` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_Detalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_detalle_ser`
--

INSERT INTO `tbl_detalle_ser` (`id_Detalle`, `id_Servicio`, `id_Vehiculo`, `id_Cliente`, `id_Empleado`, `tipo_Servicio`, `fecha_Inicio`, `fecha_Fin`, `articulos`, `datos_Vehiculo`, `datos_Servicio`, `costo_Art`, `costo_Servicio`) VALUES
('1', '100001', 'PAR010', '1005', '1001', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('2', '100001', 'PAR010', '1005', '1001', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_empleado`
--

CREATE TABLE IF NOT EXISTS `tbl_empleado` (
  `id_Empleado` varchar(15) NOT NULL,
  `cargo` int(1) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `fecha_Nacimiento` varchar(10) NOT NULL,
  `genero` int(1) NOT NULL,
  `estado_Civil` int(1) DEFAULT NULL,
  `telefono` varchar(7) DEFAULT NULL,
  `celular` varchar(10) DEFAULT NULL,
  `pais` varchar(20) DEFAULT NULL,
  `departamento` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `correo` varchar(30) NOT NULL,
  PRIMARY KEY (`id_Empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_empleado`
--

INSERT INTO `tbl_empleado` (`id_Empleado`, `cargo`, `nombre`, `apellido`, `fecha_Nacimiento`, `genero`, `estado_Civil`, `telefono`, `celular`, `pais`, `departamento`, `ciudad`, `direccion`, `correo`) VALUES
('1010', 3, 'HolaSoyElAdmi', 'MuchoGusto', '1111-11-11', 1, 1, '1', '1', '1', '1', '1', '1', '1@1.1'),
('1111', 1, 'Juan Camilo', 'Antonio Vargaz', '1990-03-12', 1, 2, '4206785', '3006854323', 'Colombia', 'Antioquia', 'Medellin', 'Cll 45 c # 80 b 70', 'juanca90@hotmail.com'),
('2222', 2, 'Andre', 'Romelle Young', '1965-02-18', 1, 2, '4309687', '3208695424', 'Estados Unidos', 'California', 'Compton', 'Cll 30 N 68 93', 'drdre@gmail.com'),
('3333', 3, 'Sara', 'Mendez', '1980-12-02', 2, 3, '-', '3006895434', 'Colombia', 'Antioquia', 'Medellin', 'Cll 90C N46 75', 'holasoysara@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_servicio`
--

CREATE TABLE IF NOT EXISTS `tbl_servicio` (
  `id_Servicio` varchar(6) NOT NULL,
  `id_Vehiculo` varchar(6) NOT NULL,
  `id_Cliente` varchar(15) NOT NULL,
  `id_Empleado` varchar(15) NOT NULL,
  `estado` int(1) NOT NULL,
  `fecha_Inicio` varchar(10) DEFAULT NULL,
  `fecha_Fin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_Servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_servicio`
--

INSERT INTO `tbl_servicio` (`id_Servicio`, `id_Vehiculo`, `id_Cliente`, `id_Empleado`, `estado`, `fecha_Inicio`, `fecha_Fin`) VALUES
('1', 'ESP462', '4444', '1111', 1, '2014-10-28', '2014-11-05'),
('2', 'ESP462', '4444', '2222', 3, '2014-10-27', '2014-10-28'),
('3', 'til897', '5555', '1111', 3, '2014-10-26', '2014-10-27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE IF NOT EXISTS `tbl_usuario` (
  `id_Usuario` varchar(15) NOT NULL,
  `perfil` int(1) NOT NULL,
  `contrasena` varchar(25) NOT NULL,
  `estado` int(1) NOT NULL,
  `foto` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id_Usuario`, `perfil`, `contrasena`, `estado`, `foto`) VALUES
('1010', 1, '123', 0, 'Imagenes/7.png'),
('1111', 1, '123', 0, 'Imagenes/9.png'),
('2222', 1, '123', 0, 'Imagenes/6.png'),
('3333', 1, '123', 0, 'Imagenes/3.png'),
('4444', 2, '123', 0, 'Imagenes/2.png'),
('5555', 2, '123', 0, 'Imagenes/5.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vehiculo`
--

CREATE TABLE IF NOT EXISTS `tbl_vehiculo` (
  `id_Vehiculo` varchar(6) NOT NULL,
  `id_Cliente` varchar(15) NOT NULL,
  `tipo_Vehiculo` varchar(15) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `fecha_Matricula` varchar(10) NOT NULL,
  `fecha_Ult_Ser` varchar(10) DEFAULT NULL,
  `combustible` varchar(10) DEFAULT NULL,
  `kilometraje` varchar(9) DEFAULT NULL,
  `historial_Vehiculo` varchar(300) DEFAULT NULL,
  `datos_Vehiculo` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id_Vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_vehiculo`
--

INSERT INTO `tbl_vehiculo` (`id_Vehiculo`, `id_Cliente`, `tipo_Vehiculo`, `marca`, `modelo`, `fecha_Matricula`, `fecha_Ult_Ser`, `combustible`, `kilometraje`, `historial_Vehiculo`, `datos_Vehiculo`) VALUES
('ESP462', '4444', 'PARTICULAR', 'MAZDA', 'S 205', '1987-08-03', '2014-09-09', 'extra', '3000', '- ', '-'),
('POL897', '4444', 'Particular', 'Chevrolet', 'Camaro SS 1969', '2013-03-12', '2014-10-27', 'diesel', '2500', '-', '-'),
('til897', '5555', 'Particular', 'Volkswagen', 'Up', '2005-02-12', '2014-08-01', 'Diesel', '3500', '-', '-');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
