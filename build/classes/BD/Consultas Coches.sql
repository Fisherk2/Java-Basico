--OTORGAR PERMISOS DE MODIFICACION Y EXECUCION DE PROCEDIMIENTOS ALMACENADOS
USE coches;
GRANT EXECUTE TO FisherCoches;
GRANT INSERT TO FisherCoches;
GRANT SELECT TO FisherCoches;
GO
sp_help Automovil;

CREATE PROC agregarAuto 
@marca VARCHAR(255), 
@cilindros SMALLINT ,
@puertas SMALLINT ,
@precio MONEY, 
@matricula VARCHAR(7)
AS
SET NOCOUNT ON
INSERT INTO Automovil(marca, cilindros, puertas, precioBase,matricula)
VALUES 
(@marca, @cilindros, @puertas, @precio, @matricula)

DROP PROC agregarAuto

agregarAuto 'Lamborghini',12,2,5100000,'SJEYRH3'
UPDATE Automovil SET cilindros = 12 WHERE marca='Lamborghini'
DELETE Automovil WHERE marca='Lamborghini'
SELECT * FROM Automovil WHERE marca = 'Lamborghini' OR cilindros < 8;

SELECT * FROM Automovil;

