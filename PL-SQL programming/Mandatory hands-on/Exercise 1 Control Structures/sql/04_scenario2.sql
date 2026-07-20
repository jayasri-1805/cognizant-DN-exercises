SET SERVEROUTPUT ON;
BEGIN
  FOR c IN (SELECT CustomerID,Balance FROM Customers) LOOP
    IF c.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP='Y'
      WHERE CustomerID=c.CustomerID;

      DBMS_OUTPUT.PUT_LINE('VIP enabled for Customer ID: '||c.CustomerID);
    END IF;
  END LOOP;
  COMMIT;
END;
/
