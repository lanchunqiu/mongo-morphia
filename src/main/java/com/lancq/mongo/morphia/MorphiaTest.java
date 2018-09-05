package com.lancq.mongo.morphia;

import com.lancq.mongo.morphia.entity.Member;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/5
 **/
public class MorphiaTest {
    public static void main(String[] args) {
        Morphia morphia = new Morphia();

        MongoClient client = new MongoClient("localhost",27017);

        Datastore ds = morphia.createDatastore(client,"testdb");

        Member member = new Member();
        member.setName("Tom");
        member.setAge(18);
        member.setAddr("天津");

        Key<Member> key = ds.save(member);
        System.out.println(key.getId());

    }
}
