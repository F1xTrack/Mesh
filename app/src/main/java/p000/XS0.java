package p000;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;

/* loaded from: classes2.dex */
public final class XS0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f13791e;

    /* renamed from: f */
    public static final XS0 f13770f = new XS0(1, 0);

    /* renamed from: g */
    public static final XS0 f13771g = new XS0(1, 1);

    /* renamed from: h */
    public static final XS0 f13772h = new XS0(1, 2);

    /* renamed from: i */
    public static final XS0 f13773i = new XS0(1, 3);

    /* renamed from: j */
    public static final XS0 f13774j = new XS0(1, 4);

    /* renamed from: k */
    public static final XS0 f13775k = new XS0(1, 5);

    /* renamed from: l */
    public static final XS0 f13776l = new XS0(1, 6);

    /* renamed from: m */
    public static final XS0 f13777m = new XS0(1, 7);

    /* renamed from: n */
    public static final XS0 f13778n = new XS0(1, 8);

    /* renamed from: o */
    public static final XS0 f13779o = new XS0(1, 9);

    /* renamed from: p */
    public static final XS0 f13780p = new XS0(1, 10);

    /* renamed from: q */
    public static final XS0 f13781q = new XS0(1, 11);

    /* renamed from: r */
    public static final XS0 f13782r = new XS0(1, 12);

    /* renamed from: s */
    public static final XS0 f13783s = new XS0(1, 13);

    /* renamed from: t */
    public static final XS0 f13784t = new XS0(1, 14);

    /* renamed from: u */
    public static final XS0 f13785u = new XS0(1, 15);

    /* renamed from: v */
    public static final XS0 f13786v = new XS0(1, 16);

    /* renamed from: w */
    public static final XS0 f13787w = new XS0(1, 17);

    /* renamed from: x */
    public static final XS0 f13788x = new XS0(1, 18);

    /* renamed from: y */
    public static final XS0 f13789y = new XS0(1, 19);

    /* renamed from: z */
    public static final XS0 f13790z = new XS0(1, 20);

    /* renamed from: A */
    public static final XS0 f13761A = new XS0(1, 21);

    /* renamed from: B */
    public static final XS0 f13762B = new XS0(1, 22);

    /* renamed from: C */
    public static final XS0 f13763C = new XS0(1, 23);

    /* renamed from: D */
    public static final XS0 f13764D = new XS0(1, 24);

    /* renamed from: E */
    public static final XS0 f13765E = new XS0(1, 25);

    /* renamed from: F */
    public static final XS0 f13766F = new XS0(1, 26);

    /* renamed from: G */
    public static final XS0 f13767G = new XS0(1, 27);

    /* renamed from: H */
    public static final XS0 f13768H = new XS0(1, 28);

    /* renamed from: I */
    public static final XS0 f13769I = new XS0(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XS0(int i, int i2) {
        super(i);
        this.f13791e = i2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) throws Throwable {
        InterfaceC7158xl interfaceC7158xlM25149b;
        String strM17875b;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        switch (this.f13791e) {
            case 0:
                AbstractC11955zg0 abstractC11955zg0 = (AbstractC11955zg0) obj;
                O90.m5968f(abstractC11955zg0, "$this$null");
                return abstractC11955zg0.m26509s(EnumC11005sD0.f42305f);
            case 1:
                AbstractC11955zg0 abstractC11955zg02 = (AbstractC11955zg0) obj;
                O90.m5968f(abstractC11955zg02, "$this$null");
                return abstractC11955zg02.m26509s(EnumC11005sD0.f42309j);
            case 2:
                AbstractC11955zg0 abstractC11955zg03 = (AbstractC11955zg0) obj;
                O90.m5968f(abstractC11955zg03, "$this$null");
                return abstractC11955zg03.m26512w();
            case 3:
                Class cls = (Class) obj;
                O90.m5965c(cls);
                return VO0.m8434b(cls);
            case 4:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "error");
                return !(th instanceof CQ0) ? new C11542wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 5:
                O90.m5968f((AbstractC4100gB) obj, "$this$initializer");
                return new C9761iV0();
            case 6:
                InterfaceC9127dY0 interfaceC9127dY0 = (InterfaceC9127dY0) obj;
                O90.m5968f(interfaceC9127dY0, "it");
                return interfaceC9127dY0.iterator();
            case 7:
                return obj;
            case 8:
                return Boolean.valueOf(obj == null);
            case 9:
                O90.m5968f((C1194Sz) obj, "ex");
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    O90.m5967e(Process.myProcessName(), "myProcessName()");
                } else if (i < 28 || Application.getProcessName() == null) {
                    ProcessUtils.getMyProcessName();
                }
                return new C7664Gt0(true);
            case 10:
                O90.m5968f((C1194Sz) obj, "ex");
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    O90.m5967e(Process.myProcessName(), "myProcessName()");
                } else if (i2 < 28 || Application.getProcessName() == null) {
                    ProcessUtils.getMyProcessName();
                }
                return new C7664Gt0(true);
            case 11:
                String str = (String) obj;
                O90.m5968f(str, "it");
                if (str.length() <= 1) {
                    return str;
                }
                return "L" + str + ';';
            case 12:
                InterfaceC0873Ns interfaceC0873NsMo1962a = ((AbstractC8315Tg1) obj).mo3797E().mo1962a();
                if (interfaceC0873NsMo1962a == null) {
                    return Boolean.FALSE;
                }
                C8340Tt0 name = interfaceC0873NsMo1962a.getName();
                C0664KX c0664kx = C11309ub0.f43763f;
                if (O90.m5963a(name, c0664kx.m4658f()) && O90.m5963a(AbstractC6940uI.m25150c(interfaceC0873NsMo1962a), c0664kx)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl, "it");
                C10937rh0 c10937rh0Mo121t0 = interfaceC7158xl.mo121t0();
                O90.m5965c(c10937rh0Mo121t0);
                return c10937rh0Mo121t0.getType();
            case 14:
                InterfaceC7158xl interfaceC7158xl2 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl2, "it");
                AbstractC7742Ig0 returnType = interfaceC7158xl2.getReturnType();
                O90.m5965c(returnType);
                return returnType;
            case 15:
                AbstractC8315Tg1 abstractC8315Tg1 = (AbstractC8315Tg1) obj;
                O90.m5968f(abstractC8315Tg1, "it");
                return Boolean.valueOf(abstractC8315Tg1 instanceof C10633pJ0);
            case 16:
                InterfaceC7158xl interfaceC7158xl3 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl3, "it");
                return Boolean.valueOf(NS1.m5691a(AbstractC6940uI.m25158k(interfaceC7158xl3)));
            case 17:
                InterfaceC7158xl interfaceC7158xl4 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl4, "it");
                int i3 = AbstractC1683ak.f15660l;
                U01 u01 = (U01) interfaceC7158xl4;
                if (AbstractC11955zg0.m26496z(u01) && AbstractC6940uI.m25149b(u01, new C7236z(7, u01)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                InterfaceC7158xl interfaceC7158xl5 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl5, "it");
                if (AbstractC11955zg0.m26496z(interfaceC7158xl5)) {
                    int i4 = C1804bk.f17126l;
                    EnumC9321f31 enumC9321f31 = null;
                    if (AbstractC9705i31.f28792e.contains(interfaceC7158xl5.getName()) && (interfaceC7158xlM25149b = AbstractC6940uI.m25149b(interfaceC7158xl5, C4214i.f28729n)) != null && (strM17875b = AbstractC9210eB1.m17875b(interfaceC7158xlM25149b)) != null) {
                        enumC9321f31 = AbstractC9705i31.f28789b.contains(strM17875b) ? EnumC9321f31.f27025a : ((EnumC9577h31) AbstractC11077sn0.m24778f(AbstractC9705i31.f28791d, strM17875b)) == EnumC9577h31.f28205b ? EnumC9321f31.f27027c : EnumC9321f31.f27026b;
                    }
                    if (enumC9321f31 != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                C8068On0 c8068On0 = (C8068On0) obj;
                O90.m5968f(c8068On0, "it");
                String strGroup = c8068On0.f8621a.group();
                O90.m5967e(strGroup, "group(...)");
                return "_".concat(strGroup);
            case 20:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 21:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 22:
                AF0 af0 = (AF0) obj;
                O90.m5968f(af0, "it");
                return Integer.valueOf(af0.f127d.size());
            case 23:
                InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) obj;
                O90.m5968f(interfaceC7032vl, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC7032vl;
            case 24:
                U01 u012 = (U01) obj;
                O90.m5968f(u012, "$this$selectMostSpecificInEachOverridableGroup");
                return u012;
            case 25:
                CE0 ce0 = (CE0) obj;
                O90.m5968f(ce0, "$this$selectMostSpecificInEachOverridableGroup");
                return ce0;
            case 26:
                InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) obj;
                O90.m5968f(interfaceC0140CD, "it");
                return Boolean.valueOf(interfaceC0140CD instanceof InterfaceC7032vl);
            case 27:
                O90.m5968f((InterfaceC0140CD) obj, "it");
                return Boolean.valueOf(!(r12 instanceof InterfaceC6522ny));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                InterfaceC0140CD interfaceC0140CD2 = (InterfaceC0140CD) obj;
                O90.m5968f(interfaceC0140CD2, "it");
                List typeParameters = ((InterfaceC7032vl) interfaceC0140CD2).getTypeParameters();
                O90.m5967e(typeParameters, "getTypeParameters(...)");
                return AbstractC7167xu.m25992t(typeParameters);
            default:
                AbstractC8315Tg1 abstractC8315Tg12 = (AbstractC8315Tg1) obj;
                O90.m5968f(abstractC8315Tg12, "it");
                InterfaceC0873Ns interfaceC0873NsMo1962a2 = abstractC8315Tg12.mo3797E().mo1962a();
                if (interfaceC0873NsMo1962a2 != null && (interfaceC0873NsMo1962a2 instanceof InterfaceC10292me1) && (((InterfaceC10292me1) interfaceC0873NsMo1962a2).mo423i() instanceof InterfaceC7633Gd1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
