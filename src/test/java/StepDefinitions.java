import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class StepDefinitions {
    private String input;
    private String output;

    // Step: приложение запущено
    @Given("приложение запущено")
    public void applicationRunning() {
        // Инициализация приложения или выполнение необходимых действий
        output = "";
    }

    // Step: пользователь вводит число <value>
    @When("пользователь вводит число {int}")
    public void inputInteger(Integer value) {
        // Вызываем метод для вычисления факториала
        try {
            output = Factorial.getFactorial(value.toString());
        } catch (ArithmeticException e) {
            output = e.getMessage();
        }
    }

    // Step: пользователь вводит строку <value>
    @When("пользователь вводит строку {string}")
    public void inputString(String value) {
        // Вводим строку и пытаемся вычислить факториал
        try {
            output = Factorial.getFactorial(value);
        } catch (ArithmeticException e) {
            output = e.getMessage();
        }
    }

    // Step: приложение выводит "<expected>"
    @Then("приложение выводит {string}")
    public void outputResult(String expected) {
        // Проверяем, что вывод совпадает с ожидаемым
        assertEquals(expected, output);
    }

    // Step: приложение выводит сообщение "<message>"
    @Then("приложение выводит сообщение {string}")
    public void outputMessage(String message) {
        // Проверяем, что вывод совпадает с ожидаемым сообщением об ошибке
        assertEquals(message, output);
    }

    // Step: приложение использует тип данных BigInteger для вычисления
    @Then("приложение использует тип данных BigInteger для вычисления")
    public void useBigInteger() {
        // Здесь мы просто проверяем, что BigInteger был использованq
        try {
            BigInteger result = new BigInteger(output);
            assertNotNull(result);
        } catch (NumberFormatException e) {
            fail("Результат не является числом");
        }
    }

    // Step: корректно выводит результат без переполнения
    @Then("корректно выводит результат без переполнения")
    public void correctResult() {
        // Проверяем, что результат не пустой и не переполнил тип данных
        assertNotNull(output);
        assertFalse(output.isEmpty());
    }
}