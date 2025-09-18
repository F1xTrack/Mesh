package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.FabricEventEmitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC6550oP;
import p000.C8774aq0;
import p000.ChoreographerFrameCallbackC7073wP;
import p000.GR0;
import p000.InterfaceC1301Ug;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.MJ0;
import p000.MT1;
import p000.O90;
import p000.RunnableC7010vP;
import p000.UN1;

/* renamed from: com.facebook.react.uimanager.events.a */
/* loaded from: classes.dex */
public final class C1930a implements InterfaceC6947uP, LifecycleEventListener {

    /* renamed from: q */
    public static final C8774aq0 f17940q = new C8774aq0(9);

    /* renamed from: c */
    public final ReactApplicationContext f17943c;

    /* renamed from: n */
    public volatile ReactEventEmitter f17954n;

    /* renamed from: a */
    public final Object f17941a = new Object();

    /* renamed from: b */
    public final Object f17942b = new Object();

    /* renamed from: d */
    public final LongSparseArray f17944d = new LongSparseArray();

    /* renamed from: e */
    public final HashMap f17945e = new HashMap();

    /* renamed from: f */
    public final RunnableC7010vP f17946f = new RunnableC7010vP(this, 1);

    /* renamed from: g */
    public final ArrayList f17947g = new ArrayList();

    /* renamed from: h */
    public final CopyOnWriteArrayList f17948h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final CopyOnWriteArrayList f17949i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final ChoreographerFrameCallbackC7073wP f17950j = new ChoreographerFrameCallbackC7073wP(0, this);

    /* renamed from: k */
    public final AtomicInteger f17951k = new AtomicInteger();

    /* renamed from: l */
    public AbstractC6550oP[] f17952l = new AbstractC6550oP[16];

    /* renamed from: m */
    public int f17953m = 0;

    /* renamed from: o */
    public short f17955o = 0;

    /* renamed from: p */
    public volatile boolean f17956p = false;

    public C1930a(ReactApplicationContext reactApplicationContext) {
        this.f17943c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f17954n = new ReactEventEmitter(reactApplicationContext);
    }

    /* renamed from: k */
    public static void m11039k(C1930a c1930a) {
        short sShortValue;
        synchronized (c1930a.f17941a) {
            synchronized (c1930a.f17942b) {
                for (int i = 0; i < c1930a.f17947g.size(); i++) {
                    try {
                        AbstractC6550oP abstractC6550oP = (AbstractC6550oP) c1930a.f17947g.get(i);
                        if (abstractC6550oP.canCoalesce()) {
                            int viewTag = abstractC6550oP.getViewTag();
                            String eventName = abstractC6550oP.getEventName();
                            short coalescingKey = abstractC6550oP.getCoalescingKey();
                            HashMap map = c1930a.f17945e;
                            Short sh = (Short) map.get(eventName);
                            if (sh != null) {
                                sShortValue = sh.shortValue();
                            } else {
                                short s = c1930a.f17955o;
                                c1930a.f17955o = (short) (s + 1);
                                map.put(eventName, Short.valueOf(s));
                                sShortValue = s;
                            }
                            long j = ((sShortValue & 65535) << 32) | viewTag | ((coalescingKey & 65535) << 48);
                            Integer num = (Integer) c1930a.f17944d.get(j);
                            AbstractC6550oP abstractC6550oP2 = null;
                            if (num == null) {
                                c1930a.f17944d.put(j, Integer.valueOf(c1930a.f17953m));
                            } else {
                                AbstractC6550oP abstractC6550oP3 = c1930a.f17952l[num.intValue()];
                                AbstractC6550oP abstractC6550oPCoalesce = abstractC6550oP.coalesce(abstractC6550oP3);
                                if (abstractC6550oPCoalesce != abstractC6550oP3) {
                                    c1930a.f17944d.put(j, Integer.valueOf(c1930a.f17953m));
                                    c1930a.f17952l[num.intValue()] = null;
                                    abstractC6550oP2 = abstractC6550oP3;
                                    abstractC6550oP = abstractC6550oPCoalesce;
                                } else {
                                    abstractC6550oP2 = abstractC6550oP;
                                    abstractC6550oP = null;
                                }
                            }
                            if (abstractC6550oP != null) {
                                c1930a.m11050l(abstractC6550oP);
                            }
                            if (abstractC6550oP2 != null) {
                                abstractC6550oP2.dispose();
                            }
                        } else {
                            c1930a.m11050l(abstractC6550oP);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            c1930a.f17947g.clear();
        }
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: a */
    public final void mo11040a(InterfaceC7136xP interfaceC7136xP) {
        this.f17948h.remove(interfaceC7136xP);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: b */
    public final void mo11041b(InterfaceC1301Ug interfaceC1301Ug) {
        this.f17949i.add(interfaceC1301Ug);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: c */
    public final void mo11042c(InterfaceC1301Ug interfaceC1301Ug) {
        this.f17949i.remove(interfaceC1301Ug);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: d */
    public final void mo11043d() {
        this.f17954n.unregister(2);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: e */
    public final void mo11044e() {
        m11051m();
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: f */
    public final void mo11045f(FabricEventEmitter fabricEventEmitter) {
        this.f17954n.register(2, (RCTModernEventEmitter) fabricEventEmitter);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: g */
    public final void mo11046g(AbstractC6550oP abstractC6550oP) {
        UN1.m7998b(abstractC6550oP.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.f17948h.iterator();
        while (it.hasNext()) {
            ((InterfaceC7136xP) it.next()).onEventDispatch(abstractC6550oP);
        }
        synchronized (this.f17941a) {
            this.f17947g.add(abstractC6550oP);
            String eventName = abstractC6550oP.getEventName();
            int uniqueID = abstractC6550oP.getUniqueID();
            O90.m5968f(eventName, "sectionName");
            MT1.m5370a(uniqueID, eventName);
        }
        m11051m();
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: h */
    public final void mo11047h() {
        UiThreadUtil.runOnUiThread(new RunnableC7010vP(this, 0));
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: i */
    public final void mo11048i(RCTEventEmitter rCTEventEmitter) {
        this.f17954n.register(1, rCTEventEmitter);
    }

    @Override // p000.InterfaceC6947uP
    /* renamed from: j */
    public final void mo11049j(InterfaceC7136xP interfaceC7136xP) {
        this.f17948h.add(interfaceC7136xP);
    }

    /* renamed from: l */
    public final void m11050l(AbstractC6550oP abstractC6550oP) {
        int i = this.f17953m;
        AbstractC6550oP[] abstractC6550oPArr = this.f17952l;
        if (i == abstractC6550oPArr.length) {
            this.f17952l = (AbstractC6550oP[]) Arrays.copyOf(abstractC6550oPArr, abstractC6550oPArr.length * 2);
        }
        AbstractC6550oP[] abstractC6550oPArr2 = this.f17952l;
        int i2 = this.f17953m;
        this.f17953m = i2 + 1;
        abstractC6550oPArr2[i2] = abstractC6550oP;
    }

    /* renamed from: m */
    public final void m11051m() {
        if (this.f17954n != null) {
            ChoreographerFrameCallbackC7073wP choreographerFrameCallbackC7073wP = this.f17950j;
            if (choreographerFrameCallbackC7073wP.f44856b) {
                return;
            }
            if (!((C1930a) choreographerFrameCallbackC7073wP.f44858d).f17943c.isOnUiQueueThread()) {
                ((C1930a) choreographerFrameCallbackC7073wP.f44858d).f17943c.runOnUiQueueThread(new GR0(17, choreographerFrameCallbackC7073wP));
            } else {
                if (choreographerFrameCallbackC7073wP.f44856b) {
                    return;
                }
                choreographerFrameCallbackC7073wP.f44856b = true;
                if (ReactFeatureFlags.enableFabricRendererExclusively) {
                    return;
                }
                MJ0.m5303a().m5305c(4, ((C1930a) choreographerFrameCallbackC7073wP.f44858d).f17950j);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.f17950j.f44857c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.f17950j.f44857c = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        m11051m();
    }
}
