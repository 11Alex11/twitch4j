package twitch4j.api.kraken.json;

import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 * Model representing a token authorization.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class TokenAuthorization {

	private List<String> scopes;

	private Date createdAt;

	private Date updatedAt;

}
