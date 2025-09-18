package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: oV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6278oV implements InterfaceC5441k61, InterfaceC1651Uy {
    public final /* synthetic */ C6469pV a;

    public /* synthetic */ C6278oV(C6469pV c6469pV) {
        this.a = c6469pV;
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        C6469pV c6469pV = this.a;
        Task taskC = c6469pV.d.c();
        Task taskC2 = c6469pV.e.c();
        return AbstractC3782fU1.h(taskC, taskC2).g(c6469pV.c, new C4290i9(c6469pV, taskC, taskC2, 11));
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) throws JSONException {
        boolean z;
        C6469pV c6469pV = this.a;
        c6469pV.getClass();
        if (task.k()) {
            c6469pV.d.b();
            C8265yw c8265yw = (C8265yw) task.i();
            if (c8265yw != null) {
                JSONArray jSONArray = c8265yw.d;
                GU gu = c6469pV.b;
                if (gu != null) {
                    try {
                        gu.c(C6469pV.g(jSONArray));
                    } catch (JSONException | C6948s1 unused) {
                    }
                }
                C6860rY0 c6860rY0 = c6469pV.l;
                try {
                    C7641ve c7641veL = ((N8) c6860rY0.c).l(c8265yw);
                    Iterator it = ((Set) c6860rY0.e).iterator();
                    while (it.hasNext()) {
                        ((Executor) c6860rY0.d).execute(new RunnableC5891mT0((C7169tA) it.next(), c7641veL, 0));
                    }
                } catch (C6850rV unused2) {
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
