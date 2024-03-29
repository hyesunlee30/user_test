//package kr.co.uclick.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import kr.co.uclick.entity.Sample;
//import kr.co.uclick.service.SampleService;
//
//@Controller
//public class SampleController {
//
//   private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
//
//   @Autowired
//   private SampleService sampleService;
//
//   @RequestMapping(value = "list.html")
//   public String list(Model model) {
//      model.addAttribute("users", sampleService.findAll());
//      return "list";
//   }
//
//   @RequestMapping(value = "newForm.html")
//   public String newForm(Model model) {
//      return "newForm";
//   }
//
//   @RequestMapping(value = "editForm.html")
//   public String editForm(Long sampleId, Model model) {
//      sampleService.findById(sampleId);
//      return "editForm";
//   }
//
//   @RequestMapping(value = "save.html")
//   public String save(Sample sample, Model model) {
//      return "redirect:list.html";
//   }
//
//   @RequestMapping(value = "delete.html")
//   public String delete(Long sampleId, Model model) {
//      return "redirect:list.html";
//   }
//
//   @RequestMapping(value = "sample.html")
//   public String sample(String name, Sample sample, Model model) {
//
//      logger.debug("sample name : {}", name);
//      logger.debug("Sample.name : {}", sample.getName());
//
//      model.addAttribute("samples", sampleService.findAll());
//      model.addAttribute("sample", sample);
//      model.addAttribute("findSampleByName", sampleService.findSampleByName(name));
//      return "sample";
//   }
//}