package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class SC0 extends B00 {
    private static final SC0 DEFAULT_INSTANCE;
    private static volatile InterfaceC5452kA0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC7739w90 strings_ = C2292bG0.d;

    static {
        SC0 sc0 = new SC0();
        DEFAULT_INSTANCE = sc0;
        B00.h(SC0.class, sc0);
    }

    public static void i(SC0 sc0, Set set) {
        InterfaceC7739w90 interfaceC7739w90 = sc0.strings_;
        if (!((T0) interfaceC7739w90).a) {
            int size = interfaceC7739w90.size();
            sc0.strings_ = interfaceC7739w90.e(size == 0 ? 10 : size * 2);
        }
        List list = sc0.strings_;
        Charset charset = AbstractC8309z90.a;
        set.getClass();
        if (!(set instanceof InterfaceC3823fi0)) {
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
        List listN = ((InterfaceC3823fi0) set).n();
        InterfaceC3823fi0 interfaceC3823fi0 = (InterfaceC3823fi0) list;
        int size4 = list.size();
        for (Object obj2 : listN) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC3823fi0.size() - size4) + " is null.";
                for (int size5 = interfaceC3823fi0.size() - 1; size5 >= size4; size5--) {
                    interfaceC3823fi0.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof C0440Fk) {
                interfaceC3823fi0.f((C0440Fk) obj2);
            } else {
                interfaceC3823fi0.add((String) obj2);
            }
        }
    }

    public static SC0 j() {
        return DEFAULT_INSTANCE;
    }

    public static RC0 l() {
        return (RC0) ((AbstractC6945s00) DEFAULT_INSTANCE.d(5));
    }

    @Override // defpackage.B00
    public final Object d(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5670lJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new SC0();
            case 4:
                return new RC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5452kA0 c7327u00 = PARSER;
                if (c7327u00 == null) {
                    synchronized (SC0.class) {
                        try {
                            c7327u00 = PARSER;
                            if (c7327u00 == null) {
                                c7327u00 = new C7327u00();
                                PARSER = c7327u00;
                            }
                        } finally {
                        }
                    }
                }
                return c7327u00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC7739w90 k() {
        return this.strings_;
    }
}
