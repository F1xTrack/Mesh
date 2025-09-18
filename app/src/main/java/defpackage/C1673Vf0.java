package defpackage;

/* renamed from: Vf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1673Vf0 {
    public boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673Vf0)) {
            return false;
        }
        C1673Vf0 c1673Vf0 = (C1673Vf0) obj;
        c1673Vf0.getClass();
        return this.a == c1673Vf0.a;
    }

    public final int hashCode() {
        return 216256 + (this.a ? 1231 : 1237);
    }

    public final String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=7, deferredInsetTypes=8, dispatchMode=1, hasTranslucentNavigationBar=" + this.a + ")";
    }
}
