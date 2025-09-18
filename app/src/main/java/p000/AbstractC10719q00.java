package p000;

/* renamed from: q00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10719q00 implements Cloneable {

    /* renamed from: a */
    public final AbstractC11868z00 f40482a;

    /* renamed from: b */
    public AbstractC11868z00 f40483b;

    public AbstractC10719q00(AbstractC11868z00 abstractC11868z00) {
        this.f40482a = abstractC11868z00;
        if (abstractC11868z00.m26296p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f40483b = (AbstractC11868z00) abstractC11868z00.mo2061m(4);
    }

    public final Object clone() {
        AbstractC10719q00 abstractC10719q00 = (AbstractC10719q00) this.f40482a.mo2061m(5);
        abstractC10719q00.f40483b = m23921m();
        return abstractC10719q00;
    }

    /* renamed from: l */
    public final AbstractC11868z00 m23920l() {
        AbstractC11868z00 abstractC11868z00M23921m = m23921m();
        abstractC11868z00M23921m.getClass();
        boolean zMo1710c = true;
        byte bByteValue = ((Byte) abstractC11868z00M23921m.mo2061m(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo1710c = false;
            } else {
                YF0 yf0 = YF0.f14212c;
                yf0.getClass();
                zMo1710c = yf0.m9251a(abstractC11868z00M23921m.getClass()).mo1710c(abstractC11868z00M23921m);
                abstractC11868z00M23921m.mo2061m(2);
            }
        }
        if (zMo1710c) {
            return abstractC11868z00M23921m;
        }
        throw new C6838sg("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: m */
    public final AbstractC11868z00 m23921m() {
        if (!this.f40483b.m26296p()) {
            return this.f40483b;
        }
        AbstractC11868z00 abstractC11868z00 = this.f40483b;
        abstractC11868z00.getClass();
        YF0 yf0 = YF0.f14212c;
        yf0.getClass();
        yf0.m9251a(abstractC11868z00.getClass()).mo1709b(abstractC11868z00);
        abstractC11868z00.m26297q();
        return this.f40483b;
    }

    /* renamed from: n */
    public final void m23922n() {
        if (this.f40483b.m26296p()) {
            return;
        }
        AbstractC11868z00 abstractC11868z00 = (AbstractC11868z00) this.f40482a.mo2061m(4);
        AbstractC11868z00 abstractC11868z002 = this.f40483b;
        YF0 yf0 = YF0.f14212c;
        yf0.getClass();
        yf0.m9251a(abstractC11868z00.getClass()).mo1711d(abstractC11868z00, abstractC11868z002);
        this.f40483b = abstractC11868z00;
    }
}
