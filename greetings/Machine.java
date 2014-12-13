package greetings;

/**
 * Created by danny on 14-12-13.
 */
public class Machine {
    private boolean isOn;

    public Machine(boolean isOn)
    {
        this.isOn = isOn;
    }
    public void TurnOn()
    {
        isOn = true;
    }
    public void TurnOff()
    {
        isOn = false;
    }

}
