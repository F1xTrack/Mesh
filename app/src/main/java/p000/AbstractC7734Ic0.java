package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: Ic0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7734Ic0 {

    /* renamed from: a */
    public static final C1339VH f5042a = C1339VH.m8357A("x", "y");

    /* renamed from: a */
    public static int m3954a(AbstractC11947zc0 abstractC11947zc0) {
        abstractC11947zc0.mo3523m();
        int iMo3514D = (int) (abstractC11947zc0.mo3514D() * 255.0d);
        int iMo3514D2 = (int) (abstractC11947zc0.mo3514D() * 255.0d);
        int iMo3514D3 = (int) (abstractC11947zc0.mo3514D() * 255.0d);
        while (abstractC11947zc0.mo3535x()) {
            abstractC11947zc0.mo3520d0();
        }
        abstractC11947zc0.mo3527o();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, iMo3514D, iMo3514D2, iMo3514D3);
    }

    /* renamed from: b */
    public static PointF m3955b(AbstractC11947zc0 abstractC11947zc0, float f) {
        int iM26247x = AbstractC7222ym.m26247x(abstractC11947zc0.mo3517U());
        if (iM26247x == 0) {
            abstractC11947zc0.mo3523m();
            float fMo3514D = (float) abstractC11947zc0.mo3514D();
            float fMo3514D2 = (float) abstractC11947zc0.mo3514D();
            while (abstractC11947zc0.mo3517U() != 2) {
                abstractC11947zc0.mo3520d0();
            }
            abstractC11947zc0.mo3527o();
            return new PointF(fMo3514D * f, fMo3514D2 * f);
        }
        if (iM26247x != 2) {
            if (iM26247x != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC0852NX.m5770s(abstractC11947zc0.mo3517U())));
            }
            float fMo3514D3 = (float) abstractC11947zc0.mo3514D();
            float fMo3514D4 = (float) abstractC11947zc0.mo3514D();
            while (abstractC11947zc0.mo3535x()) {
                abstractC11947zc0.mo3520d0();
            }
            return new PointF(fMo3514D3 * f, fMo3514D4 * f);
        }
        abstractC11947zc0.mo3525n();
        float fM3957d = 0.0f;
        float fM3957d2 = 0.0f;
        while (abstractC11947zc0.mo3535x()) {
            int iMo3518X = abstractC11947zc0.mo3518X(f5042a);
            if (iMo3518X == 0) {
                fM3957d = m3957d(abstractC11947zc0);
            } else if (iMo3518X != 1) {
                abstractC11947zc0.mo3519b0();
                abstractC11947zc0.mo3520d0();
            } else {
                fM3957d2 = m3957d(abstractC11947zc0);
            }
        }
        abstractC11947zc0.mo3529p();
        return new PointF(fM3957d * f, fM3957d2 * f);
    }

    /* renamed from: c */
    public static ArrayList m3956c(AbstractC11947zc0 abstractC11947zc0, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC11947zc0.mo3523m();
        while (abstractC11947zc0.mo3517U() == 1) {
            abstractC11947zc0.mo3523m();
            arrayList.add(m3955b(abstractC11947zc0, f));
            abstractC11947zc0.mo3527o();
        }
        abstractC11947zc0.mo3527o();
        return arrayList;
    }

    /* renamed from: d */
    public static float m3957d(AbstractC11947zc0 abstractC11947zc0) {
        int iMo3517U = abstractC11947zc0.mo3517U();
        int iM26247x = AbstractC7222ym.m26247x(iMo3517U);
        if (iM26247x != 0) {
            if (iM26247x == 6) {
                return (float) abstractC11947zc0.mo3514D();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC0852NX.m5770s(iMo3517U)));
        }
        abstractC11947zc0.mo3523m();
        float fMo3514D = (float) abstractC11947zc0.mo3514D();
        while (abstractC11947zc0.mo3535x()) {
            abstractC11947zc0.mo3520d0();
        }
        abstractC11947zc0.mo3527o();
        return fMo3514D;
    }
}
