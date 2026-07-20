SET SERVEROUTPUT ON;
BEGIN
  FOR r IN (
      SELECT c.Name,l.LoanID,l.EndDate
      FROM Customers c
      JOIN Loans l ON c.CustomerID=l.CustomerID
      WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE+30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder -> '||r.Name||
      ' | Loan: '||r.LoanID||
      ' | Due Date: '||TO_CHAR(r.EndDate,'DD-MON-YYYY')
    );
  END LOOP;
END;
/
