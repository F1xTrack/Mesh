package p000;

import android.net.Uri;

/* loaded from: classes.dex */
public final class O01 implements InterfaceC4199hl {

    /* renamed from: a */
    public final String f8165a;

    public O01(String str) {
        str.getClass();
        this.f8165a = str;
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: a */
    public final boolean mo5924a(Uri uri) {
        return this.f8165a.contains(uri.toString());
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: b */
    public final String mo5925b() {
        return this.f8165a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O01) {
            return this.f8165a.equals(((O01) obj).f8165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8165a.hashCode();
    }

    public final String toString() {
        return this.f8165a;
    }
}
