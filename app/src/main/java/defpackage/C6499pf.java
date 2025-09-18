package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6499pf {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C6499pf.class, "notCompletedCount$volatile");
    public final InterfaceC5472kH[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C6499pf(InterfaceC5472kH[] interfaceC5472kHArr) {
        this.a = interfaceC5472kHArr;
        this.notCompletedCount$volatile = interfaceC5472kHArr.length;
    }
}
