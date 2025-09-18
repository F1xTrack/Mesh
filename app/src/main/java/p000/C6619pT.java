package p000;

import com.p019vk.push.core.filedatastore.FileDataSource;

/* renamed from: pT */
/* loaded from: classes2.dex */
public final class C6619pT extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f40090a;

    /* renamed from: b */
    public final /* synthetic */ FileDataSource f40091b;

    /* renamed from: c */
    public int f40092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6619pT(FileDataSource fileDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f40091b = fileDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f40090a = obj;
        this.f40092c |= Integer.MIN_VALUE;
        Object objM26671getDataIoAF18A = this.f40091b.m26671getDataIoAF18A(this);
        return objM26671getDataIoAF18A == EnumC0817Mz.f7418a ? objM26671getDataIoAF18A : new PS0(objM26671getDataIoAF18A);
    }
}
