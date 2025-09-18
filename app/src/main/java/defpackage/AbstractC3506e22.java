package defpackage;

import com.horcrux.svg.events.SvgLoadEvent;

/* renamed from: e22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3506e22 {
    public static String a(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return SvgLoadEvent.EVENT_NAME;
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        throw new IllegalStateException(("Invalid image event: " + i).toString());
    }
}
