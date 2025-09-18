package p000;

import java.util.HashMap;

/* renamed from: Ii1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7747Ii1 {

    /* renamed from: a */
    public static final HashMap f5090a;

    static {
        HashMap map = new HashMap();
        f5090a = map;
        map.put("impactLight", new C7851Ki1(new long[]{0, 20}));
        map.put("impactMedium", new C7851Ki1(new long[]{0, 40}));
        map.put("impactHeavy", new C7851Ki1(new long[]{0, 60}));
        map.put("notificationSuccess", new C7851Ki1(new long[]{0, 40, 60, 20}));
        map.put("notificationWarning", new C7851Ki1(new long[]{0, 20, 60, 40}));
        map.put("notificationError", new C7851Ki1(new long[]{0, 20, 40, 30, 40, 40}));
        map.put("rigid", new C7851Ki1(new long[]{0, 30}));
        map.put("soft", new C7851Ki1(new long[]{0, 10}));
        map.put("clockTick", new C7799Ji1(4, 1));
        map.put("contextClick", new C7799Ji1(6, 1));
        map.put("keyboardPress", new C7799Ji1(3, 1));
        map.put("keyboardRelease", new C7799Ji1(7, 1));
        map.put("keyboardTap", new C7799Ji1(3, 1));
        map.put("longPress", new C7799Ji1(0, 1));
        map.put("textHandleMove", new C7799Ji1(9, 1));
        map.put("virtualKey", new C7799Ji1(1, 1));
        map.put("virtualKeyRelease", new C7799Ji1(8, 1));
        map.put("effectClick", new C7799Ji1(0, 0));
        map.put("effectDoubleClick", new C7799Ji1(1, 0));
        map.put("effectHeavyClick", new C7799Ji1(5, 0));
        map.put("effectTick", new C7799Ji1(2, 0));
    }
}
