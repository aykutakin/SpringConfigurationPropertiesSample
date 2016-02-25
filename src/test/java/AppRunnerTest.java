import com.mydomain.App;
import com.mydomain.AppRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Aykut on 25.02.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class AppRunnerTest {

    @Autowired
    private AppRunner appRunner;

    @Test
    public void testRun() throws Exception {
        appRunner.run(null);
    }

}
