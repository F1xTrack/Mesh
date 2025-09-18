package p000;

import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.p019vk.push.core.filedatastore.JsonSerializer;

/* renamed from: Gc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7630Gc0 extends AbstractC1571Yy {

    /* renamed from: a */
    public JsonSerializableFileDataStoreImpl f3817a;

    /* renamed from: b */
    public JsonSerializer f3818b;

    /* renamed from: c */
    public JsonSerializableFileDataStoreImpl f3819c;

    /* renamed from: d */
    public /* synthetic */ Object f3820d;

    /* renamed from: e */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f3821e;

    /* renamed from: f */
    public int f3822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7630Gc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f3821e = jsonSerializableFileDataStoreImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3820d = obj;
        this.f3822f |= Integer.MIN_VALUE;
        Object objM26674access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m26674access$writeUnsafegIAlus(this.f3821e, null, this);
        return objM26674access$writeUnsafegIAlus == EnumC0817Mz.f7418a ? objM26674access$writeUnsafegIAlus : new PS0(objM26674access$writeUnsafegIAlus);
    }
}
