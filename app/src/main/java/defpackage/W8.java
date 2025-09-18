package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class W8 implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public W8(AbstractC4257hz1 abstractC4257hz1, C6860rY0 c6860rY0) {
        this.b = abstractC4257hz1;
        this.c = c6860rY0;
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3 = this.b;
        boolean z = false;
        switch (this.a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFB = b(rational);
                RectF rectFB2 = b(rational2);
                RectF rectF = (RectF) obj3;
                boolean z2 = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
                if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
            default:
                InterfaceC0877Kz1 interfaceC0877Kz1 = (InterfaceC0877Kz1) obj;
                InterfaceC0877Kz1 interfaceC0877Kz12 = (InterfaceC0877Kz1) obj2;
                if (interfaceC0877Kz1 instanceof C6980sA1) {
                    return !(interfaceC0877Kz12 instanceof C6980sA1) ? 1 : 0;
                }
                if (interfaceC0877Kz12 instanceof C6980sA1) {
                    return -1;
                }
                AbstractC4257hz1 abstractC4257hz1 = (AbstractC4257hz1) obj3;
                return abstractC4257hz1 == null ? interfaceC0877Kz1.zzf().compareTo(interfaceC0877Kz12.zzf()) : (int) AbstractC6955s22.h(abstractC4257hz1.a((C6860rY0) this.c, Arrays.asList(interfaceC0877Kz1, interfaceC0877Kz12)).zze().doubleValue());
        }
    }

    public W8(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }
}
