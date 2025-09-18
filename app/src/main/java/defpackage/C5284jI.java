package defpackage;

import android.content.pm.PackageInfo;
import android.graphics.PointF;
import com.vk.push.core.ipc.IpcRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jI */
/* loaded from: classes2.dex */
public final class C5284jI extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public static final C5284jI f = new C5284jI(1, 0);
    public static final C5284jI g = new C5284jI(1, 1);
    public static final C5284jI h = new C5284jI(1, 2);
    public static final C5284jI i = new C5284jI(1, 3);
    public static final C5284jI j = new C5284jI(1, 4);
    public static final C5284jI k = new C5284jI(1, 5);
    public static final C5284jI l = new C5284jI(1, 6);
    public static final C5284jI m = new C5284jI(1, 7);
    public static final C5284jI n = new C5284jI(1, 8);
    public static final C5284jI o = new C5284jI(1, 9);
    public static final C5284jI p = new C5284jI(1, 10);
    public static final C5284jI q = new C5284jI(1, 11);
    public static final C5284jI r = new C5284jI(1, 12);
    public static final C5284jI s = new C5284jI(1, 13);
    public static final C5284jI t = new C5284jI(1, 14);
    public static final C5284jI u = new C5284jI(1, 15);
    public static final C5284jI v = new C5284jI(1, 16);
    public static final C5284jI w = new C5284jI(1, 17);
    public static final C5284jI x = new C5284jI(1, 18);
    public static final C5284jI y = new C5284jI(1, 19);
    public static final C5284jI z = new C5284jI(1, 20);
    public static final C5284jI A = new C5284jI(1, 21);
    public static final C5284jI B = new C5284jI(1, 22);
    public static final C5284jI C = new C5284jI(1, 23);
    public static final C5284jI D = new C5284jI(1, 24);
    public static final C5284jI E = new C5284jI(1, 25);
    public static final C5284jI F = new C5284jI(1, 26);
    public static final C5284jI G = new C5284jI(1, 27);
    public static final C5284jI H = new C5284jI(1, 28);
    public static final C5284jI I = new C5284jI(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5284jI(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        switch (this.e) {
            case 0:
                InterfaceC6239oI interfaceC6239oI = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI, "$this$withOptions");
                C2325bR0 c2325bR0 = EnumC2515cR0.a;
                interfaceC6239oI.l();
                interfaceC6239oI.d(EnumC6048nI.c);
                return c1518Tf1;
            case 1:
                InterfaceC6239oI interfaceC6239oI2 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI2, "$this$withOptions");
                interfaceC6239oI2.j();
                interfaceC6239oI2.d(SN.a);
                interfaceC6239oI2.g(C1243Ps.c);
                interfaceC6239oI2.f();
                interfaceC6239oI2.h(EnumC3340dA0.c);
                interfaceC6239oI2.a();
                interfaceC6239oI2.c();
                interfaceC6239oI2.m();
                interfaceC6239oI2.i();
                return c1518Tf1;
            case 2:
                InterfaceC6239oI interfaceC6239oI3 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI3, "$this$withOptions");
                interfaceC6239oI3.g(C1243Ps.c);
                interfaceC6239oI3.h(EnumC3340dA0.b);
                return c1518Tf1;
            case 3:
                InterfaceC6239oI interfaceC6239oI4 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI4, "$this$withOptions");
                interfaceC6239oI4.e(AbstractC7627vZ0.c(interfaceC6239oI4.k(), AbstractC8259yu.f(AbstractC6390p41.p, AbstractC6390p41.q)));
                return c1518Tf1;
            case 4:
                return "";
            case 5:
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
                O90.f(abstractC0663Ig0, "it");
                return abstractC0663Ig0;
            case 6:
                O90.f((C1758Wh1) obj, "it");
                return "...";
            case 7:
                AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) obj;
                O90.f(abstractC0663Ig02, "it");
                return abstractC0663Ig02;
            case 8:
                CD cd = (CD) obj;
                O90.f(cd, "it");
                return cd.i();
            case 9:
                return ((PackageInfo) obj).packageName;
            case 10:
                O90.f((JJ) obj, "it");
                return c1518Tf1;
            case 11:
                O90.f((JJ) obj, "it");
                return c1518Tf1;
            case 12:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 13:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 14:
                InterfaceC7454uf0 interfaceC7454uf0 = (InterfaceC7454uf0) obj;
                O90.f(interfaceC7454uf0, "it");
                return interfaceC7454uf0.toString();
            case 15:
                Enum r9 = (Enum) obj;
                O90.f(r9, "it");
                return AbstractC8235ym.k("'", r9.name(), "'");
            case 16:
                return ((C1758Wh1) obj).getType();
            case 17:
                O90.f((Throwable) obj, "it");
                throw new IllegalStateException("Error not implemented");
            case 18:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 19:
                O90.f((C0074As) obj, "it");
                return 0;
            case 20:
                return Boolean.TRUE;
            case 21:
                C6485pa0 c6485pa0 = (C6485pa0) obj;
                O90.f(c6485pa0, "it");
                return F91.v(new StringBuilder("'"), c6485pa0.a, '\'');
            case 22:
                R00 r00 = (R00) obj;
                O90.f(r00, "it");
                PointF pointF = T00.l;
                return Boolean.valueOf(NV1.l(r00.f) && !r00.H);
            case 23:
                Throwable th = (Throwable) obj;
                O90.f(th, "it");
                return !(th instanceof CQ0) ? new AQ0(th) : (CQ0) th;
            case 24:
                AbstractC0663Ig0 abstractC0663Ig03 = (AbstractC0663Ig0) obj;
                O90.f(abstractC0663Ig03, "it");
                return abstractC0663Ig03.toString();
            case 25:
                AbstractC0663Ig0 abstractC0663Ig04 = (AbstractC0663Ig0) obj;
                O90.f(abstractC0663Ig04, "it");
                return abstractC0663Ig04.toString();
            case 26:
                O90.f((IpcRequest) obj, "it");
                return c1518Tf1;
            case 27:
                InterfaceC0153Bs0 interfaceC0153Bs0 = (InterfaceC0153Bs0) obj;
                O90.f(interfaceC0153Bs0, "module");
                C1758Wh1 c1758Wh1G = GZ1.g(AbstractC1424Sa0.b, interfaceC0153Bs0.h().i(AbstractC6390p41.t));
                AbstractC0663Ig0 type = c1758Wh1G != null ? c1758Wh1G.getType() : null;
                return type == null ? C5496kP.c(EnumC5305jP.C, new String[0]) : type;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th2 = (Throwable) obj;
                return th2 == null ? new IOException("Unknown IOException") : th2;
            default:
                InterfaceC0153Bs0 interfaceC0153Bs02 = (InterfaceC0153Bs0) obj;
                O90.f(interfaceC0153Bs02, "module");
                List list = (List) WS1.b(((C1835Xh0) interfaceC0153Bs02.C0(C1274Qc0.f)).f, C1835Xh0.i[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C1840Xj) {
                        arrayList.add(obj2);
                    }
                }
                return (C1840Xj) AbstractC8069xu.A(arrayList);
        }
    }
}
