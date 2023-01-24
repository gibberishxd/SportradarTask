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

        // getters and setters
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

        // getters and setters
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

        // getters and setters
    }
}
