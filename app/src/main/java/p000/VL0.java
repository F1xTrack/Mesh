package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class VL0 {

    /* renamed from: c */
    public static final C11370v32 f12523c = new C11370v32(19);

    /* renamed from: d */
    public static volatile VL0 f12524d;

    /* renamed from: a */
    public ArrayList f12525a;

    /* renamed from: b */
    public ArrayList f12526b;

    /* renamed from: a */
    public final void m8418a(String str, C1474XQ c1474xq) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        O90.m5968f(c1474xq, "player");
        Iterator it = this.f12526b.iterator();
        while (it.hasNext()) {
            ((VL0) it.next()).m8418a(str, c1474xq);
        }
    }

    /* renamed from: b */
    public final void m8419b(String str, C1474XQ c1474xq) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        O90.m5968f(c1474xq, "player");
        Iterator it = this.f12526b.iterator();
        while (it.hasNext()) {
            ((VL0) it.next()).m8419b(str, c1474xq);
        }
    }
}
