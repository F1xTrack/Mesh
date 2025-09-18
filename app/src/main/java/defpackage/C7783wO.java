package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wO */
/* loaded from: classes.dex */
public final class C7783wO {
    public final ArrayList a;

    public C7783wO(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public synchronized InterfaceC8176yS0 a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return TE.i;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C3997gc1 c3997gc1 = (C3997gc1) it.next();
            if (c3997gc1.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c3997gc1.b)) {
                return c3997gc1.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C3997gc1 c3997gc1 = (C3997gc1) it.next();
            if ((c3997gc1.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c3997gc1.b)) && !arrayList.contains(c3997gc1.b)) {
                arrayList.add(c3997gc1.b);
            }
        }
        return arrayList;
    }
}
