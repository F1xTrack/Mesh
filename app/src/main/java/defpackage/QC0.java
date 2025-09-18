package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class QC0 extends B00 {
    private static final QC0 DEFAULT_INSTANCE;
    private static volatile InterfaceC5452kA0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C4220hn0 preferences_ = C4220hn0.b;

    static {
        QC0 qc0 = new QC0();
        DEFAULT_INSTANCE = qc0;
        B00.h(QC0.class, qc0);
    }

    public static C4220hn0 i(QC0 qc0) {
        C4220hn0 c4220hn0 = qc0.preferences_;
        if (!c4220hn0.a) {
            qc0.preferences_ = c4220hn0.e();
        }
        return qc0.preferences_;
    }

    public static OC0 k() {
        return (OC0) ((AbstractC6945s00) DEFAULT_INSTANCE.d(5));
    }

    public static QC0 l(FileInputStream fileInputStream) {
        QC0 qc0 = DEFAULT_INSTANCE;
        C5589ku c5589ku = new C5589ku(fileInputStream);
        ER erA = ER.a();
        B00 b00 = (B00) qc0.d(4);
        try {
            ZF0 zf0 = ZF0.c;
            zf0.getClass();
            EV0 ev0A = zf0.a(b00.getClass());
            C5971mu c5971mu = c5589ku.b;
            if (c5971mu == null) {
                c5971mu = new C5971mu();
                c5971mu.c = 0;
                Charset charset = AbstractC8309z90.a;
                c5971mu.d = c5589ku;
                c5589ku.b = c5971mu;
            }
            ev0A.e(b00, c5971mu, erA);
            ev0A.b(b00);
            if (b00.g()) {
                return (QC0) b00;
            }
            throw new Z90(new C7074sg().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof Z90) {
                throw ((Z90) e.getCause());
            }
            throw new Z90(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof Z90) {
                throw ((Z90) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // defpackage.B00
    public final Object d(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5670lJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PC0.a});
            case 3:
                return new QC0();
            case 4:
                return new OC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5452kA0 c7327u00 = PARSER;
                if (c7327u00 == null) {
                    synchronized (QC0.class) {
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

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
