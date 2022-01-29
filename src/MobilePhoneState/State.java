package MobilePhoneState;

// Define the interface as a base
interface MobilePhoneState
{
    void incomingCall(MobilePhone mobilePhone);
}

// The Patrolling, Recharging, and Chasing classes implement EnemyRobotState
// This gives the classes access to the action method, which they will override
// with their own custom code and behaviour
class SoundOnly implements MobilePhoneState
{
    @Override
    public void incomingCall(MobilePhone mobilePhone)
    {
        System.out.println("Beep...");
    }
}

class Silent implements MobilePhoneState
{
    @Override
    public void incomingCall(MobilePhone mobilePhone)
    {
        System.out.println("Silent...");
    }
}

class VibrateOnly implements MobilePhoneState
{
    @Override
    public void incomingCall(MobilePhone mobilePhone)
    {
        System.out.println("Vibrate only...");
    }
}

class SoundAndVibrate implements MobilePhoneState
{
    @Override
    public void incomingCall(MobilePhone mobilePhone)
    {
        System.out.println("Sound and Vibrate...");
    }
}

// Our MobilePhone class
class MobilePhone
{
    private MobilePhoneState currentState;	// The current state

    public MobilePhone(MobilePhoneState initialState)
    {
        currentState = initialState;		// Constructor setting initial state
    }

    public void setState(MobilePhoneState state)
    {
        currentState = state;
    }

    public void action() 					// Perform the unique action of the state
    {
        currentState.incomingCall(this);
    }
}

class State
{
    public static void main(String[] args)
    {
        // Create the state
        MobilePhone mobilePhone = new MobilePhone(new Silent());
        mobilePhone.action();
        // Switch to patrol mode
        mobilePhone.setState(new SoundOnly());
        mobilePhone.action();
        // Intruder found! Switch to chase mode!
        mobilePhone.setState(new VibrateOnly());
        mobilePhone.action();
        // Running out of energy...need to recharge...
        mobilePhone.setState(new Silent());
        mobilePhone.action();

        mobilePhone.setState(new SoundAndVibrate());
        mobilePhone.action();
    }
}