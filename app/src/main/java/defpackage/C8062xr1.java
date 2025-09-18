package defpackage;

import com.vk.push.common.AppInfo;

/* renamed from: xr1 */
/* loaded from: classes2.dex */
public final class C8062xr1 extends AbstractC1963Yy {
    public Object a;
    public Object b;
    public Object c;
    public AppInfo d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1320Qr1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8062xr1(C1320Qr1 c1320Qr1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = c1320Qr1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(this);
    }
}
