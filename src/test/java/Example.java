import fr.docjyJ.apiClientBuilder.exception.ApiClientException;
import fr.docjyJ.apiClientBuilder.exception.ApiServerException;
import fr.docjyJ.tisseoLib.request.*;
import fr.docjyJ.tisseoLib.response.*;

import java.time.LocalDateTime;

public class Example {
    private static final String API_KEY = "null-api-key"; // Insert your api key

    public StopAreaResponse stopArea() throws ApiServerException, ApiClientException {
        //Create request object
        StopAreaRequest request = new StopAreaRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);

        //Execute request
        return request.execute();
    }

    public StopPointResponse stopPoint() throws ApiServerException, ApiClientException {
        //Create request object
        StopPointRequest request = new StopPointRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);
        request.setDisplayDestinations(true);
        request.setDisplayLines(true);

        //Execute request
        return request.execute();
    }

    public PlacesResponse places() throws ApiServerException, ApiClientException {
        //Create request object
        PlacesRequest request = new PlacesRequest(API_KEY);

        //Set parameters
        request.setTerm("cav");

        //Execute request
        return request.execute();
    }

    public NetworksResponse networks() throws ApiServerException, ApiClientException {
        //Create request object
        NetworksRequest request = new NetworksRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    public LinesResponse lines() throws ApiServerException, ApiClientException {
        //Create request object
        LinesRequest request = new LinesRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayTerminus(true);

        //Execute request
        return request.execute();
    }

    public StopSchedulesResponse stopSchedules() throws ApiServerException, ApiClientException {
        //Create request object
        StopSchedulesRequest request = new StopSchedulesRequest(API_KEY);

        //Set parameters
        request.setStopsList("1970324837184892,3377699720882831");
        request.setDatetime(LocalDateTime.now());

        //Execute request
        return request.execute();
    }

    public RollingStocksResponse rollingStocks() throws ApiServerException, ApiClientException {
        //Create request object
        RollingStocksRequest request = new RollingStocksRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    public JourneysResponse journeys() throws ApiServerException, ApiClientException {
        //Create request Object
        JourneysRequest request = new JourneysRequest(API_KEY);

        //set parameters
        request.setDeparturePlace("basso cambo ");
        request.setArrivalPlace("françois verdier toulouse");
        request.setFirstDepartureDatetime(LocalDateTime.now());

        //Execute request
        return request.execute();

    }

    public MessagesResponse messages() throws ApiServerException, ApiClientException {
        //Create request object
        MessagesRequest request = new MessagesRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    public ServiceDensityResponse serviceDensity() throws ApiServerException, ApiClientException {
        //Create request Object
        ServiceDensityRequest request = new ServiceDensityRequest(API_KEY);

        //set parameters
        request.setCenterXY("143887.232875 5369123.828587");
        request.setBeginDateTimeSlot(LocalDateTime.now());
        request.setDisplayServices(true);

        //Execute request
        return request.execute();
    }
}
