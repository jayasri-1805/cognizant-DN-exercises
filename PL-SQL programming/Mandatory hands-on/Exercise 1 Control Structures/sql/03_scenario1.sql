SET SERVEROUTPUT ON;
BEGIN
  FOR c IN (SELECT CustomerID,DOB FROM Customers) LOOP
    IF TRUNC(MONTHS_BETWEEN(SYSDATE,c.DOB)/12) > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = c.CustomerID;

      DBMS_OUTPUT.PUT_LINE('Interest updated for Customer ID: '||c.CustomerID);
    END IF;
  END LOOP;
  COMMIT;
END;
/
