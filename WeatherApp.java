import java.io.BufferedReader;                             //takes text convert readable line by line
import java.io.InputStreamReader;                          //Bytes to char
import java.net.HttpURLConnection;
import java.net.URI;                                       //build & validate address safely
import java.net.URL;                                       //network request
import java.util.Scanner;

import org.json.JSONObject;                                //converts raw text json file to understandable text int,string...

public class WeatherApp {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter city name: ");
            String city = sc.nextLine();

            String apiKey = "d70502f713fa98ed5240d3ecad0d0033"; //api secret key without it api cant give data
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + 
            "&appid=" + apiKey;                                  //base api url q is the parametre to pass city name

            URI uri = new URI(apiUrl);                           //validates and safely handles spaces,spcl char....   
            URL url = uri.toURL();                               //network req
            
            HttpURLConnection connection = (HttpURLConnection) 
            url.openConnection();                               //opening url connection particularly http type
                                                                 
            connection.setRequestMethod("GET");          //telling to serever i want data

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Extract required data
            String cityName = jsonResponse.getString("name");

            JSONObject mainData = jsonResponse.getJSONObject("main");
            double tempKelvin = mainData.getDouble("temp");
            int humidity = mainData.getInt("humidity");

            // Convert Kelvin to Celsius
            double tempCelsius = tempKelvin - 273.15;

            // Display output
            System.out.println("City: " + cityName);
            System.out.println("Temperature: " + String.format("%.2f", tempCelsius) + " °C");
            System.out.println("Humidity: " + humidity + "%");

            sc.close();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
