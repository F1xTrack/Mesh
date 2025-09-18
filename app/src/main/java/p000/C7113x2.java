package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: x2 */
/* loaded from: classes.dex */
public final class C7113x2 extends WeakReference {

    /* renamed from: a */
    public final C0529IO f45277a;

    /* renamed from: b */
    public final boolean f45278b;

    /* renamed from: c */
    public InterfaceC10011kS0 f45279c;

    public C7113x2(C0529IO c0529io, C0592JO c0592jo, ReferenceQueue referenceQueue) {
        super(c0592jo, referenceQueue);
        IL1.m3830d(c0529io, "Argument must not be null");
        this.f45277a = c0529io;
        boolean z = c0592jo.f5502a;
        this.f45279c = null;
        this.f45278b = z;
    }
}
