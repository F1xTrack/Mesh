package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class XY0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XY0(String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new XY0(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((XY0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            DV dv = DV.a;
            this.a = 1;
            obj = dv.b(this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        Collection<C5260jA> collectionValues = ((Map) obj).values();
        String str = this.b;
        for (C5260jA c5260jA : collectionValues) {
            C5527kZ0 c5527kZ0 = new C5527kZ0(str);
            c5260jA.getClass();
            Objects.toString(c5527kZ0);
            C1857Xo1 c1857Xo1 = c5260jA.b;
            synchronized (c1857Xo1) {
                if (!Objects.equals((String) c1857Xo1.d, str)) {
                    HT ht = (HT) c1857Xo1.b;
                    String str2 = (String) c1857Xo1.c;
                    if (str2 != null) {
                        try {
                            ht.j(str2, "aqs.".concat(str)).createNewFile();
                        } catch (IOException unused) {
                        }
                    }
                    c1857Xo1.d = str;
                }
            }
            EnumC5336jZ0.a.toString();
        }
        return C1518Tf1.a;
    }
}
