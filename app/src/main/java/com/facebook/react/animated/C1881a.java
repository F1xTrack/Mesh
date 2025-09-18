package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import p000.AbstractC0852NX;
import p000.AbstractC11153tN0;
import p000.AbstractC1200T4;
import p000.AbstractC3929dS;
import p000.AbstractC4157h5;
import p000.AbstractC6550oP;
import p000.AbstractC7222ym;
import p000.C0077BD;
import p000.C0309Eu;
import p000.C0650KJ;
import p000.C0727LY;
import p000.C0986Pf;
import p000.C10160lc1;
import p000.C11751y31;
import p000.C6528o3;
import p000.C7849Kh1;
import p000.C8026Ns0;
import p000.C8190Qw0;
import p000.C9003cc1;
import p000.C9043cu0;
import p000.G51;
import p000.I90;
import p000.InterfaceC6424mP;
import p000.InterfaceC7136xP;
import p000.KE0;
import p000.OZ1;
import p000.R02;
import p000.RunnableC1483XZ;
import p000.UN1;

/* renamed from: com.facebook.react.animated.a */
/* loaded from: classes.dex */
public final class C1881a implements InterfaceC7136xP {

    /* renamed from: e */
    public final ReactApplicationContext f17883e;

    /* renamed from: a */
    public final SparseArray f17879a = new SparseArray();

    /* renamed from: b */
    public final SparseArray f17880b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f17881c = new SparseArray();

    /* renamed from: d */
    public final ArrayList f17882d = new ArrayList();

    /* renamed from: f */
    public int f17884f = 0;

    /* renamed from: g */
    public final LinkedList f17885g = new LinkedList();

    /* renamed from: h */
    public boolean f17886h = false;

    /* renamed from: i */
    public boolean f17887i = false;

    /* renamed from: j */
    public boolean f17888j = false;

    public C1881a(ReactApplicationContext reactApplicationContext) {
        this.f17883e = reactApplicationContext;
    }

    /* renamed from: a */
    public final void m10924a(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i2);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i2, "addAnimatedEventToView: Animated node with tag [", "] does not exist"));
        }
        if (!(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i + "] connected to event handler (" + str + ") should be of type " + C7849Kh1.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i3 = 0; i3 < array.size(); i3++) {
            arrayList.add(array.getString(i3));
        }
        if (str.startsWith("on")) {
            str = "top" + str.substring(2);
        }
        this.f17882d.add(new EventAnimationDriver(str, i, arrayList, (C7849Kh1) abstractC1200T4));
    }

    /* renamed from: b */
    public final void m10925b(int i, int i2) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "connectAnimatedNodeToView: Animated node with tag [", "] does not exist"));
        }
        if (!(abstractC1200T4 instanceof KE0)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i2, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type ");
            sbM26237n.append(KE0.class.getName());
            throw new JSApplicationIllegalArgumentException(sbM26237n.toString());
        }
        ReactApplicationContext reactApplicationContext = this.f17883e;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i2, "connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: "));
        }
        UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, R02.m6874b(i2), true);
        if (uIManagerM6095f == null) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(AbstractC11153tN0.m24909u(i2, "connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ")));
            return;
        }
        KE0 ke0 = (KE0) abstractC1200T4;
        if (ke0.f5951e == -1) {
            ke0.f5951e = i2;
            ke0.f5955i = uIManagerM6095f;
            this.f17881c.put(i, abstractC1200T4);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node " + ke0.f11143d + " is already attached to a view: " + ke0.f5951e);
        }
    }

    /* renamed from: c */
    public final void m10926c(int i, int i2) {
        SparseArray sparseArray = this.f17879a;
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) sparseArray.get(i);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        AbstractC1200T4 abstractC1200T42 = (AbstractC1200T4) sparseArray.get(i2);
        if (abstractC1200T42 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i2, "connectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        if (abstractC1200T4.f11140a == null) {
            abstractC1200T4.f11140a = new ArrayList(1);
        }
        ArrayList arrayList = abstractC1200T4.f11140a;
        UN1.m7999c(arrayList);
        arrayList.add(abstractC1200T42);
        abstractC1200T42.mo3767a(abstractC1200T4);
        this.f17881c.put(i2, abstractC1200T42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [o3] */
    /* JADX WARN: Type inference failed for: r1v11, types: [o3] */
    /* JADX WARN: Type inference failed for: r1v12, types: [o3] */
    /* JADX WARN: Type inference failed for: r1v13, types: [I90] */
    /* JADX WARN: Type inference failed for: r1v14, types: [KE0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [Eu] */
    /* JADX WARN: Type inference failed for: r1v16, types: [Kh1, T4] */
    /* JADX WARN: Type inference failed for: r1v18, types: [G51] */
    /* JADX WARN: Type inference failed for: r1v5, types: [cc1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [lc1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [KJ] */
    /* JADX WARN: Type inference failed for: r1v8, types: [Ns0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [o3] */
    /* renamed from: d */
    public final void m10927d(int i, ReadableMap readableMap) {
        C8190Qw0 c8190Qw0;
        SparseArray sparseArray = this.f17879a;
        if (sparseArray.get(i) != null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "createAnimatedNode: Animated node [", "] already exists"));
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            c8190Qw0 = new G51(readableMap, this);
        } else if ("value".equals(string)) {
            ?? c7849Kh1 = new C7849Kh1();
            c7849Kh1.f6259e = Double.NaN;
            c7849Kh1.f6260f = ConfigValue.DOUBLE_DEFAULT_VALUE;
            c7849Kh1.f6259e = readableMap.getDouble("value");
            c7849Kh1.f6260f = readableMap.getDouble("offset");
            c8190Qw0 = c7849Kh1;
        } else if ("color".equals(string)) {
            c8190Qw0 = new C0309Eu(readableMap, this, this.f17883e);
        } else if ("props".equals(string)) {
            c8190Qw0 = new KE0(readableMap, this);
        } else if ("interpolation".equals(string)) {
            c8190Qw0 = new I90(readableMap);
        } else if ("addition".equals(string)) {
            c8190Qw0 = new C6528o3(readableMap, this, 0);
        } else if ("subtraction".equals(string)) {
            c8190Qw0 = new C6528o3(readableMap, this, 3);
        } else if ("division".equals(string)) {
            c8190Qw0 = new C6528o3(readableMap, this, 1);
        } else if ("multiplication".equals(string)) {
            c8190Qw0 = new C6528o3(readableMap, this, 2);
        } else if ("modulus".equals(string)) {
            c8190Qw0 = new C8026Ns0(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            c8190Qw0 = new C0650KJ(readableMap, this);
        } else if ("transform".equals(string)) {
            c8190Qw0 = new C10160lc1(readableMap, this);
        } else if ("tracking".equals(string)) {
            c8190Qw0 = new C9003cc1(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Unsupported node type: ", string));
            }
            c8190Qw0 = new C8190Qw0(readableMap, this);
        }
        c8190Qw0.f11143d = i;
        sparseArray.put(i, c8190Qw0);
        this.f17881c.put(i, c8190Qw0);
    }

    /* renamed from: e */
    public final void m10928e(int i, int i2) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist"));
        }
        if (!(abstractC1200T4 instanceof KE0)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i2, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type ");
            sbM26237n.append(KE0.class.getName());
            throw new JSApplicationIllegalArgumentException(sbM26237n.toString());
        }
        KE0 ke0 = (KE0) abstractC1200T4;
        int i3 = ke0.f5951e;
        if (i3 == i2 || i3 == -1) {
            ke0.f5951e = -1;
        } else {
            StringBuilder sbM26237n2 = AbstractC7222ym.m26237n(i2, "Attempting to disconnect view that has not been connected with the given animated node: ", " but is connected to view ");
            sbM26237n2.append(ke0.f5951e);
            throw new JSApplicationIllegalArgumentException(sbM26237n2.toString());
        }
    }

    /* renamed from: f */
    public final void m10929f(int i, int i2) {
        SparseArray sparseArray = this.f17879a;
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) sparseArray.get(i);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        AbstractC1200T4 abstractC1200T42 = (AbstractC1200T4) sparseArray.get(i2);
        if (abstractC1200T42 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i2, "disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        if (abstractC1200T4.f11140a != null) {
            abstractC1200T42.mo3768b(abstractC1200T4);
            abstractC1200T4.f11140a.remove(abstractC1200T42);
        }
        this.f17881c.put(i2, abstractC1200T42);
    }

    /* renamed from: g */
    public final void m10930g(int i) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        C7849Kh1 c7849Kh1 = (C7849Kh1) abstractC1200T4;
        c7849Kh1.f6260f += c7849Kh1.f6259e;
        c7849Kh1.f6259e = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: h */
    public final void m10931h(int i) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        C7849Kh1 c7849Kh1 = (C7849Kh1) abstractC1200T4;
        c7849Kh1.f6259e += c7849Kh1.f6260f;
        c7849Kh1.f6260f = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: i */
    public final AbstractC1200T4 m10932i(int i) {
        return (AbstractC1200T4) this.f17879a.get(i);
    }

    /* renamed from: j */
    public final void m10933j(int i, Callback callback) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "getValue: Animated node with tag [", "] does not exist or is not a 'value' node"));
        }
        double dM4701f = ((C7849Kh1) abstractC1200T4).m4701f();
        if (callback != null) {
            callback.invoke(Double.valueOf(dM4701f));
            return;
        }
        ReactApplicationContext reactApplicationContext = this.f17883e;
        if (reactApplicationContext == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("tag", i);
        writableMapCreateMap.putDouble("value", dM4701f);
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    /* renamed from: k */
    public final void m10934k(AbstractC6550oP abstractC6550oP) {
        ReactApplicationContext reactApplicationContext;
        LinkedList linkedList;
        ArrayList arrayList = this.f17882d;
        if (arrayList.isEmpty() || (reactApplicationContext = this.f17883e) == null || OZ1.m6095f(reactApplicationContext, R02.m6875c(abstractC6550oP.getViewTag(), abstractC6550oP.getSurfaceId()), true) == null) {
            return;
        }
        InterfaceC6424mP eventAnimationDriverMatchSpec = abstractC6550oP.getEventAnimationDriverMatchSpec();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedList = this.f17885g;
            if (!zHasNext) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) it.next();
            if (eventAnimationDriverMatchSpec.mo17857X(eventAnimationDriver.mViewTag, eventAnimationDriver.mEventName)) {
                m10942s(eventAnimationDriver.mValueNode);
                abstractC6550oP.dispatchModern(eventAnimationDriver);
                linkedList.add(eventAnimationDriver.mValueNode);
                z = true;
            }
        }
        if (z) {
            m10945v(linkedList);
            linkedList.clear();
        }
    }

    /* renamed from: l */
    public final void m10935l(int i, int i2, String str) {
        if (str.startsWith("on")) {
            str = "top" + str.substring(2);
        }
        ListIterator listIterator = this.f17882d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (str.equals(eventAnimationDriver.mEventName) && i == eventAnimationDriver.mViewTag && i2 == eventAnimationDriver.mValueNode.f11143d) {
                listIterator.remove();
                return;
            }
        }
    }

    /* renamed from: m */
    public final void m10936m(int i) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null) {
            return;
        }
        if (!(abstractC1200T4 instanceof KE0)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type ".concat(KE0.class.getName()));
        }
        KE0 ke0 = (KE0) abstractC1200T4;
        int i2 = ke0.f5951e;
        if (i2 == -1 || R02.m6874b(i2) == 2) {
            return;
        }
        JavaOnlyMap javaOnlyMap = ke0.f5954h;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = javaOnlyMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            javaOnlyMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        ke0.f5955i.synchronouslyUpdateViewOnUIThread(ke0.f5951e, javaOnlyMap);
    }

    /* renamed from: n */
    public final void m10937n(long j) {
        SparseArray sparseArray;
        LinkedList linkedList;
        SparseArray sparseArray2;
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int i = 0;
        while (true) {
            sparseArray = this.f17881c;
            int size = sparseArray.size();
            linkedList = this.f17885g;
            if (i >= size) {
                break;
            }
            linkedList.add((AbstractC1200T4) sparseArray.valueAt(i));
            i++;
        }
        sparseArray.clear();
        int i2 = 0;
        boolean z = false;
        while (true) {
            sparseArray2 = this.f17880b;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            AbstractC4157h5 abstractC4157h5 = (AbstractC4157h5) sparseArray2.valueAt(i2);
            abstractC4157h5.mo559b(j);
            linkedList.add(abstractC4157h5.f28240b);
            if (abstractC4157h5.f28239a) {
                z = true;
            }
            i2++;
        }
        m10945v(linkedList);
        linkedList.clear();
        if (z) {
            int size2 = sparseArray2.size() - 1;
            WritableArray writableArrayCreateArray = null;
            while (true) {
                reactApplicationContext = this.f17883e;
                if (size2 < 0) {
                    break;
                }
                AbstractC4157h5 abstractC4157h52 = (AbstractC4157h5) sparseArray2.valueAt(size2);
                if (abstractC4157h52.f28239a) {
                    if (abstractC4157h52.f28241c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", abstractC4157h52.f28240b.f6259e);
                        abstractC4157h52.f28241c.invoke(writableMapCreateMap);
                    } else if (reactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", abstractC4157h52.f28242d);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", abstractC4157h52.f28240b.f6259e);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    sparseArray2.removeAt(size2);
                }
                size2--;
            }
            if (writableArrayCreateArray != null) {
                reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }

    /* renamed from: o */
    public final void m10938o(int i, double d) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        m10942s(abstractC1200T4);
        ((C7849Kh1) abstractC1200T4).f6259e = d;
        this.f17881c.put(i, abstractC1200T4);
    }

    @Override // p000.InterfaceC7136xP
    public final void onEventDispatch(AbstractC6550oP abstractC6550oP) {
        if (UiThreadUtil.isOnUiThread()) {
            m10934k(abstractC6550oP);
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC1483XZ(this, abstractC6550oP, false, 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [y31] */
    /* JADX WARN: Type inference failed for: r8v4, types: [LY, h5] */
    /* renamed from: p */
    public final void m10939p(int i, ReadableMap readableMap, Callback callback, int i2) {
        C0077BD c0077bd;
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i2);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i2, "startAnimatingNode: Animated node [", "] does not exist"));
        }
        if (!(abstractC1200T4 instanceof C7849Kh1)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i2, "startAnimatingNode: Animated node [", "] should be of type ");
            sbM26237n.append(C7849Kh1.class.getName());
            throw new JSApplicationIllegalArgumentException(sbM26237n.toString());
        }
        SparseArray sparseArray = this.f17880b;
        AbstractC4157h5 abstractC4157h5 = (AbstractC4157h5) sparseArray.get(i);
        if (abstractC4157h5 != null) {
            abstractC4157h5.mo558a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            ?? c0727ly = new C0727LY();
            c0727ly.f6708k = 0;
            c0727ly.mo558a(readableMap);
            c0077bd = c0727ly;
        } else if ("spring".equals(string)) {
            c0077bd = new C11751y31(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i2 + "]: " + string);
            }
            c0077bd = new C0077BD(readableMap);
        }
        c0077bd.f28242d = i;
        c0077bd.f28241c = callback;
        c0077bd.f28240b = (C7849Kh1) abstractC1200T4;
        sparseArray.put(i, c0077bd);
    }

    /* renamed from: q */
    public final void m10940q(int i, C0986Pf c0986Pf) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((C7849Kh1) abstractC1200T4).f6261g = c0986Pf;
    }

    /* renamed from: r */
    public final void m10941r(int i) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f17880b;
            int size = sparseArray.size();
            reactApplicationContext = this.f17883e;
            writableArrayCreateArray = null;
            if (i2 >= size) {
                break;
            }
            AbstractC4157h5 abstractC4157h5 = (AbstractC4157h5) sparseArray.valueAt(i2);
            if (abstractC4157h5.f28242d == i) {
                if (abstractC4157h5.f28241c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", abstractC4157h5.f28240b.f6259e);
                    abstractC4157h5.f28241c.invoke(writableMapCreateMap);
                } else if (reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", abstractC4157h5.f28242d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", abstractC4157h5.f28240b.f6259e);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                sparseArray.removeAt(i2);
            } else {
                i2++;
            }
        }
        if (writableArrayCreateArray != null) {
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    /* renamed from: s */
    public final void m10942s(AbstractC1200T4 abstractC1200T4) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f17880b;
            int size = sparseArray.size();
            reactApplicationContext = this.f17883e;
            if (i >= size) {
                break;
            }
            AbstractC4157h5 abstractC4157h5 = (AbstractC4157h5) sparseArray.valueAt(i);
            if (abstractC1200T4.equals(abstractC4157h5.f28240b)) {
                if (abstractC4157h5.f28241c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", abstractC4157h5.f28240b.f6259e);
                    abstractC4157h5.f28241c.invoke(writableMapCreateMap);
                } else if (reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", abstractC4157h5.f28242d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", abstractC4157h5.f28240b.f6259e);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                sparseArray.removeAt(i);
                i--;
            }
            i++;
        }
        if (writableArrayCreateArray != null) {
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    /* renamed from: t */
    public final void m10943t(int i) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((C7849Kh1) abstractC1200T4).f6261g = null;
    }

    /* renamed from: u */
    public final void m10944u(int i, ReadableMap readableMap) {
        AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) this.f17879a.get(i);
        if (abstractC1200T4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "updateAnimatedNode: Animated node [", "] does not exist"));
        }
        if (abstractC1200T4 instanceof C0309Eu) {
            m10942s(abstractC1200T4);
            ((C0309Eu) abstractC1200T4).m2444g(readableMap);
            this.f17881c.put(i, abstractC1200T4);
        }
    }

    /* renamed from: v */
    public final void m10945v(LinkedList linkedList) {
        C7849Kh1 c7849Kh1;
        C0986Pf c0986Pf;
        int i = this.f17884f;
        int i2 = i + 1;
        this.f17884f = i2;
        if (i2 == 0) {
            this.f17884f = i + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = linkedList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) it.next();
            int i4 = abstractC1200T4.f11142c;
            int i5 = this.f17884f;
            if (i4 != i5) {
                abstractC1200T4.f11142c = i5;
                i3++;
                arrayDeque.add(abstractC1200T4);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC1200T4 abstractC1200T42 = (AbstractC1200T4) arrayDeque.poll();
            if (abstractC1200T42.f11140a != null) {
                for (int i6 = 0; i6 < abstractC1200T42.f11140a.size(); i6++) {
                    AbstractC1200T4 abstractC1200T43 = (AbstractC1200T4) abstractC1200T42.f11140a.get(i6);
                    abstractC1200T43.f11141b++;
                    int i7 = abstractC1200T43.f11142c;
                    int i8 = this.f17884f;
                    if (i7 != i8) {
                        abstractC1200T43.f11142c = i8;
                        i3++;
                        arrayDeque.add(abstractC1200T43);
                    }
                }
            }
        }
        int i9 = this.f17884f;
        int i10 = i9 + 1;
        this.f17884f = i10;
        if (i10 == 0) {
            this.f17884f = i9 + 2;
        }
        Iterator it2 = linkedList.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            AbstractC1200T4 abstractC1200T44 = (AbstractC1200T4) it2.next();
            if (abstractC1200T44.f11141b == 0) {
                int i12 = abstractC1200T44.f11142c;
                int i13 = this.f17884f;
                if (i12 != i13) {
                    abstractC1200T44.f11142c = i13;
                    i11++;
                    arrayDeque.add(abstractC1200T44);
                }
            }
        }
        int i14 = 0;
        while (!arrayDeque.isEmpty()) {
            AbstractC1200T4 abstractC1200T45 = (AbstractC1200T4) arrayDeque.poll();
            try {
                abstractC1200T45.mo3769d();
                if (abstractC1200T45 instanceof KE0) {
                    ((KE0) abstractC1200T45).m4587e();
                }
            } catch (JSApplicationCausedNativeException unused) {
                AbstractC3929dS.m17675h("NativeAnimatedNodesManager");
            }
            if ((abstractC1200T45 instanceof C7849Kh1) && (c0986Pf = (c7849Kh1 = (C7849Kh1) abstractC1200T45).f6261g) != null) {
                double dM4701f = c7849Kh1.m4701f();
                switch (c0986Pf.f9215a) {
                    case 12:
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("tag", c0986Pf.f9216b);
                        writableMapCreateMap.putDouble("value", dM4701f);
                        ReactApplicationContext reactApplicationContextIfActiveOrWarn = ((NativeAnimatedModule) ((C9043cu0) c0986Pf.f9217c).f25711e).getReactApplicationContextIfActiveOrWarn();
                        if (reactApplicationContextIfActiveOrWarn != null) {
                            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                            break;
                        }
                        break;
                    default:
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("tag", c0986Pf.f9216b);
                        writableMapCreateMap2.putDouble("value", dM4701f);
                        ReactApplicationContext reactApplicationContextIfActiveOrWarn2 = ((NativeAnimatedModule) c0986Pf.f9217c).getReactApplicationContextIfActiveOrWarn();
                        if (reactApplicationContextIfActiveOrWarn2 != null) {
                            reactApplicationContextIfActiveOrWarn2.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap2);
                            break;
                        }
                        break;
                }
            }
            if (abstractC1200T45.f11140a != null) {
                for (int i15 = 0; i15 < abstractC1200T45.f11140a.size(); i15++) {
                    AbstractC1200T4 abstractC1200T46 = (AbstractC1200T4) abstractC1200T45.f11140a.get(i15);
                    int i16 = abstractC1200T46.f11141b - 1;
                    abstractC1200T46.f11141b = i16;
                    int i17 = abstractC1200T46.f11142c;
                    int i18 = this.f17884f;
                    if (i17 != i18 && i16 == 0) {
                        abstractC1200T46.f11142c = i18;
                        i11++;
                        arrayDeque.add(abstractC1200T46);
                    } else if (i17 == i18) {
                        i14++;
                    }
                }
            }
        }
        if (i3 == i11) {
            this.f17888j = false;
            return;
        }
        if (this.f17888j) {
            return;
        }
        this.f17888j = true;
        AbstractC3929dS.m17672e("NativeAnimatedNodesManager");
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            AbstractC1200T4 abstractC1200T47 = (AbstractC1200T4) it3.next();
            ArrayList arrayList = abstractC1200T47.f11140a;
            String string = "";
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it4 = abstractC1200T47.f11140a.iterator();
                while (it4.hasNext()) {
                    AbstractC1200T4 abstractC1200T48 = (AbstractC1200T4) it4.next();
                    StringBuilder sbM5762k = AbstractC0852NX.m5762k(string, " ");
                    sbM5762k.append(abstractC1200T48.f11143d);
                    string = sbM5762k.toString();
                }
            }
            abstractC1200T47.mo2442c();
            if (string.length() > 0) {
                " children: ".concat(string);
            }
            AbstractC3929dS.m17672e("NativeAnimatedNodesManager");
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i14 > 0 ? AbstractC7222ym.m26230g(i14, "cycles (", ")") : "disconnected regions") + ", there are " + i3 + " but toposort visited only " + i11);
        boolean z = this.f17886h;
        if (z && i14 == 0) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        }
    }
}
