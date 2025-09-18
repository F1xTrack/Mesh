package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class QC0 extends B00 {
    private static final QC0 DEFAULT_INSTANCE;
    private static volatile InterfaceC9975kA0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C9669hn0 preferences_ = C9669hn0.f28584b;

    static {
        QC0 qc0 = new QC0();
        DEFAULT_INSTANCE = qc0;
        B00.m429h(QC0.class, qc0);
    }

    /* renamed from: i */
    public static C9669hn0 m6611i(QC0 qc0) {
        C9669hn0 c9669hn0 = qc0.preferences_;
        if (!c9669hn0.f28585a) {
            qc0.preferences_ = c9669hn0.m18881e();
        }
        return qc0.preferences_;
    }

    /* renamed from: k */
    public static OC0 m6612k() {
        return (OC0) ((AbstractC10975s00) DEFAULT_INSTANCE.mo432d(5));
    }

    /* renamed from: l */
    public static QC0 m6613l(FileInputStream fileInputStream) {
        QC0 qc0 = DEFAULT_INSTANCE;
        C6329ku c6329ku = new C6329ku(fileInputStream);
        C0280ER c0280erM2269a = C0280ER.m2269a();
        B00 b00 = (B00) qc0.mo432d(4);
        try {
            ZF0 zf0 = ZF0.f14820c;
            zf0.getClass();
            EV0 ev0M9517a = zf0.m9517a(b00.getClass());
            C6455mu c6455mu = c6329ku.f36746b;
            if (c6455mu == null) {
                c6455mu = new C6455mu();
                c6455mu.f37983c = 0;
                Charset charset = AbstractC11889z90.f46666a;
                c6455mu.f37984d = c6329ku;
                c6329ku.f36746b = c6455mu;
            }
            ev0M9517a.mo2321e(b00, c6455mu, c0280erM2269a);
            ev0M9517a.mo2318b(b00);
            if (b00.m433g()) {
                return (QC0) b00;
            }
            throw new Z90(new C6838sg().getMessage());
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

    @Override // p000.B00
    /* renamed from: d */
    public final Object mo432d(int i) {
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10121lJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PC0.f8889a});
            case 3:
                return new QC0();
            case 4:
                return new OC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9975kA0 c11231u00 = PARSER;
                if (c11231u00 == null) {
                    synchronized (QC0.class) {
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

    /* renamed from: j */
    public final Map m6614j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
