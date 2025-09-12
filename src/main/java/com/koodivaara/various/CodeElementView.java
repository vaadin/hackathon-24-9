package com.koodivaara.various;

import com.vaadin.flow.component.html.Code;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.SortDirection;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("code-element")
@PageTitle("Code element")
@Menu(order = 3, icon = "vaadin:code", title = "Code element")
public class CodeElementView extends VerticalLayout {
    public CodeElementView() {
        var div1 = new Div("Example of code element");
        var codeElement = new Code("methodName()");
        var contentDiv = new Div(new Span("Here comes method "), codeElement, new Span(" and here comes the end"));
        add(div1, contentDiv);
    }
}
