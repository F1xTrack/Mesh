package defpackage;

/* renamed from: q00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6564q00 implements Cloneable {
    public final AbstractC8279z00 a;
    public AbstractC8279z00 b;

    public AbstractC6564q00(AbstractC8279z00 abstractC8279z00) {
        this.a = abstractC8279z00;
        if (abstractC8279z00.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (AbstractC8279z00) abstractC8279z00.m(4);
    }

    public final Object clone() {
        AbstractC6564q00 abstractC6564q00 = (AbstractC6564q00) this.a.m(5);
        abstractC6564q00.b = m();
        return abstractC6564q00;
    }

    public final AbstractC8279z00 l() {
        AbstractC8279z00 abstractC8279z00M = m();
        abstractC8279z00M.getClass();
        boolean zC = true;
        byte bByteValue = ((Byte) abstractC8279z00M.m(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                YF0 yf0 = YF0.c;
                yf0.getClass();
                zC = yf0.a(abstractC8279z00M.getClass()).c(abstractC8279z00M);
                abstractC8279z00M.m(2);
            }
        }
        if (zC) {
            return abstractC8279z00M;
        }
        throw new C7074sg("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC8279z00 m() {
        if (!this.b.p()) {
            return this.b;
        }
        AbstractC8279z00 abstractC8279z00 = this.b;
        abstractC8279z00.getClass();
        YF0 yf0 = YF0.c;
        yf0.getClass();
        yf0.a(abstractC8279z00.getClass()).b(abstractC8279z00);
        abstractC8279z00.q();
        return this.b;
    }

    public final void n() {
        if (this.b.p()) {
            return;
        }
        AbstractC8279z00 abstractC8279z00 = (AbstractC8279z00) this.a.m(4);
        AbstractC8279z00 abstractC8279z002 = this.b;
        YF0 yf0 = YF0.c;
        yf0.getClass();
        yf0.a(abstractC8279z00.getClass()).d(abstractC8279z00, abstractC8279z002);
        this.b = abstractC8279z00;
    }
}
