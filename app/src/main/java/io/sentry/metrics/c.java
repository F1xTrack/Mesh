package io.sentry.metrics;

import io.sentry.util.f;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class c {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        Pattern.compile("\\W+");
        Pattern.compile("[^\\w\\-.]+");
        Pattern.compile("[^\\w\\-./]+");
        a = (long) ((new f().a(24) / 1.6777216E7f) * 10000.0f);
    }
}
