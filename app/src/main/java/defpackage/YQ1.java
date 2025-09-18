package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class YQ1 {
    public static CameraDevice.StateCallback a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new C4222ho() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new C4031go(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC7418uT0 b(View view) {
        O90.f(view, "reactView");
        View view2 = view;
        while (!(view2 instanceof InterfaceC7418uT0)) {
            Object parent = view2.getParent();
            if (parent == null) {
                return null;
            }
            UN1.a(parent instanceof View);
            view2 = (View) parent;
        }
        return (InterfaceC7418uT0) view2;
    }

    public static final Point c(View view) {
        O90.f(view, "v");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
