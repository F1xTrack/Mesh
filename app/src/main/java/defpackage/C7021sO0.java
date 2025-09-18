package defpackage;

import android.database.Observable;

/* renamed from: sO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7021sO0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC7212tO0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC7212tO0) ((Observable) this).mObservers.get(size)).b(i);
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC7212tO0) ((Observable) this).mObservers.get(size)).c(i, i2);
        }
    }
}
