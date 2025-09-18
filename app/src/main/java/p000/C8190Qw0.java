package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

/* renamed from: Qw0 */
/* loaded from: classes.dex */
public final class C8190Qw0 extends AbstractC1200T4 {

    /* renamed from: e */
    public final C1881a f9867e;

    /* renamed from: f */
    public final JavaOnlyMap f9868f;

    public C8190Qw0(ReadableMap readableMap, C1881a c1881a) {
        this.f9868f = JavaOnlyMap.deepClone(readableMap);
        this.f9867e = c1881a;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        StringBuilder sb = new StringBuilder("ObjectAnimatedNode[");
        sb.append(this.f11143d);
        sb.append("]: mConfig: ");
        JavaOnlyMap javaOnlyMap = this.f9868f;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    /* renamed from: e */
    public final void m6832e(String str, JavaOnlyMap javaOnlyMap) {
        JavaOnlyMap javaOnlyMap2 = this.f9868f;
        ReadableType type = javaOnlyMap2.getType("value");
        if (type == ReadableType.Map) {
            javaOnlyMap.putMap(str, m6834g(javaOnlyMap2.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            javaOnlyMap.putArray(str, m6833f(javaOnlyMap2.getArray("value")));
        }
    }

    /* renamed from: f */
    public final JavaOnlyArray m6833f(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AbstractC8138Pw0.f9364a[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i);
                    if (!map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyArray.pushMap(m6834g(readableArray.getMap(i)));
                        break;
                    } else {
                        AbstractC1200T4 abstractC1200T4M10932i = this.f9867e.m10932i(map.getInt("nodeTag"));
                        if (abstractC1200T4M10932i == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (abstractC1200T4M10932i instanceof C7849Kh1) {
                            C7849Kh1 c7849Kh1 = (C7849Kh1) abstractC1200T4M10932i;
                            Object objMo3770e = c7849Kh1.mo3770e();
                            if (objMo3770e instanceof Integer) {
                                javaOnlyArray.pushInt(((Integer) objMo3770e).intValue());
                                break;
                            } else if (objMo3770e instanceof String) {
                                javaOnlyArray.pushString((String) objMo3770e);
                                break;
                            } else {
                                javaOnlyArray.pushDouble(c7849Kh1.m4701f());
                                break;
                            }
                        } else if (abstractC1200T4M10932i instanceof C0309Eu) {
                            javaOnlyArray.pushInt(((C0309Eu) abstractC1200T4M10932i).m2443e());
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(m6833f(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: g */
    public final JavaOnlyMap m6834g(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (AbstractC8138Pw0.f9364a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map == null || !map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyMap.putMap(strNextKey, m6834g(map));
                        break;
                    } else {
                        AbstractC1200T4 abstractC1200T4M10932i = this.f9867e.m10932i(map.getInt("nodeTag"));
                        if (abstractC1200T4M10932i == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (!(abstractC1200T4M10932i instanceof C7849Kh1)) {
                            if (!(abstractC1200T4M10932i instanceof C0309Eu)) {
                                break;
                            } else {
                                javaOnlyMap.putInt(strNextKey, ((C0309Eu) abstractC1200T4M10932i).m2443e());
                                break;
                            }
                        } else {
                            C7849Kh1 c7849Kh1 = (C7849Kh1) abstractC1200T4M10932i;
                            Object objMo3770e = c7849Kh1.mo3770e();
                            if (!(objMo3770e instanceof Integer)) {
                                if (!(objMo3770e instanceof String)) {
                                    javaOnlyMap.putDouble(strNextKey, c7849Kh1.m4701f());
                                    break;
                                } else {
                                    javaOnlyMap.putString(strNextKey, (String) objMo3770e);
                                    break;
                                }
                            } else {
                                javaOnlyMap.putInt(strNextKey, ((Integer) objMo3770e).intValue());
                                break;
                            }
                        }
                    }
                case 6:
                    javaOnlyMap.putArray(strNextKey, m6833f(readableMap.getArray(strNextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }
}
