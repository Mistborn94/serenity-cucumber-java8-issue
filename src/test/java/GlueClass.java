import io.cucumber.java8.En;

public class GlueClass implements En {

    public GlueClass() {
        Given("Some Step", () -> {
            System.out.println("Doing some step");
        });
    }
}
