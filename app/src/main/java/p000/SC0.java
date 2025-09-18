package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class SC0 extends B00 {
    private static final SC0 DEFAULT_INSTANCE;
    private static volatile InterfaceC9975kA0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC11508w90 strings_ = C8830bG0.f16923d;

    static {
        SC0 sc0 = new SC0();
        DEFAULT_INSTANCE = sc0;
        B00.m429h(SC0.class, sc0);
    }

    /* renamed from: i */
    public static void m7192i(SC0 sc0, Set set) {
        InterfaceC11508w90 interfaceC11508w90 = sc0.strings_;
        if (!((AbstractC1196T0) interfaceC11508w90).f11086a) {
            int size = interfaceC11508w90.size();
            sc0.strings_ = interfaceC11508w90.mo10442e(size == 0 ? 10 : size * 2);
        }
        List list = sc0.strings_;
        Charset charset = AbstractC11889z90.f46666a;
        set.getClass();
        if (!(set instanceof InterfaceC9403fi0)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listMo10831n = ((InterfaceC9403fi0) set).mo10831n();
        InterfaceC9403fi0 interfaceC9403fi0 = (InterfaceC9403fi0) list;
        int size4 = list.size();
        for (Object obj2 : listMo10831n) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC9403fi0.size() - size4) + " is null.";
                for (int size5 = interfaceC9403fi0.size() - 1; size5 >= size4; size5--) {
                    interfaceC9403fi0.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof C0362Fk) {
                interfaceC9403fi0.mo10830f((C0362Fk) obj2);
            } else {
                interfaceC9403fi0.add((String) obj2);
            }
        }
    }

    /* renamed from: j */
    public static SC0 m7193j() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: l */
    public static RC0 m7194l() {
        return (RC0) ((AbstractC10975s00) DEFAULT_INSTANCE.mo432d(5));
    }

    @Override // p000.B00
    /* renamed from: d */
    public final Object mo432d(int i) {
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10121lJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new SC0();
            case 4:
                return new RC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9975kA0 c11231u00 = PARSER;
                if (c11231u00 == null) {
                    synchronized (SC0.class) {
                        try {
                            c11231u00 = PARSER;
                            if (c11231u00 == null) {
                                c11231u00 = new C11231u00();
                                PARSER = c11231u00;
                            }
                        } finally {
                        }
                    }
                }
                return c11231u00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: k */
    public final InterfaceC11508w90 m7195k() {
        return this.strings_;
    }
}
