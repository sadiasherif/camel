/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ThreadsDefinition;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ThreadsDefinitionPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public ThreadsDefinitionPropertyPlaceholderProvider(Object obj) {
        ThreadsDefinition definition = (ThreadsDefinition) obj;

        readPlaceholders.put("executorServiceRef", definition::getExecutorServiceRef);
        writePlaceholders.put("executorServiceRef", definition::setExecutorServiceRef);
        readPlaceholders.put("poolSize", definition::getPoolSize);
        writePlaceholders.put("poolSize", definition::setPoolSize);
        readPlaceholders.put("maxPoolSize", definition::getMaxPoolSize);
        writePlaceholders.put("maxPoolSize", definition::setMaxPoolSize);
        readPlaceholders.put("keepAliveTime", definition::getKeepAliveTime);
        writePlaceholders.put("keepAliveTime", definition::setKeepAliveTime);
        readPlaceholders.put("timeUnit", definition::getTimeUnit);
        writePlaceholders.put("timeUnit", definition::setTimeUnit);
        readPlaceholders.put("maxQueueSize", definition::getMaxQueueSize);
        writePlaceholders.put("maxQueueSize", definition::setMaxQueueSize);
        readPlaceholders.put("allowCoreThreadTimeOut", definition::getAllowCoreThreadTimeOut);
        writePlaceholders.put("allowCoreThreadTimeOut", definition::setAllowCoreThreadTimeOut);
        readPlaceholders.put("threadName", definition::getThreadName);
        writePlaceholders.put("threadName", definition::setThreadName);
        readPlaceholders.put("callerRunsWhenRejected", definition::getCallerRunsWhenRejected);
        writePlaceholders.put("callerRunsWhenRejected", definition::setCallerRunsWhenRejected);
        readPlaceholders.put("id", definition::getId);
        writePlaceholders.put("id", definition::setId);
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

