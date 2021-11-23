package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida xxx", "Dúvida com spring 1", new Curso("Spring 1", "Programação 1"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
