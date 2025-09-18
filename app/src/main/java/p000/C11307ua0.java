package p000;

import java.io.Serializable;

/* renamed from: ua0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11307ua0 implements Serializable {

    /* renamed from: a */
    public final String f43754a;

    public C11307ua0(String str) {
        this.f43754a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11307ua0) {
            if (this.f43754a.equalsIgnoreCase(((C11307ua0) obj).f43754a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43754a.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.f43754a;
    }
}
