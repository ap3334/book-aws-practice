package com.example.bookaws.web;

import com.example.bookaws.config.auth.LoginUser;
import com.example.bookaws.config.auth.dto.SessionUser;
import com.example.bookaws.service.posts.PostsService;
import com.example.bookaws.web.dto.PostResponseDto;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {

        model.addAttribute("posts", postsService.findAllDesc());

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String save() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String update(@PathVariable Long id, Model model) {

        PostResponseDto dto = postsService.findById(id);

        model.addAttribute("post", dto);

        return "posts-update";
    }
}
