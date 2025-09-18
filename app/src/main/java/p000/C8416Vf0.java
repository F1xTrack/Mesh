package p000;

/* renamed from: Vf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8416Vf0 {

    /* renamed from: a */
    public boolean f12684a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8416Vf0)) {
            return false;
        }
        C8416Vf0 c8416Vf0 = (C8416Vf0) obj;
        c8416Vf0.getClass();
        return this.f12684a == c8416Vf0.f12684a;
    }

    public final int hashCode() {
        return 216256 + (this.f12684a ? 1231 : 1237);
    }

    public final String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=7, deferredInsetTypes=8, dispatchMode=1, hasTranslucentNavigationBar=" + this.f12684a + ")";
    }
}
