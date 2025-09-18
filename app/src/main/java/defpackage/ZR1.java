package defpackage;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class ZR1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ Bundle b;
    public /* synthetic */ FR1 c;

    public /* synthetic */ ZR1() {
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Bundle bundle;
        switch (this.a) {
            case 0:
                Bundle bundle2 = this.b;
                boolean zIsEmpty = bundle2.isEmpty();
                FR1 fr1 = this.c;
                if (zIsEmpty) {
                    bundle = bundle2;
                } else {
                    Bundle bundle3 = new Bundle(fr1.t1().A.U());
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C7409uQ0 c7409uQ0 = fr1.x;
                        C3386dP1 c3386dP1 = (C3386dP1) fr1.b;
                        if (zHasNext) {
                            String next = it.next();
                            Object obj = bundle2.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                fr1.u1();
                                if (C5910mZ1.e2(obj)) {
                                    fr1.u1();
                                    C5910mZ1.Z1(c7409uQ0, null, 27, null, null, 0);
                                }
                                fr1.n().l.b(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (C5910mZ1.A2(next)) {
                                fr1.n().l.c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle3.remove(next);
                            } else {
                                C5910mZ1 c5910mZ1U1 = fr1.u1();
                                c3386dP1.g.getClass();
                                if (c5910mZ1U1.h2(RemoteMessageConst.MessageBody.PARAM, next, 500, obj)) {
                                    fr1.u1().P1(next, bundle3, obj);
                                }
                            }
                        } else {
                            fr1.u1();
                            int i = c3386dP1.g.u1().m2(201500000) ? 100 : 25;
                            if (bundle3.size() > i) {
                                Iterator it2 = new TreeSet(bundle3.keySet()).iterator();
                                int i2 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i2++;
                                    if (i2 > i) {
                                        bundle3.remove(str);
                                    }
                                }
                                fr1.u1();
                                C5910mZ1.Z1(c7409uQ0, null, 26, null, null, 0);
                                fr1.n().l.d("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            bundle = bundle3;
                        }
                    }
                }
                fr1.t1().A.V(bundle);
                boolean zIsEmpty2 = bundle2.isEmpty();
                C3386dP1 c3386dP12 = (C3386dP1) fr1.b;
                if (!zIsEmpty2 || c3386dP12.g.E1(null, IB1.Z0)) {
                    C2528cV1 c2528cV1J = RI1.j(c3386dP12);
                    c2528cV1J.F1(new RunnableC1492Sx(c2528cV1J, c2528cV1J.N1(false), bundle, 28, false));
                    break;
                }
                break;
            default:
                FR1 fr12 = this.c;
                fr12.v1();
                fr12.A1();
                Bundle bundle4 = this.b;
                Preconditions.checkNotNull(bundle4);
                String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle4.getString("name"));
                C3386dP1 c3386dP13 = (C3386dP1) fr12.b;
                if (!c3386dP13.f()) {
                    fr12.n().o.d("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    C5337jZ1 c5337jZ1 = new C5337jZ1(0L, null, strCheckNotEmpty, "");
                    try {
                        C5910mZ1 c5910mZ1U12 = fr12.u1();
                        bundle4.getString("app_id");
                        c3386dP13.o().D1(new C0406Ey1(bundle4.getString("app_id"), "", c5337jZ1, bundle4.getLong("creation_timestamp"), bundle4.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle4.getString("trigger_event_name"), null, bundle4.getLong("trigger_timeout"), null, bundle4.getLong("time_to_live"), c5910mZ1U12.K1(bundle4.getString("expired_event_name"), bundle4.getBundle("expired_event_params"), "", bundle4.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
        }
    }

    public ZR1(FR1 fr1, Bundle bundle) {
        this.b = bundle;
        this.c = fr1;
    }
}
