package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class YQ1 {
    /* renamed from: a */
    public static CameraDevice.StateCallback m9297a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new C4202ho() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new C4139go(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final InterfaceC11293uT0 m9298b(View view) {
        O90.m5968f(view, "reactView");
        View view2 = view;
        while (!(view2 instanceof InterfaceC11293uT0)) {
            Object parent = view2.getParent();
            if (parent == null) {
                return null;
            }
            UN1.m7997a(parent instanceof View);
            view2 = (View) parent;
        }
        return (InterfaceC11293uT0) view2;
    }

    /* renamed from: c */
    public static final Point m9299c(View view) {
        O90.m5968f(view, "v");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
