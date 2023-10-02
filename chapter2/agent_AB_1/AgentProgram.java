package chapter2.agent_AB_1;

import chapter2.agent_AB_1.Environment.LocationState;

public class AgentProgram {
	public Action execute(Percept percept) {
		if (percept.getLocationState() == LocationState.DIRTY)
			return Environment.SUCK_DIRT;

		if (percept.getAgentLocation().equals(Environment.LOCATION_A))
			return Environment.MOVE_RIGHT;

		if (percept.getAgentLocation().equals(Environment.LOCATION_B))
			return Environment.MOVE_LEFT;

		return NoOpAction.NO_OP;
	}
}