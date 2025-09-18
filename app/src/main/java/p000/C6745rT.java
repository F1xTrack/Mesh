package p000;

import com.p019vk.push.core.filedatastore.FileDataSource;

/* renamed from: rT */
/* loaded from: classes2.dex */
public final class C6745rT extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f41669a;

    /* renamed from: b */
    public final /* synthetic */ FileDataSource f41670b;

    /* renamed from: c */
    public int f41671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6745rT(FileDataSource fileDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f41670b = fileDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41669a = obj;
        this.f41671c |= Integer.MIN_VALUE;
        Object objM26672setDatagIAlus = this.f41670b.m26672setDatagIAlus(null, this);
        return objM26672setDatagIAlus == EnumC0817Mz.f7418a ? objM26672setDatagIAlus : new PS0(objM26672setDatagIAlus);
    }
}
