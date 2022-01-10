package com.poc.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@NoArgsConstructor
public class Customer {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private String id;
    private String name;
    private String customerName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String timeZone;

    public String apacheToStringBuilder() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("id", id)
                .append("name", name)
                .append("customerName", customerName)
                .append("addressLine1", addressLine1)
                .append("addressLine2", addressLine2)
                .append("addressLine3", addressLine3)
                .append("city", city)
                .append("state", state)
                .append("zipCode", zipCode)
                .append("country", country)
                .toString();
    }

    public String stringBuilder() {
        return new StringBuilder()
                .append("{")
                .append("\"").append("id").append("\"").append(":\"").append(id).append("\",")
                .append("\"").append("name").append("\"").append(":\"").append(name).append("\",")
                .append("\"").append("customerName").append("\"").append(":\"").append(customerName).append("\",")
                .append("\"").append("addressLine1").append("\"").append(":\"").append(addressLine1).append("\",")
                .append("\"").append("addressLine2").append("\"").append(":\"").append(addressLine2).append("\",")
                .append("\"").append("addressLine3").append("\"").append(":\"").append(addressLine3).append("\",")
                .append("\"").append("city").append("\"").append(":\"").append(city).append("\",")
                .append("\"").append("state").append("\"").append(":\"").append(state).append("\",")
                .append("\"").append("zipCode").append("\"").append(":\"").append(zipCode).append("\",")
                .append("\"").append("country").append("\"").append(":\"").append(country).append("\",")
                .append("\"").append("timeZone").append("\"").append(":\"").append(timeZone).append("\",")
                .append("}").toString();
    }

    public String stringConcatenation() {
        return "{" +
                "\"" + "id" + "\"" + ":\"" + id + "\"," +
                "\"" + "name" + "\"" + ":\"" + name + "\"," +
                "\"" + "customerName" + "\"" + ":\"" + customerName + "\"," +
                "\"" + "addressLine1" + "\"" + ":\"" + addressLine1 + "\"," +
                "\"" + "addressLine2" + "\"" + ":\"" + addressLine2 + "\"," +
                "\"" + "addressLine3" + "\"" + ":\"" + addressLine3 + "\"," +
                "\"" + "city" + "\"" + ":\"" + city + "\"," +
                "\"" + "state" + "\"" + ":\"" + state + "\"," +
                "\"" + "zipCode" + "\"" + ":\"" + zipCode + "\"," +
                "\"" + "country" + "\"" + ":\"" + country + "\"," +
                "\"" + "timeZone" + "\"" + ":\"" + timeZone + "\"," +
                "}";
    }

    public String jackson() throws JsonProcessingException {
        return MAPPER.writeValueAsString(this);
    }
}
