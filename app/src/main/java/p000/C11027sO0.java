package p000;

import android.database.Observable;

/* renamed from: sO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11027sO0 extends Observable {
    /* renamed from: a */
    public final boolean m24729a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m24730b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC11155tO0) ((Observable) this).mObservers.get(size)).mo3399a();
        }
    }

    /* renamed from: c */
    public final void m24731c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC11155tO0) ((Observable) this).mObservers.get(size)).mo3400b(i);
        }
    }

    /* renamed from: d */
    public final void m24732d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC11155tO0) ((Observable) this).mObservers.get(size)).mo3401c(i, i2);
        }
    }
}
