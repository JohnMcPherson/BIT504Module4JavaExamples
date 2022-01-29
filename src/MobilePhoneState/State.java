package MobilePhoneState;

// Define the interface as a base
interface EnemyRobotState
{
    public void action(EnemyRobot robot);
}

// The Patrolling, Recharging, and Chasing classes implement EnemyRobotState
// This gives the classes access to the action method, which they will override
// with their own custom code and behaviour
class Patrolling implements EnemyRobotState
{
    @Override
    public void action(EnemyRobot robot)
    {
        System.out.println("Searching for intruders...");
    }
}

class Recharging implements EnemyRobotState
{
    @Override
    public void action(EnemyRobot robot)
    {
        System.out.println("Recharging...");
    }
}

class Chasing implements EnemyRobotState
{
    @Override
    public void action(EnemyRobot robot)
    {
        System.out.println("Intruder detected! Pursuing!");
    }
}

// Our EnemyRobot class
class EnemyRobot
{
    private EnemyRobotState currentState;	// The current state

    public EnemyRobot(EnemyRobotState initialState)
    {
        currentState = initialState;		// Constructor setting initial state
    }

    public void setState(EnemyRobotState state)
    {
        currentState = state;
    }

    public void action() 					// Perform the unique action of the state
    {
        currentState.action(this);
    }
}

class State
{
    public static void main(String[] args)
    {
        // Create the state
        EnemyRobot robot = new EnemyRobot(new Recharging());
        robot.action();
        // Switch to patrol mode
        robot.setState(new Patrolling());
        robot.action();
        // Intruder found! Switch to chase mode!
        robot.setState(new Chasing());
        robot.action();
        // Running out of energy...need to recharge...
        robot.setState(new Recharging());
        robot.action();
    }
}