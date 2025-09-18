package p000;

import com.p019vk.push.core.ipc.BaseIPCClient;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: i */
/* loaded from: classes2.dex */
public final class C4214i extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f28742e;

    /* renamed from: f */
    public static final C4214i f28721f = new C4214i(1, 0);

    /* renamed from: g */
    public static final C4214i f28722g = new C4214i(1, 1);

    /* renamed from: h */
    public static final C4214i f28723h = new C4214i(1, 2);

    /* renamed from: i */
    public static final C4214i f28724i = new C4214i(1, 3);

    /* renamed from: j */
    public static final C4214i f28725j = new C4214i(1, 4);

    /* renamed from: k */
    public static final C4214i f28726k = new C4214i(1, 5);

    /* renamed from: l */
    public static final C4214i f28727l = new C4214i(1, 6);

    /* renamed from: m */
    public static final C4214i f28728m = new C4214i(1, 7);

    /* renamed from: n */
    public static final C4214i f28729n = new C4214i(1, 8);

    /* renamed from: o */
    public static final C4214i f28730o = new C4214i(1, 9);

    /* renamed from: p */
    public static final C4214i f28731p = new C4214i(1, 10);

    /* renamed from: q */
    public static final C4214i f28732q = new C4214i(1, 11);

    /* renamed from: r */
    public static final C4214i f28733r = new C4214i(1, 12);

    /* renamed from: s */
    public static final C4214i f28734s = new C4214i(1, 13);

    /* renamed from: t */
    public static final C4214i f28735t = new C4214i(1, 14);

    /* renamed from: u */
    public static final C4214i f28736u = new C4214i(1, 15);

    /* renamed from: v */
    public static final C4214i f28737v = new C4214i(1, 16);

    /* renamed from: w */
    public static final C4214i f28738w = new C4214i(1, 17);

    /* renamed from: x */
    public static final C4214i f28739x = new C4214i(1, 18);

    /* renamed from: y */
    public static final C4214i f28740y = new C4214i(1, 19);

    /* renamed from: z */
    public static final C4214i f28741z = new C4214i(1, 20);

    /* renamed from: A */
    public static final C4214i f28712A = new C4214i(1, 21);

    /* renamed from: B */
    public static final C4214i f28713B = new C4214i(1, 22);

    /* renamed from: C */
    public static final C4214i f28714C = new C4214i(1, 23);

    /* renamed from: D */
    public static final C4214i f28715D = new C4214i(1, 24);

    /* renamed from: E */
    public static final C4214i f28716E = new C4214i(1, 25);

    /* renamed from: F */
    public static final C4214i f28717F = new C4214i(1, 26);

    /* renamed from: G */
    public static final C4214i f28718G = new C4214i(1, 27);

    /* renamed from: H */
    public static final C4214i f28719H = new C4214i(1, 28);

    /* renamed from: I */
    public static final C4214i f28720I = new C4214i(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4214i(int i, int i2) {
        super(i);
        this.f28742e = i2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) throws C11542wQ0 {
        String string;
        C0779MN c0779mn = C0779MN.f7117a;
        C1156SN c1156sn = C1156SN.f10705a;
        boolean z = false;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        switch (this.f28742e) {
            case 0:
                C11988zw1 c11988zw1 = (C11988zw1) obj;
                if (c11988zw1 != null) {
                    return c11988zw1;
                }
                throw new C11542wQ0();
            case 1:
                ((Boolean) obj).getClass();
                return new C6274k1(AbstractC7230yu.m26274e(C6298kP.f36485d));
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                O90.m5968f(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    O90.m5967e(string, "toString(...)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    O90.m5967e(string, "toString(...)");
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
                O90.m5968f(str2, "it");
                return "'" + str2 + '\'';
            case 6:
                O90.m5968f((BaseIPCClient) obj, "it");
                return c8313Tf1;
            case 7:
                InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl, "it");
                int i = C1804bk.f17126l;
                return Boolean.valueOf(AbstractC7167xu.m25994v(AbstractC9705i31.f28793f, AbstractC9210eB1.m17875b(interfaceC7158xl)));
            case 8:
                InterfaceC7158xl interfaceC7158xl2 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl2, "it");
                if (interfaceC7158xl2 instanceof InterfaceC0036AZ) {
                    int i2 = C1804bk.f17126l;
                    if (AbstractC7167xu.m25994v(AbstractC9705i31.f28793f, AbstractC9210eB1.m17875b(interfaceC7158xl2))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                C11988zw1 c11988zw12 = (C11988zw1) obj;
                O90.m5968f(c11988zw12, "defaultConfig");
                return c11988zw12.f47107a;
            case 10:
                Class cls = (Class) obj;
                O90.m5968f(cls, "it");
                return V22.m8286a(AbstractC6572ol.m23539a(cls), c0779mn, false, c0779mn);
            case 11:
                O90.m5968f((Class) obj, "it");
                return new ConcurrentHashMap();
            case 12:
                Class cls2 = (Class) obj;
                O90.m5968f(cls2, "it");
                return V22.m8286a(AbstractC6572ol.m23539a(cls2), c0779mn, true, c0779mn);
            case 13:
                Class cls3 = (Class) obj;
                O90.m5968f(cls3, "it");
                return new C9139de0(cls3);
            case 14:
                Class cls4 = (Class) obj;
                O90.m5968f(cls4, "it");
                return new C8050Oe0(cls4);
            case 15:
                C7972Mr0 c7972Mr0 = (C7972Mr0) obj;
                return "(" + c7972Mr0.f7370a + ", " + c7972Mr0.f7371b + ")";
            case 16:
                AbstractC8315Tg1 abstractC8315Tg1 = (AbstractC8315Tg1) obj;
                O90.m5965c(abstractC8315Tg1);
                return Boolean.valueOf(abstractC8315Tg1.mo3797E() instanceof InterfaceC6451mq);
            case 17:
                O90.m5968f((InterfaceC0036AZ) obj, "$this$null");
                return null;
            case 18:
                O90.m5968f((InterfaceC0036AZ) obj, "$this$null");
                return null;
            case 19:
                O90.m5968f((InterfaceC0036AZ) obj, "$this$null");
                return null;
            case 20:
                InterfaceC7158xl interfaceC7158xl3 = (InterfaceC7158xl) obj;
                O90.m5968f(interfaceC7158xl3, "it");
                return Boolean.valueOf(NS1.m5691a(interfaceC7158xl3));
            case 21:
                InterfaceC0510I5 interfaceC0510I5 = (InterfaceC0510I5) obj;
                O90.m5968f(interfaceC0510I5, "it");
                return AbstractC7167xu.m25992t(interfaceC0510I5);
            case 22:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "error");
                return !(th instanceof CQ0) ? new C11542wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 23:
                InterfaceC6543oI interfaceC6543oI = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI, "$this$withOptions");
                interfaceC6543oI.mo22756j();
                interfaceC6543oI.mo22745d(c1156sn);
                return c8313Tf1;
            case 24:
                InterfaceC6543oI interfaceC6543oI2 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI2, "$this$withOptions");
                interfaceC6543oI2.mo22756j();
                interfaceC6543oI2.mo22745d(c1156sn);
                interfaceC6543oI2.mo22759m();
                return c8313Tf1;
            case 25:
                InterfaceC6543oI interfaceC6543oI3 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI3, "$this$withOptions");
                interfaceC6543oI3.mo22756j();
                return c8313Tf1;
            case 26:
                InterfaceC6543oI interfaceC6543oI4 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI4, "$this$withOptions");
                interfaceC6543oI4.mo22745d(c1156sn);
                interfaceC6543oI4.mo22751g(C0999Ps.f9319c);
                interfaceC6543oI4.mo22753h(EnumC9079dA0.f25850b);
                return c8313Tf1;
            case 27:
                InterfaceC6543oI interfaceC6543oI5 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI5, "$this$withOptions");
                interfaceC6543oI5.mo22741b();
                interfaceC6543oI5.mo22751g(C0999Ps.f9318b);
                interfaceC6543oI5.mo22745d(EnumC6480nI.f38241c);
                return c8313Tf1;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                InterfaceC6543oI interfaceC6543oI6 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI6, "$this$withOptions");
                interfaceC6543oI6.mo22745d(EnumC6480nI.f38240b);
                return c8313Tf1;
            default:
                InterfaceC6543oI interfaceC6543oI7 = (InterfaceC6543oI) obj;
                O90.m5968f(interfaceC6543oI7, "$this$withOptions");
                interfaceC6543oI7.mo22745d(EnumC6480nI.f38241c);
                return c8313Tf1;
        }
    }
}
