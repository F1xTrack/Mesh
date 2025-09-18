package p000;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.C1930a;
import com.facebook.react.uimanager.events.C1931b;
import java.util.Iterator;

/* renamed from: wP */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7073wP implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ int f44855a;

    /* renamed from: b */
    public volatile boolean f44856b = false;

    /* renamed from: c */
    public boolean f44857c = false;

    /* renamed from: d */
    public final /* synthetic */ Object f44858d;

    public /* synthetic */ ChoreographerFrameCallbackC7073wP(int i, Object obj) {
        this.f44855a = i;
        this.f44858d = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f44855a) {
            case 0:
                UiThreadUtil.assertOnUiThread();
                if (this.f44857c) {
                    this.f44856b = false;
                } else if (!ReactFeatureFlags.enableFabricRendererExclusively) {
                    MJ0.m5303a().m5305c(4, ((C1930a) this.f44858d).f17950j);
                }
                MT1.m5371b("ScheduleDispatchFrameCallback");
                try {
                    C1930a.m11039k((C1930a) this.f44858d);
                    if (!((C1930a) this.f44858d).f17956p) {
                        ((C1930a) this.f44858d).f17956p = true;
                        MT1.m5370a(((C1930a) this.f44858d).f17951k.get(), "ScheduleDispatchFrameCallback");
                        C1930a c1930a = (C1930a) this.f44858d;
                        c1930a.f17943c.runOnJSQueueThread(c1930a.f17946f);
                    }
                    return;
                } finally {
                }
            default:
                UiThreadUtil.assertOnUiThread();
                if (this.f44857c) {
                    this.f44856b = false;
                } else {
                    MJ0.m5303a().m5305c(4, ((C1931b) this.f44858d).f17961e);
                }
                MT1.m5371b("BatchEventDispatchedListeners");
                try {
                    Iterator it = ((C1931b) this.f44858d).f17960d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1301Ug) it.next()).onBatchEventDispatched();
                    }
                    return;
                } finally {
                }
        }
    }
}
