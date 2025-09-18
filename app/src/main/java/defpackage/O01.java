package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class O01 implements InterfaceC4213hl {
    public final String a;

    public O01(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.InterfaceC4213hl
    public final boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    @Override // defpackage.InterfaceC4213hl
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O01) {
            return this.a.equals(((O01) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
