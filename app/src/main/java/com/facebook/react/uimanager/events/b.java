package com.facebook.react.uimanager.events;

import android.os.Trace;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.events.FabricEventEmitter;
import defpackage.AbstractC6260oP;
import defpackage.ChoreographerFrameCallbackC7786wP;
import defpackage.G71;
import defpackage.GR0;
import defpackage.InterfaceC1597Ug;
import defpackage.InterfaceC7405uP;
import defpackage.InterfaceC7976xP;
import defpackage.MJ0;
import defpackage.MT1;
import defpackage.OZ1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b implements InterfaceC7405uP, LifecycleEventListener {
    public final ReactEventEmitter a;
    public final ReactApplicationContext b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ChoreographerFrameCallbackC7786wP e = new ChoreographerFrameCallbackC7786wP(1, this);

    public b(ReactApplicationContext reactApplicationContext) {
        this.b = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.a = new ReactEventEmitter(reactApplicationContext);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void a(InterfaceC7976xP interfaceC7976xP) {
        this.c.remove(interfaceC7976xP);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void b(InterfaceC1597Ug interfaceC1597Ug) {
        this.d.add(interfaceC1597Ug);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void c(InterfaceC1597Ug interfaceC1597Ug) {
        this.d.remove(interfaceC1597Ug);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void d() {
        this.a.unregister(2);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void e() {
        k();
    }

    @Override // defpackage.InterfaceC7405uP
    public final void f(FabricEventEmitter fabricEventEmitter) {
        this.a.register(2, (RCTModernEventEmitter) fabricEventEmitter);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void g(AbstractC6260oP abstractC6260oP) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC7976xP) it.next()).onEventDispatch(abstractC6260oP);
        }
        if (abstractC6260oP.experimental_isSynchronous()) {
            MT1.b("FabricEventDispatcher.dispatchSynchronous('" + abstractC6260oP.getEventName() + "')");
            try {
                UIManager uIManagerF = OZ1.f(this.b, 2, true);
                if (uIManagerF instanceof G71) {
                    ((G71) uIManagerF).receiveEvent(abstractC6260oP.getSurfaceId(), abstractC6260oP.getViewTag(), abstractC6260oP.getEventName(), abstractC6260oP.canCoalesce(), abstractC6260oP.getEventData(), abstractC6260oP.getEventCategory(), true);
                } else {
                    ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            abstractC6260oP.dispatchModern(this.a);
        }
        abstractC6260oP.dispose();
        k();
    }

    @Override // defpackage.InterfaceC7405uP
    public final void h() {
        UiThreadUtil.runOnUiThread(new GR0(18, this));
    }

    @Override // defpackage.InterfaceC7405uP
    public final void i(RCTEventEmitter rCTEventEmitter) {
        this.a.register(1, rCTEventEmitter);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void j(InterfaceC7976xP interfaceC7976xP) {
        this.c.add(interfaceC7976xP);
    }

    public final void k() {
        if (this.a != null) {
            ChoreographerFrameCallbackC7786wP choreographerFrameCallbackC7786wP = this.e;
            if (choreographerFrameCallbackC7786wP.b) {
                return;
            }
            if (!((b) choreographerFrameCallbackC7786wP.d).b.isOnUiQueueThread()) {
                ((b) choreographerFrameCallbackC7786wP.d).b.runOnUiQueueThread(new GR0(19, choreographerFrameCallbackC7786wP));
            } else {
                if (choreographerFrameCallbackC7786wP.b) {
                    return;
                }
                choreographerFrameCallbackC7786wP.b = true;
                MJ0.a().c(4, ((b) choreographerFrameCallbackC7786wP.d).e);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.e.c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.e.c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        k();
    }
}
