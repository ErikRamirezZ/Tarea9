package com.raze.diplomado.seguridad.tarea9.controller;
import com.raze.diplomado.seguridad.tarea9.domain.Catalogo1;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/catalogo1s")
@Controller
@RooWebScaffold(path = "catalogo1s", formBackingObject = Catalogo1.class)
public class Catalogo1Controller {
}
