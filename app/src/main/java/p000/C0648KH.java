package p000;

import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* renamed from: KH */
/* loaded from: classes2.dex */
public final class C0648KH extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f5978a;

    /* renamed from: b */
    public final /* synthetic */ DeletePushTokenIfNoHostsWorker f5979b;

    /* renamed from: c */
    public int f5980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648KH(DeletePushTokenIfNoHostsWorker deletePushTokenIfNoHostsWorker, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f5979b = deletePushTokenIfNoHostsWorker;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f5978a = obj;
        this.f5980c |= Integer.MIN_VALUE;
        return this.f5979b.mo10322a(this);
    }
}
