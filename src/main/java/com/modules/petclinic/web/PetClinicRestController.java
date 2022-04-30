package com.modules.petclinic.web;

import com.modules.petclinic.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Validated
@RequestMapping("/api/v1")
public interface PetClinicRestController {

    @DeleteMapping("/owner/{id}")
    ResponseEntity<?> deleteOwner(@PathVariable("id") Long id);

    @PutMapping("/owner/{id}")
    ResponseEntity<?> updateOwner(@PathVariable("id") Long id, @RequestBody Owner ownerRequest);

    @PostMapping("/owner")
    ResponseEntity<URI> createOwner(@RequestBody Owner owner);

    @GetMapping("/owners")
    ResponseEntity<List<Owner>> getOwners();

    @GetMapping("/owner")
    ResponseEntity<List<Owner>> getOwners(@RequestParam("ln") String lastName);

    @GetMapping("/owner/{id}")
    ResponseEntity<Owner> getOwner(@PathVariable("id") Long id);
}
