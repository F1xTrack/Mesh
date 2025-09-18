package defpackage;

import com.vk.push.common.messaging.RemoteMessage;

/* renamed from: qu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6737qu1 extends AbstractC1963Yy {
    public C8071xu1 a;
    public RemoteMessage b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C8071xu1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6737qu1(C8071xu1 c8071xu1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c8071xu1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
