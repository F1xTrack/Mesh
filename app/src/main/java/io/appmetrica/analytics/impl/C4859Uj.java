package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Uj */
/* loaded from: classes2.dex */
public final class C4859Uj {

    /* renamed from: a */
    public final C5139g5 f30825a;

    /* renamed from: b */
    public final C4835Tj f30826b;

    /* renamed from: c */
    public final C5114f5 f30827c;

    /* renamed from: d */
    public final C4586J9 f30828d;

    /* renamed from: e */
    public final AbstractC5133g f30829e;

    /* renamed from: f */
    public final AbstractC5133g f30830f;

    /* renamed from: g */
    public C4524Gj f30831g;

    /* renamed from: h */
    public int f30832h = 0;

    public C4859Uj(C5139g5 c5139g5, C4835Tj c4835Tj, C5114f5 c5114f5, C5094ea c5094ea, C4507G2 c4507g2, C4586J9 c4586j9) {
        this.f30825a = c5139g5;
        this.f30827c = c5114f5;
        this.f30829e = c5094ea;
        this.f30830f = c4507g2;
        this.f30826b = c4835Tj;
        this.f30828d = c4586j9;
    }

    /* renamed from: a */
    public final synchronized long m19889a() {
        C4524Gj c4524Gj;
        c4524Gj = this.f30831g;
        return c4524Gj == null ? 10000000000L : c4524Gj.f30192d - 1;
    }

    /* renamed from: b */
    public final synchronized C4524Gj m19892b(C4821T5 c4821t5) {
        try {
            if (this.f30832h == 0) {
                C4524Gj c4524GjM20400b = this.f30829e.m20400b();
                if (c4524GjM20400b != null) {
                    if (c4524GjM20400b.m19453a(c4821t5.f30769i)) {
                        this.f30831g = c4524GjM20400b;
                        this.f30832h = 3;
                    } else {
                        m19891a(c4524GjM20400b, c4821t5);
                    }
                }
                C4524Gj c4524GjM20400b2 = this.f30830f.m20400b();
                if (c4524GjM20400b2 != null) {
                    if (c4524GjM20400b2.m19453a(c4821t5.f30769i)) {
                        this.f30831g = c4524GjM20400b2;
                        this.f30832h = 2;
                    } else {
                        m19891a(c4524GjM20400b2, c4821t5);
                    }
                }
                this.f30831g = null;
                this.f30832h = 1;
            }
            if (this.f30832h != 1) {
                C4524Gj c4524Gj = this.f30831g;
                if (c4524Gj != null) {
                    if (!c4524Gj.m19453a(c4821t5.f30769i)) {
                        m19891a(c4524Gj, c4821t5);
                    }
                }
                this.f30832h = 1;
                this.f30831g = null;
            }
            int iM19495a = AbstractC4560I7.m19495a(this.f30832h);
            if (iM19495a == 1) {
                C4524Gj c4524Gj2 = this.f30831g;
                long j = c4821t5.f30769i;
                c4524Gj2.f30197i = j;
                C4931Xj c4931Xj = c4524Gj2.f30190b;
                c4931Xj.m19986a(C4931Xj.f31054d, Long.valueOf(j));
                c4931Xj.m19988b();
                return this.f30831g;
            }
            if (iM19495a == 2) {
                return this.f30831g;
            }
            this.f30825a.f31735n.info("Start background session", new Object[0]);
            this.f30832h = 2;
            long j2 = c4821t5.f30769i;
            AbstractC5133g abstractC5133g = this.f30830f;
            C4548Hj c4548Hj = new C4548Hj(j2, c4821t5.f30770j);
            abstractC5133g.getClass();
            C4524Gj c4524GjM20397a = abstractC5133g.m20397a(c4548Hj);
            if (this.f30825a.f31743v.m21104c()) {
                C5114f5 c5114f5 = this.f30827c;
                c5114f5.f31652a.f31736o.m20572a(C4821T5.m19835a(c4821t5, this.f30828d), m19888a(c4524GjM20397a, c4821t5.f30769i));
            } else {
                int i = c4821t5.f30764d;
                EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    C5114f5 c5114f52 = this.f30827c;
                    c5114f52.f31652a.f31736o.m20572a(c4821t5, m19888a(c4524GjM20397a, j2));
                    C5114f5 c5114f53 = this.f30827c;
                    c5114f53.f31652a.f31736o.m20572a(C4821T5.m19835a(c4821t5, this.f30828d), m19888a(c4524GjM20397a, j2));
                }
            }
            this.f30831g = c4524GjM20397a;
            return c4524GjM20397a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m19893c(C4821T5 c4821t5) {
        try {
            if (this.f30832h == 0) {
                C4524Gj c4524GjM20400b = this.f30829e.m20400b();
                if (c4524GjM20400b != null) {
                    if (c4524GjM20400b.m19453a(c4821t5.f30769i)) {
                        this.f30831g = c4524GjM20400b;
                        this.f30832h = 3;
                    } else {
                        m19891a(c4524GjM20400b, c4821t5);
                    }
                }
                C4524Gj c4524GjM20400b2 = this.f30830f.m20400b();
                if (c4524GjM20400b2 != null) {
                    if (c4524GjM20400b2.m19453a(c4821t5.f30769i)) {
                        this.f30831g = c4524GjM20400b2;
                        this.f30832h = 2;
                    } else {
                        m19891a(c4524GjM20400b2, c4821t5);
                    }
                }
                this.f30831g = null;
                this.f30832h = 1;
            }
            int iM19495a = AbstractC4560I7.m19495a(this.f30832h);
            if (iM19495a == 0) {
                this.f30831g = m19890a(c4821t5);
            } else if (iM19495a == 1) {
                m19891a(this.f30831g, c4821t5);
                this.f30831g = m19890a(c4821t5);
            } else if (iM19495a == 2) {
                C4524Gj c4524Gj = this.f30831g;
                if (c4524Gj != null) {
                    if (c4524Gj.m19453a(c4821t5.f30769i)) {
                        C4524Gj c4524Gj2 = this.f30831g;
                        long j = c4821t5.f30769i;
                        c4524Gj2.f30197i = j;
                        C4931Xj c4931Xj = c4524Gj2.f30190b;
                        c4931Xj.m19986a(C4931Xj.f31054d, Long.valueOf(j));
                        c4931Xj.m19988b();
                    } else {
                        m19891a(c4524Gj, c4821t5);
                    }
                }
                this.f30831g = m19890a(c4821t5);
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final C4524Gj m19890a(C4821T5 c4821t5) {
        this.f30825a.f31735n.info("Start foreground session", new Object[0]);
        long j = c4821t5.f30769i;
        AbstractC5133g abstractC5133g = this.f30829e;
        C4548Hj c4548Hj = new C4548Hj(j, c4821t5.f30770j);
        abstractC5133g.getClass();
        C4524Gj c4524GjM20397a = abstractC5133g.m20397a(c4548Hj);
        this.f30832h = 3;
        this.f30825a.f31738q.m20860b();
        C5114f5 c5114f5 = this.f30827c;
        c5114f5.f31652a.f31736o.m20572a(C4821T5.m19835a(c4821t5, this.f30828d), m19888a(c4524GjM20397a, j));
        return c4524GjM20397a;
    }

    /* renamed from: a */
    public final void m19891a(C4524Gj c4524Gj, C4821T5 c4821t5) {
        if (c4524Gj.f30195g && c4524Gj.f30192d > 0) {
            C5114f5 c5114f5 = this.f30827c;
            C4821T5 c4821t5M19836a = C4821T5.m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_ALIVE);
            C4907Wj c4907Wj = new C4907Wj();
            c4907Wj.f30989a = c4524Gj.f30192d;
            c4907Wj.f30992d = c4524Gj.f30191c.f30367a;
            long andIncrement = c4524Gj.f30194f.getAndIncrement();
            C4931Xj c4931Xj = c4524Gj.f30190b;
            c4931Xj.m19986a(C4931Xj.f31057g, Long.valueOf(c4524Gj.f30194f.get()));
            c4931Xj.m19988b();
            c4907Wj.f30990b = andIncrement;
            c4907Wj.f30991c = TimeUnit.MILLISECONDS.toSeconds(Math.max(c4524Gj.f30197i - c4524Gj.f30193e, c4524Gj.f30198j));
            c5114f5.f31652a.f31736o.m20572a(c4821t5M19836a, c4907Wj);
            if (c4524Gj.f30195g) {
                c4524Gj.f30195g = false;
                C4931Xj c4931Xj2 = c4524Gj.f30190b;
                c4931Xj2.m19986a(C4931Xj.f31059i, Boolean.FALSE);
                c4931Xj2.m19988b();
            }
        }
        PublicLogger publicLogger = this.f30825a.f31735n;
        int iOrdinal = c4524Gj.f30191c.f30367a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (c4524Gj) {
            C4931Xj c4931Xj3 = c4524Gj.f30190b;
            c4931Xj3.getClass();
            c4931Xj3.f31062c = new C4995ab();
            c4931Xj3.m19988b();
            c4524Gj.f30196h = null;
        }
    }

    /* renamed from: a */
    public static C4907Wj m19888a(C4524Gj c4524Gj, long j) {
        C4907Wj c4907Wj = new C4907Wj();
        c4907Wj.f30989a = c4524Gj.f30192d;
        long andIncrement = c4524Gj.f30194f.getAndIncrement();
        C4931Xj c4931Xj = c4524Gj.f30190b;
        c4931Xj.m19986a(C4931Xj.f31057g, Long.valueOf(c4524Gj.f30194f.get()));
        c4931Xj.m19988b();
        c4907Wj.f30990b = andIncrement;
        C4931Xj c4931Xj2 = c4524Gj.f30190b;
        long j2 = j - c4524Gj.f30193e;
        c4524Gj.f30198j = j2;
        c4931Xj2.m19986a(C4931Xj.f31055e, Long.valueOf(j2));
        c4907Wj.f30991c = TimeUnit.MILLISECONDS.toSeconds(c4524Gj.f30198j);
        c4907Wj.f30992d = c4524Gj.f30191c.f30367a;
        return c4907Wj;
    }
}
