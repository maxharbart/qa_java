import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestGetKittens() {
        Feline feline = new Feline();
        int kittensCount = 2;
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(kittensCount, actual);
    }
}