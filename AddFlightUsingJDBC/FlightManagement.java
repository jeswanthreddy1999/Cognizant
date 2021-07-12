import java.sql.*;
import java.util.*;
public class FlightManagementSystem {
    public boolean addFlight(Flight fObj) {
        try {
            Connection con = DB.getConnection();
            PreparedStatement p = con.prepareStatement("insert into flight (flightId, source, destination, noofseats, flightfare) values (?, ?, ?, ?, ?);");
            p.setInt(1, fObj.getFlightId());
            p.setString(2, fObj.getSource());
            p.setString(3, fObj.getDestination());
            p.setInt(4, fObj.getNoOfSeats());
            p.setDouble(5, fObj.getFlightFare());

            p.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}