package twitch4j.common.json.converters;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import twitch4j.common.auth.Scope;

public class ScopeDeserializer extends JsonDeserializer<Scope> {
	@Override
	public Scope deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return Scope.fromString(p.getValueAsString());
	}
}
