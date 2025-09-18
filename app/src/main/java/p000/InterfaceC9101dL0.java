package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: dL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9101dL0 {
    boolean canOverrideExistingModule() default false;

    boolean hasConstants() default true;

    boolean isCxxModule() default false;

    String name();

    boolean needsEagerInit() default false;
}
