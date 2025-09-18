package io.sentry.internal.gestures;

import android.view.View;
import io.sentry.config.AbstractC6003a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: io.sentry.internal.gestures.b */
/* loaded from: classes2.dex */
public final class C6044b {

    /* renamed from: a */
    public final WeakReference f34200a;

    /* renamed from: b */
    public final String f34201b;

    /* renamed from: c */
    public final String f34202c;

    /* renamed from: d */
    public final String f34203d = "old_view_system";

    public C6044b(View view, String str, String str2) {
        this.f34200a = new WeakReference(view);
        this.f34201b = str;
        this.f34202c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6044b.class != obj.getClass()) {
            return false;
        }
        C6044b c6044b = (C6044b) obj;
        return AbstractC6003a.m21747f(this.f34201b, c6044b.f34201b) && AbstractC6003a.m21747f(this.f34202c, c6044b.f34202c) && AbstractC6003a.m21747f(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34200a, this.f34202c, null});
    }
}
