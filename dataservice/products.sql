CREATE TABLE IF NOT EXISTS `Products`(
       `productCode` VARCHAR(15),
       `productName` VARCHAR(70),
       `productLine` VARCHAR(50),
        `productScale` VARCHAR(10),
        `productVendor` VARCHAR(50),
        `productDescription` VARCHAR(1000),
        `quantityInStock` INTEGER,
        `buyPrice` DOUBLE,
        `MSRP` DOUBLE,
        PRIMARY KEY (`productCode`)        
)ENGINE=InnoDB;

