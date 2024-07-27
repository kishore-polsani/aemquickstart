package com.adobe.aemquickstart.core.models;


import com.adobe.cq.sightly.SightlyWCMMode;
import com.adobe.cq.sightly.WCMScriptHelper;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.components.Component;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Style;
import com.google.common.net.HttpHeaders;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.scripting.SlingScriptHelper;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.*;
import org.apache.sling.settings.SlingSettingsService;
import org.apache.sling.xss.XSSAPI;

import javax.annotation.PostConstruct;
import javax.jcr.Node;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.day.cq.wcm.api.Page;

@Slf4j
@Model(adaptables = {SlingHttpServletRequest.class, Resource.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyModel {

    @ScriptVariable
    private Component component;

    @ScriptVariable
    private ComponentContext componentContext;

    @ScriptVariable
    private Design currentDesign;

    @ScriptVariable
    private Node currentNode;

    @ScriptVariable
    private com.day.cq.wcm.api.Page currentPage;

    @ScriptVariable
    private HttpSession currentSession;

    @ScriptVariable
    private Style currentStyle;

    @ScriptVariable
    private Style currentStyleCustomScriptVarName;

    @ScriptVariable
    private Designer designer;

    @ScriptVariable
    private EditContext editContext;

    @ScriptVariable
    private Logger log;

    @ScriptVariable
    private PrintWriter out;

    @ScriptVariable
    private PageManager pageManager;

    @ScriptVariable
    private ValueMap pageProperties;

    @ScriptVariable
    private BufferedReader reader;

    @ScriptVariable
    private SlingHttpServletRequest request;

    @ScriptVariable
    private ResourceResolver resolver;

    @ScriptVariable
    private Resource resource;

    @ScriptVariable
    private Design resourceDesign;

    @ScriptVariable
    private Page resourcePage;

    @ScriptVariable
    private SlingHttpServletResponse response;

    @ScriptVariable
    private SlingScriptHelper sling;

    @ScriptVariable
    private WCMScriptHelper slyWcmHelper;

    @ScriptVariable
    private SightlyWCMMode wcmmode;

    @ScriptVariable
    private XSSAPI xssAPI;

    @ValueMapValue
    private String linkPath;

    @ValueMapValue
    private String homePagePath;

    @ChildResource
    private List<Resource> navLinks;

    @RequestAttribute
    private String socialParam;

    @OSGiService
    private SlingSettingsService slingSettingsService;

    @Self
    private Node node;

    @SlingObject
    private SlingHttpServletRequest slingHttpServletRequest;

    @SlingObject
    private SlingHttpServletResponse slingHttpServletResponse;

    @SlingObject
    private Resource currentResource;

    @SlingObject
    private ResourceResolver resourceResolver;


    @PostConstruct
    protected void initModel() {
        /*String xForwardedForHeader = request.getHeader(HttpHeaders.X_FORWARDED_FOR);
        log.info("=======================================================\nx-forwarded-for header {}" + xForwardedForHeader);
        if (xForwardedForHeader == null) {
            log.info("No x-forwarded-for header {}" + request.getRemoteAddr());

        } else {
            //return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
        }*/
    }
}
