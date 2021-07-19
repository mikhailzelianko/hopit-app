package com.brodyagiby.hopit.views.about;

import com.brodyagiby.hopit.components.leafletmap.LeafletMap;
import com.brodyagiby.hopit.domain.Trail;
import com.brodyagiby.hopit.service.TrailService;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.brodyagiby.hopit.views.MainLayout;

import java.util.List;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends Div {

    private TrailService trailService;

    private LeafletMap map = new LeafletMap();
    private Grid<Trail> grid = new Grid<>();

    public AboutView(TrailService trailService) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();
        this.setSizeFull();

        this.trailService = trailService;

        addClassName("about-view");

        map.setWidth("50%");
        map.setView(53.27, 27.56, 6);
        layout.add(map);

        grid.addColumn(Trail::getTitle).setHeader("Name");
        grid.addColumn(Trail::getShortDescription).setHeader("Desc");
        layout.add(grid);
        add(layout);

        List<Trail> trails = trailService.getAll();

        // load data
        grid.setItems(trails);

        for(Trail trail : trails) {
            map.addMarker(trail.getEnterLat(), trail.getEnterLong());
        }
    }




}
