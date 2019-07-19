/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.mongojack.tutorial;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.DBRef;
import org.mongojack.ObjectId;

import java.util.List;

public class BlogPost {

    private String id;

    @ObjectId
    private List<DBRef<Comment, String>> comments;

    @ObjectId
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @ObjectId
    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }
}
