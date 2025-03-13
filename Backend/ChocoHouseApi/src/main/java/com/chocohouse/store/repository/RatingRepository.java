package com.chocohouse.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chocohouse.store.entity.Rating;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
