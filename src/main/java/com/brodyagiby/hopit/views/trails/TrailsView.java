package com.brodyagiby.hopit.views.trails;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.brodyagiby.hopit.components.leafletmap.LeafletMap;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.brodyagiby.hopit.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Trails")
@Route(value = "trails", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class TrailsView extends VerticalLayout {

    private LeafletMap map = new LeafletMap();

    public TrailsView() {
        setSizeFull();
        setPadding(false);
        map.setSizeFull();
        map.setView(55.0, 10.0, 4);
        add(map);
    }
}
