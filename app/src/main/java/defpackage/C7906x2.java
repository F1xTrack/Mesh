package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7906x2 extends WeakReference {
    public final IO a;
    public final boolean b;
    public InterfaceC5506kS0 c;

    public C7906x2(IO io2, JO jo, ReferenceQueue referenceQueue) {
        super(jo, referenceQueue);
        IL1.d(io2, "Argument must not be null");
        this.a = io2;
        boolean z = jo.a;
        this.c = null;
        this.b = z;
    }
}
