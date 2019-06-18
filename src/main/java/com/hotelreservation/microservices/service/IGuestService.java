package com.hotelreservation.microservices.service;

import com.hotelreservation.microservices.entity.Guest;
import com.hotelreservation.microservices.exceptions.GuestAlreadyRegisteredException;
import com.hotelreservation.microservices.exceptions.GuestNotFoundException;
import com.hotelreservation.microservices.vo.GuestVO;

import java.util.List;

/**
 * Created by e068635 on 6/10/2019.
 */
public interface IGuestService {

    /**
     *
     * @param guestId
     * @return
     */
    GuestVO findGuestById(String guestId)  throws GuestNotFoundException;

    /**
     *
     * @param lastName
     * @return
     */
    GuestVO findGuestByLastName(String lastName)  throws GuestNotFoundException;


    /**
     *
     * @param newGuest
     * @return
     * @throws GuestAlreadyRegisteredException
     */
    GuestVO registerNewGuest(Guest newGuest) throws GuestAlreadyRegisteredException;

    /**
     *
     * @param guestId
     * @return
     * @throws GuestNotFoundException
     */
    void deleteGuest(Long guestId) throws GuestNotFoundException;

    /**
     *
     * @return
     */
    List<GuestVO> findAll();


}
