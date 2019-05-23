package com.luzfaltex.sponge.commands.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the aliases for a command
 * This attribute allows for a command to have one or multiple aliases. In other words, the base command can have
 * multiple aliases when triggering the command itself, giving the end-user more freedom of choices when giving
 * hot-words to trigger the desired command.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Alias {
    /**
     * Gets the aliases which have been defined for the command
     */
    String[] Aliases() default "";
}
