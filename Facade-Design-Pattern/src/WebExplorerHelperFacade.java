import java.sql.Driver;

class WebExplorerHelperFacade {
    public static void generateReports(String explorer, String report, String test) {
        Driver driver = null;
        switch (explorer) {
            case "firefox" -> {
                driver = Firefox.getFirefoxDriver();
                switch (report) {
                    case "html" -> Firefox.generateHTMLReport(test, driver);
                    case "junit" -> Firefox.generateJUnitReport(test, driver);
                }
            }
            case "chrome" -> {
                driver = Chrome.getChromeDriver();
                switch (report) {
                    case "html" -> Chrome.generateHTMLReport(test, driver);
                    case "junit" -> Chrome.generateJUnitReport(test, driver);
                }
            }
        }
    }
}