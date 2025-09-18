package p000;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class XY0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f13846a;

    /* renamed from: b */
    public final /* synthetic */ String f13847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XY0(String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f13847b = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new XY0(this.f13847b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((XY0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f13846a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C0221DV c0221dv = C0221DV.f2022a;
            this.f13846a = 1;
            obj = c0221dv.m1707b(this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        Collection<C6220jA> collectionValues = ((Map) obj).values();
        String str = this.f13847b;
        for (C6220jA c6220jA : collectionValues) {
            C10025kZ0 c10025kZ0 = new C10025kZ0(str);
            c6220jA.getClass();
            Objects.toString(c10025kZ0);
            C8539Xo1 c8539Xo1 = c6220jA.f34954b;
            synchronized (c8539Xo1) {
                if (!Objects.equals((String) c8539Xo1.f13983d, str)) {
                    C0471HT c0471ht = (C0471HT) c8539Xo1.f13981b;
                    String str2 = (String) c8539Xo1.f13982c;
                    if (str2 != null) {
                        try {
                            c0471ht.m3450j(str2, "aqs.".concat(str)).createNewFile();
                        } catch (IOException unused) {
                        }
                    }
                    c8539Xo1.f13983d = str;
                }
            }
            EnumC9897jZ0.f35235a.toString();
        }
        return C8313Tf1.f11463a;
    }
}
