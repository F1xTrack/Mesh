package p000;

import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;

/* renamed from: Ec0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7526Ec0 extends AbstractC1571Yy {

    /* renamed from: a */
    public JsonSerializableFileDataStoreImpl f2801a;

    /* renamed from: b */
    public JsonSerializableFileDataStoreImpl f2802b;

    /* renamed from: c */
    public /* synthetic */ Object f2803c;

    /* renamed from: d */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f2804d;

    /* renamed from: e */
    public int f2805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7526Ec0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f2804d = jsonSerializableFileDataStoreImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2803c = obj;
        this.f2805e |= Integer.MIN_VALUE;
        Object objM26673access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m26673access$readUnsafeIoAF18A(this.f2804d, this);
        return objM26673access$readUnsafeIoAF18A == EnumC0817Mz.f7418a ? objM26673access$readUnsafeIoAF18A : new PS0(objM26673access$readUnsafeIoAF18A);
    }
}
