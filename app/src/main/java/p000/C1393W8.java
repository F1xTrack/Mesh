package p000;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: W8 */
/* loaded from: classes.dex */
public final class C1393W8 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f12999a = 0;

    /* renamed from: b */
    public final Object f13000b;

    /* renamed from: c */
    public final Object f13001c;

    public C1393W8(AbstractC9694hz1 abstractC9694hz1, C10919rY0 c10919rY0) {
        this.f13000b = abstractC9694hz1;
        this.f13001c = c10919rY0;
    }

    /* renamed from: a */
    public static float m8673a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    /* renamed from: b */
    public RectF m8674b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.f13001c;
        return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3 = this.f13000b;
        boolean z = false;
        switch (this.f12999a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFM8674b = m8674b(rational);
                RectF rectFM8674b2 = m8674b(rational2);
                RectF rectF = (RectF) obj3;
                boolean z2 = rectFM8674b.width() >= rectF.width() && rectFM8674b.height() >= rectF.height();
                if (rectFM8674b2.width() >= rectF.width() && rectFM8674b2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((rectFM8674b.height() * rectFM8674b.width()) - (rectFM8674b2.height() * rectFM8674b2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(m8673a(rectFM8674b, rectF) - m8673a(rectFM8674b2, rectF)));
            default:
                InterfaceC7885Kz1 interfaceC7885Kz1 = (InterfaceC7885Kz1) obj;
                InterfaceC7885Kz1 interfaceC7885Kz12 = (InterfaceC7885Kz1) obj2;
                if (interfaceC7885Kz1 instanceof C11000sA1) {
                    return !(interfaceC7885Kz12 instanceof C11000sA1) ? 1 : 0;
                }
                if (interfaceC7885Kz12 instanceof C11000sA1) {
                    return -1;
                }
                AbstractC9694hz1 abstractC9694hz1 = (AbstractC9694hz1) obj3;
                return abstractC9694hz1 == null ? interfaceC7885Kz1.zzf().compareTo(interfaceC7885Kz12.zzf()) : (int) AbstractC10983s22.m24586h(abstractC9694hz1.mo6842a((C10919rY0) this.f13001c, Arrays.asList(interfaceC7885Kz1, interfaceC7885Kz12)).zze().doubleValue());
        }
    }

    public C1393W8(Rational rational, Rational rational2) {
        this.f13001c = rational2 == null ? new Rational(4, 3) : rational2;
        this.f13000b = m8674b(rational);
    }
}
