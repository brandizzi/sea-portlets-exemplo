package br.com.seatecnologia.blog.portlet;

import javax.portlet.GenericPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SomosLegiaoPortlet extends GenericPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        String nome = this.getPortletName();
        renderResponse.getWriter().write("Este &eacute; o portlet chamado "+nome);
    }

}
