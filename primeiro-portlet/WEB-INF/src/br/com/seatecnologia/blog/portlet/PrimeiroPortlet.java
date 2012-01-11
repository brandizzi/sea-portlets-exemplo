package br.com.seatecnologia.blog.portlet;

import javax.portlet.GenericPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class PrimeiroPortlet extends GenericPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        renderResponse.getWriter().write("Meu primeiro portlet");
    }

}
