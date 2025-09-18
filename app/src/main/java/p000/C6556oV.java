package p000;

import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: oV */
/* loaded from: classes.dex */
public final /* synthetic */ class C6556oV implements InterfaceC9968k61, InterfaceC1319Uy {

    /* renamed from: a */
    public final /* synthetic */ C6621pV f39038a;

    public /* synthetic */ C6556oV(C6621pV c6621pV) {
        this.f39038a = c6621pV;
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        C6621pV c6621pV = this.f39038a;
        Task taskM26005c = c6621pV.f40117d.m26005c();
        Task taskM26005c2 = c6621pV.f40118e.m26005c();
        return AbstractC9376fU1.m18247h(taskM26005c, taskM26005c2).mo11140g(c6621pV.f40116c, new C4224i9(c6621pV, taskM26005c, taskM26005c2, 11));
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) throws JSONException {
        boolean z;
        C6621pV c6621pV = this.f39038a;
        c6621pV.getClass();
        if (task.mo11144k()) {
            c6621pV.f40117d.m26004b();
            C7232yw c7232yw = (C7232yw) task.mo11142i();
            if (c7232yw != null) {
                JSONArray jSONArray = c7232yw.f46545d;
                C0409GU c0409gu = c6621pV.f40115b;
                if (c0409gu != null) {
                    try {
                        c0409gu.m3073c(C6621pV.m23804g(jSONArray));
                    } catch (JSONException | C6797s1 unused) {
                    }
                }
                C10919rY0 c10919rY0 = c6621pV.f40125l;
                try {
                    C7025ve c7025veM5560l = ((C0827N8) c10919rY0.f41729c).m5560l(c7232yw);
                    Iterator it = ((Set) c10919rY0.f41731e).iterator();
                    while (it.hasNext()) {
                        ((Executor) c10919rY0.f41730d).execute(new RunnableC10269mT0((C6869tA) it.next(), c7025veM5560l, 0));
                    }
                } catch (C6747rV unused2) {
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
