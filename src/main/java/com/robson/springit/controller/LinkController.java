package com.robson.springit.controller;

import com.robson.springit.model.Link;
import com.robson.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    // Single Constructor is autowired by Spring Boot 2
    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/foo")
    public String foo(Model model) {
        model.addAttribute("pageTitle", "This page is FOO!");
        return "foo";
    }
    // list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    // CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        // get the link
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        linkRepository.deleteById(id);
    }

}
