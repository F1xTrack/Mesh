package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;

/* renamed from: Gc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0495Gc0 extends AbstractC1963Yy {
    public JsonSerializableFileDataStoreImpl a;
    public JsonSerializer b;
    public JsonSerializableFileDataStoreImpl c;
    public /* synthetic */ Object d;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495Gc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.e = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objM80access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m80access$writeUnsafegIAlus(this.e, null, this);
        return objM80access$writeUnsafegIAlus == EnumC1030Mz.a ? objM80access$writeUnsafegIAlus : new PS0(objM80access$writeUnsafegIAlus);
    }
}
