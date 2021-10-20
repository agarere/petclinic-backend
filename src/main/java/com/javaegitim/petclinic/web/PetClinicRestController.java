package com.javaegitim.petclinic.web;

import com.javaegitim.petclinic.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

public interface PetClinicRestController {

    @RequestMapping(method = RequestMethod.DELETE, value = "/owner/{id}")
    ResponseEntity<?> deleteOwner(@PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.PUT, value="/owner/{id}")
    ResponseEntity<?> updateOwner(@PathVariable("id") Long id, @RequestBody Owner ownerRequest);

    @RequestMapping(method = RequestMethod.POST, value="/owner")
    ResponseEntity<URI> createOwner(@RequestBody Owner owner);

    @RequestMapping(method = RequestMethod.GET, value = "/owners")
    ResponseEntity<List<Owner>> getOwners();

    @RequestMapping(method = RequestMethod.GET, value = "/owner")
    ResponseEntity<List<Owner>> getOwners(@RequestParam("ln") String lastName);

    @RequestMapping(method = RequestMethod.GET, value = "/owner/{id}")
    ResponseEntity<Owner> getOwner(@PathVariable("id") Long id);

}
