package com.lancq.mongo;

import com.mongodb.*;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/5
 **/
public class MongoCrudTest {
    public static void main(String[] args) {
        Mongo mongo = new Mongo("127.0.0.1",27017);

        DB db = new DB(mongo,"testdb");

        DBCollection collection = db.getCollection("t_member");

        //类比JDBC，相对比较底层
        DBObject dbObject = new BasicDBObject();
        dbObject.put("name","Simon-Lan");
        dbObject.put("age", 18);
        dbObject.put("addr", "北京");

        collection.insert(dbObject);

        DBCursor cursor = collection.find();
        for(DBObject obj : cursor){
            System.out.println(obj);
        }
    }
}
