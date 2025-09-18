package com.facebook.react.uimanager.events;

import android.os.Trace;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.events.FabricEventEmitter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC6550oP;
import p000.ChoreographerFrameCallbackC7073wP;
import p000.G71;
import p000.GR0;
import p000.InterfaceC1301Ug;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.MJ0;
import p000.MT1;
import p000.OZ1;

/* renamed from: com.facebook.react.uimanager.events.b */
/* loaded from: classes.dex */
public final class C1931b implements InterfaceC6947uP, LifecycleEventListener {

    /* renamed from: a */
    public final ReactEventEmitter f17957a;

    /* renamed from: b */
    public final ReactApplicationContext f17958b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f17959c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final CopyOnWriteArrayList f17960d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final ChoreographerFrameCallbackC7073wP f17961e = new ChoreographerFrameCallbackC7073wP(1, this);

    public C1931b(ReactApplicationContext reactApplicationContext) {
        this.f17958b = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f17957a = new ReactEventEmitter(reactApplicationContext);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: a */
    public final void mo11040a(InterfaceC7136xP interfaceC7136xP) {
        this.f17959c.remove(interfaceC7136xP);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: b */
    public final void mo11041b(InterfaceC1301Ug interfaceC1301Ug) {
        this.f17960d.add(interfaceC1301Ug);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: c */
    public final void mo11042c(InterfaceC1301Ug interfaceC1301Ug) {
        this.f17960d.remove(interfaceC1301Ug);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: d */
    public final void mo11043d() {
        this.f17957a.unregister(2);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: e */
    public final void mo11044e() {
        m11052k();
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: f */
    public final void mo11045f(FabricEventEmitter fabricEventEmitter) {
        this.f17957a.register(2, (RCTModernEventEmitter) fabricEventEmitter);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: g */
    public final void mo11046g(AbstractC6550oP abstractC6550oP) {
        Iterator it = this.f17959c.iterator();
        while (it.hasNext()) {
            ((InterfaceC7136xP) it.next()).onEventDispatch(abstractC6550oP);
        }
        if (abstractC6550oP.experimental_isSynchronous()) {
            MT1.m5371b("FabricEventDispatcher.dispatchSynchronous('" + abstractC6550oP.getEventName() + "')");
            try {
                UIManager uIManagerM6095f = OZ1.m6095f(this.f17958b, 2, true);
                if (uIManagerM6095f instanceof G71) {
                    ((G71) uIManagerM6095f).receiveEvent(abstractC6550oP.getSurfaceId(), abstractC6550oP.getViewTag(), abstractC6550oP.getEventName(), abstractC6550oP.canCoalesce(), abstractC6550oP.getEventData(), abstractC6550oP.getEventCategory(), true);
                } else {
                    ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            abstractC6550oP.dispatchModern(this.f17957a);
        }
        abstractC6550oP.dispose();
        m11052k();
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: h */
    public final void mo11047h() {
        UiThreadUtil.runOnUiThread(new GR0(18, this));
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: i */
    public final void mo11048i(RCTEventEmitter rCTEventEmitter) {
        this.f17957a.register(1, rCTEventEmitter);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: j */
    public final void mo11049j(InterfaceC7136xP interfaceC7136xP) {
        this.f17959c.add(interfaceC7136xP);
    }

    /* renamed from: k */
    public final void m11052k() {
        if (this.f17957a != null) {
            ChoreographerFrameCallbackC7073wP choreographerFrameCallbackC7073wP = this.f17961e;
            if (choreographerFrameCallbackC7073wP.f44856b) {
                return;
            }
            if (!((C1931b) choreographerFrameCallbackC7073wP.f44858d).f17958b.isOnUiQueueThread()) {
                ((C1931b) choreographerFrameCallbackC7073wP.f44858d).f17958b.runOnUiQueueThread(new GR0(19, choreographerFrameCallbackC7073wP));
            } else {
                if (choreographerFrameCallbackC7073wP.f44856b) {
                    return;
                }
                choreographerFrameCallbackC7073wP.f44856b = true;
                MJ0.m5303a().m5305c(4, ((C1931b) choreographerFrameCallbackC7073wP.f44858d).f17961e);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.f17961e.f44857c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.f17961e.f44857c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        m11052k();
    }
}
