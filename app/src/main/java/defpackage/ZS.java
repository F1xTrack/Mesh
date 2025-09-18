package defpackage;

import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;

/* loaded from: classes2.dex */
public final class ZS extends AbstractC1963Yy {
    public FileDataSource a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FeatureManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objM76access$saveUpdateIntervalIoAF18A = FeatureManagerImpl.m76access$saveUpdateIntervalIoAF18A(this.c, this);
        return objM76access$saveUpdateIntervalIoAF18A == EnumC1030Mz.a ? objM76access$saveUpdateIntervalIoAF18A : new PS0(objM76access$saveUpdateIntervalIoAF18A);
    }
}
