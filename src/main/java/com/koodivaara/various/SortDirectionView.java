package com.koodivaara.various;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.SortDirection;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("sort-direction")
@PageTitle("Sort Direction")
@Menu(order = 2, icon = "vaadin:sort", title = "Sort Direction")
public class SortDirectionView extends VerticalLayout {
    public SortDirectionView() {
        var div1 = new Div("Sort Direction name: %s, short name: %s".formatted(SortDirection.ASCENDING.name(), SortDirection.ASCENDING.getShortName()));
        var div2 = new Div("Sort Direction name: %s, short name: %s".formatted(SortDirection.DESCENDING.name(), SortDirection.DESCENDING.getShortName()));
        add(div1, div2);
    }
}
