CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE UPPER(AccountType) = 'SAVINGS';

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully.');
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
