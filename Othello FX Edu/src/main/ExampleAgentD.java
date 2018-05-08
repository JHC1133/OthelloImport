package main;

import com.eudycontreras.othello.capsules.AbstractMove;
import com.eudycontreras.othello.controllers.AgentController;
import com.eudycontreras.othello.controllers.AgentMove;
import com.eudycontreras.othello.enumerations.PlayerTurn;
import com.eudycontreras.othello.models.GameBoardState;
import com.eudycontreras.othello.threading.ThreadManager;
import com.eudycontreras.othello.threading.TimeSpan;

/**
 * <H2>Created by</h2> Eudy Contreras
 * <h4> Mozilla Public License 2.0 </h4>
 * Licensed under the Mozilla Public License 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <a href="https://www.mozilla.org/en-US/MPL/2.0/">visit Mozilla Public Lincense Version 2.0</a>
 * <H2>Class description</H2>
 * 
 * @author Eudy Contreras
 */
public class ExampleAgentD extends AgentMove{
	/**
	 * Delete the content of this method and Implement your logic here!
	 */
	@Override
	public AbstractMove getMove(GameBoardState gameState) {
		return getExampleMove(gameState);
	}
	
	/**
	 * Default template move which serves as an example of how to implement move
	 * making logic. Note that this method does not use Alpha beta pruning and
	 * the use of this method can disqualify you
	 * 
	 * @param gameState
	 * @return
	 */
	private AbstractMove getExampleMove(GameBoardState gameState){
		
		int waitTime = UserSettings.MIN_SEARCH_TIME;
		
		ThreadManager.pause(TimeSpan.millis(waitTime)); // Pauses execution for the wait time to cause delay
		
		return AgentController.findRandomMove(gameState, PlayerTurn.PLAYER_ONE); // returns an example AI move Note: this is not AB Pruning
	}

}