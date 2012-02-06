package br.com.seatecnologia.blog.portlet;

import javax.portlet.GenericPortlet;

import java.io.IOException;

import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloPortlet extends GenericPortlet {
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        String path = "/view.jsp";
        include(path, renderRequest, renderResponse);
    }
    @Override
    public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        String path = "/edit.jsp";
        include(path, renderRequest, renderResponse);
    }
    public void include(String path, RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        PortletContext context = getPortletContext();
        PortletRequestDispatcher dispatcher =  context.getRequestDispatcher(path);
        dispatcher.include(renderRequest, renderResponse);
    }
}

