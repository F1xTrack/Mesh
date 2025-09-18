package p000;

import android.net.Uri;
import java.util.LinkedList;

/* renamed from: ft0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9425ft0 implements InterfaceC4199hl {

    /* renamed from: a */
    public final LinkedList f27445a;

    public C9425ft0(LinkedList linkedList) {
        this.f27445a = linkedList;
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: a */
    public final boolean mo5924a(Uri uri) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.f27445a;
            if (i >= linkedList.size()) {
                return false;
            }
            if (((InterfaceC4199hl) linkedList.get(i)).mo5924a(uri)) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: b */
    public final String mo5925b() {
        return ((InterfaceC4199hl) this.f27445a.get(0)).mo5925b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9425ft0) {
            return this.f27445a.equals(((C9425ft0) obj).f27445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27445a.hashCode();
    }

    public final String toString() {
        return "MultiCacheKey:" + this.f27445a.toString();
    }
}
