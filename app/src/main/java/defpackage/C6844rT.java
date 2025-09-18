package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;

/* renamed from: rT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6844rT extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ FileDataSource b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6844rT(FileDataSource fileDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = fileDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM78setDatagIAlus = this.b.m78setDatagIAlus(null, this);
        return objM78setDatagIAlus == EnumC1030Mz.a ? objM78setDatagIAlus : new PS0(objM78setDatagIAlus);
    }
}
