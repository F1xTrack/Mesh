package p000;

import android.view.View;

/* renamed from: yb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11819yb1 {

    /* renamed from: a */
    public final int f46332a;

    /* renamed from: b */
    public final View f46333b;

    public C11819yb1(int i, View view) {
        this.f46332a = i;
        this.f46333b = view;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C11819yb1) && ((C11819yb1) obj).f46332a == this.f46332a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f46332a).hashCode();
    }
}
