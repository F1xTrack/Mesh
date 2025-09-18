package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wO */
/* loaded from: classes.dex */
public final class C7072wO {

    /* renamed from: a */
    public final ArrayList f44846a;

    public C7072wO(int i) {
        switch (i) {
            case 1:
                this.f44846a = new ArrayList();
                break;
            default:
                this.f44846a = new ArrayList();
                break;
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC11800yS0 m25611a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1210TE.f11214i;
        }
        Iterator it = this.f44846a.iterator();
        while (it.hasNext()) {
            C9520gc1 c9520gc1 = (C9520gc1) it.next();
            if (c9520gc1.f27881a.isAssignableFrom(cls) && cls2.isAssignableFrom(c9520gc1.f27882b)) {
                return c9520gc1.f27883c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized ArrayList m25612b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f44846a.iterator();
        while (it.hasNext()) {
            C9520gc1 c9520gc1 = (C9520gc1) it.next();
            if ((c9520gc1.f27881a.isAssignableFrom(cls) && cls2.isAssignableFrom(c9520gc1.f27882b)) && !arrayList.contains(c9520gc1.f27882b)) {
                arrayList.add(c9520gc1.f27882b);
            }
        }
        return arrayList;
    }
}
