package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* renamed from: mJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5860mJ extends AbstractC1963Yy {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DeviceIdRepositoryImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5860mJ(DeviceIdRepositoryImpl deviceIdRepositoryImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = deviceIdRepositoryImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$generateDeviceId(this.c, this);
    }
}
