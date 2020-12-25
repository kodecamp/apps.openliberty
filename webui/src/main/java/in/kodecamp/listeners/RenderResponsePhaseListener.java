package in.kodecamp.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class RenderResponsePhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void beforePhase(PhaseEvent event) {

		System.out.println("before phase : RENDER_RESPONSE " + event.getPhaseId());

	}

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("after phase : RENDER_RESPONSE " + event.getPhaseId());

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}

}