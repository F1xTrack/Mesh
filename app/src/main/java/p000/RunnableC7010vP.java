package p000;

import android.os.Trace;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.C1930a;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: vP */
/* loaded from: classes.dex */
public final class RunnableC7010vP implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44362a;

    /* renamed from: b */
    public final /* synthetic */ C1930a f44363b;

    public /* synthetic */ RunnableC7010vP(C1930a c1930a, int i) {
        this.f44362a = i;
        this.f44363b = c1930a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44362a) {
            case 0:
                C1930a c1930a = this.f44363b;
                c1930a.getClass();
                UiThreadUtil.assertOnUiThread();
                c1930a.f17950j.f44857c = true;
                return;
            default:
                MT1.m5371b("DispatchEventsRunnable");
                try {
                    MT1.m5372c(this.f44363b.f17951k.getAndIncrement(), "ScheduleDispatchFrameCallback");
                    this.f44363b.f17956p = false;
                    UN1.m7999c(this.f44363b.f17954n);
                    synchronized (this.f44363b.f17942b) {
                        try {
                            C1930a c1930a2 = this.f44363b;
                            int i = c1930a2.f17953m;
                            if (i > 0) {
                                if (i > 1) {
                                    Arrays.sort(c1930a2.f17952l, 0, i, C1930a.f17940q);
                                }
                                int i2 = 0;
                                while (true) {
                                    C1930a c1930a3 = this.f44363b;
                                    int i3 = c1930a3.f17953m;
                                    if (i2 < i3) {
                                        AbstractC6550oP abstractC6550oP = c1930a3.f17952l[i2];
                                        if (abstractC6550oP != null) {
                                            String eventName = abstractC6550oP.getEventName();
                                            int uniqueID = abstractC6550oP.getUniqueID();
                                            O90.m5968f(eventName, "sectionName");
                                            MT1.m5372c(uniqueID, eventName);
                                            abstractC6550oP.dispatchModern(this.f44363b.f17954n);
                                            abstractC6550oP.dispose();
                                        }
                                        i2++;
                                    } else {
                                        Arrays.fill(c1930a3.f17952l, 0, i3, (Object) null);
                                        c1930a3.f17953m = 0;
                                        this.f44363b.f17944d.clear();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f44363b.f17949i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1301Ug) it.next()).onBatchEventDispatched();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
