package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: pf */
/* loaded from: classes2.dex */
public final class C6631pf {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40263b = AtomicIntegerFieldUpdater.newUpdater(C6631pf.class, "notCompletedCount$volatile");

    /* renamed from: a */
    public final InterfaceC6290kH[] f40264a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C6631pf(InterfaceC6290kH[] interfaceC6290kHArr) {
        this.f40264a = interfaceC6290kHArr;
        this.notCompletedCount$volatile = interfaceC6290kHArr.length;
    }
}
