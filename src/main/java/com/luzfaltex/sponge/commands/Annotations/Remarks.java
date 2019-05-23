package com.luzfaltex.sponge.commands.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// extension of the cosmetic Summary, for groups, commands, and parameters
/**
 * Attaches remarks to your commands
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Remarks {
    public String Text() default "";
}
