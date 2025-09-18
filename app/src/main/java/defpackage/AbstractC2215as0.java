package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: as0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2215as0 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void d(OZ0 oz0, Path path) {
        path.reset();
        PointF pointF = oz0.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = oz0.a;
            if (i >= arrayList.size()) {
                break;
            }
            C6981sB c6981sB = (C6981sB) arrayList.get(i);
            PointF pointF3 = c6981sB.a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = c6981sB.b;
            PointF pointF5 = c6981sB.c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (oz0.c) {
            path.close();
        }
    }

    public static float e(float f, float f2, float f3) {
        return AbstractC1705Vq.d(f2, f, f3, f);
    }

    public static void f(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02, InterfaceC1127Of0 interfaceC1127Of0) {
        if (c0971Mf0.a(i, interfaceC1127Of0.getName())) {
            String name = interfaceC1127Of0.getName();
            c0971Mf02.getClass();
            C0971Mf0 c0971Mf03 = new C0971Mf0(c0971Mf02);
            c0971Mf03.a.add(name);
            C0971Mf0 c0971Mf04 = new C0971Mf0(c0971Mf03);
            c0971Mf04.b = interfaceC1127Of0;
            arrayList.add(c0971Mf04);
        }
    }
}
