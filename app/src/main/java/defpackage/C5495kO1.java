package defpackage;

import android.database.ContentObserver;

/* renamed from: kO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5495kO1 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        WO1.i.incrementAndGet();
    }
}
