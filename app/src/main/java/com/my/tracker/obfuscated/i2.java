package com.my.tracker.obfuscated;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface i2 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
}
