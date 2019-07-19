/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.mongojack.tutorial;

import org.mongojack.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "comments")
public class Comment {

    @Id
    private String id;
    private String text;
}
