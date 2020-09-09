package com.freshworld.core.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.freshworld.core.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
