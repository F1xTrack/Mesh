package defpackage;

import com.vk.push.core.ipc.BaseIPCClient;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4258i extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public static final C4258i f = new C4258i(1, 0);
    public static final C4258i g = new C4258i(1, 1);
    public static final C4258i h = new C4258i(1, 2);
    public static final C4258i i = new C4258i(1, 3);
    public static final C4258i j = new C4258i(1, 4);
    public static final C4258i k = new C4258i(1, 5);
    public static final C4258i l = new C4258i(1, 6);
    public static final C4258i m = new C4258i(1, 7);
    public static final C4258i n = new C4258i(1, 8);
    public static final C4258i o = new C4258i(1, 9);
    public static final C4258i p = new C4258i(1, 10);
    public static final C4258i q = new C4258i(1, 11);
    public static final C4258i r = new C4258i(1, 12);
    public static final C4258i s = new C4258i(1, 13);
    public static final C4258i t = new C4258i(1, 14);
    public static final C4258i u = new C4258i(1, 15);
    public static final C4258i v = new C4258i(1, 16);
    public static final C4258i w = new C4258i(1, 17);
    public static final C4258i x = new C4258i(1, 18);
    public static final C4258i y = new C4258i(1, 19);
    public static final C4258i z = new C4258i(1, 20);
    public static final C4258i A = new C4258i(1, 21);
    public static final C4258i B = new C4258i(1, 22);
    public static final C4258i C = new C4258i(1, 23);
    public static final C4258i D = new C4258i(1, 24);
    public static final C4258i E = new C4258i(1, 25);
    public static final C4258i F = new C4258i(1, 26);
    public static final C4258i G = new C4258i(1, 27);
    public static final C4258i H = new C4258i(1, 28);
    public static final C4258i I = new C4258i(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4258i(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws C7790wQ0 {
        String string;
        MN mn = MN.a;
        SN sn = SN.a;
        boolean z2 = false;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        switch (this.e) {
            case 0:
                C8457zw1 c8457zw1 = (C8457zw1) obj;
                if (c8457zw1 != null) {
                    return c8457zw1;
                }
                throw new C7790wQ0();
            case 1:
                ((Boolean) obj).getClass();
                return new C5421k1(AbstractC8259yu.e(C5496kP.d));
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                O90.f(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    O90.e(string, "toString(...)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    O90.e(string, "toString(...)");
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 3:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 4:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 5:
                String str2 = (String) obj;
                O90.f(str2, "it");
                return "'" + str2 + '\'';
            case 6:
                O90.f((BaseIPCClient) obj, "it");
                return c1518Tf1;
            case 7:
                InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl, "it");
                int i2 = C2381bk.l;
                return Boolean.valueOf(AbstractC8069xu.v(AbstractC4273i31.f, AbstractC3534eB1.b(interfaceC8042xl)));
            case 8:
                InterfaceC8042xl interfaceC8042xl2 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl2, "it");
                if (interfaceC8042xl2 instanceof AZ) {
                    int i3 = C2381bk.l;
                    if (AbstractC8069xu.v(AbstractC4273i31.f, AbstractC3534eB1.b(interfaceC8042xl2))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                C8457zw1 c8457zw12 = (C8457zw1) obj;
                O90.f(c8457zw12, "defaultConfig");
                return c8457zw12.a;
            case 10:
                Class cls = (Class) obj;
                O90.f(cls, "it");
                return V22.a(AbstractC6326ol.a(cls), mn, false, mn);
            case 11:
                O90.f((Class) obj, "it");
                return new ConcurrentHashMap();
            case 12:
                Class cls2 = (Class) obj;
                O90.f(cls2, "it");
                return V22.a(AbstractC6326ol.a(cls2), mn, true, mn);
            case 13:
                Class cls3 = (Class) obj;
                O90.f(cls3, "it");
                return new C3430de0(cls3);
            case 14:
                Class cls4 = (Class) obj;
                O90.f(cls4, "it");
                return new C1124Oe0(cls4);
            case 15:
                C1007Mr0 c1007Mr0 = (C1007Mr0) obj;
                return "(" + c1007Mr0.a + ", " + c1007Mr0.b + ")";
            case 16:
                AbstractC1521Tg1 abstractC1521Tg1 = (AbstractC1521Tg1) obj;
                O90.c(abstractC1521Tg1);
                return Boolean.valueOf(abstractC1521Tg1.E() instanceof InterfaceC5959mq);
            case 17:
                O90.f((AZ) obj, "$this$null");
                return null;
            case 18:
                O90.f((AZ) obj, "$this$null");
                return null;
            case 19:
                O90.f((AZ) obj, "$this$null");
                return null;
            case 20:
                InterfaceC8042xl interfaceC8042xl3 = (InterfaceC8042xl) obj;
                O90.f(interfaceC8042xl3, "it");
                return Boolean.valueOf(NS1.a(interfaceC8042xl3));
            case 21:
                I5 i5 = (I5) obj;
                O90.f(i5, "it");
                return AbstractC8069xu.t(i5);
            case 22:
                Throwable th = (Throwable) obj;
                O90.f(th, "error");
                return !(th instanceof CQ0) ? new C7790wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 23:
                InterfaceC6239oI interfaceC6239oI = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI, "$this$withOptions");
                interfaceC6239oI.j();
                interfaceC6239oI.d(sn);
                return c1518Tf1;
            case 24:
                InterfaceC6239oI interfaceC6239oI2 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI2, "$this$withOptions");
                interfaceC6239oI2.j();
                interfaceC6239oI2.d(sn);
                interfaceC6239oI2.m();
                return c1518Tf1;
            case 25:
                InterfaceC6239oI interfaceC6239oI3 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI3, "$this$withOptions");
                interfaceC6239oI3.j();
                return c1518Tf1;
            case 26:
                InterfaceC6239oI interfaceC6239oI4 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI4, "$this$withOptions");
                interfaceC6239oI4.d(sn);
                interfaceC6239oI4.g(C1243Ps.c);
                interfaceC6239oI4.h(EnumC3340dA0.b);
                return c1518Tf1;
            case 27:
                InterfaceC6239oI interfaceC6239oI5 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI5, "$this$withOptions");
                interfaceC6239oI5.b();
                interfaceC6239oI5.g(C1243Ps.b);
                interfaceC6239oI5.d(EnumC6048nI.c);
                return c1518Tf1;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                InterfaceC6239oI interfaceC6239oI6 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI6, "$this$withOptions");
                interfaceC6239oI6.d(EnumC6048nI.b);
                return c1518Tf1;
            default:
                InterfaceC6239oI interfaceC6239oI7 = (InterfaceC6239oI) obj;
                O90.f(interfaceC6239oI7, "$this$withOptions");
                interfaceC6239oI7.d(EnumC6048nI.c);
                return c1518Tf1;
        }
    }
}
