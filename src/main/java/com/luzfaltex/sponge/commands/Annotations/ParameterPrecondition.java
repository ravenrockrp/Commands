package com.luzfaltex.sponge.commands.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Parameter;

/**
 * Requires the parameter to pass the specified precondition before execution can begin.
 * @see Precondition
 */
public interface ParameterPrecondition {
    /**
     * Checks whether the condition is met before the execution of the command.
     * @param context The context of the command.
     * @param parameter The parameter of the command being checked against.
     * @param value The raw value of the parameter.
     * @param services The service collection used for dependency injection.
     * @return
     */
    public abstract CompletableFuture<PreconditionResult> CheckPermissionsAsync(ICommandContext context, Parameter parameter, Object value, IServiceProvider services);
}
