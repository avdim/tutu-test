package ru.tutu.use_cases;

public class GatewayAlwaysFailsStub implements UseCases.Gateway {
    public void lookHotels(String query, LookCallback callback) {
        callback.onError("some error");
    }

    public void hotelDetails(int locationId, int hotelId, DetailsCallback callback) {
        callback.onError("some error");
    }
}
