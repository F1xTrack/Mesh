package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* renamed from: oJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6242oJ extends AbstractC1963Yy {
    public DeviceIdRepositoryImpl a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ DeviceIdRepositoryImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6242oJ(DeviceIdRepositoryImpl deviceIdRepositoryImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = deviceIdRepositoryImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$saveToLocal(this.d, null, this);
    }
}
