package io.sentry.android.replay;

import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* loaded from: classes2.dex */
public abstract class w {
    public static final SemanticsPropertyKey a = new SemanticsPropertyKey("SentryPrivacy", v.e);

    static {
        int i = SemanticsPropertyKey.$stable;
    }

    public static SemanticsPropertyKey a() {
        return a;
    }
}
