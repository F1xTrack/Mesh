package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;

/* renamed from: Ec0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0339Ec0 extends AbstractC1963Yy {
    public JsonSerializableFileDataStoreImpl a;
    public JsonSerializableFileDataStoreImpl b;
    public /* synthetic */ Object c;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339Ec0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objM79access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m79access$readUnsafeIoAF18A(this.d, this);
        return objM79access$readUnsafeIoAF18A == EnumC1030Mz.a ? objM79access$readUnsafeIoAF18A : new PS0(objM79access$readUnsafeIoAF18A);
    }
}
