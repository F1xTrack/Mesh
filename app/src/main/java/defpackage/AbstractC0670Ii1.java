package defpackage;

import java.util.HashMap;

/* renamed from: Ii1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0670Ii1 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("impactLight", new C0826Ki1(new long[]{0, 20}));
        map.put("impactMedium", new C0826Ki1(new long[]{0, 40}));
        map.put("impactHeavy", new C0826Ki1(new long[]{0, 60}));
        map.put("notificationSuccess", new C0826Ki1(new long[]{0, 40, 60, 20}));
        map.put("notificationWarning", new C0826Ki1(new long[]{0, 20, 60, 40}));
        map.put("notificationError", new C0826Ki1(new long[]{0, 20, 40, 30, 40, 40}));
        map.put("rigid", new C0826Ki1(new long[]{0, 30}));
        map.put("soft", new C0826Ki1(new long[]{0, 10}));
        map.put("clockTick", new C0748Ji1(4, 1));
        map.put("contextClick", new C0748Ji1(6, 1));
        map.put("keyboardPress", new C0748Ji1(3, 1));
        map.put("keyboardRelease", new C0748Ji1(7, 1));
        map.put("keyboardTap", new C0748Ji1(3, 1));
        map.put("longPress", new C0748Ji1(0, 1));
        map.put("textHandleMove", new C0748Ji1(9, 1));
        map.put("virtualKey", new C0748Ji1(1, 1));
        map.put("virtualKeyRelease", new C0748Ji1(8, 1));
        map.put("effectClick", new C0748Ji1(0, 0));
        map.put("effectDoubleClick", new C0748Ji1(1, 0));
        map.put("effectHeavyClick", new C0748Ji1(5, 0));
        map.put("effectTick", new C0748Ji1(2, 0));
    }
}
