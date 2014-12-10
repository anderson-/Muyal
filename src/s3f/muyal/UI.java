/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.muyal;

import s3f.core.ui.GUIBuilder;
import s3f.muyal.ui.UserToolbarWidget;

/**
 *
 * @author antunes
 */
public class UI extends GUIBuilder {

    public UI() {
        super("DWRS");
    }

    @Override
    public void init() {

        this.addToolbarComponent(new UserToolbarWidget(), 600);

    }
}
