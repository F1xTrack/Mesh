package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C4027f1;

/* renamed from: io.sentry.android.replay.viewhierarchy.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5974e {

    /* renamed from: a */
    public final int f34060a;

    /* renamed from: b */
    public final int f34061b;

    /* renamed from: c */
    public final float f34062c;

    /* renamed from: d */
    public final boolean f34063d;

    /* renamed from: e */
    public final Rect f34064e;

    /* renamed from: f */
    public ArrayList f34065f;

    public AbstractC5974e(int i, int i2, float f, AbstractC5974e abstractC5974e, boolean z, Rect rect) {
        this.f34060a = i;
        this.f34061b = i2;
        this.f34062c = f;
        this.f34063d = z;
        this.f34064e = rect;
    }

    /* renamed from: a */
    public final float m21688a() {
        return this.f34062c;
    }

    /* renamed from: b */
    public final void m21689b(ArrayList arrayList) {
        this.f34065f = arrayList;
    }

    /* renamed from: c */
    public final void m21690c(C4027f1 c4027f1) {
        ArrayList arrayList;
        if (!((Boolean) c4027f1.invoke(this)).booleanValue() || (arrayList = this.f34065f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5974e) it.next()).m21690c(c4027f1);
        }
    }
}
