import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMap {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class EventList {

        @JsonProperty("Events")
        private List<Event> events;

        public List<Event> getEvents() {
            return events;
        }

        public void setEvents(List<Event> events) {
            this.events = events;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class Event {
        @JsonProperty("sport_event_id")
        private String sportEventId;

        @JsonProperty("start_date")
        private String startDate;

        @JsonProperty("sport_name")
        private String sportName;

        @JsonProperty("competition_name")
        private String competitionName;

        @JsonProperty("competition_id")
        private String competitionId;

        @JsonProperty("season_name")
        private String seasonName;

        @JsonProperty("competitors")
        private List<Competitor> competitors;

        @JsonProperty("venue")
        private Venue venue;

        @JsonProperty("probability_home_team_winner")
        private double probabilityHomeTeamWinner;

        @JsonProperty("probability_draw")
        private double probabilityDraw;

        @JsonProperty("probability_away_team_winner")
        private double probabilityAwayTeamWinner;

        public String getSportEventId() {
            return sportEventId;
        }

        public String getStartDate() {
            return startDate;
        }

        public String getSportName() {
            return sportName;
        }

        public String getCompetitionName() {
            return competitionName;
        }

        public String getCompetitionId() {
            return competitionId;
        }

        public String getSeasonName() {
            return seasonName;
        }

        public List<Competitor> getCompetitors() {
            return competitors;
        }

        public Venue getVenue() {
            return venue;
        }

        public double getProbabilityHomeTeamWinner() {
            return probabilityHomeTeamWinner;
        }

        public double getProbabilityDraw() {
            return probabilityDraw;
        }

        public double getProbabilityAwayTeamWinner() {
            return probabilityAwayTeamWinner;
        }

        public void setSportEventId(String sportEventId) {
            this.sportEventId = sportEventId;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public void setSportName(String sportName) {
            this.sportName = sportName;
        }

        public void setCompetitionName(String competitionName) {
            this.competitionName = competitionName;
        }

        public void setCompetitionId(String competitionId) {
            this.competitionId = competitionId;
        }

        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        public void setCompetitors(List<Competitor> competitors) {
            this.competitors = competitors;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

        public void setProbabilityHomeTeamWinner(double probabilityHomeTeamWinner) {
            this.probabilityHomeTeamWinner = probabilityHomeTeamWinner;
        }

        public void setProbabilityDraw(double probabilityDraw) {
            this.probabilityDraw = probabilityDraw;
        }

        public void setProbabilityAwayTeamWinner(double probabilityAwayTeamWinner) {
            this.probabilityAwayTeamWinner = probabilityAwayTeamWinner;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class Competitor {

        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("country")
        private String country;

        @JsonProperty("country_code")
        private String countryCode;

        @JsonProperty("abbreviation")
        private String abbreviation;

        @JsonProperty("qualifier")
        private String qualifier;

        @JsonProperty("gender")
        private String gender;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getQualifier() {
            return qualifier;
        }

        public void setQualifier(String qualifier) {
            this.qualifier = qualifier;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class Venue {

        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("capacity")
        private int capacity;

        @JsonProperty("city_name")
        private String cityName;

        @JsonProperty("country_name")
        private String countryName;

        @JsonProperty("map_coordinates")
        private String mapCoordinates;

        @JsonProperty("country_code")
        private String countryCode;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getMapCoordinates() {
            return mapCoordinates;
        }

        public void setMapCoordinates(String mapCoordinates) {
            this.mapCoordinates = mapCoordinates;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }
    }
}
