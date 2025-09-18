package defpackage;

import android.view.View;

/* renamed from: yb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8204yb1 {
    public final int a;
    public final View b;

    public C8204yb1(int i, View view) {
        this.a = i;
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C8204yb1) && ((C8204yb1) obj).a == this.a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }
}
