package defpackage;

import com.facebook.react.animated.a;
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
public final class KE0 extends T4 {
    public int e = -1;
    public final a f;
    public final HashMap g;
    public final JavaOnlyMap h;
    public UIManager i;

    public KE0(ReadableMap readableMap, a aVar) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.g = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.g.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.h = new JavaOnlyMap();
        this.f = aVar;
    }

    @Override // defpackage.T4
    public final String c() {
        StringBuilder sb = new StringBuilder("PropsAnimatedNode[");
        sb.append(this.d);
        sb.append("] connectedViewTag: ");
        sb.append(this.e);
        sb.append(" mPropNodeMapping: ");
        HashMap map = this.g;
        sb.append(map != null ? map.toString() : "null");
        sb.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.h;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    public final void e() {
        double dF;
        if (this.e == -1) {
            return;
        }
        Iterator it = this.g.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            JavaOnlyMap javaOnlyMap = this.h;
            if (!zHasNext) {
                this.i.synchronouslyUpdateViewOnUIThread(this.e, javaOnlyMap);
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            T4 t4I = this.f.i(((Integer) entry.getValue()).intValue());
            if (t4I == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (t4I instanceof G51) {
                G51 g51 = (G51) t4I;
                for (Map.Entry entry2 : g51.f.entrySet()) {
                    T4 t4I2 = g51.e.i(((Integer) entry2.getValue()).intValue());
                    if (t4I2 == null) {
                        throw new IllegalArgumentException("Mapped style node does not exist");
                    }
                    if (t4I2 instanceof C5728lc1) {
                        C5728lc1 c5728lc1 = (C5728lc1) t4I2;
                        ArrayList arrayList = c5728lc1.f;
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            AbstractC5537kc1 abstractC5537kc1 = (AbstractC5537kc1) it2.next();
                            if (abstractC5537kc1 instanceof C4379ic1) {
                                T4 t4I3 = c5728lc1.e.i(((C4379ic1) abstractC5537kc1).b);
                                if (t4I3 == null) {
                                    throw new IllegalArgumentException("Mapped style node does not exist");
                                }
                                if (!(t4I3 instanceof C0823Kh1)) {
                                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + t4I3.getClass());
                                }
                                dF = ((C0823Kh1) t4I3).f();
                            } else {
                                dF = ((C5346jc1) abstractC5537kc1).b;
                            }
                            arrayList2.add(JavaOnlyMap.of(abstractC5537kc1.a, Double.valueOf(dF)));
                        }
                        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList2));
                    } else if (t4I2 instanceof C0823Kh1) {
                        C0823Kh1 c0823Kh1 = (C0823Kh1) t4I2;
                        Object objE = c0823Kh1.e();
                        if (objE instanceof Integer) {
                            javaOnlyMap.putInt((String) entry2.getKey(), ((Integer) objE).intValue());
                        } else if (objE instanceof String) {
                            javaOnlyMap.putString((String) entry2.getKey(), (String) objE);
                        } else {
                            javaOnlyMap.putDouble((String) entry2.getKey(), c0823Kh1.f());
                        }
                    } else if (t4I2 instanceof C0392Eu) {
                        javaOnlyMap.putInt((String) entry2.getKey(), ((C0392Eu) t4I2).e());
                    } else {
                        if (!(t4I2 instanceof C1334Qw0)) {
                            throw new IllegalArgumentException("Unsupported type of node used in property node " + t4I2.getClass());
                        }
                        ((C1334Qw0) t4I2).e((String) entry2.getKey(), javaOnlyMap);
                    }
                }
            } else if (t4I instanceof C0823Kh1) {
                C0823Kh1 c0823Kh12 = (C0823Kh1) t4I;
                Object objE2 = c0823Kh12.e();
                if (objE2 instanceof Integer) {
                    javaOnlyMap.putInt((String) entry.getKey(), ((Integer) objE2).intValue());
                } else if (objE2 instanceof String) {
                    javaOnlyMap.putString((String) entry.getKey(), (String) objE2);
                } else {
                    javaOnlyMap.putDouble((String) entry.getKey(), c0823Kh12.f());
                }
            } else if (t4I instanceof C0392Eu) {
                javaOnlyMap.putInt((String) entry.getKey(), ((C0392Eu) t4I).e());
            } else {
                if (!(t4I instanceof C1334Qw0)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + t4I.getClass());
                }
                ((C1334Qw0) t4I).e((String) entry.getKey(), javaOnlyMap);
            }
        }
    }
}
