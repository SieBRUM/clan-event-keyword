package com.claneventkeyword;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClanEventKeywordOverlay extends OverlayPanel {
    private Client client;
    private ClanEventKeywordPlugin plugin;
    private ClanEventKeywordConfig config;

    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Inject
    private ClanEventKeywordOverlay(Client client, ClanEventKeywordPlugin plugin, ClanEventKeywordConfig config) {
        this.client = client;
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().add(LineComponent.builder().left(config.keyword()).build());

        if(config.shouldShowTimestamp()) {
            panelComponent.getChildren().add(LineComponent.builder().left(sdf3.format(new Date())).build());
        }

        return super.render(graphics);
    }
}
