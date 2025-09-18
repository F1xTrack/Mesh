package io.sentry.android.replay.capture;

import defpackage.O90;
import io.sentry.C5185y;
import io.sentry.E;
import io.sentry.F1;
import io.sentry.J0;

/* loaded from: classes2.dex */
public final class i extends k {
    public final F1 a;
    public final J0 b;

    public i(F1 f1, J0 j0) {
        this.a = f1;
        this.b = j0;
    }

    public static void a(i iVar, E e) {
        C5185y c5185y = new C5185y();
        iVar.getClass();
        if (e != null) {
            c5185y.f = iVar.b;
            e.z(iVar.a, c5185y);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return O90.a(this.a, iVar.a) && O90.a(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
