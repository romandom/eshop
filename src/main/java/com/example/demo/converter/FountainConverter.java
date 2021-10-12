package com.example.demo.converter;

import com.example.demo.domain.dto.InformationDto;
import com.example.demo.domain.entity.InformationEntity;

public class FountainConverter {
	
	public static InformationEntity convert(InformationDto informationDto)
	{
		InformationEntity informationEntity = new InformationEntity();
		informationEntity.setImage(informationDto.getFountain());

		return informationEntity;
	}

}
