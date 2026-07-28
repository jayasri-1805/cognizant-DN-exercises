
# JWT Authentication Hands-on (Template)

This template contains the major source files for the Cognizant exercise.

## Manual changes required
1. Add Spring Security dependency.
2. Add JJWT dependency (0.9.0).
3. Complete SecurityConfig according to your Spring Boot version.
4. Run:
   mvn clean package

Test:
curl -s -u user:pwd http://localhost:8090/authenticate
