package com.koodivaara.various;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("style-helpers")
@PageTitle("Style Helpers")
@Menu(order = 1, icon = "vaadin:css", title = "Style Helpers")
public class StyleHelperView extends VerticalLayout {
    public StyleHelperView() {
        var div1 = new Div("First div");
        var div2 = new Div("Second div");
        var div3 = new Div("Third div");
        var verticalLayout1 = new VerticalLayout(div1, div2, div3);

        var div4 = new Div("First div");
        var div5 = new Div("Second div");
        var div6 = new Div("Third div");
        var verticalLayout2 = new VerticalLayout(div4, div5, div6);
        verticalLayout2.getStyle().setGap("30px");


        var div7 = new Div("First div");
        var div8 = new Div("Second div");
        var div9 = new Div("Third div");
        var verticalLayout3 = new HorizontalLayout(div7, div8, div9);

        var div10 = new Div("First div");
        var div11 = new Div("Second div");
        var div12 = new Div("Third div");
        var verticalLayout4 = new HorizontalLayout(div10, div11, div12);
        verticalLayout4.getStyle().setGap("30px");

        var withBackgroundImageLeft  = createDiv("Left background");
        withBackgroundImageLeft.getStyle().setBackground("no-repeat url(\"https://cloudfour.com/examples/img-currentsrc/images/kitten-small.png\")")
                .setBackgroundPosition("left");

        var withBackgroundImageRight = createDiv("Right background");
        withBackgroundImageRight.getStyle().setBackground("no-repeat url(\"https://cloudfour.com/examples/img-currentsrc/images/kitten-small.png\")")
                .setBackgroundPosition("right");

        var withBackgroundImageCenter  = createDiv("Center rotated");
        withBackgroundImageCenter.getStyle().setBackground("no-repeat url(\"https://cloudfour.com/examples/img-currentsrc/images/kitten-small.png\")")
                .setBackgroundPosition("center")
                .setRotate("90deg")
                .setFilter("hue-rotate(90deg)");

        add(verticalLayout1, verticalLayout2, verticalLayout3, verticalLayout4,
                withBackgroundImageLeft, withBackgroundImageRight, withBackgroundImageCenter);
    }

    private Div createDiv(String text) {
        var div = new Div(text);
        div.setWidth("500px");
        div.setHeight("500px");
        return div;
    }
}
