package defpackage;

import android.net.Uri;
import java.util.LinkedList;

/* renamed from: ft0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3856ft0 implements InterfaceC4213hl {
    public final LinkedList a;

    public C3856ft0(LinkedList linkedList) {
        this.a = linkedList;
    }

    @Override // defpackage.InterfaceC4213hl
    public final boolean a(Uri uri) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.a;
            if (i >= linkedList.size()) {
                return false;
            }
            if (((InterfaceC4213hl) linkedList.get(i)).a(uri)) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC4213hl
    public final String b() {
        return ((InterfaceC4213hl) this.a.get(0)).b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3856ft0) {
            return this.a.equals(((C3856ft0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiCacheKey:" + this.a.toString();
    }
}
