package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Ac0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0027Ac0 extends AbstractC4286i71 implements Function2 {
    public InterfaceC0935Lt0 a;
    public JsonSerializableFileDataStoreImpl b;
    public int c;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027Ac0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0027Ac0(this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0027Ac0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [Lt0] */
    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl;
        C1091Nt0 c1091Nt0;
        InterfaceC0935Lt0 interfaceC0935Lt0;
        Throwable th;
        Object obj2;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.c;
        try {
            if (i == 0) {
                RQ1.d(obj);
                jsonSerializableFileDataStoreImpl = this.d;
                InterfaceC0935Lt0 interfaceC0935Lt02 = jsonSerializableFileDataStoreImpl.h;
                this.a = interfaceC0935Lt02;
                this.b = jsonSerializableFileDataStoreImpl;
                this.c = 1;
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
                jsonSerializableFileDataStoreImpl = this.b;
                ?? r5 = this.a;
                RQ1.d(obj);
                c1091Nt0 = r5;
            }
            jsonSerializableFileDataStoreImpl.i = null;
            FileDataSource fileDataSourceAccess$getFileDataSource = JsonSerializableFileDataStoreImpl.access$getFileDataSource(jsonSerializableFileDataStoreImpl);
            String str = new String();
            this.a = c1091Nt0;
            this.b = null;
            this.c = 2;
            Object objM78setDatagIAlus = fileDataSourceAccess$getFileDataSource.m78setDatagIAlus(str, this);
            if (objM78setDatagIAlus == enumC1030Mz) {
                return enumC1030Mz;
            }
            interfaceC0935Lt0 = c1091Nt0;
            obj2 = objM78setDatagIAlus;
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
