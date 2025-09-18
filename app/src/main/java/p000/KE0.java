package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class KE0 extends AbstractC1200T4 {

    /* renamed from: e */
    public int f5951e = -1;

    /* renamed from: f */
    public final C1881a f5952f;

    /* renamed from: g */
    public final HashMap f5953g;

    /* renamed from: h */
    public final JavaOnlyMap f5954h;

    /* renamed from: i */
    public UIManager f5955i;

    public KE0(ReadableMap readableMap, C1881a c1881a) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f5953g = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f5953g.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f5954h = new JavaOnlyMap();
        this.f5952f = c1881a;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        StringBuilder sb = new StringBuilder("PropsAnimatedNode[");
        sb.append(this.f11143d);
        sb.append("] connectedViewTag: ");
        sb.append(this.f5951e);
        sb.append(" mPropNodeMapping: ");
        HashMap map = this.f5953g;
        sb.append(map != null ? map.toString() : "null");
        sb.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.f5954h;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    /* renamed from: e */
    public final void m4587e() {
        double dM4701f;
        if (this.f5951e == -1) {
            return;
        }
        Iterator it = this.f5953g.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            JavaOnlyMap javaOnlyMap = this.f5954h;
            if (!zHasNext) {
                this.f5955i.synchronouslyUpdateViewOnUIThread(this.f5951e, javaOnlyMap);
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC1200T4 abstractC1200T4M10932i = this.f5952f.m10932i(((Integer) entry.getValue()).intValue());
            if (abstractC1200T4M10932i == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (abstractC1200T4M10932i instanceof G51) {
                G51 g51 = (G51) abstractC1200T4M10932i;
                for (Map.Entry entry2 : g51.f3568f.entrySet()) {
                    AbstractC1200T4 abstractC1200T4M10932i2 = g51.f3567e.m10932i(((Integer) entry2.getValue()).intValue());
                    if (abstractC1200T4M10932i2 == null) {
                        throw new IllegalArgumentException("Mapped style node does not exist");
                    }
                    if (abstractC1200T4M10932i2 instanceof C10160lc1) {
                        C10160lc1 c10160lc1 = (C10160lc1) abstractC1200T4M10932i2;
                        ArrayList arrayList = c10160lc1.f37191f;
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            AbstractC10032kc1 abstractC10032kc1 = (AbstractC10032kc1) it2.next();
                            if (abstractC10032kc1 instanceof C9776ic1) {
                                AbstractC1200T4 abstractC1200T4M10932i3 = c10160lc1.f37190e.m10932i(((C9776ic1) abstractC10032kc1).f29371b);
                                if (abstractC1200T4M10932i3 == null) {
                                    throw new IllegalArgumentException("Mapped style node does not exist");
                                }
                                if (!(abstractC1200T4M10932i3 instanceof C7849Kh1)) {
                                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + abstractC1200T4M10932i3.getClass());
                                }
                                dM4701f = ((C7849Kh1) abstractC1200T4M10932i3).m4701f();
                            } else {
                                dM4701f = ((C9904jc1) abstractC10032kc1).f35284b;
                            }
                            arrayList2.add(JavaOnlyMap.m10963of(abstractC10032kc1.f36573a, Double.valueOf(dM4701f)));
                        }
                        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList2));
                    } else if (abstractC1200T4M10932i2 instanceof C7849Kh1) {
                        C7849Kh1 c7849Kh1 = (C7849Kh1) abstractC1200T4M10932i2;
                        Object objMo3770e = c7849Kh1.mo3770e();
                        if (objMo3770e instanceof Integer) {
                            javaOnlyMap.putInt((String) entry2.getKey(), ((Integer) objMo3770e).intValue());
                        } else if (objMo3770e instanceof String) {
                            javaOnlyMap.putString((String) entry2.getKey(), (String) objMo3770e);
                        } else {
                            javaOnlyMap.putDouble((String) entry2.getKey(), c7849Kh1.m4701f());
                        }
                    } else if (abstractC1200T4M10932i2 instanceof C0309Eu) {
                        javaOnlyMap.putInt((String) entry2.getKey(), ((C0309Eu) abstractC1200T4M10932i2).m2443e());
                    } else {
                        if (!(abstractC1200T4M10932i2 instanceof C8190Qw0)) {
                            throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC1200T4M10932i2.getClass());
                        }
                        ((C8190Qw0) abstractC1200T4M10932i2).m6832e((String) entry2.getKey(), javaOnlyMap);
                    }
                }
            } else if (abstractC1200T4M10932i instanceof C7849Kh1) {
                C7849Kh1 c7849Kh12 = (C7849Kh1) abstractC1200T4M10932i;
                Object objMo3770e2 = c7849Kh12.mo3770e();
                if (objMo3770e2 instanceof Integer) {
                    javaOnlyMap.putInt((String) entry.getKey(), ((Integer) objMo3770e2).intValue());
                } else if (objMo3770e2 instanceof String) {
                    javaOnlyMap.putString((String) entry.getKey(), (String) objMo3770e2);
                } else {
                    javaOnlyMap.putDouble((String) entry.getKey(), c7849Kh12.m4701f());
                }
            } else if (abstractC1200T4M10932i instanceof C0309Eu) {
                javaOnlyMap.putInt((String) entry.getKey(), ((C0309Eu) abstractC1200T4M10932i).m2443e());
            } else {
                if (!(abstractC1200T4M10932i instanceof C8190Qw0)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC1200T4M10932i.getClass());
                }
                ((C8190Qw0) abstractC1200T4M10932i).m6832e((String) entry.getKey(), javaOnlyMap);
            }
        }
    }
}
