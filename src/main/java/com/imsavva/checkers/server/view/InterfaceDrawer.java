package com.imsavva.checkers.server.view;

import com.imsavva.checkers.server.beans.Player;
import com.imsavva.checkers.server.model.GameModel;

/**
 * @author Savva Kodeikin
 */
public interface InterfaceDrawer {
    void draw(GameModel gameModel);
    void proclaimWinner(Player winner);
    void proclaimDeadHeat();
}
