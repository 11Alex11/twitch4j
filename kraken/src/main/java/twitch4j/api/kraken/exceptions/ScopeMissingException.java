package twitch4j.api.kraken.exceptions;

import lombok.Getter;
import lombok.Setter;
import twitch4j.common.auth.Scope;

@Getter
@Setter
public class ScopeMissingException extends RuntimeException {

	private Scope scope;

	public ScopeMissingException(Scope scope) {
		super(String.format("Scope %s is required!", scope.toString()));
		this.scope = scope;
	}
}
