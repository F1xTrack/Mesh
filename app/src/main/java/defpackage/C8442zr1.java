package defpackage;

import com.vk.push.common.AppInfo;

/* renamed from: zr1 */
/* loaded from: classes2.dex */
public final class C8442zr1 extends AbstractC1963Yy {
    public C1320Qr1 a;
    public AppInfo b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1320Qr1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8442zr1(C1320Qr1 c1320Qr1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c1320Qr1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, false, this);
    }
}
