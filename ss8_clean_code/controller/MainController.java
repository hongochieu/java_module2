package ss8_clean_code.controller;

public class MainController {
    public void start() {
        CustomerController controller = new CustomerController();
        controller.run();
    }
}
