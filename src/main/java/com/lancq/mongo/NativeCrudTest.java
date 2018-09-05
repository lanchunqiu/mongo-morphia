package com.lancq.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.Arrays;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/2
 **/
public class NativeCrudTest {
    public static void main(String[] args) {
        //MongoClient mongoClient = MongoClients.create("mongodb://192.168.227.129:27017");
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");

        MongoCollection collection = mongoDatabase.getCollection("t_member");

        FindIterable iterable = collection.find();

        MongoCursor cursor = iterable.iterator();

        while(cursor.hasNext()){
            Object o = cursor.next();
            System.out.println(o);
        }

        Document document = new Document("name","MongoDB");
        document.append("type","database");
        document.append("count", 1);
        document.append("version", Arrays.asList("v3.2","v3.0","v2.6"));
        document.append("info", new Document("x",203).append("y",102));
        collection.insertOne(document);

        cursor = iterable.iterator();
        while(cursor.hasNext()){
            Object o = cursor.next();
            System.out.println(o);
        }
    }
}
