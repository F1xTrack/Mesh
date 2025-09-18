package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import defpackage.F91;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class c {
    public final Color a;
    public final boolean b;

    public c(Color color, boolean z) {
        this.a = color;
        this.b = z;
    }

    public final Color a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return O90.a(this.a, cVar.a) && this.b == cVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Color color = this.a;
        int i = (color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes(color=");
        sb.append(this.a);
        sb.append(", hasFillModifier=");
        return F91.w(sb, this.b, ')');
    }
}
