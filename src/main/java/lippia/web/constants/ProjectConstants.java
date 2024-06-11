package lippia.web.constants;

public class ProjectConstants {
    public static final String PROJECT_BUTTON = "xpath://a[@routerlink=\"/projects\"]";
    public static final String NEW_PROJECT_BUTTON = "xpath://button[contains(@data-cy,\"create-new-project\")]";
    public static final String PROJECT_NAME_INPUT = "xpath://input[contains(@data-cy,\"project-name\")]";
    public static final String CREATE_PROJECT_BUTTON = "xpath://button[@data-cy=\"create-project\"]";
    public static final String PROJECT_CREATED = "xpath://span[text()='%s']";
}