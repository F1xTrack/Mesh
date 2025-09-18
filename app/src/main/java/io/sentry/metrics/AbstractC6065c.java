package io.sentry.metrics;

import io.sentry.util.C6173f;
import java.util.regex.Pattern;

/* renamed from: io.sentry.metrics.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6065c {

    /* renamed from: a */
    public static final long f34243a;

    /* renamed from: b */
    public static final /* synthetic */ int f34244b = 0;

    static {
        Pattern.compile("\\W+");
        Pattern.compile("[^\\w\\-.]+");
        Pattern.compile("[^\\w\\-./]+");
        f34243a = (long) ((new C6173f().m21881a(24) / 1.6777216E7f) * 10000.0f);
    }
}
