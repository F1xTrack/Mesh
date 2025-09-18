package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import p000.F91;
import p000.O90;

/* renamed from: io.sentry.android.replay.util.c */
/* loaded from: classes2.dex */
public final class C5964c {

    /* renamed from: a */
    public final Color f34039a;

    /* renamed from: b */
    public final boolean f34040b;

    public C5964c(Color color, boolean z) {
        this.f34039a = color;
        this.f34040b = z;
    }

    /* renamed from: a */
    public final Color m21681a() {
        return this.f34039a;
    }

    /* renamed from: b */
    public final boolean m21682b() {
        return this.f34040b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5964c)) {
            return false;
        }
        C5964c c5964c = (C5964c) obj;
        return O90.m5963a(this.f34039a, c5964c.f34039a) && this.f34040b == c5964c.f34040b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Color color = this.f34039a;
        int i = (color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31;
        boolean z = this.f34040b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes(color=");
        sb.append(this.f34039a);
        sb.append(", hasFillModifier=");
        return F91.m2540w(sb, this.f34040b, ')');
    }
}
