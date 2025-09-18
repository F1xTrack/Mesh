package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;

/* loaded from: classes2.dex */
public final class XS0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public static final XS0 f = new XS0(1, 0);
    public static final XS0 g = new XS0(1, 1);
    public static final XS0 h = new XS0(1, 2);
    public static final XS0 i = new XS0(1, 3);
    public static final XS0 j = new XS0(1, 4);
    public static final XS0 k = new XS0(1, 5);
    public static final XS0 l = new XS0(1, 6);
    public static final XS0 m = new XS0(1, 7);
    public static final XS0 n = new XS0(1, 8);
    public static final XS0 o = new XS0(1, 9);
    public static final XS0 p = new XS0(1, 10);
    public static final XS0 q = new XS0(1, 11);
    public static final XS0 r = new XS0(1, 12);
    public static final XS0 s = new XS0(1, 13);
    public static final XS0 t = new XS0(1, 14);
    public static final XS0 u = new XS0(1, 15);
    public static final XS0 v = new XS0(1, 16);
    public static final XS0 w = new XS0(1, 17);
    public static final XS0 x = new XS0(1, 18);
    public static final XS0 y = new XS0(1, 19);
    public static final XS0 z = new XS0(1, 20);
    public static final XS0 A = new XS0(1, 21);
    public static final XS0 B = new XS0(1, 22);
    public static final XS0 C = new XS0(1, 23);
    public static final XS0 D = new XS0(1, 24);
    public static final XS0 E = new XS0(1, 25);
    public static final XS0 F = new XS0(1, 26);
    public static final XS0 G = new XS0(1, 27);
    public static final XS0 H = new XS0(1, 28);
    public static final XS0 I = new XS0(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XS0(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws Throwable {
        InterfaceC8042xl interfaceC8042xlB;
        String strB;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        switch (this.e) {
            case 0:
                AbstractC8408zg0 abstractC8408zg0 = (AbstractC8408zg0) obj;
                O90.f(abstractC8408zg0, "$this$null");
                return abstractC8408zg0.s(EnumC6988sD0.f);
            case 1:
                AbstractC8408zg0 abstractC8408zg02 = (AbstractC8408zg0) obj;
                O90.f(abstractC8408zg02, "$this$null");
                return abstractC8408zg02.s(EnumC6988sD0.j);
            case 2:
                AbstractC8408zg0 abstractC8408zg03 = (AbstractC8408zg0) obj;
                O90.f(abstractC8408zg03, "$this$null");
                return abstractC8408zg03.w();
            case 3:
                Class cls = (Class) obj;
                O90.c(cls);
                return VO0.b(cls);
            case 4:
                Throwable th = (Throwable) obj;
                O90.f(th, "error");
                return !(th instanceof CQ0) ? new C7790wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 5:
                O90.f((AbstractC3914gB) obj, "$this$initializer");
                return new C4357iV0();
            case 6:
                InterfaceC3412dY0 interfaceC3412dY0 = (InterfaceC3412dY0) obj;
                O90.f(interfaceC3412dY0, "it");
                return interfaceC3412dY0.iterator();
            case 7:
                return obj;
            case 8:
                return Boolean.valueOf(obj == null);
            case 9:
                O90.f((C1498Sz) obj, "ex");
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    O90.e(Process.myProcessName(), "myProcessName()");
                } else if (i2 < 28 || Application.getProcessName() == null) {
                    ProcessUtils.getMyProcessName();
                }
                return new C0546Gt0(true);
            case 10:
                O90.f((C1498Sz) obj, "ex");
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    O90.e(Process.myProcessName(), "myProcessName()");
                } else if (i3 < 28 || Application.getProcessName() == null) {
                    ProcessUtils.getMyProcessName();
                }
                return new C0546Gt0(true);
            case 11:
                String str = (String) obj;
                O90.f(str, "it");
                if (str.length() <= 1) {
                    return str;
                }
                return "L" + str + ';';
            case 12:
                InterfaceC1087Ns interfaceC1087NsA = ((AbstractC1521Tg1) obj).E().a();
                if (interfaceC1087NsA == null) {
                    return Boolean.FALSE;
                }
                C1559Tt0 name = interfaceC1087NsA.getName();
                KX kx = C7442ub0.f;
                if (O90.a(name, kx.f()) && O90.a(AbstractC7384uI.c(interfaceC1087NsA), kx)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl, "it");
                C6887rh0 c6887rh0T0 = interfaceC8042xl.t0();
                O90.c(c6887rh0T0);
                return c6887rh0T0.getType();
            case 14:
                InterfaceC8042xl interfaceC8042xl2 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl2, "it");
                AbstractC0663Ig0 returnType = interfaceC8042xl2.getReturnType();
                O90.c(returnType);
                return returnType;
            case 15:
                AbstractC1521Tg1 abstractC1521Tg1 = (AbstractC1521Tg1) obj;
                O90.f(abstractC1521Tg1, "it");
                return Boolean.valueOf(abstractC1521Tg1 instanceof C6434pJ0);
            case 16:
                InterfaceC8042xl interfaceC8042xl3 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl3, "it");
                return Boolean.valueOf(NS1.a(AbstractC7384uI.k(interfaceC8042xl3)));
            case 17:
                InterfaceC8042xl interfaceC8042xl4 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl4, "it");
                int i4 = AbstractC2190ak.l;
                U01 u01 = (U01) interfaceC8042xl4;
                if (AbstractC8408zg0.z(u01) && AbstractC7384uI.b(u01, new C8277z(7, u01)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                InterfaceC8042xl interfaceC8042xl5 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl5, "it");
                if (AbstractC8408zg0.z(interfaceC8042xl5)) {
                    int i5 = C2381bk.l;
                    EnumC3700f31 enumC3700f31 = null;
                    if (AbstractC4273i31.e.contains(interfaceC8042xl5.getName()) && (interfaceC8042xlB = AbstractC7384uI.b(interfaceC8042xl5, C4258i.n)) != null && (strB = AbstractC3534eB1.b(interfaceC8042xlB)) != null) {
                        enumC3700f31 = AbstractC4273i31.b.contains(strB) ? EnumC3700f31.a : ((EnumC4082h31) AbstractC7096sn0.f(AbstractC4273i31.d, strB)) == EnumC4082h31.b ? EnumC3700f31.c : EnumC3700f31.b;
                    }
                    if (enumC3700f31 != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                C1151On0 c1151On0 = (C1151On0) obj;
                O90.f(c1151On0, "it");
                String strGroup = c1151On0.a.group();
                O90.e(strGroup, "group(...)");
                return "_".concat(strGroup);
            case 20:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 21:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 22:
                AF0 af0 = (AF0) obj;
                O90.f(af0, "it");
                return Integer.valueOf(af0.d.size());
            case 23:
                InterfaceC7662vl interfaceC7662vl = (InterfaceC7662vl) obj;
                O90.f(interfaceC7662vl, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC7662vl;
            case 24:
                U01 u012 = (U01) obj;
                O90.f(u012, "$this$selectMostSpecificInEachOverridableGroup");
                return u012;
            case 25:
                CE0 ce0 = (CE0) obj;
                O90.f(ce0, "$this$selectMostSpecificInEachOverridableGroup");
                return ce0;
            case 26:
                CD cd = (CD) obj;
                O90.f(cd, "it");
                return Boolean.valueOf(cd instanceof InterfaceC7662vl);
            case 27:
                O90.f((CD) obj, "it");
                return Boolean.valueOf(!(r12 instanceof InterfaceC6174ny));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                CD cd2 = (CD) obj;
                O90.f(cd2, "it");
                List typeParameters = ((InterfaceC7662vl) cd2).getTypeParameters();
                O90.e(typeParameters, "getTypeParameters(...)");
                return AbstractC8069xu.t(typeParameters);
            default:
                AbstractC1521Tg1 abstractC1521Tg12 = (AbstractC1521Tg1) obj;
                O90.f(abstractC1521Tg12, "it");
                InterfaceC1087Ns interfaceC1087NsA2 = abstractC1521Tg12.E().a();
                if (interfaceC1087NsA2 != null && (interfaceC1087NsA2 instanceof InterfaceC5925me1) && (((InterfaceC5925me1) interfaceC1087NsA2).i() instanceof InterfaceC0499Gd1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
