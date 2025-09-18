package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: as0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8778as0 {

    /* renamed from: a */
    public static final PointF f16638a = new PointF();

    /* renamed from: a */
    public static PointF m10349a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m10350b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m10351c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: d */
    public static void m10352d(OZ0 oz0, Path path) {
        path.reset();
        PointF pointF = oz0.f8490b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f16638a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = oz0.f8489a;
            if (i >= arrayList.size()) {
                break;
            }
            C6807sB c6807sB = (C6807sB) arrayList.get(i);
            PointF pointF3 = c6807sB.f42286a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = c6807sB.f42287b;
            PointF pointF5 = c6807sB.f42288c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (oz0.f8491c) {
            path.close();
        }
    }

    /* renamed from: e */
    public static float m10353e(float f, float f2, float f3) {
        return AbstractC1374Vq.m8585d(f2, f, f3, f);
    }

    /* renamed from: f */
    public static void m10354f(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02, InterfaceC8052Of0 interfaceC8052Of0) {
        if (c7948Mf0.m5413a(i, interfaceC8052Of0.getName())) {
            String name = interfaceC8052Of0.getName();
            c7948Mf02.getClass();
            C7948Mf0 c7948Mf03 = new C7948Mf0(c7948Mf02);
            c7948Mf03.f7293a.add(name);
            C7948Mf0 c7948Mf04 = new C7948Mf0(c7948Mf03);
            c7948Mf04.f7294b = interfaceC8052Of0;
            arrayList.add(c7948Mf04);
        }
    }
}
