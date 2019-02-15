package self.test;

import junit.framework.TestCase;
import org.squirrelframework.foundation.fsm.StateMachineBuilderFactory;
import org.squirrelframework.foundation.fsm.UntypedStateMachineBuilder;
import org.squirrelframework.foundation.fsm.annotation.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class FluentApiTest extends TestCase {


    public void test_01() {
        UntypedStateMachineBuilder builder = StateMachineBuilderFactory.create(FluentStateMachine.class);
//        builder.externalTransition().from("A").to("B").on("ToB").callMethod("fromAToB");

        FluentStateMachine fluentStateMachine = builder.newUntypedStateMachine("A");
        fluentStateMachine.fire("ToB", 100);


    }

}



@StateMachineParameters(stateType = String.class, eventType = String.class, contextType = Integer.class)
@States({
        @State(name = "A"),
        @State(name = "B"),
})
@Transitions({
        @Transit(from = "A", to = "B", on = "ToB", callMethod = "fromAToB"),

})
class FluentStateMachine extends AbstractUntypedStateMachine {





    public void fromAToB(String from, String to, String event, Integer context) {
        System.out.println("from " + from + " to " + to + " on " + event + " context:" + context);
    }
}