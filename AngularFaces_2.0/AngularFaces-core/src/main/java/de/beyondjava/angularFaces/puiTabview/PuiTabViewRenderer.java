package de.beyondjava.angularFaces.puiTabview;

import java.io.IOException;
import java.util.logging.Logger;

import javax.faces.component.UIComponent;
import javax.faces.context.*;
import javax.faces.render.*;

/**
 * A &lt;pui-tabview&gt; consists of a number of &lt;pui-tabs&gt;, each containing content that's hidden of shown
 * depending on whether the tab is active or not. Only one tab can be active at a time.
 *
 * The programming model is much like the API of the PrimeFaces &lt;tabView&gt; component.
 *
 * Usage:<br />
 * &lt;pui-tabview&gt; <br />
 * &lt;pui-tab title="first tab"&gt;<br />
 * content of first tab<br />
 * &lt;/pui-tab&gt; <br />
 * &lt;pui-tab title="default tab" selected="true"&gt;<br />
 * content of second tab <br />
 * &lt;/pui-tab&gt;<br />
 * &lt;pui-tab title="closable tab" closeable="true"&gt; <br />
 * content of closeable tab<br />
 * &lt;/pui-tab&gt;<br />
 * &lt;/pui-tabview&gt;
 *
 * Kudos: This component's development was helped a lot by a stackoverflow answer:
 * http://stackoverflow.com/questions/20531349/struggling-to-implement-tabs-in-angulardart.
 */
@FacesRenderer(componentFamily = "javax.faces.Output", rendererType = "de.beyondjava.angularFaces.puiTabview.PuiTabView")
public class PuiTabViewRenderer extends Renderer {
    private static final Logger LOGGER = Logger.getLogger("de.beyondjava.angularFaces.puiTabview.PuiTabView");

    static {
        LOGGER.info("AngularFaces renderer of 'PuiTabView' is available for use.");
    }

    public PuiTabViewRenderer() {
        LOGGER.info(getClass().getName() + " is being initialized");
    }

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        super.encodeBegin(context, component);
        ResponseWriter writer = context.getResponseWriter();
        writer.startElement("pui-tabview", component);
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        super.encodeEnd(context, component);
        writer.endElement("pui-tabview");
    }

};
