package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import defpackage.C3690f1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class e {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;
    public final Rect e;
    public ArrayList f;

    public e(int i, int i2, float f, e eVar, boolean z, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = rect;
    }

    public final float a() {
        return this.c;
    }

    public final void b(ArrayList arrayList) {
        this.f = arrayList;
    }

    public final void c(C3690f1 c3690f1) {
        ArrayList arrayList;
        if (!((Boolean) c3690f1.invoke(this)).booleanValue() || (arrayList = this.f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(c3690f1);
        }
    }
}
