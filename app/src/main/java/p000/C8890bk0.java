package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8890bk0 implements InterfaceC9305ex0 {

    /* renamed from: a */
    public final AtomicBoolean f17127a = new AtomicBoolean(true);

    /* renamed from: b */
    public final InterfaceC9049cx0 f17128b;

    /* renamed from: c */
    public final Executor f17129c;

    public C8890bk0(Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        this.f17129c = executor;
        this.f17128b = interfaceC9049cx0;
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public final void mo505r0(Object obj) {
        this.f17129c.execute(new RunnableC1096RQ(this, 16, (C9018ck0) obj));
    }
}
