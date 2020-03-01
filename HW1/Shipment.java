public class Shipment {
    private int TrackID;
    int statu;
    String strS;

    /**
     * setter method for the Shipment's TrackID
     * @param trackID recognizer
     */
    public void setTrackID(int trackID) {
        TrackID = trackID;
    }

    /**
     * getter method for the TrackID!
     * @return for the encapsulating we use getter amd the return value is the member of the shipment class
     */
    public int getTrackID() {
        return TrackID;
    }
}
