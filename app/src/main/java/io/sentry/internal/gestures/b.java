package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {
    public final WeakReference a;
    public final String b;
    public final String c;
    public final String d = "old_view_system";

    public b(View view, String str, String str2) {
        this.a = new WeakReference(view);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.config.a.f(this.b, bVar.b) && io.sentry.config.a.f(this.c, bVar.c) && io.sentry.config.a.f(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, null});
    }
}
