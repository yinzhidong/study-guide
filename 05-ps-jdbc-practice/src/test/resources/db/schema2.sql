drop table C_ADDRESS if exists;

CREATE 	TABLE C_ADDRESS
(		ADDRESS_ID		INT IDENTITY PRIMARY KEY,
		USER_ID			INT,
		ADDR_1			VARCHAR2(100),
		ADDR_2			VARCHAR2(100),
		CITY			VARCHAR2(100),
		STATE			VARCHAR2(100),
		ZIP				VARCHAR2(100)	)

