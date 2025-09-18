package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import p000.AbstractC3929dS;
import p000.AbstractC7751Ik1;
import p000.AbstractC8271Sk1;
import p000.C7522Ea0;
import p000.C7699Hk1;
import p000.DM0;
import p000.EnumC7813Jp1;
import p000.G41;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC8534Xm0;
import p000.NM0;
import p000.S91;
import p000.SK0;

/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends DM0> extends BaseJavaModule {
    private static final String NAME = "ViewManager";
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }

    private Stack<T> getRecyclableViewStack(int i) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (!map.containsKey(Integer.valueOf(i))) {
            this.mRecyclableViews.put(Integer.valueOf(i), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i));
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T createView(int i, S91 s91, NM0 nm0, G41 g41, C7522Ea0 c7522Ea0) {
        T t = (T) createViewInstance(i, s91, nm0, g41);
        if (t instanceof SK0) {
            ((SK0) t).setOnInterceptTouchEventListener(c7522Ea0);
        }
        return t;
    }

    public T createViewInstance(int i, S91 s91, NM0 nm0, G41 g41) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(s91.f10603b);
        T t = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(s91) : (T) recycleView(s91, recyclableViewStack.pop());
        t.setId(i);
        addEventEmitters(s91, t);
        if (nm0 != null) {
            updateProperties(t, nm0);
        }
        if (g41 != null && (objUpdateState = updateState(t, nm0, g41)) != null) {
            updateExtraData(t, objUpdateState);
        }
        return t;
    }

    public abstract T createViewInstance(S91 s91);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    /* renamed from: getDelegate */
    public InterfaceC7543Ek1 getMDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        Class<?> cls = getClass();
        Class<? extends C> shadowNodeClass = getShadowNodeClass();
        HashMap map = AbstractC7751Ik1.f5122a;
        HashMap map2 = new HashMap();
        for (AbstractC8271Sk1 abstractC8271Sk1 : AbstractC7751Ik1.m3997c(cls).f4482a.values()) {
            map2.put(abstractC8271Sk1.f10962a, abstractC8271Sk1.f10963b);
        }
        for (AbstractC8271Sk1 abstractC8271Sk12 : AbstractC7751Ik1.m3998d(shadowNodeClass).f3871a.values()) {
            map2.put(abstractC8271Sk12.f10962a, abstractC8271Sk12.f10963b);
        }
        return map2;
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
        Context context = t.getContext();
        if (context == null) {
            String str = NAME;
            t.getId();
            AbstractC3929dS.m17672e(str);
        } else {
            if (!(context instanceof S91)) {
                String str2 = NAME;
                t.getId();
                context.toString();
                AbstractC3929dS.m17672e(str2);
                return;
            }
            S91 s91 = (S91) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(s91.f10603b);
            if (recyclableViewStack != null) {
                recyclableViewStack.push(prepareToRecycleView(s91, t));
            }
        }
    }

    public void onSurfaceStopped(int i) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public void setupViewRecycling() {
        if (ReactFeatureFlags.enableViewRecycling) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t, Object obj);

    public void updateProperties(T t, NM0 nm0) {
        Object[] objArr;
        InterfaceC7543Ek1 mDelegate = getMDelegate();
        if (mDelegate != null) {
            HashMap map = AbstractC7751Ik1.f5122a;
            Iterator<Map.Entry<String, Object>> entryIterator = nm0.f7734a.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                mDelegate.mo2373T0(t, next.getKey(), next.getValue());
            }
        } else {
            HashMap map2 = AbstractC7751Ik1.f5122a;
            C7699Hk1 c7699Hk1M3997c = AbstractC7751Ik1.m3997c(getClass());
            Iterator<Map.Entry<String, Object>> entryIterator2 = nm0.f7734a.getEntryIterator();
            while (entryIterator2.hasNext()) {
                Map.Entry<String, Object> next2 = entryIterator2.next();
                String key = next2.getKey();
                Object value = next2.getValue();
                AbstractC8271Sk1 abstractC8271Sk1 = (AbstractC8271Sk1) c7699Hk1M3997c.f4482a.get(key);
                if (abstractC8271Sk1 != null) {
                    Integer num = abstractC8271Sk1.f10965d;
                    if (num == null) {
                        try {
                            objArr = (Object[]) AbstractC8271Sk1.f10958e.get();
                            objArr[0] = t;
                            objArr[1] = abstractC8271Sk1.mo5830a(t.getContext(), value);
                        } catch (Throwable th) {
                            AbstractC3929dS.m17674g(ViewManager.class);
                            throw new JSApplicationIllegalArgumentException("Error while updating property '" + abstractC8271Sk1.f10962a + "' of a view managed by: " + getName(), th);
                        }
                    } else {
                        Object[] objArr2 = (Object[]) AbstractC8271Sk1.f10959f.get();
                        objArr2[0] = t;
                        objArr2[1] = num;
                        objArr2[2] = abstractC8271Sk1.mo5830a(t.getContext(), value);
                        objArr = objArr2;
                    }
                    abstractC8271Sk1.f10964c.invoke(this, objArr);
                    Arrays.fill(objArr, (Object) null);
                }
            }
        }
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, NM0 nm0, G41 g41) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public long measure(Context context, InterfaceC8534Xm0 interfaceC8534Xm0, InterfaceC8534Xm0 interfaceC8534Xm02, InterfaceC8534Xm0 interfaceC8534Xm03, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        return 0L;
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        InterfaceC7543Ek1 mDelegate = getMDelegate();
        if (mDelegate != null) {
            mDelegate.mo2372I(t, str, readableArray);
        }
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRecyclableViews = null;
    }

    public void addEventEmitters(S91 s91, T t) {
    }

    public T prepareToRecycleView(S91 s91, T t) {
        return t;
    }

    public T recycleView(S91 s91, T t) {
        return t;
    }
}
