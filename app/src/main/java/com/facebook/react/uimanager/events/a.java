package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.FabricEventEmitter;
import defpackage.AbstractC6260oP;
import defpackage.C2209aq0;
import defpackage.ChoreographerFrameCallbackC7786wP;
import defpackage.GR0;
import defpackage.InterfaceC1597Ug;
import defpackage.InterfaceC7405uP;
import defpackage.InterfaceC7976xP;
import defpackage.MJ0;
import defpackage.MT1;
import defpackage.O90;
import defpackage.RunnableC7596vP;
import defpackage.UN1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements InterfaceC7405uP, LifecycleEventListener {
    public static final C2209aq0 q = new C2209aq0(9);
    public final ReactApplicationContext c;
    public volatile ReactEventEmitter n;
    public final Object a = new Object();
    public final Object b = new Object();
    public final LongSparseArray d = new LongSparseArray();
    public final HashMap e = new HashMap();
    public final RunnableC7596vP f = new RunnableC7596vP(this, 1);
    public final ArrayList g = new ArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ChoreographerFrameCallbackC7786wP j = new ChoreographerFrameCallbackC7786wP(0, this);
    public final AtomicInteger k = new AtomicInteger();
    public AbstractC6260oP[] l = new AbstractC6260oP[16];
    public int m = 0;
    public short o = 0;
    public volatile boolean p = false;

    public a(ReactApplicationContext reactApplicationContext) {
        this.c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.n = new ReactEventEmitter(reactApplicationContext);
    }

    public static void k(a aVar) {
        short sShortValue;
        synchronized (aVar.a) {
            synchronized (aVar.b) {
                for (int i = 0; i < aVar.g.size(); i++) {
                    try {
                        AbstractC6260oP abstractC6260oP = (AbstractC6260oP) aVar.g.get(i);
                        if (abstractC6260oP.canCoalesce()) {
                            int viewTag = abstractC6260oP.getViewTag();
                            String eventName = abstractC6260oP.getEventName();
                            short coalescingKey = abstractC6260oP.getCoalescingKey();
                            HashMap map = aVar.e;
                            Short sh = (Short) map.get(eventName);
                            if (sh != null) {
                                sShortValue = sh.shortValue();
                            } else {
                                short s = aVar.o;
                                aVar.o = (short) (s + 1);
                                map.put(eventName, Short.valueOf(s));
                                sShortValue = s;
                            }
                            long j = ((sShortValue & 65535) << 32) | viewTag | ((coalescingKey & 65535) << 48);
                            Integer num = (Integer) aVar.d.get(j);
                            AbstractC6260oP abstractC6260oP2 = null;
                            if (num == null) {
                                aVar.d.put(j, Integer.valueOf(aVar.m));
                            } else {
                                AbstractC6260oP abstractC6260oP3 = aVar.l[num.intValue()];
                                AbstractC6260oP abstractC6260oPCoalesce = abstractC6260oP.coalesce(abstractC6260oP3);
                                if (abstractC6260oPCoalesce != abstractC6260oP3) {
                                    aVar.d.put(j, Integer.valueOf(aVar.m));
                                    aVar.l[num.intValue()] = null;
                                    abstractC6260oP2 = abstractC6260oP3;
                                    abstractC6260oP = abstractC6260oPCoalesce;
                                } else {
                                    abstractC6260oP2 = abstractC6260oP;
                                    abstractC6260oP = null;
                                }
                            }
                            if (abstractC6260oP != null) {
                                aVar.l(abstractC6260oP);
                            }
                            if (abstractC6260oP2 != null) {
                                abstractC6260oP2.dispose();
                            }
                        } else {
                            aVar.l(abstractC6260oP);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            aVar.g.clear();
        }
    }

    @Override // defpackage.InterfaceC7405uP
    public final void a(InterfaceC7976xP interfaceC7976xP) {
        this.h.remove(interfaceC7976xP);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void b(InterfaceC1597Ug interfaceC1597Ug) {
        this.i.add(interfaceC1597Ug);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void c(InterfaceC1597Ug interfaceC1597Ug) {
        this.i.remove(interfaceC1597Ug);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void d() {
        this.n.unregister(2);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void e() {
        m();
    }

    @Override // defpackage.InterfaceC7405uP
    public final void f(FabricEventEmitter fabricEventEmitter) {
        this.n.register(2, (RCTModernEventEmitter) fabricEventEmitter);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void g(AbstractC6260oP abstractC6260oP) {
        UN1.b(abstractC6260oP.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC7976xP) it.next()).onEventDispatch(abstractC6260oP);
        }
        synchronized (this.a) {
            this.g.add(abstractC6260oP);
            String eventName = abstractC6260oP.getEventName();
            int uniqueID = abstractC6260oP.getUniqueID();
            O90.f(eventName, "sectionName");
            MT1.a(uniqueID, eventName);
        }
        m();
    }

    @Override // defpackage.InterfaceC7405uP
    public final void h() {
        UiThreadUtil.runOnUiThread(new RunnableC7596vP(this, 0));
    }

    @Override // defpackage.InterfaceC7405uP
    public final void i(RCTEventEmitter rCTEventEmitter) {
        this.n.register(1, rCTEventEmitter);
    }

    @Override // defpackage.InterfaceC7405uP
    public final void j(InterfaceC7976xP interfaceC7976xP) {
        this.h.add(interfaceC7976xP);
    }

    public final void l(AbstractC6260oP abstractC6260oP) {
        int i = this.m;
        AbstractC6260oP[] abstractC6260oPArr = this.l;
        if (i == abstractC6260oPArr.length) {
            this.l = (AbstractC6260oP[]) Arrays.copyOf(abstractC6260oPArr, abstractC6260oPArr.length * 2);
        }
        AbstractC6260oP[] abstractC6260oPArr2 = this.l;
        int i2 = this.m;
        this.m = i2 + 1;
        abstractC6260oPArr2[i2] = abstractC6260oP;
    }

    public final void m() {
        if (this.n != null) {
            ChoreographerFrameCallbackC7786wP choreographerFrameCallbackC7786wP = this.j;
            if (choreographerFrameCallbackC7786wP.b) {
                return;
            }
            if (!((a) choreographerFrameCallbackC7786wP.d).c.isOnUiQueueThread()) {
                ((a) choreographerFrameCallbackC7786wP.d).c.runOnUiQueueThread(new GR0(17, choreographerFrameCallbackC7786wP));
            } else {
                if (choreographerFrameCallbackC7786wP.b) {
                    return;
                }
                choreographerFrameCallbackC7786wP.b = true;
                if (ReactFeatureFlags.enableFabricRendererExclusively) {
                    return;
                }
                MJ0.a().c(4, ((a) choreographerFrameCallbackC7786wP.d).j);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.j.c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.j.c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        m();
    }
}
