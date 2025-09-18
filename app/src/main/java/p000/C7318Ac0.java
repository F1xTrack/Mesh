package p000;

import com.p019vk.push.core.filedatastore.FileDataSource;
import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Ac0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7318Ac0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public InterfaceC7924Lt0 f280a;

    /* renamed from: b */
    public JsonSerializableFileDataStoreImpl f281b;

    /* renamed from: c */
    public int f282c;

    /* renamed from: d */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7318Ac0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f283d = jsonSerializableFileDataStoreImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7318Ac0(this.f283d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7318Ac0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [Lt0] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl;
        C8028Nt0 c8028Nt0;
        InterfaceC7924Lt0 interfaceC7924Lt0;
        Throwable th;
        Object obj2;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f282c;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                jsonSerializableFileDataStoreImpl = this.f283d;
                InterfaceC7924Lt0 interfaceC7924Lt02 = jsonSerializableFileDataStoreImpl.f20420h;
                this.f280a = interfaceC7924Lt02;
                this.f281b = jsonSerializableFileDataStoreImpl;
                this.f282c = 1;
                c8028Nt0 = (C8028Nt0) interfaceC7924Lt02;
                if (c8028Nt0.m5899d(this) == enumC0817Mz) {
                    return enumC0817Mz;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7924Lt0 = this.f280a;
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
                jsonSerializableFileDataStoreImpl = this.f281b;
                ?? r5 = this.f280a;
                RQ1.m7017d(obj);
                c8028Nt0 = r5;
            }
            jsonSerializableFileDataStoreImpl.f20421i = null;
            FileDataSource fileDataSourceAccess$getFileDataSource = JsonSerializableFileDataStoreImpl.access$getFileDataSource(jsonSerializableFileDataStoreImpl);
            String str = new String();
            this.f280a = c8028Nt0;
            this.f281b = null;
            this.f282c = 2;
            Object objM26672setDatagIAlus = fileDataSourceAccess$getFileDataSource.m26672setDatagIAlus(str, this);
            if (objM26672setDatagIAlus == enumC0817Mz) {
                return enumC0817Mz;
            }
            interfaceC7924Lt0 = c8028Nt0;
            obj2 = objM26672setDatagIAlus;
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
