package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.jvm.functions.Function2;

/* renamed from: Fc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0417Fc0 extends AbstractC4286i71 implements Function2 {
    public InterfaceC0935Lt0 a;
    public JsonSerializableFileDataStoreImpl b;
    public JsonSerializer c;
    public int d;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl e;
    public final /* synthetic */ JsonSerializer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417Fc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, JsonSerializer jsonSerializer, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.e = jsonSerializableFileDataStoreImpl;
        this.f = jsonSerializer;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0417Fc0(this.e, this.f, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0417Fc0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [Lt0] */
    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl;
        JsonSerializer jsonSerializer;
        C1091Nt0 c1091Nt0;
        InterfaceC0935Lt0 interfaceC0935Lt0;
        Throwable th;
        Object obj2;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.d;
        try {
            if (i == 0) {
                RQ1.d(obj);
                jsonSerializableFileDataStoreImpl = this.e;
                InterfaceC0935Lt0 interfaceC0935Lt02 = jsonSerializableFileDataStoreImpl.h;
                this.a = interfaceC0935Lt02;
                this.b = jsonSerializableFileDataStoreImpl;
                jsonSerializer = this.f;
                this.c = jsonSerializer;
                this.d = 1;
                c1091Nt0 = (C1091Nt0) interfaceC0935Lt02;
                if (c1091Nt0.d(this) == enumC1030Mz) {
                    return enumC1030Mz;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0935Lt0 = this.a;
                    try {
                        RQ1.d(obj);
                        obj2 = ((PS0) obj).a;
                        Boolean boolValueOf = Boolean.valueOf(!(obj2 instanceof OS0));
                        ((C1091Nt0) interfaceC0935Lt0).e(null);
                        return boolValueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        ((C1091Nt0) interfaceC0935Lt0).e(null);
                        throw th;
                    }
                }
                jsonSerializer = this.c;
                jsonSerializableFileDataStoreImpl = this.b;
                ?? r6 = this.a;
                RQ1.d(obj);
                c1091Nt0 = r6;
            }
            if (jsonSerializableFileDataStoreImpl.e) {
                jsonSerializableFileDataStoreImpl.i = jsonSerializer;
            }
            this.a = c1091Nt0;
            this.b = null;
            this.c = null;
            this.d = 2;
            Object objM80access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m80access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
            if (objM80access$writeUnsafegIAlus == enumC1030Mz) {
                return enumC1030Mz;
            }
            interfaceC0935Lt0 = c1091Nt0;
            obj2 = objM80access$writeUnsafegIAlus;
            Boolean boolValueOf2 = Boolean.valueOf(!(obj2 instanceof OS0));
            ((C1091Nt0) interfaceC0935Lt0).e(null);
            return boolValueOf2;
        } catch (Throwable th3) {
            interfaceC0935Lt0 = c1091Nt0;
            th = th3;
            ((C1091Nt0) interfaceC0935Lt0).e(null);
            throw th;
        }
    }
}
