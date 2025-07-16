package com.spring.basic.score.controller;

import com.spring.basic.score.entity.Score;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v5")
public class ScoreController {

    private List<Score> scoreList = new ArrayList<>();

    public ScoreController() {
        scoreList.add(Score.builder()
                .id(1L)
                .name("김춘복")
                .kor(90)
                .eng(90)
                .math(90)
                .total(270)
                .average(90)
                .build());
    }

    // score-page.jsp를 열어줘 (뷰 포워딩) - 페이지 라우팅
    @GetMapping("/score-page")
    public String scorePage(Model model) {
        model.addAttribute("scoreList", scoreList);
        return "score/score-page";
    }



}
