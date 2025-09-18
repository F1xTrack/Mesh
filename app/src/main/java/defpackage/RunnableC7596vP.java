package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.a;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: vP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7596vP implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ RunnableC7596vP(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                aVar.getClass();
                UiThreadUtil.assertOnUiThread();
                aVar.j.c = true;
                return;
            default:
                MT1.b("DispatchEventsRunnable");
                try {
                    MT1.c(this.b.k.getAndIncrement(), "ScheduleDispatchFrameCallback");
                    this.b.p = false;
                    UN1.c(this.b.n);
                    synchronized (this.b.b) {
                        try {
                            a aVar2 = this.b;
                            int i = aVar2.m;
                            if (i > 0) {
                                if (i > 1) {
                                    Arrays.sort(aVar2.l, 0, i, a.q);
                                }
                                int i2 = 0;
                                while (true) {
                                    a aVar3 = this.b;
                                    int i3 = aVar3.m;
                                    if (i2 < i3) {
                                        AbstractC6260oP abstractC6260oP = aVar3.l[i2];
                                        if (abstractC6260oP != null) {
                                            String eventName = abstractC6260oP.getEventName();
                                            int uniqueID = abstractC6260oP.getUniqueID();
                                            O90.f(eventName, "sectionName");
                                            MT1.c(uniqueID, eventName);
                                            abstractC6260oP.dispatchModern(this.b.n);
                                            abstractC6260oP.dispose();
                                        }
                                        i2++;
                                    } else {
                                        Arrays.fill(aVar3.l, 0, i3, (Object) null);
                                        aVar3.m = 0;
                                        this.b.d.clear();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.b.i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1597Ug) it.next()).onBatchEventDispatched();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
