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

    // ADD WORK TIME ---------------------------------------------------------------------------------------------------
    public static final String TIMETRACKER_BUTTON = "xpath://*[@id=\"cdk-drop-list-0\"]/li[1]/div";

    public static final String TIMER_BUTTON = "xpath://a[@data-cy='timer-mode']";

    public static final String START_STOP_DIV = "xpath://div[@triggers='manual' and @placement='bottom' and @tabindex='0']";

    public static final String STOP_BUTTON = "xpath://button[@type='button' and @data-cy='tracker-stop' and @class='cl-btn cl-btn-danger cl-d-none cl-d-lg-custom-block' and text()=' Stop ']";

    public static final String TIME_ENTRY_DESCRIPTION_INPUT ="xpath://input[@type='text' and @name='autocomplete-input']";

    public static final String TIME_ENTRY_CREATED = "xpath://div[contains(@class, 'cl-fake-input-wrapper') and .//div[@data-cy='time-entry-description' and text()=' %s ']]";

    public static final String MANUAL_BUTTON = "xpath://a[@id='manual-mode']";

    public static final String START_TIME_INPUT = "xpath:(//input[contains(@class, 'time-picker')])[1]";
    public static final String END_TIME_INPUT = "xpath:(//input[contains(@class, 'time-picker')])[2]";

    public static final String DATE_INPUT = "xpath://input[contains(@class, 'input-date-picker')]";
    public static final String ADD_BUTTON = "xpath://div[@data-cy='add-btn']";

    public static final String TIMER_OPTIONS_BUTTON = "xpath://div[contains(@class, 'cl-dropdown-toggle') and contains(@class, 'pointer') and @placement='bottom']";

    public static final String DISCARD_BUTTON = "xpath://a[contains(@class, 'cl-dropdown-item') and contains(@class, 'cl-text-red') and text()=' Discard']";

    public static final String DISCARD_CONFIRMATION_BUTTON = "xpath://button[text()=' Discard ']";

    public static final String FIRST_DESCRIPTION_INPUT = "xpath:(//input[contains(@class, 'cl-input-description') and @placeholder='Add description'])[1]";

    public static final String SECOND_BILLABLE_BUTTON = "xpath:(//div[@class='cl-billable-icon cl-non-selectable pointer' and @placement='bottom' and @container='body' and @tabindex='0'])[2]";

    public static final String WORKTIME_PROJECT_BUTTON = "xpath:(//span[@class='cl-ml-2 cl-max-width-100 cl-cut-text cl-first-letter-uppercase' and @tooltipiftexttoolong=''])[2]";

    public static final String WORKTIME_CREATE_NEW_PROJECT_BUTTON = "xpath://span[text()=' Create new project ']";





}


