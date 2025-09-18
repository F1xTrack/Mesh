package p000;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: GU */
/* loaded from: classes.dex */
public final class C0409GU {

    /* renamed from: a */
    public final InterfaceC9347fG0 f3757a;

    /* renamed from: b */
    public Integer f3758b = null;

    public C0409GU(InterfaceC9347fG0 interfaceC9347fG0) {
        this.f3757a = interfaceC9347fG0;
    }

    /* renamed from: a */
    public static boolean m3071a(ArrayList arrayList, C6860t1 c6860t1) {
        String str = c6860t1.f42759a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6860t1 c6860t12 = (C6860t1) it.next();
            if (c6860t12.f42759a.equals(str) && c6860t12.f42760b.equals(c6860t1.f42760b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ArrayList m3072b() {
        C1199T3 c1199t3 = (C1199T3) ((InterfaceC1136S3) this.f3757a.get());
        c1199t3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((CG1) c1199t3.f11130a.f27505b).m1133b("frc", "")) {
            V70 v70 = AbstractC10624pE1.f39956a;
            Preconditions.checkNotNull(bundle);
            C1073R3 c1073r3 = new C1073R3();
            c1073r3.f9952a = (String) Preconditions.checkNotNull((String) I22.m3735c(bundle, "origin", String.class, null));
            c1073r3.f9953b = (String) Preconditions.checkNotNull((String) I22.m3735c(bundle, "name", String.class, null));
            c1073r3.f9954c = I22.m3735c(bundle, "value", Object.class, null);
            c1073r3.f9955d = (String) I22.m3735c(bundle, "trigger_event_name", String.class, null);
            c1073r3.f9956e = ((Long) I22.m3735c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c1073r3.f9957f = (String) I22.m3735c(bundle, "timed_out_event_name", String.class, null);
            c1073r3.f9958g = (Bundle) I22.m3735c(bundle, "timed_out_event_params", Bundle.class, null);
            c1073r3.f9959h = (String) I22.m3735c(bundle, "triggered_event_name", String.class, null);
            c1073r3.f9960i = (Bundle) I22.m3735c(bundle, "triggered_event_params", Bundle.class, null);
            c1073r3.f9961j = ((Long) I22.m3735c(bundle, "time_to_live", Long.class, 0L)).longValue();
            c1073r3.f9962k = (String) I22.m3735c(bundle, "expired_event_name", String.class, null);
            c1073r3.f9963l = (Bundle) I22.m3735c(bundle, "expired_event_params", Bundle.class, null);
            c1073r3.f9965n = ((Boolean) I22.m3735c(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            c1073r3.f9964m = ((Long) I22.m3735c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c1073r3.f9966o = ((Long) I22.m3735c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c1073r3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0298  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3073c(java.util.ArrayList r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0409GU.m3073c(java.util.ArrayList):void");
    }
}
