package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;
import com.brickred.Inventory.Management.System.Entity.Item;
import com.brickred.Inventory.Management.System.Entity.Vendor;
import com.brickred.Inventory.Management.System.Exception.ResourceNotFoundException;
import com.brickred.Inventory.Management.System.Repository.ItemRepository;
import com.brickred.Inventory.Management.System.Repository.VendorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendorServiceImpl implements VendorServiceInterface{

    @Autowired
    private VendorRepository vendorRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<VendorDto> getAllVendor() {
        List<Vendor> vendors = vendorRepository.findAll();
        List<VendorDto>vendorDtoList = new ArrayList<>();
        for(Vendor i : vendors) {
            vendorDtoList.add((this.modelMapper.map(i,VendorDto.class)));
        }
        return vendorDtoList;
    }

    @Override
    public VendorDto createvendor(VendorDto vendorDto) {
        Vendor vendor =this.modelMapper.map(vendorDto, Vendor.class);
        Vendor addVendor= this.vendorRepository.save(vendor);
        return this.modelMapper.map(addVendor, VendorDto.class);
    }

    @Override
    public VendorDto updatevendor(VendorDto vendorDto, Integer id)  {
        Vendor vendor = this.vendorRepository.findById(id).orElseThrow();
        vendor.setVendorName(vendorDto.getVendorName());
        vendor.setVendorCity(vendorDto.getVendorCity());
        vendor.setVendorMobileNo(vendorDto.getVendorMobileNo());
        vendor.setVendorEmail(vendorDto.getVendorEmail());
        this.vendorRepository.save(vendor);
        VendorDto vendorDto1=this.modelMapper.map(vendor,VendorDto.class);
        return  vendorDto1;
    }

    @Override
    public void deletevendor(Integer id) {
        this.vendorRepository.deleteById(id);

    }
}
