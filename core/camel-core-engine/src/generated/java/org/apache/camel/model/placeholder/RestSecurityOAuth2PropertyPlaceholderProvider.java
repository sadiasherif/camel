/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.rest.RestSecurityOAuth2;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class RestSecurityOAuth2PropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public RestSecurityOAuth2PropertyPlaceholderProvider(Object obj) {
        RestSecurityOAuth2 definition = (RestSecurityOAuth2) obj;

        readPlaceholders.put("authorizationUrl", definition::getAuthorizationUrl);
        writePlaceholders.put("authorizationUrl", definition::setAuthorizationUrl);
        readPlaceholders.put("tokenUrl", definition::getTokenUrl);
        writePlaceholders.put("tokenUrl", definition::setTokenUrl);
        readPlaceholders.put("flow", definition::getFlow);
        writePlaceholders.put("flow", definition::setFlow);
        readPlaceholders.put("key", definition::getKey);
        writePlaceholders.put("key", definition::setKey);
        readPlaceholders.put("description", definition::getDescription);
        writePlaceholders.put("description", definition::setDescription);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }

}

