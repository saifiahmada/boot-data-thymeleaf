package com.saifiahmada.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saifiahmada.spring.domain.Pegawai;
import com.saifiahmada.spring.repositroty.PegawaiRepository;

@RestController
@RequestMapping(value = "/pegawai")
public class PegawaiController {
	
	@Autowired
	private PegawaiRepository pegawaiRepository;
	
	@ModelAttribute("pegawai")
	public Pegawai getPegawai(){
		return new Pegawai();
	}
	
	@RequestMapping("/")
	public String hello(){
		return "hellowww bro";
	}
	
	@RequestMapping(value = "/form")
	public ModelAndView form(){
		ModelAndView mav = new ModelAndView("pegawai");
		return mav;
	}
	
	@RequestMapping(value = "/save", method= RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("pegawai") Pegawai pegawai){
		System.out.println("" + pegawai.getNama()); 
		System.out.println("" + pegawai.getGolongan());
		pegawaiRepository.save(pegawai);
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("pegawais", pegawaiRepository.findAll()); 
		return mav;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("pegawais", pegawaiRepository.findAll());
		return mav;
	}

}
