package lippia.web.constants;

public class WorkspaceConstants {
    public static final String MENU_BUTTON = "xpath://a[starts-with(@class,\"cl-d-flex cl-dropdown-toggle\")]";
    public static final String MANAGE_WORKSPACES_BUTTON = "xpath://a[@routerlink=\"/workspaces\"]";
    public static final String CREATE_NEW_WORKSPACE_BUTTON = "xpath://button[contains(@class, \"cl-btn cl-btn-outline-primary\")]";
    public static final String SET_WORKSPACE_NAME_INPUT = "xpath://input[@formcontrolname=\"name\"]";
    public static final String CREATE_WORKSPACE_BUTTON = "xpath://button[@class=\"cl-btn cl-btn-primary\"]";
    public static final String WORKSPACE_CREATED = "xpath://span[contains(text(), '%s')]";
    public static final String WS_SETTINGS_BUTTON = "xpath://a[contains(text(), 'Workspace settings')]";
    public static final String WORKSPACE_NAME_INPUT = "xpath://input[@id=\"workspaceName\"]";
    public static final String GENERAL_BUTTON = "xpath://a[@data-cy=\"settings-tab\"]";
    public static final String ACTIVE_WORKSPACE_NAME = "xpath://p[contains(text(), '%s')]";
}