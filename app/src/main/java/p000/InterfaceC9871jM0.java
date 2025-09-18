package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: defaultLong */
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: jM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9871jM0 {
    String customType() default "__default_type__";

    boolean defaultBoolean() default false;

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String name();
}
