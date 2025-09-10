package uz.psychotherapy.psychotherapybackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.psychotherapy.psychotherapybackend.dto.request.FilterRequest;
import uz.psychotherapy.psychotherapybackend.service.SpecialistService;

@RestController
@RequestMapping("/api/v1/specialist")
@RequiredArgsConstructor
public class SpecialistController {
    private final SpecialistService specialistService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllSpecialists(@RequestBody FilterRequest filter) {
        return specialistService.getAllSpecialistWithFilter(filter);
    }
}
