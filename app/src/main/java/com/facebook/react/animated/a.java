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
import defpackage.AbstractC3393dS;
import defpackage.AbstractC4087h5;
import defpackage.AbstractC6260oP;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC8235ym;
import defpackage.BD;
import defpackage.C0392Eu;
import defpackage.C0823Kh1;
import defpackage.C1088Ns0;
import defpackage.C1204Pf;
import defpackage.C1334Qw0;
import defpackage.C2549cc1;
import defpackage.C3287cu0;
import defpackage.C5728lc1;
import defpackage.C6193o3;
import defpackage.C8102y31;
import defpackage.G51;
import defpackage.I90;
import defpackage.InterfaceC5878mP;
import defpackage.InterfaceC7976xP;
import defpackage.KE0;
import defpackage.KJ;
import defpackage.LY;
import defpackage.NX;
import defpackage.OZ1;
import defpackage.R02;
import defpackage.T4;
import defpackage.UN1;
import defpackage.XZ;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class a implements InterfaceC7976xP {
    public final ReactApplicationContext e;
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final ArrayList d = new ArrayList();
    public int f = 0;
    public final LinkedList g = new LinkedList();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public a(ReactApplicationContext reactApplicationContext) {
        this.e = reactApplicationContext;
    }

    public final void a(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        T4 t4 = (T4) this.a.get(i2);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i2, "addAnimatedEventToView: Animated node with tag [", "] does not exist"));
        }
        if (!(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i + "] connected to event handler (" + str + ") should be of type " + C0823Kh1.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i3 = 0; i3 < array.size(); i3++) {
            arrayList.add(array.getString(i3));
        }
        if (str.startsWith("on")) {
            str = "top" + str.substring(2);
        }
        this.d.add(new EventAnimationDriver(str, i, arrayList, (C0823Kh1) t4));
    }

    public final void b(int i, int i2) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "connectAnimatedNodeToView: Animated node with tag [", "] does not exist"));
        }
        if (!(t4 instanceof KE0)) {
            StringBuilder sbN = AbstractC8235ym.n(i2, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type ");
            sbN.append(KE0.class.getName());
            throw new JSApplicationIllegalArgumentException(sbN.toString());
        }
        ReactApplicationContext reactApplicationContext = this.e;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(AbstractC7209tN0.u(i2, "connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: "));
        }
        UIManager uIManagerF = OZ1.f(reactApplicationContext, R02.b(i2), true);
        if (uIManagerF == null) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(AbstractC7209tN0.u(i2, "connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ")));
            return;
        }
        KE0 ke0 = (KE0) t4;
        if (ke0.e == -1) {
            ke0.e = i2;
            ke0.i = uIManagerF;
            this.c.put(i, t4);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node " + ke0.d + " is already attached to a view: " + ke0.e);
        }
    }

    public final void c(int i, int i2) {
        SparseArray sparseArray = this.a;
        T4 t4 = (T4) sparseArray.get(i);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        T4 t42 = (T4) sparseArray.get(i2);
        if (t42 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i2, "connectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        if (t4.a == null) {
            t4.a = new ArrayList(1);
        }
        ArrayList arrayList = t4.a;
        UN1.c(arrayList);
        arrayList.add(t42);
        t42.a(t4);
        this.c.put(i2, t42);
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
    public final void d(int i, ReadableMap readableMap) {
        C1334Qw0 c1334Qw0;
        SparseArray sparseArray = this.a;
        if (sparseArray.get(i) != null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "createAnimatedNode: Animated node [", "] already exists"));
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            c1334Qw0 = new G51(readableMap, this);
        } else if ("value".equals(string)) {
            ?? c0823Kh1 = new C0823Kh1();
            c0823Kh1.e = Double.NaN;
            c0823Kh1.f = ConfigValue.DOUBLE_DEFAULT_VALUE;
            c0823Kh1.e = readableMap.getDouble("value");
            c0823Kh1.f = readableMap.getDouble("offset");
            c1334Qw0 = c0823Kh1;
        } else if ("color".equals(string)) {
            c1334Qw0 = new C0392Eu(readableMap, this, this.e);
        } else if ("props".equals(string)) {
            c1334Qw0 = new KE0(readableMap, this);
        } else if ("interpolation".equals(string)) {
            c1334Qw0 = new I90(readableMap);
        } else if ("addition".equals(string)) {
            c1334Qw0 = new C6193o3(readableMap, this, 0);
        } else if ("subtraction".equals(string)) {
            c1334Qw0 = new C6193o3(readableMap, this, 3);
        } else if ("division".equals(string)) {
            c1334Qw0 = new C6193o3(readableMap, this, 1);
        } else if ("multiplication".equals(string)) {
            c1334Qw0 = new C6193o3(readableMap, this, 2);
        } else if ("modulus".equals(string)) {
            c1334Qw0 = new C1088Ns0(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            c1334Qw0 = new KJ(readableMap, this);
        } else if ("transform".equals(string)) {
            c1334Qw0 = new C5728lc1(readableMap, this);
        } else if ("tracking".equals(string)) {
            c1334Qw0 = new C2549cc1(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException(AbstractC8235ym.v("Unsupported node type: ", string));
            }
            c1334Qw0 = new C1334Qw0(readableMap, this);
        }
        c1334Qw0.d = i;
        sparseArray.put(i, c1334Qw0);
        this.c.put(i, c1334Qw0);
    }

    public final void e(int i, int i2) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist"));
        }
        if (!(t4 instanceof KE0)) {
            StringBuilder sbN = AbstractC8235ym.n(i2, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type ");
            sbN.append(KE0.class.getName());
            throw new JSApplicationIllegalArgumentException(sbN.toString());
        }
        KE0 ke0 = (KE0) t4;
        int i3 = ke0.e;
        if (i3 == i2 || i3 == -1) {
            ke0.e = -1;
        } else {
            StringBuilder sbN2 = AbstractC8235ym.n(i2, "Attempting to disconnect view that has not been connected with the given animated node: ", " but is connected to view ");
            sbN2.append(ke0.e);
            throw new JSApplicationIllegalArgumentException(sbN2.toString());
        }
    }

    public final void f(int i, int i2) {
        SparseArray sparseArray = this.a;
        T4 t4 = (T4) sparseArray.get(i);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        T4 t42 = (T4) sparseArray.get(i2);
        if (t42 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i2, "disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        if (t4.a != null) {
            t42.b(t4);
            t4.a.remove(t42);
        }
        this.c.put(i2, t42);
    }

    public final void g(int i) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        C0823Kh1 c0823Kh1 = (C0823Kh1) t4;
        c0823Kh1.f += c0823Kh1.e;
        c0823Kh1.e = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public final void h(int i) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        C0823Kh1 c0823Kh1 = (C0823Kh1) t4;
        c0823Kh1.e += c0823Kh1.f;
        c0823Kh1.f = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public final T4 i(int i) {
        return (T4) this.a.get(i);
    }

    public final void j(int i, Callback callback) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "getValue: Animated node with tag [", "] does not exist or is not a 'value' node"));
        }
        double dF = ((C0823Kh1) t4).f();
        if (callback != null) {
            callback.invoke(Double.valueOf(dF));
            return;
        }
        ReactApplicationContext reactApplicationContext = this.e;
        if (reactApplicationContext == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("tag", i);
        writableMapCreateMap.putDouble("value", dF);
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    public final void k(AbstractC6260oP abstractC6260oP) {
        ReactApplicationContext reactApplicationContext;
        LinkedList linkedList;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() || (reactApplicationContext = this.e) == null || OZ1.f(reactApplicationContext, R02.c(abstractC6260oP.getViewTag(), abstractC6260oP.getSurfaceId()), true) == null) {
            return;
        }
        InterfaceC5878mP eventAnimationDriverMatchSpec = abstractC6260oP.getEventAnimationDriverMatchSpec();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedList = this.g;
            if (!zHasNext) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) it.next();
            if (eventAnimationDriverMatchSpec.X(eventAnimationDriver.mViewTag, eventAnimationDriver.mEventName)) {
                s(eventAnimationDriver.mValueNode);
                abstractC6260oP.dispatchModern(eventAnimationDriver);
                linkedList.add(eventAnimationDriver.mValueNode);
                z = true;
            }
        }
        if (z) {
            v(linkedList);
            linkedList.clear();
        }
    }

    public final void l(int i, int i2, String str) {
        if (str.startsWith("on")) {
            str = "top" + str.substring(2);
        }
        ListIterator listIterator = this.d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (str.equals(eventAnimationDriver.mEventName) && i == eventAnimationDriver.mViewTag && i2 == eventAnimationDriver.mValueNode.d) {
                listIterator.remove();
                return;
            }
        }
    }

    public final void m(int i) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null) {
            return;
        }
        if (!(t4 instanceof KE0)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type ".concat(KE0.class.getName()));
        }
        KE0 ke0 = (KE0) t4;
        int i2 = ke0.e;
        if (i2 == -1 || R02.b(i2) == 2) {
            return;
        }
        JavaOnlyMap javaOnlyMap = ke0.h;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = javaOnlyMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            javaOnlyMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        ke0.i.synchronouslyUpdateViewOnUIThread(ke0.e, javaOnlyMap);
    }

    public final void n(long j) {
        SparseArray sparseArray;
        LinkedList linkedList;
        SparseArray sparseArray2;
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int i = 0;
        while (true) {
            sparseArray = this.c;
            int size = sparseArray.size();
            linkedList = this.g;
            if (i >= size) {
                break;
            }
            linkedList.add((T4) sparseArray.valueAt(i));
            i++;
        }
        sparseArray.clear();
        int i2 = 0;
        boolean z = false;
        while (true) {
            sparseArray2 = this.b;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            AbstractC4087h5 abstractC4087h5 = (AbstractC4087h5) sparseArray2.valueAt(i2);
            abstractC4087h5.b(j);
            linkedList.add(abstractC4087h5.b);
            if (abstractC4087h5.a) {
                z = true;
            }
            i2++;
        }
        v(linkedList);
        linkedList.clear();
        if (z) {
            int size2 = sparseArray2.size() - 1;
            WritableArray writableArrayCreateArray = null;
            while (true) {
                reactApplicationContext = this.e;
                if (size2 < 0) {
                    break;
                }
                AbstractC4087h5 abstractC4087h52 = (AbstractC4087h5) sparseArray2.valueAt(size2);
                if (abstractC4087h52.a) {
                    if (abstractC4087h52.c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", abstractC4087h52.b.e);
                        abstractC4087h52.c.invoke(writableMapCreateMap);
                    } else if (reactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", abstractC4087h52.d);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", abstractC4087h52.b.e);
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

    public final void o(int i, double d) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        s(t4);
        ((C0823Kh1) t4).e = d;
        this.c.put(i, t4);
    }

    @Override // defpackage.InterfaceC7976xP
    public final void onEventDispatch(AbstractC6260oP abstractC6260oP) {
        if (UiThreadUtil.isOnUiThread()) {
            k(abstractC6260oP);
        } else {
            UiThreadUtil.runOnUiThread(new XZ(this, abstractC6260oP, false, 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [y31] */
    /* JADX WARN: Type inference failed for: r8v4, types: [LY, h5] */
    public final void p(int i, ReadableMap readableMap, Callback callback, int i2) {
        BD bd;
        T4 t4 = (T4) this.a.get(i2);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i2, "startAnimatingNode: Animated node [", "] does not exist"));
        }
        if (!(t4 instanceof C0823Kh1)) {
            StringBuilder sbN = AbstractC8235ym.n(i2, "startAnimatingNode: Animated node [", "] should be of type ");
            sbN.append(C0823Kh1.class.getName());
            throw new JSApplicationIllegalArgumentException(sbN.toString());
        }
        SparseArray sparseArray = this.b;
        AbstractC4087h5 abstractC4087h5 = (AbstractC4087h5) sparseArray.get(i);
        if (abstractC4087h5 != null) {
            abstractC4087h5.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            ?? ly = new LY();
            ly.k = 0;
            ly.a(readableMap);
            bd = ly;
        } else if ("spring".equals(string)) {
            bd = new C8102y31(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i2 + "]: " + string);
            }
            bd = new BD(readableMap);
        }
        bd.d = i;
        bd.c = callback;
        bd.b = (C0823Kh1) t4;
        sparseArray.put(i, bd);
    }

    public final void q(int i, C1204Pf c1204Pf) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((C0823Kh1) t4).g = c1204Pf;
    }

    public final void r(int i) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            int size = sparseArray.size();
            reactApplicationContext = this.e;
            writableArrayCreateArray = null;
            if (i2 >= size) {
                break;
            }
            AbstractC4087h5 abstractC4087h5 = (AbstractC4087h5) sparseArray.valueAt(i2);
            if (abstractC4087h5.d == i) {
                if (abstractC4087h5.c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", abstractC4087h5.b.e);
                    abstractC4087h5.c.invoke(writableMapCreateMap);
                } else if (reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", abstractC4087h5.d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", abstractC4087h5.b.e);
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

    public final void s(T4 t4) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            int size = sparseArray.size();
            reactApplicationContext = this.e;
            if (i >= size) {
                break;
            }
            AbstractC4087h5 abstractC4087h5 = (AbstractC4087h5) sparseArray.valueAt(i);
            if (t4.equals(abstractC4087h5.b)) {
                if (abstractC4087h5.c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", abstractC4087h5.b.e);
                    abstractC4087h5.c.invoke(writableMapCreateMap);
                } else if (reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", abstractC4087h5.d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", abstractC4087h5.b.e);
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

    public final void t(int i) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null || !(t4 instanceof C0823Kh1)) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((C0823Kh1) t4).g = null;
    }

    public final void u(int i, ReadableMap readableMap) {
        T4 t4 = (T4) this.a.get(i);
        if (t4 == null) {
            throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "updateAnimatedNode: Animated node [", "] does not exist"));
        }
        if (t4 instanceof C0392Eu) {
            s(t4);
            ((C0392Eu) t4).g(readableMap);
            this.c.put(i, t4);
        }
    }

    public final void v(LinkedList linkedList) {
        C0823Kh1 c0823Kh1;
        C1204Pf c1204Pf;
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        if (i2 == 0) {
            this.f = i + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = linkedList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            T4 t4 = (T4) it.next();
            int i4 = t4.c;
            int i5 = this.f;
            if (i4 != i5) {
                t4.c = i5;
                i3++;
                arrayDeque.add(t4);
            }
        }
        while (!arrayDeque.isEmpty()) {
            T4 t42 = (T4) arrayDeque.poll();
            if (t42.a != null) {
                for (int i6 = 0; i6 < t42.a.size(); i6++) {
                    T4 t43 = (T4) t42.a.get(i6);
                    t43.b++;
                    int i7 = t43.c;
                    int i8 = this.f;
                    if (i7 != i8) {
                        t43.c = i8;
                        i3++;
                        arrayDeque.add(t43);
                    }
                }
            }
        }
        int i9 = this.f;
        int i10 = i9 + 1;
        this.f = i10;
        if (i10 == 0) {
            this.f = i9 + 2;
        }
        Iterator it2 = linkedList.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            T4 t44 = (T4) it2.next();
            if (t44.b == 0) {
                int i12 = t44.c;
                int i13 = this.f;
                if (i12 != i13) {
                    t44.c = i13;
                    i11++;
                    arrayDeque.add(t44);
                }
            }
        }
        int i14 = 0;
        while (!arrayDeque.isEmpty()) {
            T4 t45 = (T4) arrayDeque.poll();
            try {
                t45.d();
                if (t45 instanceof KE0) {
                    ((KE0) t45).e();
                }
            } catch (JSApplicationCausedNativeException unused) {
                AbstractC3393dS.h("NativeAnimatedNodesManager");
            }
            if ((t45 instanceof C0823Kh1) && (c1204Pf = (c0823Kh1 = (C0823Kh1) t45).g) != null) {
                double dF = c0823Kh1.f();
                switch (c1204Pf.a) {
                    case 12:
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("tag", c1204Pf.b);
                        writableMapCreateMap.putDouble("value", dF);
                        ReactApplicationContext reactApplicationContextIfActiveOrWarn = ((NativeAnimatedModule) ((C3287cu0) c1204Pf.c).e).getReactApplicationContextIfActiveOrWarn();
                        if (reactApplicationContextIfActiveOrWarn != null) {
                            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                            break;
                        }
                        break;
                    default:
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("tag", c1204Pf.b);
                        writableMapCreateMap2.putDouble("value", dF);
                        ReactApplicationContext reactApplicationContextIfActiveOrWarn2 = ((NativeAnimatedModule) c1204Pf.c).getReactApplicationContextIfActiveOrWarn();
                        if (reactApplicationContextIfActiveOrWarn2 != null) {
                            reactApplicationContextIfActiveOrWarn2.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap2);
                            break;
                        }
                        break;
                }
            }
            if (t45.a != null) {
                for (int i15 = 0; i15 < t45.a.size(); i15++) {
                    T4 t46 = (T4) t45.a.get(i15);
                    int i16 = t46.b - 1;
                    t46.b = i16;
                    int i17 = t46.c;
                    int i18 = this.f;
                    if (i17 != i18 && i16 == 0) {
                        t46.c = i18;
                        i11++;
                        arrayDeque.add(t46);
                    } else if (i17 == i18) {
                        i14++;
                    }
                }
            }
        }
        if (i3 == i11) {
            this.j = false;
            return;
        }
        if (this.j) {
            return;
        }
        this.j = true;
        AbstractC3393dS.e("NativeAnimatedNodesManager");
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            T4 t47 = (T4) it3.next();
            ArrayList arrayList = t47.a;
            String string = "";
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it4 = t47.a.iterator();
                while (it4.hasNext()) {
                    T4 t48 = (T4) it4.next();
                    StringBuilder sbK = NX.k(string, " ");
                    sbK.append(t48.d);
                    string = sbK.toString();
                }
            }
            t47.c();
            if (string.length() > 0) {
                " children: ".concat(string);
            }
            AbstractC3393dS.e("NativeAnimatedNodesManager");
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i14 > 0 ? AbstractC8235ym.g(i14, "cycles (", ")") : "disconnected regions") + ", there are " + i3 + " but toposort visited only " + i11);
        boolean z = this.h;
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
