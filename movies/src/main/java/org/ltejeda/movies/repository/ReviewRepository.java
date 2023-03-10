package org.ltejeda.movies.repository;

import org.bson.types.ObjectId;
import org.ltejeda.movies.entities.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
