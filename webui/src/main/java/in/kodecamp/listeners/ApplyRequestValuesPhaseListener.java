package in.kodecamp.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class ApplyRequestValuesPhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void beforePhase(PhaseEvent event) {

		System.out.println("before phase : APPLY_REQUEST_VALUES " + event.getPhaseId());

	}

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("after phase : APPLY_REQUEST_VALUES " + event.getPhaseId());

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.APPLY_REQUEST_VALUES;
	}

}