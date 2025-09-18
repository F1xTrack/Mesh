package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: ha0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9643ha0 implements InterfaceC7290zr {

    /* renamed from: b */
    public static final C9643ha0 f28465b = new C9643ha0(0);

    /* renamed from: c */
    public static final C9643ha0 f28466c = new C9643ha0(1);

    /* renamed from: a */
    public final /* synthetic */ int f28467a;

    public /* synthetic */ C9643ha0(int i) {
        this.f28467a = i;
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: a */
    public final boolean mo7727a(C9261eb0 c9261eb0) {
        X01 x01M5741y;
        switch (this.f28467a) {
            case 0:
                C8473Wh1 c8473Wh1 = (C8473Wh1) c9261eb0.mo1221f0().get(1);
                C4049fN c4049fN = RP0.f10161d;
                O90.m5965c(c8473Wh1);
                InterfaceC7402Bs0 interfaceC7402Bs0M25157j = AbstractC6940uI.m25157j(c8473Wh1);
                c4049fN.getClass();
                InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0M25157j, AbstractC10604p41.f39790Q);
                if (interfaceC6976usM17465b == null) {
                    x01M5741y = null;
                } else {
                    C7789Jd1.f5652b.getClass();
                    C7789Jd1 c7789Jd1 = C7789Jd1.f5653c;
                    List parameters = interfaceC6976usM17465b.mo1439v().getParameters();
                    O90.m5967e(parameters, "getParameters(...)");
                    Object objM25972R = AbstractC7167xu.m25972R(parameters);
                    O90.m5967e(objM25972R, "single(...)");
                    x01M5741y = NV1.m5741y(c7789Jd1, interfaceC6976usM17465b, AbstractC7230yu.m26274e(new C10988s41((InterfaceC10292me1) objM25972R)));
                }
                if (x01M5741y == null) {
                    return false;
                }
                AbstractC7742Ig0 type = c8473Wh1.getType();
                O90.m5967e(type, "getType(...)");
                return InterfaceC7846Kg0.f6251a.m25726b(x01M5741y, AbstractC7375Be1.m789g(type, false));
            default:
                List listMo1221f0 = c9261eb0.mo1221f0();
                O90.m5967e(listMo1221f0, "getValueParameters(...)");
                List<C8473Wh1> list = listMo1221f0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                for (C8473Wh1 c8473Wh12 : list) {
                    O90.m5965c(c8473Wh12);
                    if (AbstractC6940uI.m25148a(c8473Wh12) || c8473Wh12.f13327k != null) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: b */
    public final String mo10456b(C9261eb0 c9261eb0) {
        switch (this.f28467a) {
        }
        return KS1.m4645a(this, c9261eb0);
    }

    @Override // p000.InterfaceC7290zr
    public final String getDescription() {
        switch (this.f28467a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
