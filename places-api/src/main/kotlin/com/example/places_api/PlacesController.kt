package com.example.places_api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/places")
class PlacesController {

    @GetMapping
    fun getPlaces(): List<CommercialPlace> {
        return listOf(
            CommercialPlace("Coffee Shop", "Coffee Corner", 4.5),
            CommercialPlace("Restaurant", "Dinner Place", 4.2)
        )
    }
}