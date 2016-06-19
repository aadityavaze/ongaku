
/**
 * Created by Vaze on 6/18/2016.
 */
package outofcheeseerror.codevad.ongaku;

/**
 * Interface implemented by classes that can handle notifications about steps.
 * These classes can be passed to StepDetector.
 */
public interface StepListener {
    public void onStep();
    public void passValue();
}

