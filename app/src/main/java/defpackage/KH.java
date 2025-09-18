package defpackage;

import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* loaded from: classes2.dex */
public final class KH extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ DeletePushTokenIfNoHostsWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KH(DeletePushTokenIfNoHostsWorker deletePushTokenIfNoHostsWorker, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = deletePushTokenIfNoHostsWorker;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
