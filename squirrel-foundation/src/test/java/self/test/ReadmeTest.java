package self.test;

import junit.framework.TestCase;
import org.squirrelframework.foundation.fsm.StateMachineBuilder;
import org.squirrelframework.foundation.fsm.StateMachineBuilderFactory;
import org.squirrelframework.foundation.fsm.UntypedStateMachine;
import org.squirrelframework.foundation.fsm.UntypedStateMachineBuilder;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class ReadmeTest extends TestCase {


    public void test_01() {
        UntypedStateMachineBuilder stateMachineBuilder = StateMachineBuilderFactory.create(MyStateMachine.class);
    }


}



class MyStateMachine extends AbstractUntypedStateMachine {



}