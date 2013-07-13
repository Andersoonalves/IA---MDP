package tests;

import logic.MDP;

import org.junit.Before;
import org.junit.Test;

public class MDPTest {

	private MDP mdp;
	@Before
	public void setUp() throws Exception {
		this.mdp = new MDP();
	}

	@Test
	public void firstTest() {
		mdp.mdp(0, 0);
		mdp.mdp(0, 1);	
		mdp.mdp(0, 2);	
			
		mdp.mdp(1, 0);

		mdp.mdp(1, 2);	
			
		mdp.mdp(2, 0);
		mdp.mdp(2, 1);	
		mdp.mdp(2, 2);	
		
		
	}

}
