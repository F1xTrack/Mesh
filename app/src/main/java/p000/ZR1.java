package p000;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class ZR1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14893a = 0;

    /* renamed from: b */
    public /* synthetic */ Bundle f14894b;

    /* renamed from: c */
    public /* synthetic */ FR1 f14895c;

    public /* synthetic */ ZR1() {
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Bundle bundle;
        switch (this.f14893a) {
            case 0:
                Bundle bundle2 = this.f14894b;
                boolean zIsEmpty = bundle2.isEmpty();
                FR1 fr1 = this.f14895c;
                if (zIsEmpty) {
                    bundle = bundle2;
                } else {
                    Bundle bundle3 = new Bundle(fr1.m7851t1().f11742A.m7569U());
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C11287uQ0 c11287uQ0 = fr1.f3225x;
                        C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
                        if (zHasNext) {
                            String next = it.next();
                            Object obj = bundle2.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                fr1.m7852u1();
                                if (C10282mZ1.m22850e2(obj)) {
                                    fr1.m7852u1();
                                    C10282mZ1.m22847Z1(c11287uQ0, null, 27, null, null, 0);
                                }
                                fr1.mo6070n().f8383l.m24553b(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (C10282mZ1.m22837A2(next)) {
                                fr1.mo6070n().f8383l.m24554c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle3.remove(next);
                            } else {
                                C10282mZ1 c10282mZ1M7852u1 = fr1.m7852u1();
                                c9110dP1.f26037g.getClass();
                                if (c10282mZ1M7852u1.m22888h2(RemoteMessageConst.MessageBody.PARAM, next, 500, obj)) {
                                    fr1.m7852u1().m22875P1(next, bundle3, obj);
                                }
                            }
                        } else {
                            fr1.m7852u1();
                            int i = c9110dP1.f26037g.m7852u1().m22890m2(201500000) ? 100 : 25;
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
                                fr1.m7852u1();
                                C10282mZ1.m22847Z1(c11287uQ0, null, 26, null, null, 0);
                                fr1.mo6070n().f8383l.m24555d("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            bundle = bundle3;
                        }
                    }
                }
                fr1.m7851t1().f11742A.m7570V(bundle);
                boolean zIsEmpty2 = bundle2.isEmpty();
                C9110dP1 c9110dP12 = (C9110dP1) fr1.f11615b;
                if (!zIsEmpty2 || c9110dP12.f26037g.m6511E1(null, IB1.f4779Z0)) {
                    C8989cV1 c8989cV1M6946j = RI1.m6946j(c9110dP12);
                    c8989cV1M6946j.m10744F1(new RunnableC1192Sx(c8989cV1M6946j, c8989cV1M6946j.m10752N1(false), bundle, 28, false));
                    break;
                }
                break;
            default:
                FR1 fr12 = this.f14895c;
                fr12.mo7681v1();
                fr12.m18793A1();
                Bundle bundle4 = this.f14894b;
                Preconditions.checkNotNull(bundle4);
                String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle4.getString("name"));
                C9110dP1 c9110dP13 = (C9110dP1) fr12.f11615b;
                if (!c9110dP13.m17593f()) {
                    fr12.mo6070n().f8386o.m24555d("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    C9898jZ1 c9898jZ1 = new C9898jZ1(0L, null, strCheckNotEmpty, "");
                    try {
                        C10282mZ1 c10282mZ1M7852u12 = fr12.m7852u1();
                        bundle4.getString("app_id");
                        c9110dP13.m17601o().m10742D1(new C7571Ey1(bundle4.getString("app_id"), "", c9898jZ1, bundle4.getLong("creation_timestamp"), bundle4.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle4.getString("trigger_event_name"), null, bundle4.getLong("trigger_timeout"), null, bundle4.getLong("time_to_live"), c10282mZ1M7852u12.m22871K1(bundle4.getString("expired_event_name"), bundle4.getBundle("expired_event_params"), "", bundle4.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
        }
    }

    public ZR1(FR1 fr1, Bundle bundle) {
        this.f14894b = bundle;
        this.f14895c = fr1;
    }
}
