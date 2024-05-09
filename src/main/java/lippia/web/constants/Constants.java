package lippia.web.constants;

public class Constants {

    // LOGIN -----------------------------------------------------------------------------------------------------------
    public static final String LOGIN_MANUALLY_BUTTON = "xpath://*[text()=\" Log in manually \"]";

    public static final String INPUT_EMAIL = "id:email";

    public static final String INPUT_PSWD = "xpath://input[@id='password']";

    public static final String LOGIN_BUTTON = "xpath://button[text()=\" Log In \"]";

    public static final String AVATAR = "xpath://avatar";

    public static final String MSJ = "xpath://*[contains(text(), '%s')]";

    public static final String MSJ2 = "xpath://*[text()= \"%s\"]";

    public static final String VISIBILITY_TOGGLE = "xpath://button[contains(@class,\"visibility-toggle\")]";


    // CREATE PROJECT --------------------------------------------------------------------------------------------------
    public static final String PROJECT_BUTTON = "xpath://a[@routerlink=\"/projects\"]";

    public static final String NEW_PROJECT_BUTTON = "xpath://button[contains(@data-cy,\"create-new-project\")]";

    public static final String PROJECT_NAME_INPUT = "xpath://input[contains(@data-cy,\"project-name\")]";

    public static final String CREATE_PROJECT_BUTTON = "xpath://button[@data-cy=\"create-project\"]";

    public static final String PROJECT_CREATED = "xpath://span[text()='%s']";


    // CREATE WORKSPACE ------------------------------------------------------------------------------------------------
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

    
    // LOGOUT ----------------------------------------------------------------------------------------------------------
    public static final String LOGOUT_BUTTON = "xpath://a[@data-cy=\"logout\"]";


}

