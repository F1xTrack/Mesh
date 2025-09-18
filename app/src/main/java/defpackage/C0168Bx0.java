package defpackage;

import android.content.Intent;

/* renamed from: Bx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0168Bx0 {
    public final int a;
    public final int b;
    public final Intent c;

    public C0168Bx0(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0168Bx0)) {
            return false;
        }
        C0168Bx0 c0168Bx0 = (C0168Bx0) obj;
        return this.a == c0168Bx0.a && this.b == c0168Bx0.b && O90.a(this.c, c0168Bx0.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Intent intent = this.c;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "OnActivityResultPayload(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ")";
    }
}
