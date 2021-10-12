package com.example.demo.resource;

import com.example.demo.domain.dto.InformationDto;
import com.example.demo.service.SaveService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/eshop")
public class InformationResource {

    private final SaveService saveService;

    @PostMapping(consumes = MediaType.ALL_VALUE)
    @ResponseStatus (HttpStatus.CREATED)
    public HttpStatus
        createBuy(@RequestBody InformationDto informationDto) {
        {
            try{
                saveService.save(informationDto);
            }catch (Exception e){
                return HttpStatus.FORBIDDEN;
            }

            return HttpStatus.CREATED;
        }
    }
}
