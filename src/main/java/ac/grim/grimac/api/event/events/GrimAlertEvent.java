package ac.grim.grimac.api.event.events;

import ac.grim.grimac.api.AbstractCheck;
import ac.grim.grimac.api.GrimUser;
import ac.grim.grimac.api.event.GrimEvent;
import lombok.Getter;

public class GrimAlertEvent extends GrimEvent implements GrimUserEvent {

    private final GrimUser user;

    @Getter
    private final AbstractCheck check;

    @Getter
    private final String details; // TODO: change this

    @Getter
    private final boolean verbose;

    public GrimAlertEvent(GrimUser user, AbstractCheck check, String details, boolean verbose) {
        super(true);
        this.user = user;
        this.check = check;
        this.details = details;
        this.verbose = verbose;
    }

    @Override
    public GrimUser getUser() {
        return user;
    }

}
