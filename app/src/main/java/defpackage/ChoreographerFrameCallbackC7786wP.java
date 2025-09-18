package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.a;
import com.facebook.react.uimanager.events.b;
import java.util.Iterator;

/* renamed from: wP */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7786wP implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public volatile boolean b = false;
    public boolean c = false;
    public final /* synthetic */ Object d;

    public /* synthetic */ ChoreographerFrameCallbackC7786wP(int i, Object obj) {
        this.a = i;
        this.d = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                UiThreadUtil.assertOnUiThread();
                if (this.c) {
                    this.b = false;
                } else if (!ReactFeatureFlags.enableFabricRendererExclusively) {
                    MJ0.a().c(4, ((a) this.d).j);
                }
                MT1.b("ScheduleDispatchFrameCallback");
                try {
                    a.k((a) this.d);
                    if (!((a) this.d).p) {
                        ((a) this.d).p = true;
                        MT1.a(((a) this.d).k.get(), "ScheduleDispatchFrameCallback");
                        a aVar = (a) this.d;
                        aVar.c.runOnJSQueueThread(aVar.f);
                    }
                    return;
                } finally {
                }
            default:
                UiThreadUtil.assertOnUiThread();
                if (this.c) {
                    this.b = false;
                } else {
                    MJ0.a().c(4, ((b) this.d).e);
                }
                MT1.b("BatchEventDispatchedListeners");
                try {
                    Iterator it = ((b) this.d).d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1597Ug) it.next()).onBatchEventDispatched();
                    }
                    return;
                } finally {
                }
        }
    }
}
