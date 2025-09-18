package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: Ic0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0651Ic0 {
    public static final VH a = VH.A("x", "y");

    public static int a(AbstractC8396zc0 abstractC8396zc0) {
        abstractC8396zc0.m();
        int iD = (int) (abstractC8396zc0.D() * 255.0d);
        int iD2 = (int) (abstractC8396zc0.D() * 255.0d);
        int iD3 = (int) (abstractC8396zc0.D() * 255.0d);
        while (abstractC8396zc0.x()) {
            abstractC8396zc0.d0();
        }
        abstractC8396zc0.o();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, iD, iD2, iD3);
    }

    public static PointF b(AbstractC8396zc0 abstractC8396zc0, float f) {
        int iX = AbstractC8235ym.x(abstractC8396zc0.U());
        if (iX == 0) {
            abstractC8396zc0.m();
            float fD = (float) abstractC8396zc0.D();
            float fD2 = (float) abstractC8396zc0.D();
            while (abstractC8396zc0.U() != 2) {
                abstractC8396zc0.d0();
            }
            abstractC8396zc0.o();
            return new PointF(fD * f, fD2 * f);
        }
        if (iX != 2) {
            if (iX != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(NX.s(abstractC8396zc0.U())));
            }
            float fD3 = (float) abstractC8396zc0.D();
            float fD4 = (float) abstractC8396zc0.D();
            while (abstractC8396zc0.x()) {
                abstractC8396zc0.d0();
            }
            return new PointF(fD3 * f, fD4 * f);
        }
        abstractC8396zc0.n();
        float fD5 = 0.0f;
        float fD6 = 0.0f;
        while (abstractC8396zc0.x()) {
            int iX2 = abstractC8396zc0.X(a);
            if (iX2 == 0) {
                fD5 = d(abstractC8396zc0);
            } else if (iX2 != 1) {
                abstractC8396zc0.b0();
                abstractC8396zc0.d0();
            } else {
                fD6 = d(abstractC8396zc0);
            }
        }
        abstractC8396zc0.p();
        return new PointF(fD5 * f, fD6 * f);
    }

    public static ArrayList c(AbstractC8396zc0 abstractC8396zc0, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC8396zc0.m();
        while (abstractC8396zc0.U() == 1) {
            abstractC8396zc0.m();
            arrayList.add(b(abstractC8396zc0, f));
            abstractC8396zc0.o();
        }
        abstractC8396zc0.o();
        return arrayList;
    }

    public static float d(AbstractC8396zc0 abstractC8396zc0) {
        int iU = abstractC8396zc0.U();
        int iX = AbstractC8235ym.x(iU);
        if (iX != 0) {
            if (iX == 6) {
                return (float) abstractC8396zc0.D();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(NX.s(iU)));
        }
        abstractC8396zc0.m();
        float fD = (float) abstractC8396zc0.D();
        while (abstractC8396zc0.x()) {
            abstractC8396zc0.d0();
        }
        abstractC8396zc0.o();
        return fD;
    }
}
