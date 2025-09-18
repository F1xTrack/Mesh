package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;

/* renamed from: pT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6463pT extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ FileDataSource b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6463pT(FileDataSource fileDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = fileDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM77getDataIoAF18A = this.b.m77getDataIoAF18A(this);
        return objM77getDataIoAF18A == EnumC1030Mz.a ? objM77getDataIoAF18A : new PS0(objM77getDataIoAF18A);
    }
}
