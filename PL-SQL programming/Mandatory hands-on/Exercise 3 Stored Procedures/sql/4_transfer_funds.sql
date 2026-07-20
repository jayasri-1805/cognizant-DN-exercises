CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account
    FOR UPDATE;

    IF v_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_to_account;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed. Insufficient balance.');
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('One of the account numbers is invalid.');
END;
/

BEGIN
    TransferFunds(1,2,500);
END;
/
