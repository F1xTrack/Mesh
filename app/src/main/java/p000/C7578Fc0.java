package p000;

import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.p019vk.push.core.filedatastore.JsonSerializer;
import kotlin.jvm.functions.Function2;

/* renamed from: Fc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7578Fc0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public InterfaceC7924Lt0 f3326a;

    /* renamed from: b */
    public JsonSerializableFileDataStoreImpl f3327b;

    /* renamed from: c */
    public JsonSerializer f3328c;

    /* renamed from: d */
    public int f3329d;

    /* renamed from: e */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f3330e;

    /* renamed from: f */
    public final /* synthetic */ JsonSerializer f3331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7578Fc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, JsonSerializer jsonSerializer, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f3330e = jsonSerializableFileDataStoreImpl;
        this.f3331f = jsonSerializer;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7578Fc0(this.f3330e, this.f3331f, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7578Fc0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [Lt0] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl;
        JsonSerializer jsonSerializer;
        C8028Nt0 c8028Nt0;
        InterfaceC7924Lt0 interfaceC7924Lt0;
        Throwable th;
        Object obj2;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f3329d;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                jsonSerializableFileDataStoreImpl = this.f3330e;
                InterfaceC7924Lt0 interfaceC7924Lt02 = jsonSerializableFileDataStoreImpl.f20420h;
                this.f3326a = interfaceC7924Lt02;
                this.f3327b = jsonSerializableFileDataStoreImpl;
                jsonSerializer = this.f3331f;
                this.f3328c = jsonSerializer;
                this.f3329d = 1;
                c8028Nt0 = (C8028Nt0) interfaceC7924Lt02;
                if (c8028Nt0.m5899d(this) == enumC0817Mz) {
                    return enumC0817Mz;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7924Lt0 = this.f3326a;
                    try {
                        RQ1.m7017d(obj);
                        obj2 = ((PS0) obj).f9075a;
                        Boolean boolValueOf = Boolean.valueOf(!(obj2 instanceof OS0));
                        ((C8028Nt0) interfaceC7924Lt0).m5900e(null);
                        return boolValueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        ((C8028Nt0) interfaceC7924Lt0).m5900e(null);
                        throw th;
                    }
                }
                jsonSerializer = this.f3328c;
                jsonSerializableFileDataStoreImpl = this.f3327b;
                ?? r6 = this.f3326a;
                RQ1.m7017d(obj);
                c8028Nt0 = r6;
            }
            if (jsonSerializableFileDataStoreImpl.f20417e) {
                jsonSerializableFileDataStoreImpl.f20421i = jsonSerializer;
            }
            this.f3326a = c8028Nt0;
            this.f3327b = null;
            this.f3328c = null;
            this.f3329d = 2;
            Object objM26674access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m26674access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
            if (objM26674access$writeUnsafegIAlus == enumC0817Mz) {
                return enumC0817Mz;
            }
            interfaceC7924Lt0 = c8028Nt0;
            obj2 = objM26674access$writeUnsafegIAlus;
            Boolean boolValueOf2 = Boolean.valueOf(!(obj2 instanceof OS0));
            ((C8028Nt0) interfaceC7924Lt0).m5900e(null);
            return boolValueOf2;
        } catch (Throwable th3) {
            interfaceC7924Lt0 = c8028Nt0;
            th = th3;
            ((C8028Nt0) interfaceC7924Lt0).m5900e(null);
            throw th;
        }
    }
}
