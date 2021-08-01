package com.exaltpawarikanda.msscbeerinventoryservice.web.mappers;

import com.exaltpawarikanda.msscbeerinventoryservice.domain.BeerInventory;
import com.exaltpawarikanda.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
