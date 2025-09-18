package p000;

import android.content.Intent;

/* renamed from: Bx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7412Bx0 {

    /* renamed from: a */
    public final int f1098a;

    /* renamed from: b */
    public final int f1099b;

    /* renamed from: c */
    public final Intent f1100c;

    public C7412Bx0(int i, int i2, Intent intent) {
        this.f1098a = i;
        this.f1099b = i2;
        this.f1100c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7412Bx0)) {
            return false;
        }
        C7412Bx0 c7412Bx0 = (C7412Bx0) obj;
        return this.f1098a == c7412Bx0.f1098a && this.f1099b == c7412Bx0.f1099b && O90.m5963a(this.f1100c, c7412Bx0.f1100c);
    }

    public final int hashCode() {
        int i = ((this.f1098a * 31) + this.f1099b) * 31;
        Intent intent = this.f1100c;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "OnActivityResultPayload(requestCode=" + this.f1098a + ", resultCode=" + this.f1099b + ", data=" + this.f1100c + ")";
    }
}
