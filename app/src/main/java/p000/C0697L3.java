package p000;

import java.io.Serializable;

/* renamed from: L3 */
/* loaded from: classes2.dex */
public class C0697L3 implements Serializable {

    /* renamed from: b */
    public static final C0697L3 f6474b = new C0697L3(LocalNotification.Importance.NONE);

    /* renamed from: a */
    public final String f6475a;

    public C0697L3(String str) {
        this.f6475a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0697L3) {
            if (this.f6475a.equals(((C0697L3) obj).f6475a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6475a.hashCode();
    }

    public final String toString() {
        return this.f6475a;
    }
}
