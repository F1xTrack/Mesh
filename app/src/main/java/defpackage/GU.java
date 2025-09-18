package defpackage;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class GU {
    public final InterfaceC3739fG0 a;
    public Integer b = null;

    public GU(InterfaceC3739fG0 interfaceC3739fG0) {
        this.a = interfaceC3739fG0;
    }

    public static boolean a(ArrayList arrayList, C7139t1 c7139t1) {
        String str = c7139t1.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7139t1 c7139t12 = (C7139t1) it.next();
            if (c7139t12.a.equals(str) && c7139t12.b.equals(c7139t1.b)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        T3 t3 = (T3) ((S3) this.a.get());
        t3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((CG1) t3.a.b).b("frc", "")) {
            V70 v70 = AbstractC6420pE1.a;
            Preconditions.checkNotNull(bundle);
            R3 r3 = new R3();
            r3.a = (String) Preconditions.checkNotNull((String) I22.c(bundle, "origin", String.class, null));
            r3.b = (String) Preconditions.checkNotNull((String) I22.c(bundle, "name", String.class, null));
            r3.c = I22.c(bundle, "value", Object.class, null);
            r3.d = (String) I22.c(bundle, "trigger_event_name", String.class, null);
            r3.e = ((Long) I22.c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            r3.f = (String) I22.c(bundle, "timed_out_event_name", String.class, null);
            r3.g = (Bundle) I22.c(bundle, "timed_out_event_params", Bundle.class, null);
            r3.h = (String) I22.c(bundle, "triggered_event_name", String.class, null);
            r3.i = (Bundle) I22.c(bundle, "triggered_event_params", Bundle.class, null);
            r3.j = ((Long) I22.c(bundle, "time_to_live", Long.class, 0L)).longValue();
            r3.k = (String) I22.c(bundle, "expired_event_name", String.class, null);
            r3.l = (Bundle) I22.c(bundle, "expired_event_params", Bundle.class, null);
            r3.n = ((Boolean) I22.c(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            r3.m = ((Long) I22.c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            r3.o = ((Long) I22.c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(r3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GU.c(java.util.ArrayList):void");
    }
}
