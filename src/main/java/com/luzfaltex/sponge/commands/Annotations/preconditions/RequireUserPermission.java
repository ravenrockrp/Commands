package com.luzfaltex.sponge.commands.Annotations.preconditions;

import com.luzfaltex.sponge.commands.Annotations.Precondition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.CompletableFuture;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequireUserPermission extends Precondition {
    public String PermissionString() default "";

    @Override
    public CompletableFuture<PreconditionResult> CheckPermissionsAsync(ICommandContext context, CommandInfo command, IServiceProvider services) {
        return null;
    }
}
