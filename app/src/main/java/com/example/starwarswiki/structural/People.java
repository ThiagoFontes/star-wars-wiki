package com.example.starwarswiki.structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "count",
        "next",
        "previous",
        "results"
})
/**
 * POJO Class to help with people response from SWAPI
 */
public class People extends JsonSWAPIPage {

    @JsonProperty("results")
    private List<Person> list = null;


    @JsonProperty("results")
    public List<Person> getList() {
        return list;
    }

    @JsonProperty("results")
    public void setList(List<Person> list) {
        this.list = list;
    }
}